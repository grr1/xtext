/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator.scoping

import com.google.inject.Inject
import com.google.inject.name.Names
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend2.lib.StringConcatenationClient
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.scoping.IGlobalScopeProvider
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.scoping.IgnoreCaseLinking
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider
import org.eclipse.xtext.xtext.generator.AbstractGeneratorFragment2
import org.eclipse.xtext.xtext.generator.CodeConfig
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess
import org.eclipse.xtext.xtext.generator.model.TypeReference
import org.eclipse.xtext.xtext.generator.xbase.XbaseUsageDetector

import static org.eclipse.xtext.GrammarUtil.*

import static extension org.eclipse.xtext.xtext.generator.model.TypeReference.*
import static extension org.eclipse.xtext.xtext.generator.util.GrammarUtil2.*

class ImportNamespacesScopingFragment2 extends AbstractGeneratorFragment2 {
	
	@Inject extension XtextGeneratorNaming
	@Inject extension XbaseUsageDetector
	@Inject CodeConfig codeConfig
	@Inject FileAccessFactory fileAccessFactory
	
	@Accessors
	boolean generateStub = true
	
	@Accessors
	boolean ignoreCase = false
	
	@Accessors
	boolean inheritImplementation = true
	
	protected def TypeReference getScopeProviderClass(Grammar grammar) {
		new TypeReference(grammar.runtimeBasePackage + '.scoping.' + getSimpleName(grammar) + 'ScopeProvider')
	}
	
	protected def TypeReference getScopeProviderSuperClass(Grammar grammar) {
		val superGrammar = grammar.nonTerminalsSuperGrammar
		if (inheritImplementation && superGrammar !== null) 
			superGrammar.scopeProviderClass
		else 
			defaultScopeProviderSuperClass
	}

	protected def TypeReference getDefaultScopeProviderSuperClass() {
		new TypeReference(AbstractDeclarativeScopeProvider)
	}
	
	override generate() {
		contributeRuntimeGuiceBindings()
		
		if (generateStub && !grammar.inheritsXbase) {
			if (codeConfig.preferXtendStubs)
				generateXtendScopeProvider()
			else
				generateJavaScopeProvider()
			
			if (projectConfig.runtimeManifest !== null) {
				projectConfig.runtimeManifest.exportedPackages += grammar.scopeProviderClass.packageName
				if (codeConfig.preferXtendStubs)
					projectConfig.runtimeManifest.requiredBundles += 'org.eclipse.xtext.xbase.lib'
			}
		}
	}
	
	protected def contributeRuntimeGuiceBindings() {
		val bindingFactory = new GuiceModuleAccess.BindingFactory
		if (!grammar.inheritsXbase) {
			if (generateStub)
				bindingFactory.addTypeToType(IScopeProvider.typeRef, grammar.scopeProviderClass)
			else
				bindingFactory.addTypeToType(IScopeProvider.typeRef, ImportedNamespaceAwareLocalScopeProvider.typeRef)
			val StringConcatenationClient statement =
				'''binder.bind(«IScopeProvider».class).annotatedWith(«Names».named(«AbstractDeclarativeScopeProvider».NAMED_DELEGATE)).to(«ImportedNamespaceAwareLocalScopeProvider».class);'''
			bindingFactory.addConfiguredBinding(IScopeProvider.simpleName + 'Delegate', statement)
			bindingFactory.addTypeToType(IGlobalScopeProvider.typeRef(), DefaultGlobalScopeProvider.typeRef)
		}
		val StringConcatenationClient statement =
			'''binder.bindConstant().annotatedWith(«IgnoreCaseLinking».class).to(«ignoreCase»);'''
		bindingFactory.addConfiguredBinding(IgnoreCaseLinking.simpleName, statement)
		bindingFactory.contributeTo(language.runtimeGenModule)
	}
	
	protected def generateJavaScopeProvider() {
		fileAccessFactory.createJavaFile(grammar.scopeProviderClass, '''
			/**
			 * This class contains custom scoping description.
			 * 
			 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
			 * on how and when to use it.
			 */
			public class «grammar.scopeProviderClass.simpleName» extends «grammar.scopeProviderSuperClass» {
			
			}
		''').writeTo(projectConfig.runtimeSrc)
	}
	
	protected def generateXtendScopeProvider() {
		fileAccessFactory.createXtendFile(grammar.scopeProviderClass, '''
			/**
			 * This class contains custom scoping description.
			 * 
			 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
			 * on how and when to use it.
			 */
			class «grammar.scopeProviderClass.simpleName» extends «grammar.scopeProviderSuperClass» {
			
			}
		''').writeTo(projectConfig.runtimeSrc)
	}
	
}
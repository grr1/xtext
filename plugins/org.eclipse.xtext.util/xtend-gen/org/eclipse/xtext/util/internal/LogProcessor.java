/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.util.internal;

import org.apache.log4j.Logger;
import org.eclipse.xtend.lib.macro.AbstractClassProcessor;
import org.eclipse.xtend.lib.macro.TransformationContext;
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration;
import org.eclipse.xtend.lib.macro.declaration.MutableFieldDeclaration;
import org.eclipse.xtend.lib.macro.declaration.TypeReference;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class LogProcessor extends AbstractClassProcessor {
  @Override
  public void doTransform(final MutableClassDeclaration cls, @Extension final TransformationContext context) {
    final Procedure1<MutableFieldDeclaration> _function = new Procedure1<MutableFieldDeclaration>() {
      @Override
      public void apply(final MutableFieldDeclaration it) {
        it.setStatic(true);
        it.setFinal(true);
        TypeReference _newTypeReference = context.newTypeReference(Logger.class);
        it.setType(_newTypeReference);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append(Logger.class, "");
            _builder.append(".getLogger(");
            String _simpleName = cls.getSimpleName();
            _builder.append(_simpleName, "");
            _builder.append(".class)");
            _builder.newLineIfNotEmpty();
          }
        };
        it.setInitializer(_client);
        context.setPrimarySourceElement(it, cls);
      }
    };
    cls.addField("LOG", _function);
  }
}

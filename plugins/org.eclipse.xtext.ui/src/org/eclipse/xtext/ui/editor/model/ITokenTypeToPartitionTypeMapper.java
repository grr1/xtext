/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.model;

import com.google.inject.ImplementedBy;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
@ImplementedBy(TerminalsTokenTypeToPartitionMapper.class)
public interface ITokenTypeToPartitionTypeMapper {
	
	/**
	 * returns the partition type for the given antlr type
	 */
	String getPartitionType(int antlrTokenType);
	
	/**
	 * returns all supported partition types
	 */
	String[] getSupportedPartitionTypes();
}

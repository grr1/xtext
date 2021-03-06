/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.common.types;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class JvmStringAnnotationValueTest extends Assert {

	private JvmStringAnnotationValue stringAnnotationValue;

	@Before
	public void setUp() throws Exception {
		stringAnnotationValue = TypesFactory.eINSTANCE.createJvmStringAnnotationValue();
	}	
	
	@Test public void testMultiValue() {
		stringAnnotationValue.getValues().add("zonk");
		stringAnnotationValue.getValues().add("zonk");
		assertEquals(2, stringAnnotationValue.getValues().size());
	}
}

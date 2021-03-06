/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xbase.ui.tests.editor;

import org.eclipse.xtext.junit4.ui.ContentAssistProcessorTestBuilder;
import org.eclipse.xtext.xbase.ui.tests.editor.ContentAssistTest;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@SuppressWarnings("all")
public class ContentAssistForTest extends ContentAssistTest {
  @Override
  protected String getPrefix() {
    return "for(";
  }
  
  @Override
  protected String getSuffix() {
    return ", var z = 1";
  }
  
  @Override
  public void testEmptyInput() throws Exception {
    ContentAssistProcessorTestBuilder _newBuilder = this.newBuilder();
    String[] _keywordsAndStatics = this.getKeywordsAndStatics();
    String[] _expect = this.expect(_keywordsAndStatics, new String[] { "var", "val" });
    _newBuilder.assertText(_expect);
  }
}

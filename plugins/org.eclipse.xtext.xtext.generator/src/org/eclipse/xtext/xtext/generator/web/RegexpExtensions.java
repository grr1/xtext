/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator.web;

import org.eclipse.xtext.util.Strings;

public class RegexpExtensions {
	
	public static String toRegexpString(String string) {
		int length = string.length();
		StringBuilder out = new StringBuilder(2 * length);

		for (int x = 0; x < length; x++) {
			char c = string.charAt(x);
			switch (c) {
				case '\t':
					out.append("\\\\t");
					break;
				case '\n':
					out.append("\\\\n");
					break;
				case '\r':
					out.append("\\\\r");
					break;
				case '\f':
					out.append("\\\\f");
					break;
				case '\b':
					out.append("[\\\\b]");
					break;
				case '"':
				case '.':
				case '*':
				case '+':
				case '?':
				case '^':
				case '$':
				case '{':
				case '}':
				case '(':
				case ')':
				case '|':
				case '[':
				case ']':
				case '\\':
					out.append("\\\\");
					out.append(c);
					break;
				default:
					if (c < 0x20 || c > 0x7e) {
						out.append("\\\\u");
						out.append(Strings.toHex((c >> 12) & 0xf));
						out.append(Strings.toHex((c >> 8) & 0xf));
						out.append(Strings.toHex((c >> 4) & 0xf));
						out.append(Strings.toHex(c & 0xf));
					} else {
						out.append(c);
					}
			}
		}
		return out.toString();
	}

}

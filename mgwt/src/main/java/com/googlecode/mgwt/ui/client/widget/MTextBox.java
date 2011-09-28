/*
 * Copyright 2010 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.mgwt.ui.client.widget;

import com.google.gwt.dom.client.InputElement;
import com.google.gwt.user.client.ui.TextBox;
import com.googlecode.mgwt.ui.client.MGWTStyle;
import com.googlecode.mgwt.ui.client.theme.base.InputCss;
import com.googlecode.mgwt.ui.client.widget.base.MTextBoxBase;


/**
 * @author Daniel Kurka
 * 
 */
public class MTextBox extends MTextBoxBase {

	public MTextBox() {
		this(MGWTStyle.getDefaultClientBundle().getInputCss());

	}

	public MTextBox(InputCss css) {
		this(css, new TextBox());

	}

	public MTextBox(InputCss css, TextBox textBox) {
		super(css, textBox);
		addStyleName(css.textBox());
	}

	public int getMaxLength() {
		return getInputElement().getMaxLength();
	}

	public int getVisibleLength() {
		return getInputElement().getSize();
	}

	public void setMaxLength(int length) {
		getInputElement().setMaxLength(length);
	}

	public void setVisibleLength(int length) {
		getInputElement().setSize(length);
	}

	private InputElement getInputElement() {
		return box.getElement().cast();
	}

}
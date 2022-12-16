/*   
 * Copyright 2022-preset Arpan Mukhopadhyay<arixion@outlook.com>. 
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.nordlaf;

import java.awt.Graphics2D;

import javax.swing.JComponent;

/**
 * @author Arpan Mukhopadhyay
 *
 */
public class ButtonPainter extends AbstractComponentPainter {

	// Represents the current state of the button
	private ButtonState state;
	
	// Represents the variant of the button.
	// Default is CONTAINED
	private Variant variant = Variant.CONTAINED;
	
	@Override
	protected void doPaint(Graphics2D g, JComponent component, int width, int height) {
		// TODO Auto-generated method stub

	}

}
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
import java.awt.RenderingHints;

import javax.swing.JComponent;
import javax.swing.Painter;

/**
 * @author Arpan Mukhopadhyay
 *
 */
public abstract class AbstractComponentPainter implements Painter<JComponent> {

	@Override
	public void paint(Graphics2D g, JComponent object, int width, int height) {
		g = (Graphics2D) g.create();
		// By default we will try to enable the anti aliasing effect with the current
		// painter.
		enableAntialiasing(g);
		// Delegate the actual painting to individual component.
		doPaint(g, object, width, height);
		// Finally dispose the graphic object.
		g.dispose();
	}

	/**
	 * Enables the anti aliasing to the current {@code Graphic2D}
	 * 
	 * @param g the current {@code Graphic2D}
	 */
	private void enableAntialiasing(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	}

	/**
	 * Disables the anti aliasing to the current {@code Graphic2D}
	 * 
	 * @param g the current {@code Graphic2D}
	 */
	private void disableAntiAliasing(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
	}

	/**
	 * 
	 * @param g
	 * @param component
	 * @param width
	 * @param height
	 */
	protected abstract void doPaint(Graphics2D g, JComponent component, int width, int height);
}

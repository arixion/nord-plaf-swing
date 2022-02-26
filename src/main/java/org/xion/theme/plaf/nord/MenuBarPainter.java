package org.xion.theme.plaf.nord;

import javax.swing.*;
import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class MenuBarPainter extends AbstractRegionPainter {

    private Object[] extendedCacheKeys;
    private PaintContext paintContext;
    private Rectangle2D rect;

    private Color colorNord1 = decodeColor("nord1", 13, 82, 91, 255);

    /**
     *
     * @param paintContext
     */
    public MenuBarPainter(PaintContext paintContext) {
        paintContext = paintContext;
    }

    @Override
    protected PaintContext getPaintContext() {
        return null;
    }

    @Override
    protected void doPaint(Graphics2D g, JComponent c, int width, int height, Object[] extendedCacheKeys) {
        extendedCacheKeys = extendedCacheKeys;
    }

    /**
     *
     * @param g
     */
    private void paint(Graphics2D g) {
        createRect();
        g.fill(rect);
        g.setBackground(colorNord1);
    }

    /**
     *
     */
    private void createRect() {
        rect.setRect(decodeX(1.0f), decodeY(0.0f), decodeX(2.0f) - decodeX(1.0f), decodeX(2.0f) - decodeX(1.0f));
    }
}

package org.xion.theme.plaf.nord;

import javax.swing.*;
import javax.swing.plaf.synth.SynthLookAndFeel;

/**
 * @author Arpan Mukhopadhyay
 */
public class NordLookAndFeel extends SynthLookAndFeel {

    private NordDefaults lafDefaults;
    private UIDefaults stockDefaults;

    /**
     *
     */
    public NordLookAndFeel() {
        super();
        lafDefaults = new NordDefaults();
    }

    @Override
    public void initialize() {
        super.initialize();
        lafDefaults.initialize();
    }

    @Override
    public UIDefaults getDefaults() {
        if (null == stockDefaults) {
            stockDefaults = super.getDefaults();
            lafDefaults.initializeDefaults(stockDefaults);
        }
        return stockDefaults;
    }
}

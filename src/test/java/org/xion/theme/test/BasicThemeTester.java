package org.xion.theme.test;

import org.xion.theme.plaf.nord.NordLookAndFeel;
import org.xion.theme.test.app.NordThemeBrowser;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.util.Enumeration;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * @author Arpan Mukhopadhyay
 */
public class BasicThemeTester {

    private static final String APPLICATION_TITLE = "Nord Theme Browser";

    public void testBasicTheme() {
        try {
            UIManager.setLookAndFeel(NordLookAndFeel.class.getName());
//            UIManager.setLookAndFeel(NimbusLookAndFeel.class.getName());
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//            UIManager.setLookAndFeel(MetalLookAndFeel.class.getName());
            System.out.println(UIManager.getDefaults().keySet().size());
            Enumeration<Object> mappings = UIManager.getDefaults().elements();
            while (mappings.hasMoreElements()) {
                System.out.println(mappings.nextElement().getClass().getName());
            }
            new NordThemeBrowser(APPLICATION_TITLE);
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        BasicThemeTester tester = new BasicThemeTester();
        tester.testBasicTheme();
    }
}

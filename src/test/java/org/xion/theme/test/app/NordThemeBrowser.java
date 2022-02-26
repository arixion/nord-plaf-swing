package org.xion.theme.test.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * @author Arpan Mukhopadhyay
 */
public class NordThemeBrowser extends JFrame {

    /**
     * Creates a theme browser with the given title
     *
     * @param title the title of the theme browser application
     */
    public NordThemeBrowser(final String title) {
        setTitle(title);
        setSize(new Dimension(640, 480));
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private JMenuItem exitMenuItem;

    /**
     * This method initializes all the components
     */
    private void initComponents() {
        JMenuBar appMenuBar = new JMenuBar();
        JMenu fileMenu = new JMenu();
        JMenuItem newMenuItem = new JMenuItem();
        JMenuItem openMenuItem = new JMenuItem();
        JMenuItem saveAsMenuItem = new JMenuItem();
        JMenuItem closeMenuItem = new JMenuItem();
        exitMenuItem = new JMenuItem();

        //Preparing the file menu
        {
            fileMenu.setText("File");
            fileMenu.setMnemonic('F');

            //---- newMenuItem ----
            newMenuItem.setText("New");
            newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
            newMenuItem.setMnemonic('N');
//            newMenuItem.addActionListener(e -> newActionPerformed());
            fileMenu.add(newMenuItem);

            //---- openMenuItem ----
            openMenuItem.setText("Open...");
            openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
            openMenuItem.setMnemonic('O');
//            openMenuItem.addActionListener(e -> openActionPerformed());
            fileMenu.add(openMenuItem);

            //---- saveAsMenuItem ----
            saveAsMenuItem.setText("Save As...");
            saveAsMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
            saveAsMenuItem.setMnemonic('S');
//            saveAsMenuItem.addActionListener(e -> saveAsActionPerformed());
            fileMenu.add(saveAsMenuItem);
            fileMenu.addSeparator();

            //---- closeMenuItem ----
            closeMenuItem.setText("Close");
            closeMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
            closeMenuItem.setMnemonic('C');
//            closeMenuItem.addActionListener(e -> menuItemActionPerformed(e));
            fileMenu.add(closeMenuItem);
            fileMenu.addSeparator();

            //---- exitMenuItem ----
            exitMenuItem.setText("Exit");
            exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
            exitMenuItem.setMnemonic('X');
//            exitMenuItem.addActionListener(e -> exitActionPerformed());
            fileMenu.add(exitMenuItem);
        }
        appMenuBar.add(fileMenu);

        setJMenuBar(appMenuBar);
    }
}

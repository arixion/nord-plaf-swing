/**
 * 
 */
package io.plaf.nord.frame;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.Serial;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author arixion
 *
 */
public class BasicFrame extends JFrame {

	@Serial
	private static final long serialVersionUID = -3881022191208155614L;
	
	private final String title;
	
	/**
	 * 
	 * @param title
	 */
	public BasicFrame(String title) {
		this.title = title;
		initFrame();
	}
	
	/**
	 * 
	 */
	private void initFrame() {
		setTitle(title);
		setSize(new Dimension(640, 480));
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		// Adding a dummy button to it
		final Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER));
		contentPane.add(new JButton("Test Button"));
	}
	
	
}

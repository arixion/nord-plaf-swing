/**
 * 
 */
package io.plaf.nord;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.synth.SynthLookAndFeel;

import io.plaf.nord.frame.BasicFrame;

/**
 * @author Arpan Mukhopadhyay
 *
 */
public class NordPlafBasicFrameTest {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(new SynthLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		SwingUtilities.invokeLater(() -> {
			BasicFrame frame = new BasicFrame("Basic Frame");
			frame.setVisible(true);
		});
	}
}

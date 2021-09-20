package vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class FrameInterno extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameInterno frame = new FrameInterno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameInterno() {
		setBounds(100, 100, 450, 300);

	}

}

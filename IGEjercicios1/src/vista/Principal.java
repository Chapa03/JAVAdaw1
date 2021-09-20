package vista;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;

public class Principal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 602, 445);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel centro = new JPanel();
		frame.getContentPane().add(centro, BorderLayout.CENTER);
		centro.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton = new JButton("RadioButton");
		centro.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		centro.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		centro.add(btnNewButton_2);
	}

}

package vista;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class VentanaPrincipal {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Etiqueta 1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Sitka Small", Font.PLAIN, 15));
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setBackground(Color.GREEN);
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		textField = new JTextField();
		textField.setForeground(Color.LIGHT_GRAY);
		textField.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setForeground(Color.YELLOW);
		frame.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(Color.DARK_GRAY);
		textArea.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(textArea, BorderLayout.SOUTH);
		
		textField_1 = new JTextField();
		frame.getContentPane().add(textField_1, BorderLayout.EAST);
		textField_1.setColumns(10);
	}

}

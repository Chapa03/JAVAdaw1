import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal {

	private JFrame frame;
	private JTextField textFieldNombre;

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
		frame.setBounds(100, 100, 624, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel norte = new JPanel();
		frame.getContentPane().add(norte, BorderLayout.NORTH);
		norte.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblInstrucciones = new JLabel("Introduce aqui tu nombre:");
		norte.add(lblInstrucciones);
		
		textFieldNombre = new JTextField();
		norte.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JPanel centro = new JPanel();
		frame.getContentPane().add(centro, BorderLayout.CENTER);
		centro.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel sur = new JPanel();
		frame.getContentPane().add(sur, BorderLayout.SOUTH);
		sur.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblSaludo = new JLabel("Hola!!!");
		sur.add(lblSaludo);
		
//		Metodo de la accion del boton
		JButton btnBotonSaludo = new JButton("New button");
		btnBotonSaludo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Cambio del texto de la label lblSaludo
				lblSaludo.setText("Hey! Que pasa " + textFieldNombre.getText());
//				Ventana de dialogo
				JOptionPane.showMessageDialog(null, "Eyy " + textFieldNombre.getText() + "!!!");
			}
		});
		centro.add(btnBotonSaludo);
		
		
	}

}

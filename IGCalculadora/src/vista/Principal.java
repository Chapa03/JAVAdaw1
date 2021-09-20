package vista;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import java.awt.Toolkit;
import java.awt.Font;

public class Principal {
	static int num1;
	static int num2;
	static int resultado;
	static char operador = ' ';
	static boolean reset = false;
	

	private JFrame frmChapaLculadora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmChapaLculadora.setVisible(true);
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
		frmChapaLculadora = new JFrame();
		frmChapaLculadora.getContentPane().setFont(new Font("Verdana", Font.PLAIN, 11));
		frmChapaLculadora.setFont(new Font("Verdana", Font.PLAIN, 12));
		frmChapaLculadora.getContentPane().setBackground(new Color(0, 0, 0));
		frmChapaLculadora.setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/vista/files/calc.png")));
		frmChapaLculadora.setResizable(false);
		frmChapaLculadora.setTitle("CHAPAlculadora");
		frmChapaLculadora.setBounds(100, 100, 390, 376);
		frmChapaLculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmChapaLculadora.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel norteFlow = new JPanel();
		norteFlow.setBackground(new Color(70, 130, 180));
		frmChapaLculadora.getContentPane().add(norteFlow, BorderLayout.NORTH);
		norteFlow.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel label = new JLabel("");
		norteFlow.add(label);
		
		JLabel lblNumero1 = new JLabel("");
		lblNumero1.setHorizontalAlignment(SwingConstants.RIGHT);
		norteFlow.add(lblNumero1);
		
		JLabel lblTotalTexto = new JLabel("Total:");
		lblTotalTexto.setFont(new Font("Verdana", Font.BOLD, 16));
		lblTotalTexto.setHorizontalAlignment(SwingConstants.RIGHT);
		norteFlow.add(lblTotalTexto);
		
		JLabel lblNumero2 = new JLabel("");
		lblNumero2.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNumero2.setBackground(Color.GRAY);
		lblNumero2.setToolTipText("Hola");
		lblNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
		norteFlow.add(lblNumero2);
		
		JPanel centroGrid = new JPanel();
		centroGrid.setBackground(new Color(70, 130, 180));
		frmChapaLculadora.getContentPane().add(centroGrid, BorderLayout.CENTER);
		centroGrid.setLayout(new GridLayout(0, 3, 1, 1));
		
		JButton btnDelete = new JButton("<-");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setForeground(new Color(51, 102, 153));
		centroGrid.add(btnDelete);
		btnDelete.setBackground(new Color(255, 99, 71));
		
		JButton btnReset = new JButton("C");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReset.setForeground(new Color(51, 102, 153));
		btnReset.setBackground(new Color(255, 99, 71));
		centroGrid.add(btnReset);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operador = '%';
				lblTotalTexto.setForeground(new Color(255, 99, 71));
				lblTotalTexto.setText(operador + "");
				lblNumero1.setText(lblNumero2.getText());
				num1 = num1 + Integer.parseInt(lblNumero2.getText());
				lblNumero2.setText("");
			}
		});
		btnPercent.setForeground(new Color(176, 196, 222));
		btnPercent.setBackground(new Color(51, 102, 153));
		centroGrid.add(btnPercent);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNumero2.setText(lblNumero2.getText() + "7");
			}
		});
		btn7.setForeground(new Color(51, 102, 153));
		btn7.setBackground(new Color(176, 196, 222));
		centroGrid.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNumero2.setText(lblNumero2.getText() + "8");
			}
		});
		btn8.setForeground(new Color(51, 102, 153));
		btn8.setBackground(new Color(176, 196, 222));
		centroGrid.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNumero2.setText(lblNumero2.getText() + "9");
			}
		});
		btn9.setForeground(new Color(51, 102, 153));
		btn9.setBackground(new Color(176, 196, 222));
		centroGrid.add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNumero2.setText(lblNumero2.getText() + "4");
			}
		});
		btn4.setForeground(new Color(51, 102, 153));
		btn4.setBackground(new Color(176, 196, 222));
		centroGrid.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNumero2.setText(lblNumero2.getText() + "5");
			}
		});
		btn5.setForeground(new Color(51, 102, 153));
		btn5.setBackground(new Color(176, 196, 222));
		centroGrid.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNumero2.setText(lblNumero2.getText() + "6");
			}
		});
		btn6.setForeground(new Color(51, 102, 153));
		btn6.setBackground(new Color(176, 196, 222));
		centroGrid.add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNumero2.setText(lblNumero2.getText() + "1");
			}
		});
		btn1.setForeground(new Color(51, 102, 153));
		btn1.setBackground(new Color(176, 196, 222));
		centroGrid.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNumero2.setText(lblNumero2.getText() + "2");
			}
		});
		btn2.setForeground(new Color(51, 102, 153));
		btn2.setBackground(new Color(176, 196, 222));
		centroGrid.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNumero2.setText(lblNumero2.getText() + "3");
			}
		});
		btn3.setForeground(new Color(51, 102, 153));
		btn3.setBackground(new Color(176, 196, 222));
		centroGrid.add(btn3);
		
		JSeparator separator = new JSeparator();
		centroGrid.add(separator);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNumero2.setText(lblNumero2.getText() + "0");
			}
		});
		btn0.setForeground(new Color(51, 102, 153));
		btn0.setBackground(new Color(176, 196, 222));
		centroGrid.add(btn0);
		
		JButton btnComa = new JButton(",");
		btnComa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnComa.setForeground(new Color(51, 102, 153));
		btnComa.setBackground(new Color(176, 196, 222));
		centroGrid.add(btnComa);
		
		JPanel esteGrid = new JPanel();
		esteGrid.setBackground(new Color(70, 130, 180));
		frmChapaLculadora.getContentPane().add(esteGrid, BorderLayout.EAST);
		esteGrid.setLayout(new GridLayout(0, 1, 1, 1));
		
		JButton btnCociente = new JButton("/");
		btnCociente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operador = '/';
				lblTotalTexto.setForeground(new Color(255, 99, 71));
				lblTotalTexto.setText(operador + "");
				lblNumero1.setText(lblNumero2.getText());
				num1 = num1 + Integer.parseInt(lblNumero2.getText());
				lblNumero2.setText("");
			}
		});
		btnCociente.setForeground(new Color(176, 196, 222));
		btnCociente.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnCociente.setBackground(new Color(51, 102, 153));
		esteGrid.add(btnCociente);
		
		JButton btnProducto = new JButton("*");
		btnProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operador = '*';
				lblTotalTexto.setForeground(new Color(255, 99, 71));
				lblTotalTexto.setText(operador + "");
				lblNumero1.setText(lblNumero2.getText());
				num1 = num1 + Integer.parseInt(lblNumero2.getText());
				lblNumero2.setText("");
			}
		});
		btnProducto.setForeground(new Color(176, 196, 222));
		btnProducto.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnProducto.setBackground(new Color(51, 102, 153));
		esteGrid.add(btnProducto);
		
		JButton btnDiferencia = new JButton("-");
		btnDiferencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operador = '-';
				lblTotalTexto.setForeground(new Color(255, 99, 71));
				lblTotalTexto.setText(operador + "");
				lblNumero1.setText(lblNumero2.getText());
				num1 = num1 + Integer.parseInt(lblNumero2.getText());
				lblNumero2.setText("");
			}
		});
		btnDiferencia.setForeground(new Color(176, 196, 222));
		btnDiferencia.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnDiferencia.setBackground(new Color(51, 102, 153));
		esteGrid.add(btnDiferencia);
		
		JButton btnEqual = new JButton("   =   ");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTotalTexto.setForeground(new Color(204, 255, 0));
				lblTotalTexto.setText("Total:");
				if (((num1 < 0) || (num1 > 0))) {
					System.out.println("Hola if principal (numero)");
					num2 = Integer.parseInt(lblNumero2.getText());
					
					lblNumero1.setText(lblNumero1.getText() + " " + operador + " " + num2);
					switch (operador) {
					case '+':
						lblNumero2.setText("" + (num1 + num2));
						break;
					case '-':
						lblNumero2.setText("" + (num1 - num2));
						break;
					case '*':
						lblNumero2.setText("" + (num1 * num2));
						break;
					case '/':
						lblNumero2.setText("" + (num1 / num2));
						break;
					case '%':
						lblNumero2.setText("" + ((num1 * num2) / 100));
						break;
					} 
					
				} else {
					System.out.println("Hola else principal (no numero)");
					if ((lblNumero2.getText().length() == 0) || (Integer.parseInt(lblNumero2.getText()) != 0)) {
						System.out.println("Hola if anidado (no numero)");
						lblNumero2.setText("0");
					}
					
				}
				
			}
		});
		
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operador = '+';
				lblTotalTexto.setForeground(new Color(255, 99, 71));
				lblTotalTexto.setText(operador + "");
				lblNumero1.setText(lblNumero2.getText());
				num1 = num1 + Integer.parseInt(lblNumero2.getText());
				lblNumero2.setText("");
				
//				operador = '+';
//				lblTotalTexto.setForeground(new Color(255, 99, 71));
//				lblTotalTexto.setText(operador + "");
//				resultado = Integer.parseInt(lblNumero1.getText()) + Integer.parseInt(lblNumero2.getText());
//				lblNumero1.setText("" + resultado);
//				num1 = num1 + Integer.parseInt(lblNumero2.getText());
//				lblNumero2.setText("");
			}
		});
		btnSuma.setForeground(new Color(176, 196, 222));
		btnSuma.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnSuma.setBackground(new Color(51, 102, 153));
		esteGrid.add(btnSuma);
		btnEqual.setForeground(new Color(255, 99, 71));
		btnEqual.setFont(new Font("Verdana", Font.BOLD, 14));
		btnEqual.setBackground(new Color(0, 128, 128));
		esteGrid.add(btnEqual);
		
		JPanel surFlow = new JPanel();
		FlowLayout flowLayout = (FlowLayout) surFlow.getLayout();
		flowLayout.setHgap(10);
		flowLayout.setAlignment(FlowLayout.RIGHT);
		surFlow.setBackground(new Color(70, 130, 180));
		frmChapaLculadora.getContentPane().add(surFlow, BorderLayout.SOUTH);
		
		JLabel lblPresentacion = new JLabel("About");
		lblPresentacion.setFont(new Font("Verdana", Font.PLAIN, 9));
		lblPresentacion.setForeground(new Color(204, 255, 0));
		surFlow.add(lblPresentacion);
		
//		Boton ABOUT
		JButton btnAbout = new JButton("");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "La CALCULADORA mas bacana y facherita del barrio");
			}
		});
		btnAbout.setIcon(new ImageIcon(Principal.class.getResource("/vista/files/ic_info_black_18dp_1x.png")));
		btnAbout.setBackground(new Color(204, 255, 0));
		surFlow.add(btnAbout);
	}
}

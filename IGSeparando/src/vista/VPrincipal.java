package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.VPrincipalControlador;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtContenido;
	

	/**
	 * Create the frame.
	 */
	public VPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JPanel panel_centro = new JPanel();
		contentPane.add(panel_centro, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Etiqueta");
		panel_centro.add(lblNewLabel);
		
		txtContenido = new JTextField();
		panel_centro.add(txtContenido);
		txtContenido.setColumns(10);
		
		JPanel panel_botones = new JPanel();
		contentPane.add(panel_botones, BorderLayout.SOUTH);
		
		JButton btnUno = new JButton("Uno");
		btnUno.setActionCommand("Uno");
		btnUno.addActionListener(new VPrincipalControlador(txtContenido));
		panel_botones.add(btnUno);
		
		JButton btnDos = new JButton("Dos");
		btnDos.setActionCommand("Dos");
		btnDos.addActionListener(new VPrincipalControlador(txtContenido));
		panel_botones.add(btnDos);
	
		JButton btnTres = new JButton("Tres");
		btnTres.setActionCommand("Tres");
		btnTres.addActionListener(new VPrincipalControlador(txtContenido));
		panel_botones.add(btnTres);
	}



}

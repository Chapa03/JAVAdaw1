package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import java.awt.Color;

public class EjemploJList extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public EjemploJList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelBotones = new JPanel();
		contentPane.add(panelBotones, BorderLayout.SOUTH);
		
		textField = new JTextField();
		panelBotones.add(textField);
		textField.setColumns(10);
		
		JPanel panelOeste = new JPanel();
		contentPane.add(panelOeste, BorderLayout.WEST);
		panelOeste.setLayout(new BoxLayout(panelOeste, BoxLayout.X_AXIS));
		
		String[] arrayLista = {"Cristina", "Cristian", "Maria", "Ramiro"};
		JList list = new JList(arrayLista);
		panelOeste.add(list);
		
		JPanel panelCentro = new JPanel();
		panelCentro.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
		contentPane.add(panelCentro, BorderLayout.CENTER);
		panelCentro.setLayout(new BoxLayout(panelCentro, BoxLayout.X_AXIS));
		
		JPanel panelEste = new JPanel();
		contentPane.add(panelEste, BorderLayout.EAST);
		panelEste.setLayout(new BoxLayout(panelEste, BoxLayout.Y_AXIS));
		
		List<String> varLista = Arrays.asList(arrayLista);
		JList list_1 = new JList(arrayLista);
		panelEste.add(list_1);
		
		DefaultListModel modelo = new DefaultListModel();
		modelo.addAll(varLista);
		modelo.addElement("Ana");
		
		JList listaConModelo = new JList(modelo);
		listaConModelo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane scroll = new JScrollPane(listaConModelo);
		panelCentro.add(scroll);
		
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(e -> {
			modelo.addElement(textField.getText());
			textField.setText("");
		});
		panelBotones.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.remove(listaConModelo.getSelectedIndex());
			}
		});
		panelBotones.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Borrar todos");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.removeAllElements();
			}
		});
		panelBotones.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Mostrar seleccionado");
		btnNewButton_3.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, listaConModelo.getSelectedValue());
		}
				);
		panelBotones.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Cambiar tipo selecci\u00F3n");
		btnNewButton_4.addActionListener(e -> {
			listaConModelo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		});
		panelBotones.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Ver seleccionados");
		btnNewButton_5.addActionListener(e -> {
			JOptionPane.showInternalMessageDialog(null, listaConModelo.getSelectedValuesList());
			for (Object s : listaConModelo.getSelectedValuesList()) {
				
			}
		});
		panelBotones.add(btnNewButton_5);


		JButton btnNewButton_6 = new JButton("Borrar seleccionados");
		btnNewButton_6.addActionListener(e -> {
			int cont = 0;
			for (Integer y : listaConModelo.getSelectedIndices()) {
				modelo.remove(y - cont++);
			}
		});
		panelBotones.add(btnNewButton_6);
		
	}

}







package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class VPrincipalControlador implements ActionListener {
//	Para cambiar desde el control un elemento de la vista, hay que crear el elemento
//	de la vist que queramos modificar y añadirlo al contructor, para poder llamarlo desde la vista
	private JTextField txtContenido;
	
	public VPrincipalControlador(JTextField txtContenido) {
		super();
		this.txtContenido = txtContenido;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		Object o = e.getSource();
		String s = e.getActionCommand();
		
//		Para Utilizar el getSource, necesitamos que cada boton sea un atributo
//		de la clase.
//		if (o == btnDos) {
//			System.out.println("Boton dos");
//		} else if(o == btnUno) {
//			System.out.println("Boton uno");
//		} else if(o == btnTres) {
//			System.out.println("Boton tres");
//		}
		
//		Con el getActionCommand podemos declarar los botones donde queramos
		switch (s) {
		case "Uno":
			txtContenido.setText("Boton uno");
			break;
		case "Dos":
			txtContenido.setText("Boton dos");
			break;
		case "Tres":
			txtContenido.setText("Boton tres");
			break;
		default:
			break;
		}
		
	}

}

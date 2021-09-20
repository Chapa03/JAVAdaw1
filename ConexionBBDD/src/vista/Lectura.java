package vista;

import java.util.Scanner;

import modelo.clases.Producto;

public class Lectura {
	static Scanner scan=new Scanner(System.in);
	
	public static Producto leerProducto() {
		Producto p= new Producto();
		System.out.println("Dime el código:");
		p.setIdProducto(scan.nextInt());
		System.out.println("Dime el nombre:");
		p.setNombreProducto(scan.next());
		return p;
	}
}

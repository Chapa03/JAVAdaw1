package ejercicios.basicas2;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static String leerDescripcion() {
		System.out.print("Introduce una descripcion: ");
		return sc.next();
	}
	
	public static int leerCantidad(String s) {
		System.out.print("Introduce " + s);
		return sc.nextInt();
	}
	
	public static Articulo datosArticulo() {
		Articulo a = new Articulo();
		a.setDescripcion(leerDescripcion());
		a.setCantidad(leerCantidad("la cantidad: "));
		a.setStockMinimo(leerCantidad("el stock minimo: "));
		return a;
	}

	public static void main(String[] args) {
		Articulo a1 = new Articulo("Mascarilla", 150, 50);
		System.out.println(a1.toString());
		
		Articulo a2 = datosArticulo();
		System.out.println(a2.toString());
		
		while (a2.cantidad < a2.stockMinimo + (a2.stockMinimo * 25 / 100)) {
			if (a2.bajoStock()) {
				System.out.println("\tRiesgo de agotar existencias de " + a2.getDescripcion());
				System.out.println("Deberian adquirirse " + a2.compraMinima() + " unidades de " + a2.getDescripcion());
				System.out.print("Cuantas unidades de " + a2.descripcion + " deseas adquirir?: ");
				a2.nuevosArticulos(sc.nextInt());
				System.out.println("Stock actualizado:");
				System.out.println(a2.toString());
			} else {
				System.out.println("\n" + a2.compraMinima() + " unidad/es necesaria/s para remamente de " + a2.getDescripcion());
				System.out.print("Cuantas unidades de " + a2.descripcion + " deseas adquirir?: ");
				a2.nuevosArticulos(sc.nextInt());
				System.out.println("Stock actualizado:");
				System.out.println(a2.toString());
			}
		}
		sc.close();
	}

}

package ampliacion;

import java.util.Scanner;

public class Ejercicio1c {
//	Realizar un programa que reciba un precio inicial 
//	y las unidades compradas y que decida el precio final , 
//	teniendo en cuenta que a partir de 25 unidades se descuenta un 10%, 
//	a partir de 150 unidades un 25% y a partir de 1000 unidades un 40%.
	static Scanner sc = new Scanner(System.in);
	
	public static double entrada() {
		double entrada;
		entrada = sc.nextDouble();
		return entrada;
	}
	
	public static double precioSinDescuento(double precio, double unidades) {
		double total;
		total = precio * unidades;
		return total;
	}
	
	public static int tieneDescuento(double unidades) {
		int tipoDescuento;
		
		if ((unidades >= 25) && (unidades < 150)) {
			tipoDescuento = 1;
		} else if ((unidades >= 150) && (unidades < 1000)) {
			tipoDescuento = 2;
		} else if (unidades >= 1000) {
			tipoDescuento = 3;
		} else {
			tipoDescuento = 0;
		}
		
		return tipoDescuento;
	}
	
	public static void salida(double total, double unidades, double precio, int tipoDescuento) {
		int porcentaje = 0;
		double precioFinal = 0, descuento = 0;
		switch (tipoDescuento) {
		case 0:
			porcentaje = 0;
			descuento = 0;
			precioFinal = total;
			break;
		case 1:
			porcentaje = 10;
			descuento = total * 0.1;
			precioFinal = (total - descuento);
			break;
		case 2:
			porcentaje = 25;
			descuento = (total * 0.25);
			precioFinal = (total - descuento);
			break;
		case 3:
			porcentaje = 40;
			descuento = (total * 0.4);
			precioFinal = (total - descuento);
			break;
		}
		
		System.out.println("\n\t* * * Factura generada * * *"
				+ "\n\t----------------------------"
				+ "\n\t|"
				+ "\n\t| Articulos:\t" + (int) unidades + "uds"
				+ "\n\t|"
				+ "\n\t| Precio/ud:\t" + precio + "eur/ud"
				+ "\n\t|"
				+ "\n\t|      Suma:\t" + total + "eur"
				+ "\n\t|"
				+ "\n\t| Descuento:\t- " + porcentaje + "%"
				+ "\n\t|           \t- " + descuento + "eur"
				+ "\n\t|---------------------------"
				+ "\n\t|     Total:\t" + precioFinal + "eur"
				+ "\n\t----------------------------");
	}


	public static void main(String[] args) {
		double precio, unidades, total;
		int tipoDescuento;
		
		System.out.print("Introduce el precio del articulo: ");
		precio = entrada();
		System.out.print("Cuantas unidades adquieres del articulo? ");
		unidades = entrada();
		
		total = precioSinDescuento(precio, unidades);
		tipoDescuento = tieneDescuento(unidades);
		
		salida(total, unidades, precio, tipoDescuento);
		
		sc.close();
	}

}

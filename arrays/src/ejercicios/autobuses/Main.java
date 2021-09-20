package ejercicios.autobuses;

import java.util.Arrays;

public class Main {
//aniadir a un array 5 autobuses de distintos tipos
//escribir por pantalla solo aquellos que estan activos
//modificar el estado de dos de ellos
//crear otro array con los interurbanos a partir del anterior

	public static Autobus[] listaAutobusesActivos(Autobus[] f1) {
		int cont = 0;
		for (int i = 0; i < f1.length; i++) {
			if (f1[i].getEstado().equals("Activo")) {
				cont++;
			}
		}

		Autobus[] listaActivos = new Autobus[cont];
		
		int j = 0;
		for (int i = 0; i < f1.length; i++) {
			if (f1[i].getEstado().equals("Activo")) {
				listaActivos[j] = f1[i];
				j++;
			}
		}
		return listaActivos;
	}

	public static void main(String[] args) {
		Autobus[] flota1 = new Autobus[5];
		flota1[0] = new Autobus(1, "Urbano", "Activo");
		flota1[1] = new Autobus(282, "Interurbano", "Inactivo");
		flota1[2] = new Autobus(5, "Urbano", "Inactivo");
		flota1[3] = new Autobus(3, "Urbano", "Activo");
		flota1[4] = new Autobus(341, "Interurbano", "Activo");

		System.out.println(Arrays.toString(listaAutobusesActivos(flota1)));
	}

}

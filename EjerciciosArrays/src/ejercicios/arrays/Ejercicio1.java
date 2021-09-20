package ejercicios.arrays;

import java.util.Scanner;

public class Ejercicio1 {
//	Crea un array de 5 posiciones en el que insertes valores de 
//	palabras que insertas por teclado. 
//	Muestra por consola todos los �ndices y las palabra de cada posici�n de la 
//	siguiente forma: (0 - palabra ; 1- palabra; 2 - palabra; 3 - palabra; 4 - palabra)
//	Solicita por pantalla el �ndice que quieres mostrar y que te ense�e la 
//	palabra que contiene esa posici�n
//	Solicita por pantalla una palabra y que te diga en qu� posici�n 
//	est� (�La palabra est� en la posici�n x�. Si no la encuentra, que te lo 
//	indique (�La palabra no est� incluida en tu array�)
	static Scanner sc = new Scanner(System.in);

	public static String[] rellenarArray(String[] array) {
		int cont = 0;
		while (cont < 5) {
			System.out.print("Introduce la " + (cont + 1) + "a palabra del array (indice " + cont + "): ");
			array[cont] = sc.next();
			cont++;
		}
		return array;
	}

	public static String escribirArray(String[] array) {
		String salida = "";
		for (int i = 0; i < array.length; i++) {
			salida += (i + 1) + " - " + array[i] + "; ";
		}
		return salida;
	}

	public static String buscarPorIndice(String[] array) {
		String posicion = "";
		boolean bucle = true;
		System.out.print("Introduce un indice para mostrar su palabra almacenada: ");
		while (bucle) {
			int indice = sc.nextInt();
			if ((indice >= 0) && (indice < 5)) {
				posicion = indice + " - " + array[indice];
				bucle = false;
			} else {
				System.out.print("Ese indice no es valido. Intentalo de nuevo: ");
			}
		}
		return posicion;
	}

	public static String buscarPorPalabra(String[] array) {
		String salidaIndice = "";
		System.out.println("Introduce una palabra para saber en que posicion del array se encuentra: ");
		String palabra = sc.next();
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(palabra)) {
				salidaIndice = "Indice: " + i;
			}
		}
		if (salidaIndice.equals("")) {
			salidaIndice = "La palabra no esta en el array.";
		}
		return salidaIndice;
	}

	public static void main(String[] args) {
		String[] array = new String[5];

		rellenarArray(array);
		System.out.println(escribirArray(array));
		System.out.println(buscarPorIndice(array));
		System.out.println(buscarPorPalabra(array));
	}

}

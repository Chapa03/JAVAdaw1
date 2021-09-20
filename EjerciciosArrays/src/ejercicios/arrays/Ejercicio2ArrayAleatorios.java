package ejercicios.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2ArrayAleatorios {
//	Rellenar un array de 20 posiciones con números entre 10 y 30 aleatorios.
//	Mostrar por pantalla:
//	Los números de cada posición en una fila
//	La suma de todos los números obtenidos en el array
//	La media de todos los números obtenidos en el array
//	Los que sean mayores de 20 en una fila
//	El número de mayores de 20 obtenidos
	static Random rnd = new Random();
	
	public static int[] rellenarNumeros(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(21) + 10;
		}
		return array;
	}
	
	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static int sumaNumerosArray(int[] array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return suma;
	}
	
	public static int mediaNumerosArray(int[] array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return suma / array.length;
	}
	
//	alguna manera de inicializar el array sin definir el numero de
//	posiciones que va a tener?
	public static int[] arrayMayores20(int[] array) {
		int[] mayores20;
		int cont = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 20) {
				cont++;
			}
		}
		mayores20 = new int[cont];
		cont = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 20) {
				mayores20[cont] = array[i];
				cont++;
			}
		}
		return mayores20;
	}

	public static void main(String[] args) {
		int[] arrayNumeros = new int[20];
		
		rellenarNumeros(arrayNumeros);
		System.out.println("Numeros de cada posicion en una fila: ");
		mostrarArray(arrayNumeros);
		System.out.println("Suma total de los numeros del array: " + sumaNumerosArray(arrayNumeros));
		System.out.println("La media aritmetica de los valores del array es: " + mediaNumerosArray(arrayNumeros));
		System.out.println("Nuevo array con los numeros mayores de 20 del anterior:");
		System.out.println(Arrays.toString(arrayMayores20(arrayNumeros)));
		System.out.println("Numero de mayores de 20 obtenidos: " + arrayMayores20(arrayNumeros).length);
	}

}

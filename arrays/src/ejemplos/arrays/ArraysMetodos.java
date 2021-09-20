package ejemplos.arrays;

import java.util.Arrays;

public class ArraysMetodos {
	
	public static void recibirEscritura(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	public static int[] inicializar(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = i * 2;
		}
		return array;
	}
	
	public static void intercambioPosiciones(int[] array) {
		int aux = 0;
		aux = array[1];
		array[1] = array[3];
		array[3] = aux;
	}

	public static void main(String[] args) {
		int[] miArray = new int[5];

		recibirEscritura(miArray);
		recibirEscritura(inicializar(miArray));
		recibirEscritura(miArray);
		intercambioPosiciones(miArray);
		recibirEscritura(miArray);
		
		miArray[3] = 34;
		miArray[0] = 12;

//		El sort() no devuelve valores, sino que cambia las posiciones del array
		Arrays.sort(miArray);
		recibirEscritura(miArray);
		
		String[] aS = {"viernes", "jueves", "lunes", "martes", "miercoles"};
		Arrays.sort(aS);
		System.out.println(Arrays.toString(aS));
	}

}

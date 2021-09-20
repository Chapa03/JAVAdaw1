package ejercicios.arrays;

import java.util.Arrays;

public class Ejercicio2 {
//	Crear un array de String con 4 elementos, inicializarlo con los 
//	valores y comparar los elementos 1 y 3 , de forma que nos escriba 
//	por pantalla si son iguales independientemente de c�mo est�n escritos
//	Intercambiar el contenido de las posiciones 2 y 4 del array.

	public static void main(String[] args) {
		String[] cadenas = {"Capirote", "pleistoceno", "CaPirOTe", "cachiporra"};
		
		if (cadenas[0].toLowerCase().compareTo(cadenas[2].toLowerCase()) == 0) {
			System.out.println("Los dos elementos son iguales");
		} else { 
			System.out.println("Los dos elementos son distintos");
		}
		
		String[] intercambio = {cadenas[0], cadenas[2]};
		
		cadenas[0] = intercambio[1];
		cadenas[2] = intercambio[0];
		
		System.out.println(Arrays.toString(cadenas));
	}

}
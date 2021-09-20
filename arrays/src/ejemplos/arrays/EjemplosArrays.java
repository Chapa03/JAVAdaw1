package ejemplos.arrays;

import java.util.Arrays;
import java.util.Random;

public class EjemplosArrays {
	static Random rnd = new Random();

	public static void main(String[] args) {
		int[] varInt = new int[3];
		varInt[0] = 2;
		varInt[1] = 3;
		varInt[2] = 4;
		
//		para un array ya declarado, no se puede variar su longitud
//		aunque si se pueden almacenar diferentes tipos de elementos
//		o que cada dimension del array sea de una longitud distinta
//		varInt[3] = 5;
		System.out.println("Array varInt");
		for (int i = 0; i <= varInt.length - 1; i++) {
			System.out.println(varInt[i]);
		}
		
		
		int[] otroVar = {10, 11, 12};
		System.out.println("Array otroVar");
		for (int i = 0; i <= otroVar.length - 1; i++) {
			System.out.println(otroVar[i]);
		}
		
		String[] frase = {"En", "un", "lugar", "de", "la", "mancha"};
		System.out.println(frase[2]);
		System.out.println(Arrays.toString(frase));
		System.out.println(Arrays.toString(otroVar));
		
		int[] temperaturas = new int[100];
//		por defecto, un array de enteros se inicializa con todos los valores a 0
		System.out.println(Arrays.toString(temperaturas));
		
		for (int i = 0; i <= temperaturas.length - 1; i++) {
			temperaturas[i] = rnd.nextInt(9) + 35;
		}
		System.out.println(Arrays.toString(temperaturas));

	}

}

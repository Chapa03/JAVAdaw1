package ejemplos.arrays;

import java.util.Arrays;

public class ForEachEquals {

	public static void main(String[] args) {
//		Creacion e inicializacion
//		int n = 23;
//		int[] miArrayEnteros1 = new int[n];
		int[] miArrayEnteros = {1,2,3,45,34};
		String[] miArrayString = {"uno","dos","tres","cuarenta y cinco","treinta y cuatro"};
		
//		Acceso a posiciones del array
		System.out.println(miArrayEnteros[3]);
		System.out.println(miArrayString[3]);
		
//		Asignacion de valores
		miArrayEnteros[0] = 8;
		miArrayString[0] = "ocho";
		
//		Acceso a un indice que no existe
//		System.out.println(miArrayEnteros[6]);
		
//		Asignar contenido a un indice que no existe
//		miArrayEnteros[5] = 23;
		
//		Escribir por pantalla todos los valores del Array
		System.out.println(Arrays.toString(miArrayString));
		System.out.println(Arrays.toString(miArrayEnteros));
		
//		Funciones de arrays
		System.out.println("Length");
		String s = "hola";
		System.out.println(miArrayEnteros.length + " y " + s.length());
		
		for (int i = 0; i < miArrayEnteros.length; i++) {
			miArrayEnteros[i] += 1;
			System.out.print(miArrayEnteros[i] + ".");
		}
		System.out.println("\n");
		
//		FOR EACH
//		No trabaja con indices. Recorre el bucle almacenando el valor de cada
//		iteracion en la variable que nosotros declaramos
		System.out.println("FOR EACH:");
		for (String palabra: miArrayString) {
			System.out.print(palabra + "; ");
		}
		
		System.out.println();
		for (int num: miArrayEnteros) {
			System.out.print(num + ". ");
		}
		System.out.println("\n");
		
//		Utilizacion del equals()
		int[] miArrayEnteros2 = {1,2,3,45,34};
		int[] miArrayEnteros3 = {1,2,3,45,34};
//		De esta forma no funciona porque esta comparando las referencias del objeto
//		System.out.println(miArrayEnteros2.equals(miArrayEnteros3));
		System.out.println("Comparacion con Arrays.equals: " + Arrays.equals(miArrayEnteros2, miArrayEnteros3));
		int[] otroArray = miArrayEnteros2;
//		De esta manera si nos da un true en la comparacion de dos arrays diferentes, porque
//		al segundo array le hemos asignado los valores del primero, por lo que ha recogido
//		las referencias del primer array y en la comparacion son iguales
		System.out.println("Comparacion otroArray: " + miArrayEnteros2.equals(otroArray));
		
//		COPYOF
		int[] miArrayEnteros4 = Arrays.copyOf(miArrayEnteros, miArrayEnteros.length);
		System.out.println("Comparacion con Arrays.equals despues de crear el array con Arrays.copyOf: " + Arrays.equals(miArrayEnteros4, miArrayEnteros));
		
	}

}

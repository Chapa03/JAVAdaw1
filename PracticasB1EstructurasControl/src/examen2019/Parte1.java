package examen2019;

import java.util.Scanner;

public class Parte1 {
//	Se desea reconstruir una frase que nos dan en palabras sueltas. Para ello:
//		Pedir el número de palabras que quieren insertar
//		Leer todas las palabras de la frase, cada una en una línea. 
//		Recomponer la frase con espacios separando las palabras
//		Escribir la frase, de forma que se alterne la forma de escribirlas: una en minúsculas y 
//		la siguiente en mayúsculas
//		Escribir la frase leída, dividiéndola en grupos de dos letras separadas por - y  de forma 
//		que en cada línea tengamos 3 grupos de dos letras solamente. (No considerar los 
//		espacios para generar los grupos de letras)
	static Scanner sc = new Scanner(System.in);

	public static String leerPalabra(int n) {
		String palabra = "";
		System.out.print("Introduce la " + n + "a palabra:");
		palabra = sc.next();
		return palabra;
	}

	public static void main(String[] args) {
		String frase = "";
		int control = 1;
		System.out.print("Cuantas palabras vas a introducir? ");
		for (int i = sc.nextInt(); i > 0; i--) {
			if (i % 2 == 0) {
				frase += leerPalabra(control).toLowerCase() + " ";
				control++;
			} else {
				frase += leerPalabra(control).toUpperCase() + " ";
				control++;
			}
		}
		System.out.println(frase);

//		resuelvo la ultima parte eliminando los espacios de la variable frase
//		y trabajando con el resultado.
		String resultado = "";
		int cont = 0;
		resultado = frase.replace(" ", "");
		for (int i = 0; i < resultado.length(); i++) {
			if ((cont % 2 == 0) && (cont != 0)) {
				System.out.print("-");
			}
			if ((cont % 6 == 0) && (cont != 0)) {
				System.out.println();
			}
			System.out.print(resultado.charAt(i));
			cont++;
		}
	}

}

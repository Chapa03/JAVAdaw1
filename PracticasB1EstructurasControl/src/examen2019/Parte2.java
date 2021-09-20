package examen2019;

import java.util.Scanner;

public class Parte2 {
//	De una frase leída por pantalla queremos tener un método que nos devuelva:
//		Cada palabra en una línea
//		Para cada palabra, en la misma línea:
//		La palabra en mayúsculas
//		El número de caracteres de la palabra
//		Al final la frase completa, con cada palabra comenzando por mayúscula
//		y el resto tal y como se ha escrito en la original.
	static Scanner sc = new Scanner(System.in);
	
	public static String leerFrase() {
		String frase = "";
		System.out.print("Introduce una frase: ");
		frase = sc.nextLine();
		return frase;
	}
	
	public static void salidaEnLineas(String s) {
		String fraseMayus = s.toUpperCase() + " ";
		fraseMayus.toUpperCase();
		int index1 = 0;
		int index2 = 0;
		for (int i=0; i < fraseMayus.length(); i++) {
			if ((fraseMayus.charAt(i) == ' ')) {
				index2 = i;
				System.out.print("-");
				System.out.println(fraseMayus.substring(index1, index2) + ":" + fraseMayus.substring(index1, index2).length());
				index1 = i+1;
			}
		}
	}
	
	public static void salidaFraseMayus(String s) {
		String fraseMinus = s.toLowerCase();
		for (int i=0; i < fraseMinus.length(); i++) {
			if (i == 0) {
				System.out.print(fraseMinus.toUpperCase().charAt(i));
			} else if (fraseMinus.charAt(i) == ' ') {
				System.out.print(" " + fraseMinus.toUpperCase().charAt(++i));
			} else {
				System.out.print(fraseMinus.charAt(i));

			}
		}
	}
	
	public static void main(String[] args) {
		String frase;
		frase = leerFrase();
		salidaEnLineas(frase);
		salidaFraseMayus(frase);
		

	}

}

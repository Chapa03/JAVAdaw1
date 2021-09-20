package ejercicios23;

import java.util.Scanner;

public class Ejercicio3 {
	static Scanner sc = new Scanner(System.in);
	
	public static void leerPalabras() {
		String entradaCompleta = "";
		boolean condicion = true;
		int contador = 0;
		while (condicion) {
			System.out.print("Introduce una palabra (Deten el programa con FIN): ");
			String palabra = sc.next();
			if(!palabra.equals("FIN")) {
				if(palabra.length() >= 5) {
					entradaCompleta += palabra + " ";
					contador++;
					if (contador == 3) {
						entradaCompleta += "\n";
						contador = 0;
					}
				}
			} else {
				condicion = false;
				System.out.println("Finalizando el programa");
			}
		}
		System.out.println(entradaCompleta);
	}

	public static void main(String[] args) {
		leerPalabras();
	}

}

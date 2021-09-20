package ejercicios.arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5ArraysBarcos {
//	Crear un juego de adivinar barquitos unidimensional. En un array de 10 posiciones, 
//	se fijan 3 a true de forma aleatoria y el resto a false. Se trata de adivinar 
//	desde la consola las posiciones en las que est�n los barcos situados.
//	Modificarlo para que s�lo se permitan tres fallos.
//
//	Posibles ampliaciones: barcos que ocupen m�s de una posici�n en un array mayor y que  
//	distinga entre tocado y hundido, que avise de cuando ha sido tocado.
//	limitar el n�mero de barcos de cada tipo: 1 de 3 posiciones, 2 de 2 posiciones y 3 de 
//	una posici�n. En un array bidimensional.
	static Scanner sc = new Scanner(System.in);
	static Random rnd = new Random();
	
	public static int entrada() {
		System.out.print("Introduce una posicion del 1 al 10: ");
		return sc.nextInt() - 1;
	}
	
	public static boolean[] generarBarquitos() {
		boolean[] barquitos = new boolean[10];
		int cont = 0;
//		generamoshasta tres posiciones true para el array
		for (int i = 0; i < barquitos.length; i++) {
			if ((rnd.nextInt(2) == 0) && (cont < 3)) {
				barquitos[i] = true;
				cont++;
			} else {
				barquitos[i] = false;
			}
		}
		cont = 0;
//		contamos el numero de trues
		for (int i = 0; i < barquitos.length; i++) {
			if (barquitos[i] == true) {
				cont++;
			}
		}
//		como mediante este metodo no podemos asegurar
//		un minimo de 3 true, si el array no los contiene,
//		llama al metodo de nuevo y solo llegara al return
//		cuando haya 3 true en el array que genera
		if(cont != 3) {
			generarBarquitos();
		}
		return barquitos;
	}
	
	public static boolean adivinarPosiciones(boolean[] array) {
		boolean adivinar = false;
		int contFallos = 0;
		int contAciertos = 0;
		while ((contFallos < 3) && (contAciertos < 3)) {
			if (array[entrada()] == true) {
				System.out.println("Tocado y hundido!!!");
				contAciertos++;
			} else {
				System.out.println("AGUA");
				contFallos++;
			}
		}
		if (contFallos < contAciertos) {
			adivinar = true;
		}
		return adivinar;
	}

	public static void main(String[] args) {
		boolean[] barquitos = generarBarquitos();
		
		if (adivinarPosiciones(barquitos)) {
			System.out.println("Enhorabuena!! Has hundido todos los barcos!!!");
		} else {
			System.out.println("No has conseguido hundir la flota. Vuelve a intentarlo de nuevo...");
		}
		
	}

}

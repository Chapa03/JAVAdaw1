package ejercicios.clasesEspeciales;

import java.util.Random;
import java.util.Scanner;

public class CartonBingo {
//	4. Generar una linea de carton de bingo
	static Scanner sc = new Scanner(System.in);
	static Random rnd = new Random();
	static String linea = "";
	
	public static int numero() {
		return rnd.nextInt(99) + 1;
	}
	
	public static String generarLinea() {
		for (int i = 0; i < 9; i++) {
			if (linea.indexOf(numero() + "") == -1) {
				linea += numero() + " ";
			} else {
				i--;
			}
		}
		return linea;
	}
	
	public static void main(String[] args) {
		System.out.print(generarLinea());
	}

}

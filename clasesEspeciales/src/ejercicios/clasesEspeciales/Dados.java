package ejercicios.clasesEspeciales;

import java.util.Random;

public class Dados {
//	2. Generar un programa que nos permita jugar una partida de dados:
//	que saque una tirada de 5 dados, con valores entre 1 y 6.

	static Random rnd = new Random();

	public static int dado(int caras) {
		return rnd.nextInt(caras) + 1;
	}

	public static void tirada(int veces) {
		for (int i = 1; i <= veces; i++) {
			System.out.println("Dado " + i + ": " + dado(6));
		}
	}

	public static void main(String[] args) {
		tirada(5);
	}

}

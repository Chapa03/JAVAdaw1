package ejercicios.clasesEspeciales;

import java.util.Random;
import java.util.Scanner;

public class GenerarCarta {
	static Scanner sc = new Scanner(System.in);
	
	public static String paloCarta(int palo) {
		String paloEscrito = "";
		switch (palo) {
		case 1:
			paloEscrito = "Oros";
			break;
		case 2:
			paloEscrito = "Copas";
			break;
		case 3:
			paloEscrito = "Bastos";
			break;
		case 4:
			paloEscrito = "Espadas";
			break;
		}
		return paloEscrito;
	}
	
	public static String cartaEscrita(int carta) {
		String cartaEscrita = "";
		switch (carta) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
			cartaEscrita = "" + carta;
			break;
		case 8:
			cartaEscrita = "J";
			break;
		case 9:
			cartaEscrita = "Q";
			break;
		case 10:
			cartaEscrita = "K";
			break;
		}
		return cartaEscrita;
	}
	
	public static void main(String[] args) {
		Random rnd = new Random();
		System.out.println("Generador automatico de cartas:");
		System.out.println("La carta es: " + cartaEscrita(rnd.nextInt(10) + 1) + " de " + paloCarta(rnd.nextInt(4) + 1));
	}

}

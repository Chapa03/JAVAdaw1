package ampliacion;

import java.util.Scanner;

public class Ejercicio2c2 {
//	Leer dos valores de cartas posibles (Las figuras serán J,Q,K) y decidir si
//	se ha pasado o no en un juego de las 7 y media (las figuras valen media y el 
//	resto su valor). No están permitidos 8 y 9 , como en la baraja española. 
	static Scanner sc = new Scanner(System.in);
	
	public static char leerValor(String tipo) {
		boolean noValido = true;
		char car = ' ';
		String palabra;
		while (noValido) {
			System.out.println("Escribeme la " + tipo + " carta: ");
			palabra = sc.next().toUpperCase();
			car = palabra.charAt(0);
			if ((palabra.length() == 1) && ((car > '0') && (car < '8')) || (car == 'J') || (car == 'Q') || (car == 'K')){
				noValido = false;
			} else {
				System.out.println("Las cartas validas son: 1, 2, 3, 4, 5, 6, 7, J, Q y K");
			}
		}
		return car;
	}
	
	public static float transformar(char valorLeido) {
		float numLeido = 0.0F;
		switch(valorLeido) {
		case '1':
			numLeido = 1F;
			break;
		case '2':
			numLeido = 2F;
			break;
		case '3':
			numLeido = 3F;
			break;
		case '4':
			numLeido = 4F;
			break;
		case '5':
			numLeido = 5F;
			break;
		case '6':
			numLeido = 6F;
			break;
		case '7':
			numLeido = 7F;
			break;
		case 'J':
			numLeido = 0.5F;
			break;
		case 'Q':
			numLeido = 0.5F;
			break;
		case 'K':
			numLeido = 0.5F;
			break;
		}
		return numLeido;
	}
	
	public static float sumaValores(float v1, float v2) {
		return v1 + v2;
	}
	
	public static void main(String[] args) {
		float suma1, suma2;
		System.out.println("Primer jugador:");
		suma1 = sumaValores(transformar(leerValor("primera")), transformar(leerValor("segunda")));
		System.out.println("Segundo jugador:");
		suma2 = sumaValores(transformar(leerValor("primera")), transformar(leerValor("segunda")));
		
		if ((suma1 > 7.5) || (suma2 > 7.5)){
			System.out.println("Se ha pasado del valor");
		} else {
			if (suma1 >  suma2) { 
				System.out.println("El primer jugador haganado con " + suma1 + " puntos!");
			} else if(suma1 < suma2) {
				System.out.println("El segundo jugador ha ganado con " + suma2 + " puntos!");
			} else {
				System.out.println("Los dos jugadores han empatado!");
			}
		}
		sc.close();
	}
}
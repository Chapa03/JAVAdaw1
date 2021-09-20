package ampliacion;

import java.util.Scanner;

public class EjercicioCD {
//	Leer dos valores de cartas posibles (Las figuras seran J,Q,K) y decidir si
//	se ha pasado o no en un juego de las 7 y media (las figuras valen media y el 
//	resto su valor). No esan permitidos 8 y 9 , como en la baraja espaniola. 
//	ejercicio anterior con 3 cartas
	static Scanner sc = new Scanner(System.in);
	
	public static char leerValor(String tipo) {
		boolean noValido = true;
		char car = ' ';
		String palabra;
		while (noValido) {
			System.out.print("Escribeme la " + tipo + " carta: ");
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
		float suma1, suma2, suma3;
		System.out.println("\tPrimer jugador:");
		suma1 = sumaValores(transformar(leerValor("primera")), transformar(leerValor("segunda")));
		System.out.println();
		System.out.println("\tSegundo jugador:");
		suma2 = sumaValores(transformar(leerValor("primera")), transformar(leerValor("segunda")));
		System.out.println();
		System.out.println("\tTercer jugador:");
		suma3 = sumaValores(transformar(leerValor("primera")), transformar(leerValor("segunda")));
		System.out.println();
		
		
		if ((suma1 > 7.5) && (suma2 > 7.5) && (suma3 > 7.5)) {
			System.out.println("Los tres jugadores han perdido");
		} else if ((suma1 <= 7.5) && (suma1 == suma2) && (suma1 == suma3)) {
			System.out.println("Los 3 jugadores han empatado");
		} else if ((suma1 <= 7.5) && (((suma2 < 7.5) && (suma2 < suma1)) || (suma2 > 7.5)) && ((suma3 < 7.5) && (suma3 < suma1) || (suma3 > 7.5))) {
			System.out.println("Gana el jugador 1 con " + suma1 + " puntos!!");
		} else if ((suma2 <= 7.5) && (((suma1 < 7.5) && (suma1 < suma2)) || (suma1 > 7.5)) && ((suma3 < 7.5) && (suma3 < suma2) || (suma3 > 7.5))) {
			System.out.println("Gana el jugador 2 con " + suma1 + " puntos!!");
		} else if ((suma3 <= 7.5) && (((suma2 < 7.5) && (suma2 < suma3)) || (suma2 > 7.5)) && ((suma1 < 7.5) && (suma1 < suma3) || (suma1 > 7.5))) {
			System.out.println("Gana el jugador 3 con " + suma1 + " puntos!!");
		} else if ((suma2 == suma3) && ((suma1 > 7.5) || ((suma1 < 7.5) && (suma1 < suma2)))) {
			System.out.println("El jugador 1 ha perdido y los jugadores 2 y 3 quedan empate con " + suma2 + " puntos.");
		} else if ((suma1 == suma3) && ((suma2 > 7.5) || ((suma2 < 7.5) && (suma2 < suma1)))) {
			System.out.println("El jugador 2 ha perdido y los jugadores 2 y 3 quedan empate con " + suma1 + " puntos.");
		} else if ((suma1 == suma2) && ((suma3 > 7.5) || ((suma3 < 7.5) && (suma3 < suma2)))) {
			System.out.println("El jugador 3 ha perdido y los jugadores 2 y 3 quedan empate con " + suma2 + " puntos.");
		}
		sc.close();
	}
}

import java.util.Scanner;

public class Ejercicio11 {
//	Realizar un programa que lea una palabra y nos permita a partir de un menú, completar las distintas opciones a través de métodos:
//		--------------MENÚ DE OPCIONES----------------------------
//		UNO- Mostrar la palabra al revés
//		DOS- Mostrar sólo la primera y la última letra de una palabra, y las intermedias con X
//		TRES- Mostrar sólo las vocales de la palabra, y el resto en C
//		CUATRO- SALIR
//		Que se ejecute todas las veces que queramos

	static Scanner sc = new Scanner(System.in);

	public static String leerPalabra() {
		String palabra;
		System.out.print("Introduce una palabra: ");
		palabra = sc.next();
		return palabra;
	}

	public static String invertirPalabra(String palabra) {
		String palabraInvertida = "";
		// i, que va a ser el indice, tiene que ser igual a la longitud de la palabra
		// MENOS 1, porque el indice epieza en 0
		int i = palabra.length() - 1;
		while (i >= 0) {
			palabraInvertida = palabraInvertida + palabra.charAt(i);
			i--;
		}
		return palabraInvertida;
	}

	public static String letrasExtremos(String palabra) {
		String palabraX = "";
		char primeraLetra, ultimaLetra;
		int longitudSinExtremos;
		longitudSinExtremos = palabra.length() - 2;
		primeraLetra = palabra.charAt(0);
		ultimaLetra = palabra.charAt(palabra.length() - 1);

		int i = 0;
		while (i < longitudSinExtremos) {
			palabraX = palabraX + "x";
			i++;
		}
		palabraX = primeraLetra + palabraX + ultimaLetra;

		return palabraX;
	}

	public static String vocales(String palabra) {
		String soloVocales = "";
		int i = 0;
		while (i < palabra.length()) {
			if ((palabra.toLowerCase().charAt(i) == 'a') || (palabra.toLowerCase().charAt(i) == 'e')
					|| (palabra.toLowerCase().charAt(i) == 'i') || (palabra.toLowerCase().charAt(i) == 'o')
					|| (palabra.toLowerCase().charAt(i) == 'u')) {
				soloVocales = soloVocales + palabra.charAt(i);
			} else {
				soloVocales = soloVocales + "x";
			}
			i++;
		}
		return soloVocales;
	}

	public static void menu(String palabra) {
		int opcion = 0;
		
			while (opcion != 4) {
			System.out.println("\n--------------------------------------------------"
					+ "\n-----------------MENU DE OPCIONES-----------------"
					+ "\n--------------------------------------------------");
			System.out.print("\t1- MOSTRAR PALABRA INVERTIDA" 
					+ "\n\t2- PRIMERA Y ULTIMA LETRA DE LA PALABRA" 
					+ "\n\t3- VOCALES DE LA PALABRA"
					+ "\n\t4- SALIR"
					+ "\n->");
			
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("**" + invertirPalabra(palabra));
				break;
			case 2:
				System.out.println("**" + letrasExtremos(palabra));
				break;
			case 3:
				System.out.println("**" + vocales(palabra));
				break;
			case 4:
				System.out.println("**Saliendo del programa...");
				break;
			default:
				System.out.println("**Introduce una opcion valida, por favor.");
				break;
			}
		}
	}

	public static void main(String[] args) {
		String palabra;
		palabra = leerPalabra();
		
		menu(palabra);
		
		System.out.println("Programa finalizado.");
		sc.close();
	}

}

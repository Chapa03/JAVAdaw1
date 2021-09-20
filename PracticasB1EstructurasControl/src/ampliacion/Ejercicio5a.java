package ampliacion;

import java.util.Scanner;

public class Ejercicio5a {
//	Indicar si un carácter leído es: a. una letra minúscula b. una letra mayúscula 
//	c. un dígito entre 0 y 9 d. vocal o consonante en caso de ser letra mayúscula o minúscula
	static Scanner sc = new Scanner(System.in);

	public static String entrada() {
		String entradaCaracter = "";
		System.out.print("Introduce un caracter, por favor: ");
		entradaCaracter = sc.next();
		return entradaCaracter;
	}

	public static boolean isLetter(char lecturaMet) {
		boolean letterOrNot;
		letterOrNot = (((lecturaMet >= 'a') && (lecturaMet <= 'z')) || ((lecturaMet >= 'A') && (lecturaMet <= 'Z')));
		return letterOrNot;
	}

	public static boolean isCapitalLetter(char lecturaMet) {
		boolean capitalOrNot;
		capitalOrNot = ((lecturaMet >= 'A') && (lecturaMet <= 'Z'));
		return capitalOrNot;
	}

	public static boolean isNumber(char lecturaMet) {
		boolean numberOrNot;
		numberOrNot = ((lecturaMet >= '0') && (lecturaMet <= '9'));
		return numberOrNot;
	}

	public static boolean isVocal(char lecturaMet) {
		boolean vocalOrNot;
		vocalOrNot = (lecturaMet == 'a' || lecturaMet == 'e' || lecturaMet == 'i' || lecturaMet == 'o'
				|| lecturaMet == 'u');
		return vocalOrNot;
	}

	public static void salida(char caracterInicial, boolean letraMet, boolean mayusMet, boolean vocalMet, boolean numeroMet,
			String entradaOriginalMet) {
		if (numeroMet) {
			System.out.println("El caracter " + caracterInicial + " es un numero comprendido entre 0 y 9");
		} else if (letraMet) {
			if (vocalMet) {
				if (mayusMet) {
					System.out.println("El caracter \"" + caracterInicial + "\" es una vocal MAYUSCULA");
				} else {
					System.out.println("El caracter \"" + caracterInicial + "\" es una vocal minuscula");
				}
			} else {
				if (mayusMet) {
					System.out.println("El caracter \"" + caracterInicial + "\" es una consonante MAYUSCULA");
				} else {
					System.out.println("El caracter \"" + caracterInicial + "\" es una consonante minuscula");
				}
			}
		} else {
			System.out.println("(" + caracterInicial + ") La proxima vez introduce un caracter valido, por favor");
		}
	}

	public static void main(String[] args) {
		char lectura = ' ', operacionesChar = ' ';
		boolean vocal, numero, mayus, letra;

		String entradaOriginal = entrada();
		
		operacionesChar = entradaOriginal.toLowerCase().charAt(0);
		lectura = entradaOriginal.charAt(0);

		letra = isLetter(lectura);
		mayus = isCapitalLetter(lectura);
		vocal = isVocal(operacionesChar);
		numero = isNumber(lectura);

		salida(lectura, letra, mayus, vocal, numero, entradaOriginal);
		sc.close();
	}

}

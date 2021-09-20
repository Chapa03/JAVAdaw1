package ejercicios.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4Separacion {
//	Leer por pantalla una frase de una línea y almacenarla
//	a.  	En un array de Strings (cada palabra en una posición)
//	b.  	En un array de caracteres, eliminando los espacios (cada carácter en una posición)
//	c.  	Darle la vuelta a los caracteres en otro array y comprobar si la frase es 
//	palíndroma (se lee igual en un sentido que en otro: “Dabale arroz a la zorra el abad”) 
//	(sin tener en cuenta los espacios entre palabras)
	static Scanner sc = new Scanner(System.in);
	
	public static String entrada() {
		System.out.print("Dime una frase: ");
		return sc.nextLine();
	}
	
	public static void main(String[] args) {
		String frase = "";
		String[] frasePartida;
		
		frase = entrada();
//		guardando cada palabra de la frase separada por espacios
//		en cad auna de las posiciones del array
		frasePartida = frase.split(" ");
		
		System.out.println("Array de las palabras de la frase:");
		System.out.println(Arrays.toString(frasePartida));
		
//		genero una frase sin espacio a partir de la escrita
		String fraseSinEspacios = frase.replace(" ", "");
		char[] letrasFrase = new char[fraseSinEspacios.length()];
		for (int i = 0; i < fraseSinEspacios.length(); i++) {
			letrasFrase[i] = fraseSinEspacios.charAt(i);
		}
		System.out.println("Array de las letras de la frase sin espacios:");
		System.out.println(Arrays.toString(letrasFrase));
		
//		genero un array de caracteres para almacenar la frase introducida
//		al reves sin espacios
		char[] fraseAlReves = new char[letrasFrase.length];
		
		for (int i = 0; i < fraseAlReves.length; i++) {
			fraseAlReves[i] = letrasFrase[letrasFrase.length - (i + 1)];
		}
		
		System.out.println("Frase al reves sin espacios: ");
		System.out.println(Arrays.toString(fraseAlReves));
		
		System.out.println("La frase \"" + frase + "\" es palindroma?");
		boolean palindroma = true;
		for (int i = 0; i < letrasFrase.length; i++) {
			if (((fraseAlReves[i] + "").toLowerCase()).equals((letrasFrase[i] + "").toLowerCase())) {
			} else {
				palindroma = false;
			}
		}
		
		if (palindroma) {
			System.out.println("Si, la frase SI es palindroma");
		} else {
			System.out.println("No, la frase NO es palindroma");
		}

	}

}

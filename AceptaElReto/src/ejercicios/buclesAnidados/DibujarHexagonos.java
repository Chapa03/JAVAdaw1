package ejercicios.buclesAnidados;

import java.util.Scanner;

public class DibujarHexagonos {
//	mostrará el hexágono regular que tiene como longitud de lado 
//	el número de caracteres especificado. Dicho hexágono estará 
//	dibujado con el carácter proporcionado en la entrada:
//	3 *
//	   ***
//	  *****
//	 *******
//	  *****
//	   ***
	static Scanner sc = new Scanner(System.in);
	
	public static String entrada() {
		String datos = "";
		boolean formatoCorrecto = false;
		System.out.println("Introduce la longitud de los lados (n<10)"
				+ "\ny los caracteres que pintaran el hexagono (c)"
				+ "\nen el siguiente formato: n c");
		while(!formatoCorrecto) {
			datos = sc.nextLine();
			if ((datos.length() == 3) && ((datos.charAt(0) >= '0') && (datos.charAt(0) <= '9')) && (datos.charAt(1) == ' ')) {
				formatoCorrecto = true;
			} else {
				System.out.println("El formato introducido no es correcto."
						+ "\nRecuerda: 'numero_lados' espacio '1_caracter'");
			}
		}
		return datos;
	}
	
//	public static String hexagono(String s) {
//		String hexagono = "";
//		int
//		for (int i = 1; )
//		return hexagono;
//	}
	
	public static void main(String[] args) {
//		System.out.println(hexagono(entrada()));
	}
}

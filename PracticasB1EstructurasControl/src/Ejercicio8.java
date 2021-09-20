import java.util.Scanner;

public class Ejercicio8 {
//	Realizar un programa que solicite un número de 5 dígitos del teclado 
//	y separe el número en dígitos individuales, mostrándolos por pantalla:
	static Scanner sc = new Scanner(System.in);
	
	public static String entradaNumero() {
		String numeroInput;
		System.out.print("Introduce un numero de 5 cifras: ");
		numeroInput = sc.next();
		return numeroInput;
	}
	
	public static void salidaNumeroSeparado(String numero) {
		System.out.println("Tu numero:");

		switch (numero.length()) {
		case 5:
			System.out.println("\t" + numero.charAt(0) + " " + numero.charAt(1) + " " + numero.charAt(2) + " " + numero.charAt(3) + " " + numero.charAt(4) + " ");
			break;
		case 4:
			System.out.println("\t0 " + numero.charAt(0) + " " + numero.charAt(1) + " " + numero.charAt(2) + " " + numero.charAt(3) + " ");
			break;
		case 3:
			System.out.println("\t0 0 " + numero.charAt(0) + " " + numero.charAt(1) + " " + numero.charAt(2));
			break;
		case 2:
			System.out.println("\t0 0 0 " + numero.charAt(0) + " " + numero.charAt(1));
			break;
		case 1:
			System.out.println("\t0 0 0 0 " + numero.charAt(0));
			break;
		}
	}
	
	public static void main(String[] args) {
		String numero;
		
		numero = entradaNumero();
		salidaNumeroSeparado(numero);
		
		sc.close();
	}
		
}


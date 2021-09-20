import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
//		Realizar un programa que decida si dos números leídos por teclado, si:
//			el primero es múltiplo del segundo o 
//			el segundo es múltiplo del primero 
//			 y muestre el resultado
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 0;
		System.out.print("Introduce un numero: ");
		n1 = sc.nextInt();
		System.out.print("Introduce otro numero: ");
		n2 = sc.nextInt();

		if (n1 % n2 == 0) {
			System.out.println("El primero (" + n1 + ") es multiplo del segundo (" + n2 + ") porque " + n1 + " % " + n2
					+ " == " + (n1 % n2));
		} else if (n2 % n1 == 0) {
			System.out.println("El segundo (" + n2 + ") es multiplo del primero (" + n1 + ") porque " + n2 + " % " + n1
					+ " == " + (n2 % n1));
		} else {
			System.out.println("Los numeros n1 y n2 no son multiplos el uno del otro.");
		}

		sc.close();
	}

}

package bucles;

import java.util.Scanner;

public class EjWhileSemaforo {
	static Scanner sc = new Scanner(System.in);
	
	public static int leerNum() {
		System.out.print("Dime un numero: ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		int num = 34;
		int valor = 0;
		boolean sinAdivinar = true;
		while (sinAdivinar) {
			valor = leerNum();
			if (valor == num) {
				System.out.println("Muy bien, has acertado");
				sinAdivinar = false;
			} else {
				System.out.println("Lo siento, no has adivinado");
			}
			
		}
	}

}

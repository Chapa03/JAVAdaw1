package ejercicios.clasesEspeciales;

import java.util.Random;
import java.util.Scanner;

public class RandomAdivina {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Random rnd = new Random();
		int numero = rnd.nextInt(10) + 1;
		int cont = 1;
		boolean bucle = true;
		int numeroEscrito;
		System.out.println("Se acaba de generar un número del 1 al 10. Intenta adivinarlo en 3 intentos!!");
		
		while (bucle) {
			System.out.print("Intento numero " + cont + ": ");
			numeroEscrito = sc.nextInt();
			if ((numeroEscrito == numero) && (cont < 3)) {
				System.out.println("Correcto! el número generado era el " + numero);
				bucle = false;
			} else if (cont == 3) {
				System.out.println("Has sobrepasado el numero de intentos. El numero correcto era " + numero);
				bucle = false;
			} else {
				System.out.println(numeroEscrito > numero ? "NO! El numero es menor :P":"El numero es mayor :D");
			}
			cont++;
		}
		
	}

}

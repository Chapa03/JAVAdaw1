package ampliacion;

import java.util.Scanner;

public class Ejercicio1a {
//	Leer un número por pantalla y decidir si es positivo o negativo
//	Leer un número por pantalla y decidir si su parte decimal es nula o no

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numero = 0, parteDecimal;
		int numeroEntero = 0;
		
		System.out.print("Introduce un numero por pantalla: ");
		numero = sc.nextDouble();
		
		if (numero >= 0) {
			System.out.println("El numero " + numero + ", es positivo.");
		} else {
			System.out.println("El numero " + numero + ", es negativo.");
		}
		
		numeroEntero = (int) numero;
		parteDecimal = numero - numeroEntero;
		
		if (parteDecimal == 0) {
			System.out.println("El numero " + numero + " no tiene parte decimal.");
		} else {
			System.out.println("La parte decimal del numero " + numero + " es: " + (parteDecimal));
		}
		
		sc.close();
	}

}

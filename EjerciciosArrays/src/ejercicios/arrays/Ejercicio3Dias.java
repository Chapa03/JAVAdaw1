package ejercicios.arrays;

import java.util.Scanner;

public class Ejercicio3Dias {
//	Realizar un programa que nos permita realizar el manejo del n�mero de d�as 
//	que tiene cada mes del a�o utilizando un array en el que cada �ndice o posici�n 
//	corresponde al mes y el contenido tiene el n�mero de d�as que tiene ese mes.
//	-        Para ello, inicializar el array con los valores correspondientes 
//		a los d�as de cada mes
//	-        Que por pantalla nos pidan que les digamos el n�mero de d�as de un mes 
//		determinado. Nos dicen el n�mero de mes (de 1 a 12).
//	-        Obtener por pantalla la salida:
//		�El mes n tiene m d�as�
//		�quiere conocer el n�mero de d�as de otro mes? s/n

	static Scanner sc = new Scanner(System.in);
	
	public static int entrada() {
		System.out.println("Introduce el numero correspondiente a un mes: ");
		return sc.nextInt();
	}
	
	public static void diasMes (int[] array, int n) {
		if ((n >= 1) && (n <= 12)) {
			System.out.println("El mes " + n + " tiene " + array[n - 1] + " dias.");
		} else {
			System.out.println("Vuelva a intentarlo");
		}
		
	}

	public static void main(String[] args) {
		int[] daysOfYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		boolean bucle = true;
		
		diasMes(daysOfYear, entrada());
		
		while (bucle) {
			System.out.println("Quiere conocer el numero de dias de otro mes? (S/N): ");
			if (sc.next().toLowerCase().charAt(0) == 's') {
				diasMes(daysOfYear, entrada());
			} else {
				bucle = false;
			}
		}
		System.out.println("Finalizando programa");
	}

}

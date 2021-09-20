import java.util.Scanner;

public class Ejercicio2 {
//	Leer un número por pantalla que sea, 1 ó 10 , y obtener por pantalla el número en letras: UNO o DIEZ
//	Añadir al programa los números 100 y 1000
	static Scanner sc = new Scanner(System.in);

	public static int entrada() {
		int numeroMet = 0;
		System.out.print("Introduce un numero (1, 10, 100, 1000): ");
		numeroMet = sc.nextInt();
		return numeroMet;
	}

	public static void salida(int numeroMet) {
		if (numeroMet == 1) {
			System.out.println("El numero es el UNO");
		} else if (numeroMet == 10) {
			System.out.println("El numero es el DIEZ");
		} else if (numeroMet == 100) {
			System.out.println("El numero es el CIEN");
		} else if (numeroMet == 1000) {
			System.out.println("El numero es el MIL");
		} else {
			System.out.println("Numero no valido");
		}
	}

	public static void main(String[] args) {
		int numero = 0;
		numero = entrada();
		salida(numero);
		sc.close();
	}

}

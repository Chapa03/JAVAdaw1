package ampliacion;

import java.util.Scanner;

public class Ejercicio3a {
//	Leer dos números y escribir “El mayor de los dos es:” mayor de los dos. Indicar si son iguales (“Los dos son iguales”) 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 0;
		
		System.out.print("Introduce un numero: ");
		n1 = sc.nextInt();
		System.out.print("Introduce otro numero: ");
		n2 = sc.nextInt();
		
		if (n1 == n2) {
			System.out.println("Los numeros " + n1 + " y " + n2 + " son iguales.");
		} else if (n1 > n2) {
			System.out.println("El numero " + n1 + " es mayor que el numero " +  n2);
		} else {
			System.out.println("El numero " + n2 + " es mayor que el numero " +  n1);
		}
		sc.close();
	}

}

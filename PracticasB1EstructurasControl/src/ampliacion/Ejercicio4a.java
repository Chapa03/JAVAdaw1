package ampliacion;

import java.util.Scanner;
	
public class Ejercicio4a {
//	Leer tres números y escribirlos en orden de menor a mayor. Escribirlos de mayor a menor
	static Scanner sc = new Scanner(System.in);
	
	public static int entrada() {
		int numeroMet;
		numeroMet = sc.nextInt();
		return numeroMet;
	}
	
	public static void mayorMenor(int n1, int n2, int n3) {
		System.out.println("\n** Tus numeros ordenados de MAYOR a menor **");
		if ((n1 > n2) && (n1 > n3)) {
			if (n2 > n3) {
				System.out.println(n1 + "\n" + n2 + "\n" + n3);
			} else {
				System.out.println(n1 + "\n" + n3 + "\n" + n2);
			}
		} else if ((n2 > n1) && (n2 > n3)) {
			if (n1 > n3) {
				System.out.println(n2 + "\n" + n1 + "\n" + n3);
			} else {
				System.out.println(n2 + "\n" + n3 + "\n" + n1);
			}
		} else if ((n3 > n1) && (n3 > n2)) {
			if (n1 > n2) {
				System.out.println(n3 + "\n" + n1 + "\n" + n2);
			} else {
				System.out.println(n3 + "\n" + n2 + "\n" + n1);
			}
		}
	}
	
	public static void menorMayor(int n1, int n2, int n3) {
		System.out.println("\n** Tus numeros ordenados de menor a MAYOR **");
		if ((n1 < n2) && (n1 < n3)) {
			if (n2 < n3) {
				System.out.println(n1 + "\n" + n2 + "\n" + n3);
			} else {
				System.out.println(n1 + "\n" + n3 + "\n" + n2);
			}
		} else if ((n2 < n1) && (n2 < n3)) {
			if (n1 < n3) {
				System.out.println(n2 + "\n" + n1 + "\n" + n3);
			} else {
				System.out.println(n2 + "\n" + n3 + "\n" + n1);
			}
		} else if ((n3 < n1) && (n3 < n2)) {
			if (n1 < n2) {
				System.out.println(n3 + "\n" + n1 + "\n" + n2);
			} else {
				System.out.println(n3 + "\n" + n2 + "\n" + n1);
			}
		}
	}
	
	
	public static void main(String[] args) {
		int n1 = 0, n2 = 0, n3 = 0;

		System.out.print("Introduce un numero: ");
		n1 = entrada();
		System.out.print("Introduce el segundo numero: ");
		n2 = entrada();
		System.out.print("Introduce el tercer numero: ");
		n3 = entrada();
		
		mayorMenor(n1, n2, n3);
		menorMayor(n1, n2, n3);
		
		
		sc.close();
	}

}

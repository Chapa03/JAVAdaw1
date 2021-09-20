package bucles;

import java.util.Scanner;

public class EjercicioTablasWhile {
//	Haz las tablas de mutiplicar del numero introducido por pantalla
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroTabla = 0;
		int cont = 0;
		
		System.out.print("Introduce un numero: ");
		numeroTabla = sc.nextInt();
		
		System.out.println("La tabla del " + numeroTabla + ":");
		while (cont <= 10) {
			System.out.println(numeroTabla + " x " + cont + " = " + (numeroTabla * cont));
			cont++;
		}
		sc.close();
	}
}

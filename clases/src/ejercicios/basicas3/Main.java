package ejercicios.basicas3;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static String leerCuenta(String s) {
		System.out.println("Introduce tu " + s + ":");
		return sc.next();
	}
	
	public static float leerNumero(String s) {
		System.out.println("Introduce el " + s + ":");
		return sc.nextFloat();
	}
	
	public static void introducirDinero(CuentaCorriente c) {
		System.out.print("Cuanto dinero quieres ingresar? ");
		c.ingreso(sc.nextFloat());
	}
	
	public static void sacarDinero(CuentaCorriente c) {
		System.out.print("Cuanto dinero quieres sacar? ");
		c.ingreso(-sc.nextFloat());
	}
	
	public static CuentaCorriente nuevaCuenta() {
		CuentaCorriente c = new CuentaCorriente();
		c.setIban(leerCuenta("IBAN"));
		c.setNumCuenta(leerCuenta("numero de cuenta"));
		c.setSaldo(leerNumero("saldo actual"));
		c.setTipoInteres(leerNumero("tipo de interes"));
		return c;
	}
	
	public static void main(String[] args) {
		CuentaCorriente c1 = new CuentaCorriente("0287440089", "ES34 2873 2839 83 0287440089", 300, 0);
		System.out.println(c1.toString());
		
		CuentaCorriente c2 = nuevaCuenta();
		System.out.println(c2.toString());
		
		int opcion = 0;
		while(opcion!=3) {
			System.out.print("\n Que deseas hacer:"
					+ "\n\t1-Ingresar dinero."
					+ "\n\t2-Sacar dinero"
					+ "\n\t3-SALIR"
					+ "->");
			opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("*INGRESAR DINERO*");
				introducirDinero(c2);
				System.out.println("Saldo actual de la cuenta " + c2.getNumCuenta() + ": " + c2.getSaldo() + "€");
				break;
			case 2:
				System.out.println("*SACAR DINERO*");
				sacarDinero(c2);
				System.out.println("Saldo actual de la cuenta " + c2.getNumCuenta() + ": " + c2.getSaldo() + "€");
				break;
			case 3:
				System.out.println("Fin de las operaciones.");
				System.out.println("Saldo actual de la cuenta " + c2.getNumCuenta() + ": " + c2.getSaldo() + "€");
				break;
			default:
			}
		}
		
		
		sc.close();
	}
}

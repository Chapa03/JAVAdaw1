package ampliacion;

import java.util.Scanner;

public class EjercicioCEMonedas {
	static Scanner sc = new Scanner(System.in);
	
	public static String leerMoneda(String s) {
		String moneda = "";
		System.out.print(s + " moneda: ");
		moneda = sc.next();
		return moneda;
	}
	
	public static int valorMoneda(String s) {
		int centimos = 0;
		switch (s.toLowerCase()) {
		case "1c":
			centimos = 1;
			break;
		case "2c":
			centimos = 2;
			break;
		case "5c":
			centimos = 5;
			break;
		case "10c":
			centimos = 10;
			break;
		case "20c":
			centimos = 20;
			break;
		case "50c":
			centimos = 50;
			break;
		case "1e":
			centimos = 100;
			break;
		case "2e":
			centimos = 200;
			break;
		}
		return centimos;
	}

	public static void main(String[] args) {
		int centimos = 0;
		int euros;
		String moneda;
		System.out.println("Introduce 3 monedas (1c, 2c, 5c, 10c, 20c, 50c, 1E, 2E");
		
		for (int i=1; i<=3; i++) {
			moneda = leerMoneda(i + "a");
			centimos = centimos + valorMoneda(moneda);
		}
		
		euros = centimos/100;
		
		if (centimos % 100 == 0) {
			System.out.println("Has introducido un total de " + euros + "€");
		} else if (centimos < 100){
			System.out.println("Has introducido un total de " + centimos + " centimos.");
		} else {
			System.out.println("Has introducido un total de " + euros + " euros y " + (centimos - euros * 100) + " centimos");
		}
		
	}

}

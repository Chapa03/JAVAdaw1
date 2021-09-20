import java.util.Scanner;

public class GasolinaInteractivo {
	public static void main(String[] args) {
		double precioCombustible, litros100, kilometros, consumoLitros, costeViaje;
		String tipoCombustible = "";
		Scanner sc = new Scanner(System.in);
		
		precioCombustible = 0;
		litros100 = 0;
		kilometros = 0;
		consumoLitros = 0;
		costeViaje = 0;
		
		System.out.print("Bienvenido a la calculadora de consumos de tu vehiculo.\n" 
				+ "Necesito a continuacion una serie de datos. Que combustible usa tu vehiculo? \n" 
				+ "1. Diesel \n2. Gasolina \n--> ");
		int opcion = sc.nextInt();
		
		if (opcion == 1) {
				tipoCombustible = "Diesel";
				System.out.print("Indica el precio actual del " + tipoCombustible + ": ");
				precioCombustible = sc.nextFloat();
		} else if (opcion == 2){
				tipoCombustible = "Gasolina";
				System.out.print("Indica el precio actual de la " + tipoCombustible + ": ");
				precioCombustible = sc.nextFloat();
		} else {
				System.out.println("Opcion no valida");
		}
		
		System.out.print("Indica tambien el consumo medio de tu vehiculo: ");
		litros100 = sc.nextDouble();
		
		System.out.print("Cuantos kilometros vas a realizar? ");
		kilometros = sc.nextDouble();
		
		consumoLitros = (litros100 * kilometros) / 100;
		costeViaje = consumoLitros * precioCombustible;
		
		System.out.println("");
		System.out.println("En ese caso \n"
				+ " . . . . . \n"
				+ "Tu consumo en litros sera de || " + consumoLitros + "l ||"
				+ "\nLo que te supondra un gasto en " + tipoCombustible +" de || " + costeViaje + " euros ||");
		sc.close();
				
	}
}

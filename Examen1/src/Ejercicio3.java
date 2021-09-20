import java.util.Scanner;

public class Ejercicio3 {
//	(3 puntos) Realizar un programa que realice la lectura de 4 temperaturas (un
//		número con decimal) de una persona (se supone que se realizan con distintos
//		termómetros) y nos diga la probabilidad de estar enferma, según los siguientes
//		criterios:
//	- Si todas son <= 36,5 la probabilidad es de un 0%
//	- Si todas son > =38,5 la probabilidad es de un 100%
//	- Si hay 2 que son >= 37,5 y menos de 38,5, pero el resto son menores de 36,5 la
//		probabilidad es de un 40%
//	- Si hay 2 que son >= 37,5 y menos de 38,5, pero el resto son mayores de 38,5 la
//		probabilidad es de un 90%
//	- En cualquier otro caso, la probabilidad es de un 50%
	static Scanner sc = new Scanner(System.in);

	public static double entradaTemperatura() {
		double temperatura = 0;
		temperatura = sc.nextDouble();
		return temperatura;
	}

	public static void probabilidadEnfermo(int rangoTotal) {
		if (rangoTotal == 4) {
			System.out.println("Tu probabilidad de estar enfermo es del 0%");
		} else if (rangoTotal == 16) {
			System.out.println("Tu probabilidad de estar enfermo es del 100%");
		} else if (rangoTotal == 8) {
			System.out.println("Tu probabilidad de estar enfermo es del 40%");
		} else if (rangoTotal == 14) {
			System.out.println("Tu probabilidad de estar enfermo es del 90%");
		} else {
			System.out.println("Tu probabilidad de estar enfermo es del 50%");
		}
	}

	public static int rango(double temperatura) {
		int rangoTemperatura = 0;
		if (temperatura <= 36.5) {
			rangoTemperatura = 1;
		} else if ((temperatura > 36.5) && (temperatura < 37.5)) {
			rangoTemperatura = 2;
		} else if ((temperatura >= 37.5) && (temperatura < 38.5)) {
			rangoTemperatura = 3;
		} else if (temperatura >= 38.5) {
			rangoTemperatura = 4;
		} else {
			System.out.println("Temperatura no valida");
		}
		return rangoTemperatura;
	}

	public static int sumaRangos(double temp1, double temp2, double temp3, double temp4) {
		int sumaRangos = 0;
		sumaRangos = ((rango(temp1)) + (rango(temp2)) + (rango(temp3)) + (rango(temp4)));
		return sumaRangos;
	}

	public static void main(String[] args) {
		double temp1, temp2, temp3, temp4;
		int totalRangos;

		System.out.print("Introduce la primera temperatura: ");
		temp1 = entradaTemperatura();
		System.out.print("Introduce la segunda temperatura: ");
		temp2 = entradaTemperatura();
		System.out.print("Introduce la tercera temperatura: ");
		temp3 = entradaTemperatura();
		System.out.print("Introduce la cuarta temperatura: ");
		temp4 = entradaTemperatura();
		System.out.println();

		totalRangos = sumaRangos(temp1, temp2, temp3, temp4);
		probabilidadEnfermo(totalRangos);

		sc.close();
	}
}

package arrayList.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class DiasSemana {
//	Crear ArrayList com los dias de la semana aniadiendo elementos
//	Preguntar por un dia de al semana y nos diga el dia anterior y el posterior
//	tener la posibilidad de que detecte si hemos insertado un dia que no corresponde
//	Le decimos 3 dias y que nos devuelva los restantes de la semana
//	Que los dias restantes nos los devuelva por pantalla en orden alfabetico
	static Scanner sc = new Scanner(System.in);
	
	public static int diaElegido(ArrayList<String> lista) {
		String dia;
		int diaNumero = 0;
		System.out.println("Dime un dia de la semana: ");
		dia = sc.next().toLowerCase();
		
		switch (dia) {
		case "lunes":
			diaNumero = 0;
			break;
		case "martes":
			diaNumero = 1;
			break;
		case "miercoles":
			diaNumero = 2;
			break;
		case "jueves":
			diaNumero = 3;
			break;
		case "viernes":
			diaNumero = 4;
			break;
		case "sabado":
			diaNumero = 5;
			break;
		case "domingo":
			diaNumero = 6;
			break;
		default:
			System.out.println("Dia no valido");
		}
		return diaNumero;
	}
	
	public static void salida(ArrayList<String> lista, int n) {
		
		if (n == 0) {
			System.out.println("El dia siguiente es " + lista.get(1));
		} else if (n == 6) {
			System.out.println("El dia anterior es " + lista.get(lista.size() - 2));
		} else {
			System.out.println("El dia anterior es " + lista.get(n - 1));
			System.out.println("El dia siguiente es " + lista.get(n + 1));
		}
	}

	public static void main(String[] args) {
		ArrayList<String> diasSemana = new ArrayList<String>();
		int diaNumero;
		
		diasSemana.add("Lunes");
		diasSemana.add("Martes");
		diasSemana.add("Miercoles");
		diasSemana.add("Jueves");
		diasSemana.add("Viernes");
		diasSemana.add("Sabado");
		diasSemana.add("Domingo");
		
		diaNumero = diaElegido(diasSemana);
		
		salida(diasSemana, diaNumero);

	}

}

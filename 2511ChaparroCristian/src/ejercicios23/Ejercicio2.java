package ejercicios23;

import java.util.Scanner;

public class Ejercicio2 {
	static Scanner sc = new Scanner(System.in);
	
	public static String leerFecha() {
		System.out.print("Escribe una fecha (dd/mm/aaaa): ");
		return sc.next();
	}
	
	public static boolean comprobarFecha(String s) {
		boolean fechaEsPosterior = false;
		String day, month, year, mesEnNombre = "";
		day = s.substring(0,2);
		month = s.substring(3,5);
		year = s.substring(6,10);
		
		switch(month) {
		case "01":
			mesEnNombre = "Enero";
			break;
		case "02":
			mesEnNombre = "Febrero";
			break;
		case "03":
			mesEnNombre = "Marzo";
			break;
		case "04":
			mesEnNombre = "Abril";
			break;
		case "05":
			mesEnNombre = "Mayo";
			break;
		case "06":
			mesEnNombre = "Junio";
			break;
		case "07":
			mesEnNombre = "Julio";
			break;
		case "08":
			mesEnNombre = "Agosto";
			break;
		case "09":
			mesEnNombre = "Septiembre";
			break;
		case "10":
			mesEnNombre = "Octubre";
			break;
		case "11":
			mesEnNombre = "Noviembre";
			break;
		case "12":
			mesEnNombre = "Diciembre";
			break;
		}
		
		System.out.println("Fecha: " + day + " de " + mesEnNombre + " de " + year);
		
//		condicion del if, pero no he podido aplicarla por no saber extraer el valor numerico del string
//		(year es mayor que 2020) || ((anio es igual 2020) && (mes mes mayor 11)) || ((anio es igual 2020) && (mes es igual 11) && (dia es mayor 25))
//		he escrito la condicion de introducir (por ejemplo) dia == 03 para comprobar que todo el codigo funcione
		if (day.equals("03")) {
			fechaEsPosterior = true;
		} else {
			fechaEsPosterior = false;
		}
		return fechaEsPosterior;
	}

	public static void main(String[] args) {
		if(comprobarFecha(leerFecha())) {
			System.out.println("La fecha es posterior a la de hoy (25/11/2020)");
		} else {
			System.out.println("La fecha NO es posterior a la de hoy");
		}

	}

}

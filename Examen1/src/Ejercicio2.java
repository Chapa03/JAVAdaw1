import java.util.Scanner;

public class Ejercicio2 {
//	(1 puntos) Mostrar por pantalla un calendario con 30 días de mes, comenzando el
//	lunes el día 1, de la siguiente manera:
//	(1 puntos) Cambiar el programa para que pida por pantalla un mes en letras y nos
//	muestre su calendario, según los días 
//	DESARROLLO DE APLICACIONES WEB
//	(1 punto) Cambiar para que no comience el día marcado sino el indicado 
//	(L, M, X, J, V, S o D)
	static Scanner sc = new Scanner(System.in);
	
	public static int diasMes(String mes) {
		int diasMes = 0;
		switch (mes.toLowerCase()) {
		case "enero":
		case "ene":
		case "marzo":
		case "mar":
		case "mayo":
		case "may":
		case "julio":
		case "jul":
		case "agosto":
		case "ago":
		case "octubre":
		case "oct":
		case "diciembre":
		case "dic":
			diasMes = 31;
			break;
		case "febrero":
		case "feb":
			diasMes = 28;
			break;
		case "abril":
		case "abr":
		case "junio":
		case "jun":
		case "septiembre":
		case "sep":
		case "noviembre":
		case "nov":
			diasMes = 30;
			break;
		default:
			System.out.println("El mes escrito no es valido.");
		}
		return diasMes;
	}
	
	public static void pintarCalendario(int diasMes, int diaInicio) {
		String dias = "LMXJVSD";
		int control = 1;
		int controlDiaInicio = 1;
		for (int i = 0; i < dias.length(); i++) {
			System.out.print(dias.charAt(i) + "\t");
		}
		System.out.println("\n");
		for (int i=1; i<=6; i++) {
			for (int j=1; j<=7; j++) {
				if (controlDiaInicio < diaInicio) {
					System.out.print("\t");
					controlDiaInicio++;
				} else {
					if (control <= diasMes) {
						System.out.print((control) + "\t");
						control++;
					}
				}
			}
			System.out.println();
		}
	}
	
	public static int diaInicio() {
		char dia = ' ';
		int diaNumerico = 0;
		System.out.print("Qué dia de la semana empezará el mes? (L, M, X, J, V, S, D): ");
		dia = sc.next().toLowerCase().charAt(0);
		System.out.println();
		switch (dia) {
		case 'l':
			diaNumerico = 1;
			break;
		case 'm':
			diaNumerico = 2;
			break;
		case 'x':
			diaNumerico = 3;
			break;
		case 'j':
			diaNumerico = 4;
			break;
		case 'v':
			diaNumerico = 5;
			break;
		case 's':
			diaNumerico = 6;
			break;
		case 'd':
			diaNumerico = 7;
			break;
		default:
			System.out.println("El dia introducido no es valido");
		}
		return diaNumerico;
	}

	public static void main(String[] args) {
		int diasMes = 0, diaInicio = 0;
		String mes;
		
		System.out.println("Escribe un mes para mostrar el calendario:");
		mes = sc.next();
		diasMes = diasMes(mes);
		diaInicio = diaInicio();
		pintarCalendario(diasMes, diaInicio);
	}
}

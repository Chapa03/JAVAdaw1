package ampliacion;

import java.util.Scanner;

public class Ejercicio9b {
//	9. Pedir un mes y año e indicar si es una fecha posible de (del año 0 a 2020) 
//	10. Pedimos un día también, además del mes y el año e indicar si es una fecha posible (no consideramos bisiestos) 
	static Scanner sc = new Scanner(System.in);
	
	public static int entrada() {
		int entradaMet = 0;
		entradaMet = sc.nextInt();
		return entradaMet;
	}
	
	public static int diaEsValido(int diaMet) {
		int confirmacion = 0;
		if ((diaMet >= 1) && (diaMet <= 29)) {
			confirmacion = 1;
		} else if ((diaMet >= 1) && (diaMet <= 30)) {
			confirmacion = 2;
		} else if ((diaMet >= 1) && (diaMet <= 31)) {
			confirmacion = 3;
		} else {
			confirmacion = 0;
		}
		return confirmacion;
	}
	
	public static int mesEsValido(int mesMet) {
		int confirmacion = 0;
		confirmacion = (((mesMet >= 1) && (mesMet <= 12)) ? 1 : 0);
		return confirmacion;
	}
	
	public static int anioEsValido(int anioMet) {
		int confirmacion;
		confirmacion = (((anioMet >= 0) && (anioMet <= 2020)) ? 1 : 0);
		return confirmacion;
	}
	
	public static void comprobacion(int diaMet, int mesMet, int anioMet, boolean diaValidoMet, boolean mesValidoMet, boolean anioValidoMet, int valorDiaConfirmacion) {
		if (anioValidoMet) {
			if (mesValidoMet) {
				switch (mesMet) {
				case 2:
					//FEBRERO
					if (diaValidoMet) {
						System.out.println((valorDiaConfirmacion == 1) ? "La fecha " + diaMet + "/" + mesMet + "/" + anioMet + " es válida" 
								: "La fecha " + diaMet + "/" + mesMet + "/" + anioMet + " NO es válida, porque el mes " + mesMet + ", sólo tiene 29 días.");
					} else {
						System.out.println("El día introducido no corresponde con los dias del mes");
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					//meses con 30 dias
					if (diaValidoMet) {
						System.out.println(((valorDiaConfirmacion == 2) || (valorDiaConfirmacion == 2)) ? "La fecha " + diaMet + "/" + mesMet + "/" + anioMet + " es válida" 
								: "La fecha " + diaMet + "/" + mesMet + "/" + anioMet + " NO es válida, porque el mes " + mesMet + ", sólo tiene 30 días.");					
					} else {
						System.out.println("El día introducido no corresponde con los dias del mes");
					}
					break;
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					//meses con 31 dias
					if (diaValidoMet) {
						System.out.println((((valorDiaConfirmacion == 3) || (valorDiaConfirmacion == 2) || (valorDiaConfirmacion == 1))) ? "La fecha " 
								+ diaMet + "/" + mesMet + "/" + anioMet + " es válida" : "La fecha " + diaMet + "/" 
								+ mesMet + "/" + anioMet + " NO es válida, porque el mes " + mesMet + ", sólo tiene 31 días.");					
					} else {
						System.out.println("El día introducido no corresponde con los dias del mes");
					}
					break;
				}
			} else {
				System.out.println("El mes introducido (" + mesMet + ") no es válido (1 - 12)");
			}
		} else {
			System.out.println("El anio introducido (" + anioMet + ") no es valido (0000 - 2020");
		}
	}

	public static void main(String[] args) {
		int dia, mes, anio, valorDiaConfirmacion;
		boolean diaValido, mesValido, anioValido;
		System.out.println("Introduce una fecha");
		System.out.print("- Dia: ");
		dia = entrada();
		System.out.print("- Mes: ");
		mes = entrada();
		System.out.print("- Anio: ");
		anio = entrada();
		
		valorDiaConfirmacion = diaEsValido(dia);
		diaValido = ((valorDiaConfirmacion >= 1) && (valorDiaConfirmacion <= 3));
		mesValido = (mesEsValido(mes) == 1);
		anioValido = (anioEsValido(anio) == 1);
		
		comprobacion(dia, mes, anio, diaValido, mesValido, anioValido, valorDiaConfirmacion);
		
		sc.close();
		
		
		
		
	}

}

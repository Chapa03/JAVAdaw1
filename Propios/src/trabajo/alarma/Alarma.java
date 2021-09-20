//package trabajo.alarma;
//
//import java.util.Scanner;
//
//public class Alarma {
//	static Scanner sc = new Scanner(System.in);
//	
//	public static String leerHora() {
//		String horaEntrada = "";
//		System.out.print("A que hora es el proximo turno de trabajo [h][hh][hh.mm][h.mm][hh:mm][h:mm]? ");
//		horaEntrada = sc.next();
//		if (((horaEntrada.length() == 1) || (horaEntrada.length() == 2)) && ((horaEntrada.charAt(0) >= '0') && (horaEntrada.charAt(0) <= '9'))) {
//			return horaEntrada;
//		} else if ((horaEntrada.length() == 4) && ((horaEntrada.indexOf('.') != -1) || (horaEntrada.indexOf(':') != -1))){
//			hora = horaEntrada.charAt(0);
//			
//		}
//		
//	}
//
//	public static void main(String[] args) {
//		
//	}
//
//}

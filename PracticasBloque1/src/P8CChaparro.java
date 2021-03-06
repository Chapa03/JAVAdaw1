import java.util.Scanner;

public class P8CChaparro {
	public static void main(String[] args) {
//		8.Crear un programa que, dado un número de horas, devuelva el número de semanas y días.
//		9.Crear un programa que, dado un número de horas, devuelva el número de semanas, días y horas equivalentes. 
//		  Por ejemplo, dado un total de 1000 horas, debe mostrar 5 semanas, 6 días y 16 horas.
		
		int horas, diasTotales, diasRes, semanas, horasRes;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t*Calculadora de semanas y dias*\n");
		System.out.print("Introduce las horas que quieres convertir: ");
		
		horas = sc.nextInt();
		diasTotales = horas / 24;
		diasRes = diasTotales % 7;
		semanas = diasTotales / 7;
		horasRes = horas % 24;
		
		//Con este bloque solo compruebo si los valores son 1 o no, para escribirlos
		//en la salida a consola en singular o plural. se podria hacer directamente
		//sustituyendo la palabra entera, en vez de anhadiendo o no la s
		String pluralH = (horasRes == 1 ? "" : "s");
		String pluralDT = (diasTotales == 1 ? "" : "s");
		String pluralDR = (diasRes == 1 ? "" : "s");
		String pluralS = (semanas == 1 ? "" : "s");
		
		//Si sobran días en la conversion a semanas, vamos a comprobarlo aqui
		//para no tener que mostrar el ultimo sout si el total de semanas es inferior a 1 ni si el numero de
		//dias restantes = 0
		//asi la salida no sera redudante
		String salidaDias = (((semanas != 0) && (diasRes >= 1)) || ((semanas >= 1) && (diasRes >= 1)) ? "Ademas, equivalen a " 
				+ diasTotales + " dia" + pluralDT + "." : "");
		
		//salida a consola
		System.out.println("\n*** Introdujiste " + horas + " hora" + pluralH + ", que, en semanas, equivalen a... ***");
		System.out.println(semanas + " semana" + pluralS + ", " + diasRes + " dia" + pluralDR + " y " + horasRes + " hora" + pluralH + " en total.");
		System.out.println(salidaDias);
		
		sc.close();
	}
}

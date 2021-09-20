import java.util.Scanner;

public class P7CristianChaparro {
	
	public static int calculoSegundos(int horasMet, int minutosMet) {
		int segundos = 0;
		segundos = (horasMet * 60 * 60) + (minutosMet * 60);
		return segundos;
	}
	
	public static void salidaConsola(int horasMet2, int minutosMet2, int segundosMet) {
		//Con este bloque sólo compruebo si los valores son 1 o no, para escribirlos
		//en la salida a consola en singular o plural
		String pluralH = (horasMet2 == 1 ? "" : "s");
		String pluralM = (minutosMet2 == 1 ? "" : "s");
		
		//salida a consola
		System.out.println(horasMet2 + " hora" + pluralH + " y " + minutosMet2 + " minuto" + pluralM + " equivalen a " + segundosMet + " segundos.");
	}

	public static void main(String[] args) {
//		Crear un programa que dado un número de horas y un número de minutos,
//		calcule el número total de segundos. 
//		Por ejemplo, 12 horas y 35 minutos serían 45300 segundos.
		
		int horas, minutos, segundos;
		
		Scanner sc = new Scanner(System.in);
		
		horas = 0;
		minutos = 0;
		
		System.out.println("\t*Calculadora de segundos*");
		System.out.print("\nIntroduce las horas: ");
		horas = sc.nextInt();
		System.out.print("Introduce los minutos: ");
		minutos = sc.nextInt();
		
		segundos = calculoSegundos(horas, minutos);
		salidaConsola(horas, minutos, segundos);
		
		
		sc.close();
		
	}

}

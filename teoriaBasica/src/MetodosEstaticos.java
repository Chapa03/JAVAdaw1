import java.util.Scanner;

public class MetodosEstaticos {
	
	public static void escribirPorConsola(){
		System.out.println("\tTe doy la bienvenida al programa");
		System.out.println("------------------------------------------");
	}
	
	public static int leerHoras() {
		Scanner scan = new Scanner(System.in);
		int horas = 0;
		
		System.out.println("Dime el numero de horas: ");
		horas = scan.nextInt();
		scan.close();
		return horas;
	}
	
	//horasMetodo son las horas recogidas como argumento en main, para poder trabjar con ellas dentro del metodo,
	// ya que el alcance las variables es limitado (parametro formal)
	public static int calcularDias(int horasMetodo) {
		int dias = 0;
		dias = horasMetodo / 24;
		
		return dias;
	}
	
	public static void escribirResultado(int semanas, int dias, int horasS) {
		System.out.println("Semanas: " + semanas + "\nDias sobrantes: " + dias % 7 + "\nDias: " + dias + "\nHoras restantes: " + horasS % 24);
	}
	
	public static void main(String[] args) {
		escribirPorConsola();
		int horas = 0, diasMain = 0, semanas = 0;
		horas = leerHoras();
		//le estamos pasando al metodo calcularDias() las horas recogidas en el metodo anterior como argumento (parametro real)
		diasMain = calcularDias(horas);
		semanas = diasMain / 7;
		escribirResultado(semanas, diasMain, horas);
		
	}

}

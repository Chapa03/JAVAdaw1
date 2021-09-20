import java.util.Scanner;

public class Ejercicio0 {
//		Calcular el precio del abono transporte en función de la edad de una persona. Obtener por pantalla y la edad de la persona.
//		<=26 - Abono joven - 20€
//		>26 y  <65 - Abono normal - 45€
//		>=65 - Abono reducido - 25€
//		Es familia numerosa? Aplicar reduccion de un 20%
//		Indique la Zona A, B, C. B es un 15% mas y si es zona C un 30% mas.
	static Scanner sc = new Scanner(System.in);

	public static int saludoEdad() {
		int edadMet = 0;
		System.out.println("\t*** Calculo de precios para el abono transportes ***");
		System.out.print("Introduce tu edad, por favor: ");
		edadMet = sc.nextInt();
		return edadMet;
	}
	
	public static int abonoCorrespondiente(int edadAbono) {
		int precioAbono;
		if (edadAbono <= 26) {
			precioAbono = 20;
			System.out.println("\t**Preparando Abono Joven");
		} else if ((edadAbono > 26) && (edadAbono < 65)) {
			precioAbono = 45;
			System.out.println("\t**Preparando Abono Normal");
		} else {
			precioAbono = 25;
			System.out.println("\t**Preparando abono Jubilados");
		}

		return precioAbono;
	}

	public static double familiaNumerosa(double abonoActualMet) {
		double precioAbonoFamilia = 0;
		char respuesta = ' ';
		System.out.print("Perteneces a una familia numerosa? (S/N): ");
		respuesta = sc.next().toLowerCase().charAt(0);
		//comparo la entrada por consola con el string de contenido "s" en el if
		//y si es familia numerosa le resto el 20% y sino el precio permanece gual
		if (respuesta == 's') {
			precioAbonoFamilia = (abonoActualMet - ( abonoActualMet * 0.20));
			System.out.println("\t**Aplicada reduccion por familia numerosa");
		} else {
			precioAbonoFamilia = abonoActualMet;
		}
		return precioAbonoFamilia;
	}
	
	public static double zona(double abonoFamiliaMet) {
		double precioConZona = 0;
		char respuesta = ' ', zonaA = 'a', zonaB = 'b', zonaC = 'c';
		System.out.print("En que zonas quieres aplicar tu abono? (A, B o C): ");
		respuesta = sc.next().toLowerCase().charAt(0);
		if (respuesta == zonaA) {
			precioConZona = abonoFamiliaMet;
			System.out.println("\t**Aplicada la tarifa estandar");
		} else if (respuesta == zonaB) {
			precioConZona = abonoFamiliaMet + (abonoFamiliaMet * 0.15);
			System.out.println("\t**Aplicada la tarifa del 15% por Zona B");
		} else if (respuesta == zonaC){
			precioConZona = abonoFamiliaMet + (abonoFamiliaMet * 0.30);
			System.out.println("\t**Aplicada la tarifa del 30% por Zona C");
		} else {
			System.out.println("El valor introducido no es correcto");
		}
		return precioConZona;
	}
	
	public static void salidaResultado(double precioFinal) {
		System.out.println("\nEl precio final de tu abono es de:\n" +
				"-----------------------------------\n" +
				"\t\t\t #" + precioFinal + "# EUR");
	}

	public static void main(String[] args) {
		int edad = 0;
		double abonoActual, abonoFamilia, abonoZona;

		edad = saludoEdad();
		abonoActual = abonoCorrespondiente(edad);
		abonoFamilia = familiaNumerosa(abonoActual);
		abonoZona = zona(abonoFamilia);
		salidaResultado(abonoZona);

		sc.close();
	}

}

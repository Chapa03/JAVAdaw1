package ejerciciosSueltos;

import java.util.Random;

public class IfSwitch1_2 {
//	(IF, CONDICIONES, SWITCH) Realizar un programa que simule el funcionamiento de un semÃ¡foro:
//		Si la variable semaforo toma el valor 
//		Rojo, escriba por pantalla: â€œpareâ€�
//		Amarillo, escriba por pantalla â€œvaya parandoâ€�
//		Verde, escriba por pantalla â€œpuede pasarâ€�
//	ej2
//	Modificar el programa anterior, aÃ±adiendo una variable que sea velocidad, de forma que:
//		si el semÃ¡foro estÃ¡ en verde y la velocidad es mayor de 50, escriba por pantalla â€œtiene una multaâ€�.
//		Si el semÃ¡foro estÃ¡ en rojo y la velocidad es de 30 o mÃ¡s, aÃ±ada â€œDemasiada velocidadâ€�
//		Si el semÃ¡foro estÃ¡ en naranja y la velocidad es de 40 o mÃ¡s, aÃ±ada, â€œlleva demasiada velocidad, pareâ€�

	 static Random rnd = new Random();

	public static int numeroGenerado() {
		return rnd.nextInt(3) + 1;
	}
	
	public static String semaforo(int n) {
		String color = "";
		switch (n){
		case 1:
			color = "verde";
			break;
		case 2:
			color = "ambar";
			break;
		case 3:
			color = "rojo";
			break;
		default:
			System.out.println("Error con Random en semaforo()");
		}
		return color;
	}
	
	public static String instrucciones(String s) {
		String instruccion = "";
		if (s.equals("verde")) {
			instruccion = ("Semaforo en " + s.toUpperCase() 
					+ "\nPuede pasar");
		} else if (s.equals("ambar")) {
			instruccion = ("Semaforo en " + s.toUpperCase() 
					+ "\nVaya parando");
		} else if (s.equals("rojo")) {
			instruccion = ("Semaforo en " + s.toUpperCase() 
					+ "\nPare");
		} else {
			System.out.println("Error en el if de instrucciones()");
		}
		return instruccion;
	}
	
	public static int velocidad() {
//		quiero obtener comom resultado las velocidades 30, 40 o 50
		return (rnd.nextInt(3) + 3) * 10;
	}

	public static void main(String[] args) {
//		instrucciones del semaforo
		System.out.println(instrucciones(semaforo(numeroGenerado())));
		
//		ejercicio 2
		if ((semaforo(numeroGenerado()).equals("verde")) && (velocidad() == 50)) {
			System.out.println("Tiene una multa");
		} else if (semaforo(numeroGenerado()).equals("ambar") && (velocidad() == 40)){
			System.out.println("Lleva demasiada velocidad, pare.");
		} else if (semaforo(numeroGenerado()).equals("rojo") && (velocidad() == 30)) {
			System.out.println("Demasiada velocidad");
		} else {
			System.out.println("La carretera esta en buen estado");
		}
	}

}

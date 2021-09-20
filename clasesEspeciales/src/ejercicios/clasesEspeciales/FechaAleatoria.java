package ejercicios.clasesEspeciales;

import java.util.Random;

public class FechaAleatoria {
//	3. Generar un programa que nos dé una fecha aleatoria 
//	para un posible regalo al que cumpla ese día del año
	static Random rnd = new Random();
	
	public static int generarFecha(int minimo, int maximo) {
		return rnd.nextInt(maximo) + minimo;
	}
	
	public static String fechaCompleta() {
		return generarFecha(1, 31) + "/" + generarFecha(1, 12) + "/" + generarFecha(1950, 71);
	}
	
	public static void main(String[] args) {
	System.out.println(fechaCompleta());
	}

}

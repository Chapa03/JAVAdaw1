
public class P10CChaparro {

	public static void main(String[] args) {
//		Realizar un programa que asigne a dos personas Marta y Maria dos valores que correspondan a su edad (Marta 17 y Maria 16).
//		- Informar de la edad de cada una por pantalla.
//		- Intercambiar el contenido de las variables que tienen la edad de forma que funcione para cualquier 
//		  valor de edad que se haya asignado en un principio
//		- Mostrar por pantalla el contenido

		int edadMarta = 17, edadMaria = 16, change = 0;
		
		System.out.println("Marta tiene " + edadMarta + " anios y Maria tiene " + edadMaria + " anios.");
		
		//Intercambio de datos de las variables??
		change = edadMarta;
		edadMarta = edadMaria;
		edadMaria = change;
		System.out.println("Marta tiene " + edadMarta + " anios y Maria tiene " + edadMaria + " anios.");
		
		
	}

}

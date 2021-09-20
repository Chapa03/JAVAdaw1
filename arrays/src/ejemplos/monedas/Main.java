package ejemplos.monedas;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
//		Declaracion e instanciacion
		Moneda[] monedero = new Moneda[10];
		
//		Inicializacion y declaracion
		Moneda[] monederoPepe = {new Moneda(1, "Euro"), new Moneda(1, "Centimo"), new Moneda(50, "Centimo"), new Moneda(2, "Euro")};
		
//		Inicializacion sobre posiciones de array ya inicializadas
		for (int i = 0; i < monederoPepe.length; i++) {
			monederoPepe[i] = new Moneda();
			monederoPepe[i].setValor(2);
		}
		
//		Asignacion de un valor al array
		monedero[0] = new Moneda(2, "Centimo");
		monedero[1] = new Moneda(1, "Euro");
		monedero[2] = new Moneda(1, "Euro");
		monedero[1] = null;
		monedero[9] = new Moneda (2, "Euro");
		
//		Acceder a las propiedades de las monedas
		for (int i = 0; i < monedero.length; i++) {
			if (monedero[i] == null ) {
				monedero[i] = new Moneda();
				monedero[i].setTipo("Centimo");
				monedero[i].setValor(50);
			}
		}
		
		for (int i = 0; i < monedero.length; i++) {
			if (monedero[i].getValor() == 50) {
				monedero[i].setValor(20);
			}
		}
		
//		Escribir el array
		System.out.println(Arrays.toString(monedero));
		System.out.println(Arrays.toString(monederoPepe));
		
//		Escribir elementos concretos
		System.out.println(monedero[1]);	 			//Llama al toString para ese elemento
		System.out.println(monedero[1].getTipo());	//Obtenemos el tipo del objeto en el array
		
	}

}

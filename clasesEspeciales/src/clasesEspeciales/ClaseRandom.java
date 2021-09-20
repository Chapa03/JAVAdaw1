package clasesEspeciales;

import java.util.Random;

public class ClaseRandom {

	public static void main(String[] args) {
//		el parametro de random es la semilla, que es el numero a partir del
//		cual aplica la formula para generar los numeros requeridos
//		si no se le aniade parametro, toma el valor de la hora y el
//		dia en milesimas de segundo
		Random rnd = new Random();
		for (int i = 0; i < 10; i++) {
//			el parametro del metodo next() nos delimita el maximo (sin llegar)
//			valor que nos va a mostrar. El minimo siempre va a ser 0, a no ser que le 
//			sumemos 1 al resultado para que empiece siempre en 1, ademas, en este caso
//			el random si que generara el numero que tiene por parametro
//			si sumamos un random entero y un float, generamos un numero entero con decimal
			System.out.println(rnd.nextInt(10) + 1 + rnd.nextFloat());
		}
		int a, b;
		a = rnd.nextInt(100) + 50;
		b = rnd.nextInt(100) + 50;
		System.out.println("Valor de a: " + a + " Valor de b: " + b + " El valor máximo es: " + Math.max(a, b));
		System.out.println(rnd.nextInt(3) + 3);
	}

}

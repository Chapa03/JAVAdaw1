package ejercicios.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2Monedas {
//	Crear otro array de 20 posiciones con valores que sean los de monedas de 
//	céntimos de forma aleatoria (posibles valores: 1,2,5, 10, 20, 50)
//	Mostrar por pantalla:
//	Los valores obtenidos
//	La cantidad total en euros obtenida
//	La moneda que más haya salido
	static Random rnd = new Random();
	static String monedaMasRepetida;
	
//	hay que encontrar la forma de rellenar el array con monedas de centimo aleatorias
//	pero con valores validos. Aqui planteo una opcion en la que un bucle va iterando hasta
//	que llega a un valor valido y lo almacena en el array. La otra opcion que requiere menos
//	recursos es la de hacerlo con un switch, asociando los valores de las monedas a los 
//	numeros del 1 al 6.
	public static int[] rellenarArray(int[] array) {
		int aleatorio;
		for (int i = 0; i < array.length; i++) {
			aleatorio = rnd.nextInt(6);
			switch(aleatorio) {
			case 0:
				array[i] = 1;
				break;
			case 1:
				array[i] = 2;
				break;
			case 2:
				array[i] = 5;
				break;
			case 3:
				array[i] = 10;
				break;
			case 4:
				array[i] = 20;
				break;
			case 5:
				array[i] = 50;
				break;
			}
			//aleatorio = rnd.nextInt(50) + 1;
			//if ((aleatorio == 1) || (aleatorio == 2) || (aleatorio == 5) || (aleatorio == 10) || (aleatorio == 20) || (aleatorio == 50)) {
			//	array[i] = aleatorio;
			//} else {
			//	i--;
			//}
		}
		return array;
	}
	
	public static float sumaMonedas(int[] array) {
		float suma = 0f;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return suma / 100;
	}
	
	public static int monedaMasRepetida(int[] array) {
		int uno = 0, dos = 0, cinco = 0, diez = 0, veinte = 0, cincuenta = 0;
		for (int i = 0; i < array.length; i++) {
			switch(array[i]) {
			case 1:
				uno++;
				monedaMasRepetida = "un centimo";
				break;
			case 2:
				dos++;
				monedaMasRepetida = "dos centimos";
				break;
			case 5:
				cinco++;
				monedaMasRepetida = "cinco centimos";
				break;
			case 10:
				diez++;
				monedaMasRepetida = "diez centimos";
				break;
			case 20:
				veinte++;
				monedaMasRepetida = "veinte centimos";
				break;
			case 50:
				cincuenta++;
				monedaMasRepetida = "cincuenta centimos";
				break;
			}
		}
		if ((uno > dos) && (uno > cinco) && (uno > diez) && (uno > veinte) && (uno > cincuenta)) {
			return uno;
		} else if ((dos > uno) && (dos > cinco) && (dos > diez) && (dos > veinte) && (dos > cincuenta)) {
			return dos;
		} else if ((cinco > uno) && (cinco > dos) && (cinco > diez) && (cinco > veinte) && (cinco > cincuenta)) {
			return cinco;
		} else if ((diez > uno) && (diez > dos) && (diez > cinco) && (diez > veinte) && (diez > cincuenta)) {
			return diez;
		} else if ((veinte > uno) && (veinte > dos) && (veinte > cinco) && (veinte > diez) && (veinte > cincuenta)) {
			return veinte;
		} else {
			return cincuenta;
		}
		
	}

	public static void main(String[] args) {
		int[] monedas = new int[20];
		
		System.out.println("Monedas obtenidas: ");
		System.out.println(Arrays.toString(rellenarArray(monedas)));
		System.out.println("Total en euros: " + sumaMonedas(monedas) + " euros");
		System.out.println("La moneda mas repetida ha sido la de " + monedaMasRepetida + " con " + monedaMasRepetida(monedas));
	}

}

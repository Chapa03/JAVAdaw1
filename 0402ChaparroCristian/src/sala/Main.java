package sala;

import java.util.Random;

public class Main {
	static Random rnd = new Random();
	
	public static int plazasLibres(int[][] array) {
		int libres = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 1) {
					libres++;
				}
			}
		}
		return libres;
	}
	
	public static int[][] plazasAleatorias(int[][] array){
		int[][] diezAleatorias = new int[10][8];
		int cont = 0;
		int fila = 0, columna = 0;
		while (cont < 10) {
			fila = rnd.nextInt(10);
			columna = rnd.nextInt(8);
			if ((array[fila][columna] != 0) && (array[fila][columna] != 2)) {
				array[fila][columna] = 0;
				cont++;
			}
		}
		return diezAleatorias;
	}

	public static void main(String[] args) {
		int[][] tamanioSala = new int[10][8];
		
//		llenamos el array con posiciones intercaladas separadas
//		para respetar la distancia de seguridad por covid
		for (int i = 0; i < tamanioSala.length; i++) {
			for (int j = 0; j < tamanioSala[i].length; j++) {
				if ((j % 2 == 0) && (i % 2 == 0)) {
					tamanioSala[i][j] = 2;
				} else if ((j % 2 == 1) && (i % 2 == 1)) {
					tamanioSala[i][j] = 2;
				}
			}
		}
		
//		llenamos por defecto las posiciones ocupables como libres
		for (int i = 0; i < tamanioSala.length; i++) {
			for (int j = 0; j < tamanioSala[i].length; j++) {
				if ((j % 2 == 1) && (i % 2 == 0)) {
					tamanioSala[i][j] = 1;
				} else if ((j % 2 == 0) && (i % 2 == 1)) {
					tamanioSala[i][j] = 1;
				}
			}
		}
		
//		se muestra el array entero por pantalla
		for (int i = 0; i < tamanioSala.length; i++) {
			System.out.print("F" + (i + 1) + ":\t");
			for (int j = 0; j < tamanioSala[i].length; j++) {
				System.out.print(" " + tamanioSala[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\nEl numero de plazas libres es de: " + plazasLibres(tamanioSala) + "\n");
		
//		llenamos el array con salas ocupadas aleatoriamente
		plazasAleatorias(tamanioSala);
		
		
//		se muestra el array entero por pantalla
		for (int i = 0; i < tamanioSala.length; i++) {
			System.out.print("F" + (i + 1) + ":\t");
			for (int j = 0; j < tamanioSala[i].length; j++) {
				System.out.print(" " + tamanioSala[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\nEl numero de plazas libres es de: " + plazasLibres(tamanioSala) + "\n");

		
//		numeros de butacas ocupadas de cada columna
		
		
		
		
		
	}

}

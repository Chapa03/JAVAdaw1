package ejercicios.clasesEspeciales;

import java.util.Random;

public class MuestraRandom {
	static Random rnd = new Random();

	public static void main(String[] args) {
		String cero = "";
		String uno = "";
		String dos = "";
		String tres = "";
		String cuatro = "";
		String cinco = "";
		String seis = "";
		String siete = "";
		String ocho = "";
		String nueve = "";
		int ceron = 0;
		int unon = 0;
		int dosn = 0;
		int tresn = 0;
		int cuatron = 0;
		int cincon = 0;
		int seisn = 0;
		int sieten = 0;
		int ochon = 0;
		int nueven = 0;
		
		System.out.println("1000 muestras aleatorias del 0 al 9");

		for  (int i = 0; i < 1000; i++) {
			int muestra = rnd.nextInt(10);
			if (muestra == 0) {
				cero += "|";
				ceron++;
			} else if (muestra == 1) {
				uno += "|";
				unon++;
			} else if (muestra == 2) {
				dos += "|";
				dosn++;
			} else if (muestra == 3) {
				tres += "|";
				tresn++;
			} else if (muestra == 4) {
				cuatro += "|";
				cuatron++;
			} else if (muestra == 5) {
				cinco += "|";
				cincon++;
			} else if (muestra == 6) {
				seis += "|";
				seisn++;
			} else if (muestra == 7) {
				siete += "|";
				sieten++;
			} else if (muestra == 8) {
				ocho += "|";
				ochon++;
			} else if (muestra == 9) {
				nueve += "|";
				nueven++;
			} else {
				System.out.println("Parametro incorrecto");
			}
		}
		
		System.out.println("0: " + ceron + "\t" + cero
				+ "\n1: " + unon + "\t" + uno
				+ "\n2: " + dosn + "\t" + dos
				+ "\n3: " + tresn + "\t" + tres
				+ "\n4: " + cuatron + "\t" + cuatro
				+ "\n5: " + cincon + "\t" + cinco
				+ "\n6: " + seisn + "\t" + seis
				+ "\n7: " + sieten + "\t" + siete
				+ "\n8: " + ochon + "\t" + ocho
				+ "\n9: " + nueven + "\t" + nueve);
		

	}

}

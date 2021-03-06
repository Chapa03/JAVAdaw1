package chapa;

import java.util.Scanner;

public class CryptobladesChapa {
	static Scanner sc = new Scanner(System.in);
	static int[] tablaExp = {16,17,18,19,20,22,24,26,28,30,33,36,39,42,46,50,55,60,66,72,79,86,
			94,103,113,124,136,149,163,178,194,211,229,248,268,289,311,334,358,383,409,436,464,
			493,523,554,586,619,653,688,724,761,799,838,878,919,961,1004,1048};
	static int pjLvl;
	static int claimExp;
	static int exp;
	static int cont = 0;
	
	public static void main(String[] args) {		
		System.out.print("Nivel de tu personaje: ");
		pjLvl = sc.nextInt() - 1;
		System.out.print("Experiencia ACTUAL que tiene tu personaje: ");
		exp = sc.nextInt();
		System.out.print("Experiencia a reclamar para tu personaje: ");
		claimExp = sc.nextInt();
		
		calcularNivelAlSubir(pjLvl, exp, claimExp);
	}
	
	public static void calcularNivelAlSubir(int pjLvl, int exp, int claimExp) {
		if (cont == 0) {
			tablaExp[pjLvl] = tablaExp[pjLvl] - exp;
			cont++;
		}
		while (claimExp >= tablaExp[pjLvl]) {
			claimExp = claimExp - tablaExp[pjLvl];
			pjLvl++;
		}
		System.out.println("El personaje sube al nivel " + (pjLvl + 1) + " con " + claimExp + " puntos de experiencia restantes.");
	}

}

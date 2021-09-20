import java.util.Scanner;

public class Ejercicio12 {
//	Leer una frase por pantalla y obtener sólo las letras pares.
//	Utilizar esa otra frase de letras pares y escribirla por pantalla con 
//	una letra en mayúsculas y otra en minúsculas y eliminando los blancos que vaya encontrando.
	static Scanner sc = new Scanner(System.in);
	
	public static String entrada() {
		String frase;
		System.out.println("Escribe una frase:");
		frase = sc.nextLine();
		return frase;
	}
	
	public static String letrasPares(String frase) {
		String frasePares = "";
		int i = 1;
		
		while (i < frase.length()) {
			frasePares = frasePares + frase.charAt(i);
			i+=2;
		}
		return frasePares;
	}
	
	public static String sinEspacios(String frasePares) {
		String sinEspacios = "";
		int i = 0;
		while (i < frasePares.length()) {
			if (frasePares.charAt(i) != ' '){
				sinEspacios = sinEspacios + frasePares.charAt(i);
			}
			i++;
		}
		return sinEspacios;
	}
	
	public static String fraseCani(String fraseSinEspacios) {
		String fraseCani = "";
		char letra;
		int i = 0;
		while (i < fraseSinEspacios.length()) {
			if (i % 2 == 0) {
				letra = fraseSinEspacios.toUpperCase().charAt(i);
				fraseCani = fraseCani + letra;
			} else {
				letra = fraseSinEspacios.toLowerCase().charAt(i);
				fraseCani = fraseCani + letra;
			}
			i++;
		}
		return fraseCani;
	}
	
	public static void salida(String frase) {
		String frasePares, fraseSinEspacios, fraseMinusMayus;
		
		frasePares = letrasPares(frase);
		fraseSinEspacios = sinEspacios(frasePares);
		fraseMinusMayus = fraseCani(fraseSinEspacios);
		
		System.out.println("\n** ** ** ** ** ** ** **");
		System.out.println("Letras PARES de la frase:");
		System.out.println(frasePares);
		
		System.out.println("\nAlternando MAYUS y minus sin espacios:");
		System.out.println(fraseMinusMayus);
	}

	public static void main(String[] args) {
		String frase;
		frase = entrada();
		salida(frase);
		sc.close();
	}

}

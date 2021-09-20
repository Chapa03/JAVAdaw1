import java.util.Scanner;

public class Ejercicio9 {
//	Leer un número de 3 cifras y decidir si es capicúa.
//	Hacer lo mismo con una palabra de 3 letras  
	static Scanner sc = new Scanner(System.in);
	
	public static String entrada() {
		String cadena = "";
		cadena = sc.next();
		return cadena;
	}
	
	public static boolean esCapicua(String cadena) {
		boolean capicua;
		if ((cadena.toLowerCase().charAt(0)) == (cadena.toLowerCase().charAt(2))) {
			capicua = true;
		} else {
			capicua = false;
		}
		return capicua;
	}
	
	public static void salida(String numero, String palabra) {
		System.out.println((esCapicua(numero)) ? "El numero " + numero + " es capicua" : "El numero " + numero + " NO es capicua");
		System.out.println((esCapicua(numero)) ? "La palabra " + palabra + " es capicua" : "La palabra " + palabra + " NO es capicua");
	}
	
	public static void main(String[] args) {
		String palabra, numero;
		
		System.out.print("Introduce un numero de 3 digitos: ");
		numero = entrada();
		System.out.print("Introduce una palabra de 3 caracteres: ");
		palabra = entrada();
		
		salida(numero, palabra);
		
		sc.close();
	}

}

package expresionesRegulares;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {

	public static void main(String[] args) {
		String cadena = "El frio de clase hoy es congelador";
		
//		al menos una barra y/o numeros del 0 al 9
//		String patron = "[/0-9]+";
		
//		letras minusculas y numeros repetidos o no hasta 6
//		String patron = "[a-z0-9]{6}";
		
//		AL MENOS una letra minuscula
//		String patron = "[a-z]+";
		
//		al menos una letra mayuscula cualquiera, incluidas tildes
//		String patron = "[A-Z¡…Õ”⁄]+";
		
//		una sola letra de las dadas
//		String patron = "[ABC]";
		
//		al menos 2 letras mayusculas, al menos 2 numeros y 1 @
//		String patron = "[A-Z]{2,}[0-9]{2,}[@]{1}";
		
//		una de las dos opciones en el parentesis
//		String patron = "(hace|frio){1}";
		
//		cualquier combinacion de la a, a la z, (pueden o no aparecer(*)),
//		"hace" o "frio" una vez y cualquier combinacion de la a, a la z y espacios
//		(pueden o no aparecer(*))
//		String patron = "[a-z]*(hace|frio){1}[a-z ]*";
		
//		igual que el ejemplo anterior, pero ignorando las mayus o minus de la primera 
//		condicion [a-z] con (?i)
//		String patron = "[a-z]*(?i)(hace|frio){1}[a-z ]*";
		
//		igual que el anterior, pero negando lo que va despues del acento circunflejo
		String patron = "[^a-z]*(?i)(hace|frio){1}[a-z ]*";
		
//		compara el contenido de una cadena con el patron dado (en orden), y devuelve
//		true o false en funcion de que se cumpla el patron o no
		System.out.println(Pattern.matches(patron, cadena));
		
//		generamos una expresion regular
		String regex = "(hoy|congelador)";
//		toma la expresion regular y la analiza
		Pattern pat = Pattern.compile(regex);
//		creamos el objeto a partir del patron generado en el compile
		Matcher mat = pat.matcher(cadena);

		System.out.println("Matches: " + mat.matches());
		System.out.println("Find: " + mat.find());
		System.out.println("Looking at: " + mat.lookingAt());
//		el primer elemento que coindide con el patron es el que reemplaza
		System.out.println("Replace First: " + mat.replaceFirst("ayer"));
//		sustituye todas las ocurrencias que encuentre
		System.out.println("Replace all: " + mat.replaceAll("TODOS"));
		
		String fecha = "12/01/2000";
//		separar elementos en funcion de la expresion regular dada
		String[] fechaSeparada = fecha.split("/");
		System.out.print(Arrays.toString(fechaSeparada));
		
	}

}

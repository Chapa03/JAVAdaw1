
public class MetodosString {

	public static void main(String[] args) {
		String frase = "   En un lugar de la mancha";
		System.out.println(frase.length());
		System.out.println(frase.charAt(20));
		System.out.println(frase.charAt(frase.length()-2));
		System.out.println(frase.substring(10));
		System.out.println(frase.substring(9, 19));
		System.out.println(frase.concat(" de cuyo nombre no quiero acordarme."));
		//"busqueda"
		System.out.println("El index");
		System.out.println(frase.indexOf("lugar"));
		//busqueda de caragteres o string desde un indice
		System.out.println(frase.indexOf("l", 7));
		System.out.println(frase.toLowerCase());
		System.out.println(frase.toUpperCase());
		//quita los espacios en blanco de los extremos de un string
		System.out.println(frase.trim());
		//reemplazo de caracteres o Strings para todas las ocurrencias del string
		System.out.println(frase.replace('u', '0'));
		System.out.println(frase.isEmpty());
		//repetir un string
		System.out.println(frase.repeat(2));
		char c = 'A';
		//podemos aprovechar metodos para caracteres utilizando la palabra 
		//Character y pasandole al metodo por parametro la variable o el caracter
		System.out.println(Character.isAlphabetic(c));
		System.out.println(Character.isLowerCase(c));
		
		String otraFrase = frase;
		System.out.println("Son iguales: " + (otraFrase == frase));
		//metodo para la comparacion de strings
		System.out.println("Son iguales: " + (otraFrase.equals(frase)));

		
	}

}

import java.util.Scanner;

public class Ejercicio10 {
//	Leer una frase por pantalla y 
//	Escribir  por pantalla un menú con  las siguientes opciones:
//	Menú que pida una opción hasta que deseemos finalizar:
//	-----------------MENÚ DE OPCIONES---------------------------
//	A- ESCRITURA DE LA FRASE LEÍDA EN minúsculas
//	B- ESCRITURA DE LA FRASE EN MAYÚSCULAS
//	C- ESCRITURA DE LA FRASE EN TIPO Oración
//	S- SALIR
	
	//DUDA - Se puede tener la variable frase en static en la clase sin ningun tipo de
	//problemas para usarla entre metodos en vez de ir pasandola por parametro???
	static Scanner sc = new Scanner(System.in);
	static String frase = "";
	
	public static String leerFrase() {
		String frase = "";
		System.out.println("Introduce cualquier frase que se te ocurra:");
		frase = sc.nextLine();
		return frase;
	}
	
	public static void menu() {
		String opcion = "";
		char opcionChar = ' ';
		//mientras que opcionChar != 's', ejecuta el codigo
		while (opcionChar != 's') {
			System.out.println("\n--------------------------------------------------"
					+ "\n-----------------MENU DE OPCIONES-----------------"
					+ "\n--------------------------------------------------");
			System.out.print("\tA- CONVERTIR FRASE A MAYUSCULAS" 
					+ "\n\tB- CONVERTIR FRASE A minusculas" 
					+ "\n\tC- ESCRIBIR TIPO Oracion"
					+ "\n\tS- SALIR"
					+ "\n->");
			opcion = sc.next();
			opcionChar = opcion.toLowerCase().charAt(0);
			switch (opcionChar) {
			case 'a':
				System.out.println("**" + fraseMayusculas());
				break;
			case 'b':
				System.out.println("**" + fraseMinusculas());
				break;
			case 'c':
				System.out.println("**" + oracion());
				break;
			case 's':
				System.out.println("**Saliendo del programa...");
				break;
			default:
				System.out.println("**Introduce una opcion valida, por favor.");
				break;
			}
		}
	}
	
	public static String fraseMayusculas() {
		String fraseMayus = frase.toUpperCase();
		return fraseMayus;
	}
	
	public static String fraseMinusculas() {
		String fraseMinus = frase.toLowerCase();
		return fraseMinus;
	}
	//Con substring, puedo elegir el indice de inicio y de final de un string
	public static String oracion() {
		String oracion = (frase.toUpperCase().charAt(0) + frase.substring(1, frase.length()));
		return oracion;
	}

	public static void main(String[] args) {
		
		frase = leerFrase();
		menu();
		System.out.println("Programa finalizado.");
		
		sc.close();
	}

}

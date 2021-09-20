import java.util.Scanner;

// probar a hacer los ejercicios determinando automaticamente los valores de los caracteres
// Funcionando con char predeterminadas

public class P5CristianChaparro {

	public static void main(String[] args) {
//			Partiendo de tres variables tipo carácter c1, c2 y c3:
//			Realizar una expresion que de verdadero si:
		
		char c1, c2, c3;
		String contenedor;
		boolean operacion;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Practica 4, Bloque 1 - Cristian Chaparro Arteaga \n - - - ");

		System.out.print("Por favor, introduce el primer caracter (c1): ");
		contenedor = sc.next();
		c1 = contenedor.charAt(0);
		System.out.print("Por favor, introduce el segundo caracter (c2): ");
		contenedor = sc.next();
		c2 = contenedor.charAt(0);
		System.out.print("Por favor, introduce el tercer caracter (c3): ");
		contenedor = sc.next();
		c3 = contenedor.charAt(0);

		//caracteres -> A 65, a 97
		
		//comparaciones mayus y minus
		boolean pruebaMayusc1 = (c1 >= 'A' && c1 <= 'Z');
		boolean pruebaMayusc2 = (c2 >= 'A' && c2 <= 'Z');
//		boolean pruebaMayusc3 = (c3 >= 'A' && c3 <= 'Z');
		boolean pruebaMinusc1 = (c1 >= 'a' && c1 <= 'z');
		boolean pruebaMinusc2 = (c2 >= 'a' && c2 <= 'z');
//		boolean pruebaMinusc3 = (c3 >= 'a' && c3 <= 'z');
		
		

//		c1 y c2 son el mismo caracter
		operacion = (c1 == c2);
		System.out.println(" - c1 y c2 son el mismo caracter? " + operacion);
				
//		c1 y c2 son el mismo caracter pero uno en mayusculas y otro en minusculas
		operacion = (((pruebaMayusc1 || pruebaMinusc1) && (pruebaMayusc2 || pruebaMinusc2)) && (c1 - c2 != 0) );
		System.out.println(" - c1 y c2 son el mismo caracter, pero c1 en MAYUS y c2 en minus? " + operacion);
		
		/*			
//		c1 y c2 son la misma letra pero una en minuscula y la otra en mayúscula
		operacion = ((c1 - c2 == 32) || (c2 - c1 == 32)) && (((c1 >= 97) && (c1 < 130)) && ((c2 >= 65) && (c2 < 97)));
		System.out.println(" - c1 y c2 son el mismo caracter pero c1 en minus y c2 en MAYUS? " + operacion);
		
//		c1, c2 y c3  son minúsculas
		operacion = (c1 >= 97) && (c2 >= 97) && (c3 >= 97);
		System.out.println(" - c1, c2 y c3 son minusculas? " + operacion);

//		c1, c2 y c3 son mayúsculas
		operacion = (c1 < 97) && (c2 < 97) && (c3 < 97);
		System.out.println(" - c1, c2 y c3 son MAYUSCULAS? " + operacion);
		
//		c2 va antes en el alfabeto que c1
		//las operaciones con el 32 son para contrarrestar las diferencias entre mayus y minus sin comprobar si lo son
		operacion = ((c2 < c1) || ((c2 - 32 < c1) || (c2 < c1 - 32)));
		System.out.println(" - c2 va antes en el alfabeto que c1? " + operacion);
		sc.close();
		*/
		sc.close();
	}

}

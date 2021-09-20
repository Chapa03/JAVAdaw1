import java.util.Scanner;

public class P4CristianChaparro {
	
//	Partiendo de la base de tres variables numericas: v1, v2 y v3
//	Realizar una expresion que de verdadero si:
	
	public static void main(String[] args) {
		int v1, v2, v3;
		boolean mostrar;
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el primer numero (v1): ");
		v1 = entrada.nextInt();
		System.out.print("Introduce el segundo numero (v2): ");
		v2 = entrada.nextInt();
		System.out.print("Introduce el tercer numero (v3): ");
		v3 = entrada.nextInt();
	
		System.out.println(" *** *** *** ");
		
//		v3 es el mayor valor de los 3
		mostrar = (v3 > v2) && (v3 > v1);
		System.out.println("- v3 es el mayor valor de los 3? " + mostrar);
		
//		v2 es mayor que v3 pero v2 es menor que v1
		mostrar = (v2 > v3) && (v2 < v1);
		System.out.println("- v2 es mayor que v3 y menor que v1? " + mostrar);
		
//		v1 no es igual a ninguno de los otros dos valores
		mostrar = (v1 != v2) && (v1 != v3);
		System.out.println("- v1 es distinto de v2 y v3? " + mostrar);
		
//		hay por lo menos dos valores iguales
		mostrar = (v1 == v2) || (v2 == v3);
		System.out.println("- Alguno de los valores son iguales? " + mostrar);
		
//		los tres valores son iguales
		mostrar = (v1 == v2) && (v2 == v3);
		System.out.println("- Son los 3 valores iguales? " + mostrar);
		
//		v1 esta entre 1 y 30, v2 entre 31 y 60 y v3 entre 61 y 100
		mostrar = ((v1 >= 1) && (v1 <= 30)) && ((v2 >= 31) && (v2 <= 60)) && ((v3 >= 61) && (v3 <= 100));
		System.out.println("- 1 < v1 < 30; 31 < v2 < 60 y 61 < v3 < 100 ? " + mostrar);
		
//		v1 y v3  son menores que 10, v2 es mayor que 20 
		mostrar = ((v1 < 10) && (v3 < 10)) && (v2 > 20);
		System.out.println("- v1 y v3 son < 10 y v2 > 20? " + mostrar);
		
//		v1 es mayor que 100 o menor que 10
		mostrar = (v1 > 100) || (v1 < 10);
		System.out.println("- v1 es mayor que 100 o menor que 10? " + mostrar);
		
//		v1 es mayor que 100 y menor que 10
		mostrar = (v1 > 100) && (v1 < 10);
		System.out.println("- v1 es mayor que 100 y menor que 10? " + mostrar);
		
//		v1 es par
		mostrar = (2 % v1) == 0;
		System.out.println("- v1 es par? " + mostrar);
		
//		v1 y v2 son pares
		mostrar = (2 % v1 == 0) && (2 % v2 == 0);
		System.out.println("- v1 y v2 son pares? " + mostrar);
		
//		v1 es divisible por v2
		mostrar = (v1 % v2 == 0);
		System.out.println("- v1 es divisible entre 2? " + mostrar);
		
		entrada.close();
	}
	

	
	
}

import java.util.Scanner;

public class Ejercicio7 {
//	Leer números por teclado de manera que sólo permita que el recién leído 
//	sea mayor que el anterior. En el momento que esto no se cumpla el programa se detiene.
//	La lectura del primer número siempre será exitosa, ya que no hay ningún número con el que compararlo. 
	static Scanner sc = new Scanner(System.in);

	
	public static int entradaNumero() {
		int numero;
		numero = sc.nextInt();
		return numero;
	}
	
	public static void isBigger() {
		int numeroLeido;
		int comparador;
		System.out.print("Introduce un numero: ");
		comparador = entradaNumero();
		System.out.print("Introduce un numero mayor para continuar: ");
		
		while ((numeroLeido = entradaNumero()) > comparador) {
			System.out.print("Introduce un numero mayor para continuar: ");
			comparador = numeroLeido;
		}
	}

	public static void main(String[] args) {
		isBigger();
		
		System.out.println("El número introducido no es mayor que el anterior.");
		
		sc.close();
	}

}

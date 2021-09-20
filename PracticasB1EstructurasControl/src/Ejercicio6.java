import java.util.Scanner;

public class Ejercicio6 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
//		Leer números por teclado de manera que al escribir el número 0, 
//		pare el proceso y se dejen de leer números. Obtener la suma de todos los leídos.
		int numeroLeido = 1, sumaLeidos = 0;
				
		while (numeroLeido != 0) {
			System.out.print("Introduce un numero:");
			numeroLeido = sc.nextInt();
			sumaLeidos += numeroLeido;
		}
		
		System.out.println("La suma de los numeros obtenidos es " + sumaLeidos);
		
	}

}

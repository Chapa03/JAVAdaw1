import java.util.Scanner;

public class P3CristianChaparro {

	public static void main(String[] args) {
		//Mostrar el nombre recibido por consola y un saludo en pantalla
		//tras una línea de asteriscos. 3 numeros (dos enteros y un float)
		//boolean que contenga true o false segun si num1 es mayor o no que num2
		//un char en el que se guarda la tercera letra de mi nombre
		
		String nombre;
		int num1, num2;
		float numDec;
		//boolean (num1>num2);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hola! Como te llamas? ");
		nombre = sc.next();
		System.out.print("Elige un numero entero: ");
		num1 = sc.nextInt();
		System.out.print("Ahora elige un segundo numero: ");
		num2 = sc.nextInt();
		System.out.print("Ahora necesito que introduzcas un numero decimal: ");
		numDec = sc.nextFloat();
		
		System.out.println("\n*****************************************************");
		System.out.println("El nombre del usuario es " + nombre);
		System.out.println("Los números que has elegido son:"
				+ "\nEnteros: " + num1 + " y " + num2 + " | Float: " + numDec );
		
		if (num1 > num2) {
			System.out.println("De los números enteros introducidos, el número " + num1 + " es mayor que " + num2);
		} else if (num1 < num2) {
			System.out.println("De los números enteros introducidos, el número " + num2 + " es mayor que " + num1);
		} else {
			System.out.println("Los números que introdujiste son iguales");
		}
		
		char terceraLetra = nombre.charAt(2);
		
		
		System.out.println("Y la tercera letra de tu nombre es la \"" + terceraLetra + "\"");
		
		sc.close();
		
	}

}
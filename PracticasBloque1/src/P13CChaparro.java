import java.util.Scanner;

public class P13CChaparro {
//	Realizar un programa que después de leer tu nombre por pantalla y tres números (DOS ENTEROS Y UN FLOAT), escriba lo siguiente: 
//		ESTE ES MI PRIMER PROGRAMA
//		************************************************************************** 
//		Mi nombre es (el nombre leído) 
//		Los números dados son: Numero 1 Numero2 Numero3 
//		Podemos decir que Numero1 es mayor que Numero2 es (true o false) 
//		Podemos decir que la multiplicación de Numero1 por Numero2 es menor que Numero3 es (true o false) 
//		La tercera letra de mi nombre es … 
//		Mi nombre y apellido son: 
//		Si multiplico mi edad por el número primero leído el resultado es menor que 100000: true o false
	static Scanner sc = new Scanner(System.in);
	static int contNombre = 0;
	static int contNumero = 0;
	
	//Saludo principal
	public static void saludo () {
		System.out.println("\n\tESTE ES MI PRIMER PROGRAMA");
		System.out.println("**************************************************************************");
	}
	//Recogida de nombre y apellidos
	public static String leerTexto() {
		String introduccion = "";
		
		if(contNombre==0) {
			System.out.print("Como te llamas?: ");
		}else if(contNombre==1) {
			System.out.print("Dime tu primer apellido: ");
		}else{
			System.out.print("Dime tu segundo apellido: ");
		}
		
		introduccion = sc.next();
		contNombre++;
		return introduccion;
	}
	public static int leerNumero() {
		int n1 = 0;
		
		if(contNumero==0) {
			System.out.print("Ahora necesito que introduzcas un numero entero: ");
		}else{
			System.out.print("Y otro mas por aqui: ");
		}
		
		n1 = sc.nextInt();
		contNumero++;
		return n1;
	}
	public static float leerFloat() {
		float n3= 0F;
		System.out.print("Y, por ultimo un numero decimal: ");
		n3 = sc.nextFloat();
		return n3;
	}
	//Todas las salidas a consola de los datos introducidos
	public static void salidaConsola(String miNombre, String miApe1, String miApe2, int n1, int n2, float n3, boolean comparacionMet, boolean comparacionEdadMet, boolean comparacionOpMet) {
		System.out.println("Mi nombre es: " + miNombre);
		System.out.println("Mi nombre completo es: " + miNombre + " " + miApe1 + " " + miApe2);
		System.out.println("La tercera letra de mi nombre es la: " + miNombre.charAt(2));
		System.out.println("Los numeros dados son: " + n1 + ", " + n2 + " y " + n3);
		System.out.println("Podemos decir que el numero " + n1 + " es mayor que el numero " + n2 + "?: " + comparacionMet);
		System.out.println("Podemos decir que " + n1 + " x " + n2 + " es mayor que " + n3 + "?: " + comparacionOpMet);
		System.out.println("Si multiplicco mi edad por " + n1 + " el resultado es meor que 100000? " + comparacionEdadMet);
	}
	//comparacion  de los nunmeros introducidos
	public static boolean comparacion(int n1, int n2) {
		boolean compararNumeros = (n1 > n2);
		return compararNumeros;
	}
	//comparacion de n1*n2 es menor que 3
	public static boolean comparacionOperacion(int n1, int n2, float n3) {
		boolean compararOperacion = (n1 * n2 > n3);
		return compararOperacion;
	}
	
	public static boolean comparacionEdad(int n1) {
		int edad = 27;
		boolean compararEdad = (edad * n1 > 100000);
		return compararEdad;
	}
	
	public static void main(String[] args) {
		String nombre = "", apellido1 = "", apellido2 = "";
		int num1 = 0, num2 = 0;
		float num3 = 0F;
		boolean comp = true, compEdad = true, compOperacion = true;
		
		nombre = leerTexto();
		apellido1 = leerTexto();
		apellido2 = leerTexto();
		System.out.println(" - - - - ");
		num1 = leerNumero();
		num2 = leerNumero();
		num3 = leerFloat(); 
		
		comp = comparacion(num1, num2);
		compOperacion = comparacionOperacion(num1, num2, num3);
		compEdad = comparacionEdad(num1);
		
		saludo();
		salidaConsola(nombre, apellido1, apellido2, num1, num2, num3, comp, compEdad, compOperacion);
		
		sc.close();
	}

}

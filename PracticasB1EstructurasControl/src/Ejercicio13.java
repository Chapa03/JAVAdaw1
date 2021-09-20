import java.util.Scanner;

public class Ejercicio13 {
//	Realizar un programa que tenga 3 métodos y desde el principal se realice una llamada a los 3:
//		Primer método: calcularProporcion, que reciba dos valores y nos devuelva el porcentaje que representa el primero sobre el segundo, redondeado a  2 cifras.
//		Ejemplo: le damos 2 y 8 y nos devolverá 25 que corresponde al 25%. 
//		Desde el principal, escribir como resultado:
//		La proporción 2 de 8 corresponde a un 25%
//		Segundo método: obtenerColor, le damos la proporción obtenida y nos dará el color que corresponde, teniendo en cuenta que de:
//		0 a 25 incluido, es rojo
//		25 excluido a 50 incluido es amarillo
//		50 excluido a 75 incluido es verde
//		75 excluido a 100 incluido es azul
//		Desde el principal, escribir el color obtenido
//		Tercer método:esCorrecto, le pasamos el color obtenido y nos devuelve un valor booleano que es:
//		true, si es verde o azul
//		false, si es rojo o amarillo
//		Si es true, desde el principal se escribirá: puedes pasar
//		Si es false, desde el principal se escribirá: tienes la puerta cerrada
	static Scanner sc = new Scanner(System.in);
	
	public static int calcularProporcion(int num1, int num2) {
		double calculo;
		int porcentaje;
		
		calculo = (num1 * 100) / num2;
		porcentaje = (int) calculo; 
		return porcentaje;
	}
	
	public static String obtenerColor(int porcentaje) {
		String color = "";
		if ((porcentaje >= 0) && (porcentaje <= 25)) {
			color = "rojo";
		} else if ((porcentaje > 25) && (porcentaje <= 50)) {
			color = "amarillo";
		} else if ((porcentaje > 50) && (porcentaje <= 75)) {
			color = "verde";
		} else if ((porcentaje > 75) && (porcentaje <= 100)) {
			color = "azul";
		} else {
			System.out.println("El valor no es valido");
		}
		return color;
	}
	
	public static boolean esCorrecto(String color) {
		boolean correcto = false;
		if ((color == "verde") || (color == "azul")) {
			correcto = true;
		} else if ((color == "amarillo") || (color == "rojo")) {
			correcto = false;
		}
		
		return correcto;
	}

	public static void main(String[] args) {
		int num1, num2, porcentaje;
		String color;
		
		System.out.print("Introduce un numero: ");
		num1 = sc.nextInt();
		System.out.print("Introduce otro numero: ");
		num2 = sc.nextInt();
		
		porcentaje = calcularProporcion(num1, num2);
		System.out.println("La proporcion " + num1 + " de " + num2 + " corresponde a un " + porcentaje + "%");
		
		color = obtenerColor(porcentaje);
		System.out.println("El color obtenido es el " + color);
		
		if (esCorrecto(color)) {
			System.out.println("Puedes pasar");
		} else {
			System.out.println("Tienes la puerta cerrada");
		}
		

	}

}

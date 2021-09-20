
//DUDAS - hasta cuantos caracteres podemos pasar por consola a un string con un scanner??? - nextLine() lo 
//soluciona y lee la linea entera que le pasemos

import java.util.Scanner;

public class P6CristianChaparro {
	//se utiliza el scaner estatico para poder acceder desde todos los metodos estatidos dentro de la misma clase
	static Scanner sc = new Scanner(System.in);
	
	public static void saludo(String nombreMet, String ape1, String ape2) {
		
		System.out.print("Escribe aqui tu nombre: ");
		nombreMet = sc.next();
		System.out.print("Ahora tu 1er apellido: ");
		ape1 = sc.next();
		System.out.print("Y por utimo, tu 2o apellido: ");
		ape2 = sc.next();
		System.out.println("Un placer conocerte " + nombreMet + " " + ape1 + " " + ape2 + "\n");
		
	}
	
	public static void calculoVueltas(int metrosMet, int mCarreraMet) {
		
		int vueltas;
		System.out.print("De cuantas vueltas consta la siguiente carrera? " + "\n");
		//Me tiraba error y vi que estaba importando vueltas de main y dandole valor en este metodo
		//por lo que elimine la variable del main y la declaro e inicializo aqui, pero el Scanner me da un problema
		vueltas = sc.nextInt();

		
		mCarreraMet= metrosMet * vueltas;
		System.out.print("Los participantes tendran que recorrer " + mCarreraMet + " metros en " + vueltas + " vueltas de 400m");
	
	}

	public static void main(String[] args) {
//		Realizar un programa de forma que obtenga primero el saludo con tu nombre y apellido,
//		- Insertar una variable con el numero de metros de una carrera
//		- Insertar en una variable el numero de vueltas a una pista de atletismo suponiendo que tiene 400m cada vuelta
//		- Obtener el valor por pantalla del numero de vueltas a la pista incluyendo en el mensaje:
//		"Una carrera de x metros tiene x vueltas"
		
		String nombre = "", apellido1 = "", apellido2 = "";
		int metros, mCarrera =0;
		
		metros = 400;
		
		saludo(nombre, apellido1, apellido2);
		calculoVueltas(metros, mCarrera);
		sc.close();
		
		
	}

}

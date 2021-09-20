package ejercicios.rectangulo;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static int leerValor() {
		System.out.print("Dame un valor: ");
		return sc.nextInt();
	}
	
//	nos devolvera un objeto de tipo rectangulo
	public static Rectangulo datosRectangulo() {
		Rectangulo r = new Rectangulo();
		r.setLadoA(leerValor());
		r.setLadoB(leerValor());
		return r;
	}
	
//	podemos mandar objetos por parametro
	public static int modificaLadoB(Rectangulo r) {
		r.setLadoB(10);
		return r.getLadoB();
	}
	
	public static void obtenerDatos(Rectangulo r) {
		r.setLadoA(leerValor());
		r.setLadoB(leerValor());
	}

	public static void main(String[] args) {
//		creacion del objeto con el constructor mas amplio
		Rectangulo r1 = new Rectangulo(leerValor(), leerValor());
		System.out.println("r1 - " + r1.toString());
		System.out.println(r1.toString());
		System.out.println("Area del rectangulo: " + r1.area());
		System.out.println("Perimetro del rectangulo: " + r1.perimetro());
		System.out.println("Sus lados son iguales (es un cuadrado)?: " + r1.esCuadrado());
		System.out.println(r1.pintarRectangulo());;
		
//		creacion del objeto dandole los parametros con los setters
//		Rectangulo r2 = new Rectangulo();
//		r2.setLadoA(leerValor());
//		r2.setLadoB(leerValor());
//		System.out.println("r2 - " + r2.toString());
//		System.out.println(r2.pintarRectangulo());
		
//		llamamos al metodo datosRectangulo() que nos devuelve un 
//		objeto y automatizamos la creacion del rectangulo
		Rectangulo r6 = datosRectangulo();
		System.out.println("r6 - " + r6.toString());
		System.out.println(r6.pintarRectangulo());
		
		System.out.println("Lado B = " + modificaLadoB(r6));
//		despues de cambiarle algun atributo a traves de un 
//		metodo, le pedimos que nos devuelva el mismo objeto, con los
//		atributos nuevos (esto no pasaria con las variables, pues
//		cualquier variable que trabajemos en un metodo, no cambiara
//		la variable fuera de ese metodo
		System.out.println("r6 - " + r6.toString());
		System.out.println(r6.pintarRectangulo());
		
		Rectangulo r7 = new Rectangulo();
		obtenerDatos(r7);
		System.out.println("r6 - " + r7.toString());
		
		
	}

}

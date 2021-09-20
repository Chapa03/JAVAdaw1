package listas;

import java.util.ArrayList;
import java.util.List;

public class EjemploCasting {

	public static void main(String[] args) {
//		Herencia Upcasting y downcasting
		Persona p1 = new Persona("Leticia");
		System.out.println(p1.getNombre());
		System.out.println(p1.toString());
		
		Alumno a1 = new Alumno("Maria", "1DAW");
		System.out.println(a1.getCurso() + " - " + a1.getNombre());
		System.out.println(a1.toString());
		
//		UPCASTING
//		generamos un alumno de tipo Persona.
//		en este caso solo podemos acceder a los metodos de la clase padre
//		a excepcion de los metodos que esten sobrescritos en la clase hija
		Persona pa1 = new Alumno("Ana", "1DAW");
		System.out.println(pa1.getNombre());
//		DOWNCASTING
//		podemos especificar una "bajada de nivel" del objeto para poder 
//		acceder a los elementos de la clase hija, a los que sin el 
//		casting no se nos permitiria acceder
		System.out.println(((Alumno)(pa1)).getCurso());
		System.out.println(pa1.toString());
		
//		Operador instanceof
		System.out.println(p1.getClass());
		if (pa1 instanceof Alumno) {
			System.out.println("pa1 Es un alumno");
		}
		
//		ARRAYS - Aplicacion directa
		
//		generalmente, para nombrar cualquier tipo de lista, nombramos
//		a la izquiera List, ya que es el nombre de la interfaz de la que heredan
//		todas las listas, como por ejemplo, los ArrayList
		List<Persona> arrayPersonas = new ArrayList<Persona>();
		arrayPersonas.add(new Alumno("Pepe", "1DAW"));
		arrayPersonas.add(new Alumno("Ares", "1DAW"));
		arrayPersonas.add(new Conserje());
		for (Persona p: arrayPersonas) {
			System.out.println(p.getNombre());
			if (p instanceof Alumno) {
				System.out.println(((Alumno)(p)).getCurso());
			}
		}
	}

}

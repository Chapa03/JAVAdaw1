package herencia.ejemplo1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		Animal a1 = new Animal("Kiko", "Gran Danes", new GregorianCalendar(2010, Calendar.FEBRUARY, 21));
		System.out.println(a1.toString());
		
//		los objetos de la clase mamifero tendran los atributos y metodos propios
//		y ademas tendra los atributos y metodos de la clase padre
		Mamifero m1 = new Mamifero();
		m1.setNombre("Uno");
		m1.setMesesGestacion(23);
		m1.setRaza("Dogo");
		m1.setFechaNacimiento(new GregorianCalendar(2010, Calendar.FEBRUARY, 21));
		System.out.println(m1.getNombre() + " " + m1.getTipoPiel());
		
//		si hay dos metodos iguales en la subclase y en la superclase, un objeto
//		del tipo de la subclase, utilizara el metodo de la subclase
		System.out.println(m1.toString());
		
		Mamifero m2 = new Mamifero("Pelo", 15);
		m2.setFechaNacimiento(new GregorianCalendar(2010, Calendar.JULY, 10));
		System.out.println(m2.toString());
		
		Mamifero m3 = new Mamifero("Kaki", "Gran Danes", new GregorianCalendar(2010, Calendar.JANUARY, 12), "Mucho pelo", 5);
		System.out.println(m3.toString());
		
		Insecto i1 = new Insecto("Conchita", "Mantis", new GregorianCalendar(2010, Calendar.AUGUST, 2), 6);
		System.out.println(i1.toString());
	}

}

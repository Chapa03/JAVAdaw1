package ejemplos;

public class Main {

	public static void main(String[] args) {
//		nuevos objetos del tipo persona:
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona("Luis", 27);
		
		Vivienda v1 = new Vivienda();
		
//		llamada a los metodos de Persona
		p1.escribir();
		p1.setNombre("Chapa");
		p1.escribir();

		p2.escribir();
		p2.setNombre("Ana");
		p2.escribir();
		
		p3.escribir();
		v1.escribir();
		
	}

}

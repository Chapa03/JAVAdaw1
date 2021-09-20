package clases;

public class Main {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Dragos", 18F, 70);
		
		System.out.println(persona1.toString());
		
		System.out.println(persona1.getNombre());
		
		persona1.setNombre("KIKEEEEEEI");
		
		System.out.println(persona1.getNombre());
		
		System.out.println(persona1.alturaMasPeso());
		
		System.out.println("\t1");
		System.out.println("12345678901234567890");
	}

}

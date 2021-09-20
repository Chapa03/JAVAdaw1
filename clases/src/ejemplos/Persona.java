package ejemplos;

//	Molde con las caracteristicas que va a tener que tener cualquier
//	objeto del tipo Persona
public class Persona {
//	atributos de la clase
	String nombre;
	int edad;
	
//	constructor de la clase
	public Persona() {
		edad = 34;
	}
	
//	sobrecarga del metodo de la clase:
//	se usa el miso metodo con parametros distintos
	public Persona(String s, int e) {
		nombre = s;
		edad = e;
	}
	
//	metodos de la clase
	public void escribir() {
		System.out.println(nombre + " " + edad);
	}

	public void setNombre(String s) {
		nombre = s;
	}
}

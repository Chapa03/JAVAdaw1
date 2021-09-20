package ejercicios.torneoTenis;

public class Jugador {
	private String nombre;
	private String tramoEdad;
	
	public Jugador(String nombre, String tramoEdad) {
		this.nombre = nombre;
		this.tramoEdad = tramoEdad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTramoEdad() {
		return tramoEdad;
	}

	public void setTramoEdad(String tramoEdad) {
		this.tramoEdad = tramoEdad;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", tramoEdad=" + tramoEdad + "]";
	}
	
}

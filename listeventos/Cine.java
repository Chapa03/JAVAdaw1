package listeventos;

import java.util.GregorianCalendar;

public class Cine extends Evento {
	

	private String pelicula;
	public Cine(String lugar, int asistentes, int recaudacion, GregorianCalendar fecha, String pelicula) {
		super (lugar, asistentes, recaudacion, fecha);
		this.pelicula=pelicula;
	}
	public String getPelicula() {
		return pelicula;
	}
	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}
	
}

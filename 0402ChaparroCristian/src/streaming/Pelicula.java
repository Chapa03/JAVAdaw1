package streaming;

import java.util.Calendar;

public class Pelicula extends Emisiones{
	private int duracion;
	
	public Pelicula(int codEmision, String titulo, Calendar fechaInclusion, int duracion) {
		super(codEmision, titulo, fechaInclusion);
		this.duracion = duracion;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Pelicula [duracion=" + duracion + "]";
	}
	
}

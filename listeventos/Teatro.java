package listeventos;

import java.util.Calendar;

public class Teatro extends Evento {
	private String compania;

	public Teatro(String compania) {
		super();
		this.compania = compania;
	}
	public Teatro() {
		super();
		}

	public Teatro(String lugar, int asistentes, float recaudacion, Calendar fecha, String compania) {
		super(lugar, asistentes, recaudacion, fecha);
		this.compania=compania;
	}

	

	

	
}

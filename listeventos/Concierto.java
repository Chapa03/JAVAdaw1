package listeventos;

import java.util.ArrayList;
import java.util.Calendar;

public class Concierto extends Evento {
	private ArrayList<Grupo> listaGrupos;

	public Concierto(ArrayList<Grupo> listaGrupos) {
		this.listaGrupos = listaGrupos;
	}

	public Concierto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Concierto(String lugar, int asistentes, float recaudacion, Calendar fecha,ArrayList<Grupo> listaGrupos ) {
		super(lugar, asistentes, recaudacion, fecha);
		this.listaGrupos = listaGrupos;
	}
	
	
}

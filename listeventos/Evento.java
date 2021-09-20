package listeventos;

import java.util.Calendar;

public class Evento {
	
	private String lugar;
	private int asistentes;
	private float recaudacion;
	private Calendar fecha;
	
	public Evento() {
		super();
	}
	public Evento(String lugar, int asistentes, float recaudacion, Calendar fecha) {
		super();
		this.lugar = lugar;
		this.asistentes = asistentes;
		this.recaudacion = recaudacion;
		this.fecha = fecha;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public int getAsistentes() {
		return asistentes;
	}
	public void setAsistentes(int asistentes) {
		this.asistentes = asistentes;
	}
	public float getRecaudacion() {
		return recaudacion;
	}
	public void setRecaudacion(float recaudacion) {
		this.recaudacion = recaudacion;
	}
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Evento [lugar=");
		builder.append(lugar);
		builder.append(", asistentes=");
		builder.append(asistentes);
		builder.append(", recaudacion=");
		builder.append(recaudacion);
		builder.append(", fecha=");
		builder.append(fecha);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}

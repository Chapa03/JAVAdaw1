package streaming;

import java.util.*;

public class Emisiones {
	private int codEmision;
	private String titulo;
	private Calendar fechaInclusion;
	
	
	public Emisiones(int codEmision, String titulo, Calendar fechaInclusion) {
		this.codEmision = codEmision;
		this.titulo = titulo;
		this.fechaInclusion = fechaInclusion;
	}

	public int getCodEmision() {
		return codEmision;
	}

	public void setCodEmision(int codEmision) {
		this.codEmision = codEmision;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Calendar getFechaInclusion() {
		return fechaInclusion;
	}

	public void setFechaInclusion(Calendar fechaInclusion) {
		this.fechaInclusion = fechaInclusion;
	}

	@Override
	public String toString() {
		return "Emisiones [codEmision=" + codEmision + ", titulo=" + titulo + ", fechaInclusion=" + fechaInclusion
				+ "]";
	}
	
}

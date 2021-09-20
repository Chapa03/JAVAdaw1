package ejercicios.autobuses;

public class Autobus {
	private int numLinea;
	private String tipoAutobus;
	private String estado;
	
	public Autobus() {
	}
	
	public Autobus(int numLinea, String tipoAutobus, String estado) {
		this.numLinea = numLinea;
		this.tipoAutobus = tipoAutobus;
		this.estado = estado;
	}

	public int getNumLinea() {
		return numLinea;
	}

	public void setNumLinea(int numLinea) {
		this.numLinea = numLinea;
	}

	public String getTipoAutobus() {
		return tipoAutobus;
	}

	public void setTipoAutobus(String tipoAutobus) {
		this.tipoAutobus = tipoAutobus;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Autobus [numLinea=" + numLinea + ", tipoAutobus=" + tipoAutobus + ", estado=" + estado + "]";
	}
	
}

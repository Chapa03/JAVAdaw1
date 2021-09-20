package modelo;

public class Nave {
	private String codigoNave;
	private Viaje viaje;
	private int numAsientos;
	private String tipoNave;
	
	public Nave(String codigoNave, Viaje viaje, int numAsientos, String tipoNave) {
		super();
		this.codigoNave = codigoNave;
		this.viaje = viaje;
		this.numAsientos = numAsientos;
		this.tipoNave = tipoNave;
	}

	public String getCodigoNave() {
		return codigoNave;
	}

	public void setCodigoNave(String codigoNave) {
		this.codigoNave = codigoNave;
	}

	public Viaje getViaje() {
		return viaje;
	}

	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}

	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}

	public String getTipoNave() {
		return tipoNave;
	}

	public void setTipoNave(String tipoNave) {
		this.tipoNave = tipoNave;
	}

	@Override
	public String toString() {
		return "Nave [codigoNave=" + codigoNave + ", viaje=" + viaje + ", numAsientos=" + numAsientos + ", tipoNave="
				+ tipoNave + "]";
	}

}

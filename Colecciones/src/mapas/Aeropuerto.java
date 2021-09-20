package mapas;

public class Aeropuerto {
	private String nombreAeropuerto;
	private String ciudad;
	private String codIacc;
	
	public Aeropuerto(String nombreAeropuerto, String ciudad, String codIacc) {
		super();
		this.nombreAeropuerto = nombreAeropuerto;
		this.ciudad = ciudad;
		this.codIacc = codIacc;
	}

	public String getNombreAeropuerto() {
		return nombreAeropuerto;
	}

	public void setNombreAeropuerto(String nombreAeropuerto) {
		this.nombreAeropuerto = nombreAeropuerto;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCodIacc() {
		return codIacc;
	}

	public void setCodIacc(String codIacc) {
		this.codIacc = codIacc;
	}

	@Override
	public String toString() {
		return "Aeropuerto " + nombreAeropuerto + ", Ciudad: " + ciudad + " - IACC=" + codIacc;
	}
	
}

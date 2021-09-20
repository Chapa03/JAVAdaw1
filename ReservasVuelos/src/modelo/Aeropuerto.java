package modelo;

public class Aeropuerto implements Comparable<Aeropuerto>{
	private String codAeropuertoIATA;
	private String codAeropuertoICAO;
	private String nombreAeropuerto;
	private Ciudad ciudad;
	
	public Aeropuerto(String codAeropuertoIATA, String codAeropuertoICAO, String nombreAeropuerto, Ciudad ciudad) {
		super();
		this.codAeropuertoIATA = codAeropuertoIATA;
		this.codAeropuertoICAO = codAeropuertoICAO;
		this.nombreAeropuerto = nombreAeropuerto;
		this.ciudad = ciudad;
	}

	public String getCodAeropuertoIATA() {
		return codAeropuertoIATA;
	}

	public void setCodAeropuertoIATA(String codAeropuertoIATA) {
		this.codAeropuertoIATA = codAeropuertoIATA;
	}

	public String getCodAeropuertoICAO() {
		return codAeropuertoICAO;
	}

	public void setCodAeropuertoICAO(String codAeropuertoICAO) {
		this.codAeropuertoICAO = codAeropuertoICAO;
	}

	public String getNombreAeropuerto() {
		return nombreAeropuerto;
	}

	public void setNombreAeropuerto(String nombreAeropuerto) {
		this.nombreAeropuerto = nombreAeropuerto;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Aeropuerto [codAeropuertoIATA=" + codAeropuertoIATA + ", codAeropuertoICAO=" + codAeropuertoICAO
				+ ", nombreAeropuerto=" + nombreAeropuerto + ", ciudad=" + ciudad + "]";
	}

	@Override
	public int compareTo(Aeropuerto dos) {
		return this.getNombreAeropuerto().compareTo(dos.getNombreAeropuerto());
		
	}
	
}

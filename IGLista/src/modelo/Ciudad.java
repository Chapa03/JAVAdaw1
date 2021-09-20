package modelo;

public class Ciudad {
	private String nombreCiudad;
	private String privincia;
	
	public Ciudad(String nombreCiudad, String privincia) {
		super();
		this.nombreCiudad = nombreCiudad;
		this.privincia = privincia;
	}
	
	public String getNombreCiudad() {
		return nombreCiudad;
	}
	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
	public String getPrivincia() {
		return privincia;
	}
	public void setPrivincia(String privincia) {
		this.privincia = privincia;
	}

	@Override
	public String toString() {
		return "Ciudad [nombreCiudad=" + nombreCiudad + ", privincia=" + privincia + "]";
	}
	
}

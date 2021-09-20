package modelo.clases;

public class Estacion {
	private int codEstacion;
	private String nombreEstacion;
	private double longitud;
	private double latitud;
	private int poblacion;
	
	public Estacion(int codEstacion, String nombreEstacion, double longitud, double latitud, int poblacion) {
		this.codEstacion = codEstacion;
		this.nombreEstacion = nombreEstacion;
		this.longitud = longitud;
		this.latitud = latitud;
		this.poblacion = poblacion;
	}

	public int getCodEstacion() {
		return codEstacion;
	}

	public void setCodEstacion(int codEstacion) {
		this.codEstacion = codEstacion;
	}

	public String getNombreEstacion() {
		return nombreEstacion;
	}

	public void setNombreEstacion(String nombreEstacion) {
		this.nombreEstacion = nombreEstacion;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	@Override
	public String toString() {
		return "Estacion [codEstacion=" + codEstacion + ", nombreEstacion=" + nombreEstacion + ", longitud=" + longitud
				+ ", latitud=" + latitud + ", poblacion=" + poblacion + "]";
	}
	
}

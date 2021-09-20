package modelo;

public class Ciudad implements Comparable<Ciudad>{
	private int codCiudad;
	private String nombreCiudad;
	private String pais;
	
	public Ciudad(int codCiudad, String nombreCiudad, String pais) {
		super();
		this.codCiudad = codCiudad;
		this.nombreCiudad = nombreCiudad;
		this.pais = pais;
	}

	public int getCodCiudad() {
		return codCiudad;
	}

	public void setCodCiudad(int codCiudad) {
		this.codCiudad = codCiudad;
	}

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Ciudad [codCiudad=" + codCiudad + ", nombreCiudad=" + nombreCiudad + ", pais=" + pais + "]";
	}

	@Override
	public int compareTo(Ciudad o) {
		return this.getNombreCiudad().compareTo(o.getNombreCiudad());
	}
	
}

package Iteradores;

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

//	Si en el Comparable le aniadimos el tipo de objeto que va a importar, no hace falta hacer
//	el downcasting que hay en la linea comentada 63
//	y el objeto pasado al metodo compare to sería del tipo especificado
//	@Override
//	public int compareTo(Object o) {
//		return this.getNombreCiudad().compareTo(((Ciudad)o).getNombreCiudad());
//	}


	@Override
	public int compareTo(Ciudad o) {
		return this.getNombreCiudad().compareTo(o.getNombreCiudad());
	}
	
}

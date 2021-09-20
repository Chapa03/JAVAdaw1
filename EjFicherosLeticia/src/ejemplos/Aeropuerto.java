package ejemplos;

public class Aeropuerto implements Comparable<Aeropuerto>{
	private String codAeropuertoIANA;
	private String codAeropuertoICAO;
	private String nombre;
	private String pais;
	
	
	public Aeropuerto(String codAeropuertoIATA, String codAeropuertoICAO, String nombre, String pais) {
		super();
		this.codAeropuertoIANA = codAeropuertoIATA;
		this.codAeropuertoICAO = codAeropuertoICAO;
		this.nombre = nombre;
		this.pais = pais;
	}
	public String getCodAeropuertoIATA() {
		return codAeropuertoIANA;
	}
	public void setCodAeropuertoIATA(String codAeropuertoIATA) {
		this.codAeropuertoIANA = codAeropuertoIATA;
	}
	public String getCodAeropuertoICAO() {
		return codAeropuertoICAO;
	}
	public void setCodAeropuertoICAO(String codAeropuertoICAO) {
		this.codAeropuertoICAO = codAeropuertoICAO;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return pais;
	}
	public void setCiudad(String ciudad) {
		this.pais = ciudad;
	}
	@Override
	public String toString() {
		return "Aeropuerto [codAeropuertoIATA=" + codAeropuertoIANA + ", codAeropuertoICAO=" + codAeropuertoICAO
				+ ", nombre=" + nombre + ", ciudad=" + pais + "]";
	}
	@Override
	public int compareTo(Aeropuerto dos) {
		/*
		 * Aeropuerto uno=this; int ret=0; if
		 * (uno.getNombre().charAt(0)<dos.getNombre().charAt(0)) { ret=-1; } else if
		 * (uno.getNombre().charAt(0)>dos.getNombre().charAt(0)) { ret=1; } //return
		 * ret;
		 */		
		return this.getNombre().compareTo(dos.getNombre());
	}
	
	
}

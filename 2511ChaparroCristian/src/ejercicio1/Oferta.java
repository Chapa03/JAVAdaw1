package ejercicio1;

public class Oferta {
	private String puesto;
	private String fecha;
	private String empresa;
	private int numCandidatos;
	
	public Oferta() {
		
	}
	
	public Oferta(String puesto, String fecha, String empresa, int numCandidatos) {
		this.puesto = puesto;
		this.fecha = fecha;
		this.empresa = empresa;
		this.numCandidatos = numCandidatos;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getNumCandidatos() {
		return numCandidatos;
	}

	public void setNumCandidatos(int numCandidatos) {
		this.numCandidatos = numCandidatos;
	}
	
	public void incrementarNumCandidatos(int i) {
		this.numCandidatos += i;
	}
	
	public void activarOferta(String fecha) {
		this.fecha = fecha;
	}
	
	public boolean estaActiva() {
		boolean ofertaActiva = false;
		if (this.fecha.equals("00/00/0000")) {
			ofertaActiva = false;
		} else {
			ofertaActiva = true;
		}
		return ofertaActiva;
	}

	@Override
	public String toString() {
		return "Oferta [puesto=" + puesto + ", fecha=" + fecha + ", empresa=" + empresa + ", numCandidatos="
				+ numCandidatos + "]";
	}
	
	
}

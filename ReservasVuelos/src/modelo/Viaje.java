package modelo;

public class Viaje {
	private Aeropuerto aeropuertoOrigen;
	private Aeropuerto aeropuertoDestino;
	
	public Viaje(Aeropuerto aeropuertoOrigen, Aeropuerto aeropuertoDestino) {
		super();
		this.aeropuertoOrigen = aeropuertoOrigen;
		this.aeropuertoDestino = aeropuertoDestino;
	}

	public Aeropuerto getAeropuertoOrigen() {
		return aeropuertoOrigen;
	}

	public void setAeropuertoOrigen(Aeropuerto aeropuertoOrigen) {
		this.aeropuertoOrigen = aeropuertoOrigen;
	}

	public Aeropuerto getAeropuertoDestino() {
		return aeropuertoDestino;
	}

	public void setAeropuertoDestino(Aeropuerto aeropuertoDestino) {
		this.aeropuertoDestino = aeropuertoDestino;
	}

	@Override
	public String toString() {
		return "Viaje [aeropuertoOrigen=" + aeropuertoOrigen + ", aeropuertoDestino=" + aeropuertoDestino + "]";
	}
	
}

package modelo;

import java.util.Arrays;

public class Terminal {
	private int nTerminal;
	private String[] servicios;
	private Aeropuerto aeropuerto;
	
	public Terminal(int nTerminal, String[] servicios, Aeropuerto ap) {
		super();
		this.nTerminal = nTerminal;
		this.servicios = servicios;
		this.aeropuerto = ap;
	}

	public int getnTerminal() {
		return nTerminal;
	}

	public void setnTerminal(int nTerminal) {
		this.nTerminal = nTerminal;
	}

	public String[] getServicios() {
		return servicios;
	}

	public void setServicios(String[] servicios) {
		this.servicios = servicios;
	}

	public Aeropuerto getAp() {
		return aeropuerto;
	}

	public void setAp(Aeropuerto ap) {
		this.aeropuerto = ap;
	}

	@Override
	public String toString() {
		return "Terminal [nTerminal=" + nTerminal + ", servicios=" + Arrays.toString(servicios) + ", ap=" + aeropuerto + "]";
	}

}

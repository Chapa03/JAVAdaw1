package modelo;

import java.util.Calendar;

public class Vuelo {
	private Calendar diaVuelo;
	private Calendar horaSalida;
	private Nave nave;
	private Terminal terminalLlegada;
	
	public Vuelo(Calendar diaVuelo, Calendar horaSalida, Nave nave, Terminal terminalLlegada) {
		super();
		this.diaVuelo = diaVuelo;
		this.horaSalida = horaSalida;
		this.nave = nave;
		this.terminalLlegada = terminalLlegada;
	}

	public Calendar getDiaVuelo() {
		return diaVuelo;
	}

	public void setDiaVuelo(Calendar diaVuelo) {
		this.diaVuelo = diaVuelo;
	}

	public Calendar getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Calendar horaSalida) {
		this.horaSalida = horaSalida;
	}

	public Nave getNave() {
		return nave;
	}

	public void setNave(Nave nave) {
		this.nave = nave;
	}

	public Terminal getTerminalLlegada() {
		return terminalLlegada;
	}

	public void setTerminalLlegada(Terminal terminalLlegada) {
		this.terminalLlegada = terminalLlegada;
	}

	@Override
	public String toString() {
		return "Vuelo [diaVuelo=" + diaVuelo + ", horaSalida=" + horaSalida + ", nave=" + nave + ", terminalLlegada="
				+ terminalLlegada + "]";
	}

}

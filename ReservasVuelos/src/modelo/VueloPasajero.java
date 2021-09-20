package modelo;

import java.util.Calendar;

public class VueloPasajero extends Vuelo{
	private int asientosVendidos;

	public VueloPasajero(Calendar diaVuelo, Calendar horaSalida, Nave nave, Terminal terminalLlegada,
			int asientosVendidos) {
		super(diaVuelo, horaSalida, nave, terminalLlegada);
		this.asientosVendidos = asientosVendidos;
	}

	public int getAsientosVendidos() {
		return asientosVendidos;
	}

	public void setAsientosVendidos(int asientosVendidos) {
		this.asientosVendidos = asientosVendidos;
	}

	@Override
	public String toString() {
		return "VueloPasajero [asientosVendidos=" + asientosVendidos + "]";
	}

}

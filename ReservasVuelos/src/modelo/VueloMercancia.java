package modelo;

import java.util.Calendar;

public class VueloMercancia extends Vuelo{
	private double pesoCarga;

	public VueloMercancia(Calendar diaVuelo, Calendar horaSalida, Nave nave, Terminal terminalLlegada,
			double pesoCarga) {
		super(diaVuelo, horaSalida, nave, terminalLlegada);
		this.pesoCarga = pesoCarga;
	}

	public double getPesoCarga() {
		return pesoCarga;
	}

	public void setPesoCarga(double pesoCarga) {
		this.pesoCarga = pesoCarga;
	}

	@Override
	public String toString() {
		return "VueloMercancia [pesoCarga=" + pesoCarga + "]";
	}

}

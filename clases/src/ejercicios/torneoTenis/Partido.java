package ejercicios.torneoTenis;

import java.util.Calendar;

public class Partido {
	Jugador judador1;
	Jugador jugador2;
	Pista pistaPartido;
	Calendar momentoPartido;
	
	public Partido(Jugador judador1, Jugador jugador2, Pista pistaPartido, Calendar momentoPartido) {
		this.judador1 = judador1;
		this.jugador2 = jugador2;
		this.pistaPartido = pistaPartido;
		this.momentoPartido = momentoPartido;
	}

	public Jugador getJudador1() {
		return judador1;
	}

	public void setJudador1(Jugador judador1) {
		this.judador1 = judador1;
	}

	public Jugador getJugador2() {
		return jugador2;
	}

	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}

	public Pista getPistaPartido() {
		return pistaPartido;
	}

	public void setPistaPartido(Pista pistaPartido) {
		this.pistaPartido = pistaPartido;
	}

	public Calendar getMomentoPartido() {
		return momentoPartido;
	}

	public void setMomentoPartido(Calendar momentoPartido) {
		this.momentoPartido = momentoPartido;
	}

	@Override
	public String toString() {
		return "* " + judador1 + " contra " + jugador2 + " *"
				+ "\nPista: " + pistaPartido 
				+ "\nFecha de partido: " + momentoPartido;
	}
}

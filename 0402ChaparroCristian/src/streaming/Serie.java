package streaming;

import java.util.Calendar;

public class Serie extends Emisiones{
	private int numeroTemporadas;
	private int totalCapitulos;
	
	public Serie(int codEmision, String titulo, Calendar fechaInclusion, int numeroTemporadas, int totalCapitulos) {
		super(codEmision, titulo, fechaInclusion);
		this.numeroTemporadas = numeroTemporadas;
		this.totalCapitulos = totalCapitulos;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public int getTotalCapitulos() {
		return totalCapitulos;
	}

	public void setTotalCapitulos(int totalCapitulos) {
		this.totalCapitulos = totalCapitulos;
	}

	@Override
	public String toString() {
		return "Serie [numeroTemporadas=" + numeroTemporadas + ", totalCapitulos=" + totalCapitulos + "]";
	}
}

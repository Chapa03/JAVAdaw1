package ejercicio.vehiculos;

public class Autobus extends Vehiculo{
	private int numeroPlazas;

	public Autobus() {
		
	}

	public Autobus(int numeroPlazas) {
		super();
		this.numeroPlazas = numeroPlazas;
	}

	public Autobus(String matricula, String modelo, int potenciaCV, int numeroPlazas) {
		super(matricula, modelo, potenciaCV);
		this.numeroPlazas = numeroPlazas;
	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}

	@Override
	public String toString() {
		return " Autobus [numeroPlazas=" + numeroPlazas + "] " + super.toString();
	}
	
	
	
}

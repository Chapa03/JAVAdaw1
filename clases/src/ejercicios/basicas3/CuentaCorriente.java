package ejercicios.basicas3;

public class CuentaCorriente {
	private String numCuenta;
	private String iban;
	private float saldo;
	private float tipoInteres;
	
	public CuentaCorriente() {
	}
	
	public CuentaCorriente(String numCuenta, String iban, float saldo, float ripoInteres) {
		this.numCuenta = numCuenta;
		this.iban = iban;
		this.saldo = saldo;
		this.tipoInteres = ripoInteres;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(float ripoInteres) {
		this.tipoInteres = ripoInteres;
	}
	
	public void ingreso(float f) {
		this.saldo += f;
	}
	
	public void gasto(float f) {
		this.saldo += f;
	}

	@Override
	public String toString() {
		return "Cuenta Corriente [Num Cuenta: " + numCuenta + ", IBAN: " + iban + ", Saldo: " + saldo + ", Tipo Interes: "
				+ tipoInteres + "]";
	}
	
	
	
}

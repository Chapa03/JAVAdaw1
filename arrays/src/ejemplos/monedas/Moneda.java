package ejemplos.monedas;

public class Moneda {
	private int valor;
	private String tipo;
	
	public Moneda() {
		
	}
	
	public Moneda(int valor, String tipo) {
		this.valor = valor;
		this.tipo = tipo;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Moneda [valor=" + valor + ", cantidad=" + tipo + "]";
	}
	
	
}

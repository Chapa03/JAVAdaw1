package ejercicios.basicas2;

public class Articulo {
	String descripcion;
	int cantidad;
	int stockMinimo;
	
	public Articulo() {
		
	}
	
	public Articulo(String descripcion, int cantidad, int stockMinimo) {
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.stockMinimo = stockMinimo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getStockMinimo() {
		return stockMinimo;
	}
	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}
	
	public void nuevosArticulos(int cantidad) {
		this.cantidad += cantidad;
	}
	
	public boolean bajoStock() {
		return this.cantidad < this.stockMinimo;
	}
	
	public int compraMinima() {
		if (this.bajoStock()) {
			return this.stockMinimo - this.cantidad + (this.stockMinimo * 25 / 100);
		} else if (this.cantidad < this.stockMinimo + (this.stockMinimo * 25 / 100)) {
			return (this.stockMinimo + (this.stockMinimo * 25 / 100)) - this.cantidad;
		} else {
			return 0;
		}
	}
	
	public int sobreStock() {
		return this.cantidad - this.stockMinimo;
	}
	
	@Override
	public String toString() {
		return "\tArticulo [Descripcion: " + descripcion + ", Cantidad: " + cantidad + ", Stock Minimo: " + stockMinimo + "]\n";
	}
}

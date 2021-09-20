package ejercicio.pasteleria;

public class ProductoExterno extends Producto{
	private int tiempoServicio;
	
	public ProductoExterno() {
		
	}

	public ProductoExterno(int idProducto, String nombreProducto, TipoProducto tipoProducto, float precioVenta,
			float precioCoste, int tiempoServicio) {
		super(idProducto, nombreProducto, tipoProducto, precioVenta, precioCoste);
		this.tiempoServicio = tiempoServicio;

	}

	public int getTiempoServicio() {
		return tiempoServicio;
	}

	public void setTiempoServicio(int tiempoServicio) {
		this.tiempoServicio = tiempoServicio;
	}

	@Override
	public String toString() {
		return "ProductoExterno [tiempoServicio=" + tiempoServicio + "] " + super.toString();
	}
	
	
}

package ejercicio.pasteleria;

public class ProductoPropio extends Producto{
	private int tiempoPreparacion;
	private int tiempoCaducidad;
	private int duracion;
	
	public ProductoPropio() {
		
	}
	
	public ProductoPropio(int idProducto, String nombreProducto, TipoProducto tipoProducto, float precioVenta,
			float precioCoste, int tiempoPreparacion, int tiempoCaducidad, int duracion) {
		super(idProducto, nombreProducto, tipoProducto, precioVenta,precioCoste);
		this.tiempoPreparacion = tiempoPreparacion;
		this.tiempoCaducidad = tiempoCaducidad;
		this.duracion = duracion;
	}

	public int getTiempoPreparacion() {
		return tiempoPreparacion;
	}

	public void setTiempoPreparacion(int tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}

	public int getTiempoCaducidad() {
		return tiempoCaducidad;
	}

	public void setTiempoCaducidad(int tiempoCaducidad) {
		this.tiempoCaducidad = tiempoCaducidad;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "ProductoPropio [tiempoPreparacion=" + tiempoPreparacion + ", tiempoCaducidad=" + tiempoCaducidad + "]";
	}
	
}

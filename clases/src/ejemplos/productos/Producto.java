package ejemplos.productos;

public class Producto {
	private String nombre;
	private String tipoProducto;
	private float precio;
	
	public Producto() {
		
	}
	
	public Producto(String nombre, String tipoProducto, float precio) {
//		con this, estamos indicando que hacemos referencia al atributo de la clase
		this.nombre = nombre;
		this.tipoProducto = tipoProducto;
		this.precio = precio;
	}
	
//	cambio de atributos de la clase: por convenio, el nombre sera set+Nombre de atributo
	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	
	public void setTipoProducto(String nuevoProducto) {
		this.tipoProducto = nuevoProducto;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getTipoProducto() {
		return this.tipoProducto;
	}
	
	public float getPrecio() {
		return this.precio;
	}

//	podemos generar el metodo toString, que se encarga de recoger todos los datos de los atributos
//	de un objeto de la clase y los reune en un string que podemos almacenar o guardar por pantalla
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", tipoProducto=" + tipoProducto + ", precio=" + precio + "]";
	}
	
}

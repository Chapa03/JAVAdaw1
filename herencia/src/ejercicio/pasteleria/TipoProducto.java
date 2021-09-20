package ejercicio.pasteleria;

public class TipoProducto {
	private String nombreTipoProducto;

	public TipoProducto() {
		
	}

	public TipoProducto(String nombreTipoProducto) {
		this.nombreTipoProducto = nombreTipoProducto;
	}

	public String getNombreTipoProducto() {
		return nombreTipoProducto;
	}

	public void setNombreTipoProducto(String nombreTipoProducto) {
		this.nombreTipoProducto = nombreTipoProducto;
	}

	@Override
	public String toString() {
		return "TipoProducto [nombreTipoProducto=" + nombreTipoProducto + "]";
	}
	
}

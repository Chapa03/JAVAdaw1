package modelo.clases;

public class Producto {
 private int idProducto;
 private String nombreProducto;
 
public Producto() {
	super();
}

public Producto(int idProducto, String nombreProducto) {
	super();
	this.idProducto = idProducto;
	this.nombreProducto = nombreProducto;
}

public int getIdProducto() {
	return idProducto;
}

public void setIdProducto(int idProducto) {
	this.idProducto = idProducto;
}

public String getNombreProducto() {
	return nombreProducto;
}

public void setNombreProducto(String nombreProducto) {
	this.nombreProducto = nombreProducto;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Producto [idProducto=");
	builder.append(idProducto);
	builder.append(", nombreProducto=");
	builder.append(nombreProducto);
	builder.append("]");
	return builder.toString();
}

 
 
}

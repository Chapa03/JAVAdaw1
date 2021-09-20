package modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.clases.Producto;

public class ProductosDAO {
public static void insertarProducto(Producto p) {
	try {
		EnlaceJDBC enlace=new EnlaceJDBC();
		if (enlace.insertar("Insert into productos values("+ p.getIdProducto()+",'"+p.getNombreProducto()+"')")) {
			System.out.println("El elemento "+ p.getNombreProducto()+ " se ha insertado correctamente");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

	public static void insertarProductoAI(Producto p) {
		try {
			EnlaceJDBC enlace = new EnlaceJDBC();
			if (enlace.insertar("Insert into productos(nombre) values('" + p.getNombreProducto() + "')")) {
				System.out.println("El elemento " + p.getNombreProducto() + " se ha insertado correctamente");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static List<Producto> seleccionarProductos() {
		List<Producto> listaProductos = new ArrayList<Producto>();
		ResultSet res = null;
		try {
			EnlaceJDBC enlace = new EnlaceJDBC();
			res = enlace.seleccionRegistros("select id_producto, nombre from productos");
			while (res.next()) {
				listaProductos.add(new Producto(res.getInt("id_producto"), res.getString(2)));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaProductos;
	}

}

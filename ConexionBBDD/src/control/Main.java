package control;

import java.util.ArrayList;
import java.util.List;

import modelo.clases.Producto;
import modelo.clases.Producto;
import modelo.dao.ProductosDAO;
import modelo.dao.ProductosDAOps;
import vista.Lectura;

public class Main {
	

	public static void main(String[] args) {
		Producto p1=new Producto(3, "Carne");
		Producto p2=new Producto(4, "Pescado");
		List<Producto> listaProductos=new ArrayList<Producto>();
	//	listarProductos();
		int cont=0;
//		while (cont<3) {
//			Producto p3=Lectura.leerProducto();
//			listaProductos.add(p3);
//		}
		
		ProductosDAO.insertarProducto(new Producto(0, "Mango mangao"));
		ProductosDAO.insertarProductoAI(new Producto (0, "Corito sano"));
		List<Producto> listaP= ProductosDAO.seleccionarProductos();
		for (Producto p: listaP) {
			System.out.println("- "+ p.getNombreProducto());
		}

//		Gestion de la base de datos desde ProductosDAOps con los 
		if (ProductosDAOps.listaProductosConPS(new Producto(0, "Carne"))) {
			System.out.println("Se ha insertado correctamente");
		}
			
	}

}

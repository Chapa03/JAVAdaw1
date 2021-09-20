package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.clases.Producto;

/*
 * El preparedStatement funciona directamente con la Conexion, sin 
 * tener que utilizar el enlace JDBC
 */
public class ProductosDAOps {

	private static Connection connection;
	public static boolean listaProductosConPS (Producto p){
		boolean rowInserted = false;
		PreparedStatement pStatement = null;
		try {
			connection = Conexion.conectar();
			
			String sql = "INSERT INTO productos  VALUES (0, ?)";
			pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, p.getNombreProducto());
			// -----------------ejecutamos
			rowInserted = pStatement.executeUpdate() > 0;
	
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			// -------------cerramos y desconectamos
			try {
				pStatement.close();
				Conexion.desconectar();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return rowInserted;
	}
	
	
	
	public static List<Producto> obtenerPorIdP(int id) throws SQLException {
		List<Producto> listaProductos= new ArrayList<Producto>();
		ResultSet res=null;
		PreparedStatement pStatement = null;
		try {
			connection = Conexion.conectar();
			
			String sql = "SELECT * FROM productos WHERE id_producto=?";
			pStatement = connection.prepareStatement(sql);
			pStatement.setInt(1, id);
			
			// -----------------ejecutamos
			ResultSet rs = pStatement.executeQuery();
			while (res.next()) {
				listaProductos.add(new Producto(res.getInt(1), res.getString(2)));
			}
			
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			// -------------cerramos y desconectamos
			try {
				pStatement.close();
				Conexion.desconectar();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

		return listaProductos;
	}

	//********************************************************ACTUALIZACIÓN********************************************
	public boolean actualizar(Producto p) throws SQLException {
		boolean rowActualizar = false;
		PreparedStatement pStatement = null;
		try {
			connection = Conexion.conectar();
			
			String sql = "UPDATE productos SET nombre=? WHERE id_producto=?";
			pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, p.getNombreProducto());
			pStatement.setInt(2, p.getIdProducto());

			rowActualizar = pStatement.executeUpdate() > 0;

		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {			
			try {
				pStatement.close();
				Conexion.desconectar();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}

		}
		return rowActualizar;
	}

	// eliminar
	public boolean eliminar(int  id) throws SQLException {
		boolean rowEliminar = false;
		PreparedStatement pStatement =null;
		
		try {
			connection = Conexion.conectar();
			
			//-------generamos la sentencia
			String sql = "DELETE FROM productos WHERE id_producto=?";
			pStatement = connection.prepareStatement(sql);
			pStatement.setInt(1, id);

			rowEliminar = pStatement.executeUpdate() > 0;
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {			
			try {
				pStatement.close();
				Conexion.desconectar();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}

		}

		return rowEliminar;
	}

	

}
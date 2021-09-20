package modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.clases.Poblacion;

public class PoblacionDAO {
public static void insertarPoblacion(Poblacion p) {
	try {
		EnlaceJDBC enlace=new EnlaceJDBC();
		if (enlace.insertar("Insert into poblacion values(0,"+ p.getIdPoblacion() +",'"+p.getNombrePoblacion()+"')")) {
			System.out.println(p.getNombrePoblacion()+ " se ha insertado correctamente en la base de datos");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

	public static void insertarPoblacionAI(Poblacion p) {
		try {
			EnlaceJDBC enlace = new EnlaceJDBC();
			if (enlace.insertar("Insert into poblacion values(0, '" + p.getNombrePoblacion() + "','" + p.getProvincia() + "')")) {
				System.out.println(p.getNombrePoblacion()+ " se ha insertado correctamente en la base de datos");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static List<Poblacion> seleccionarPoblacion() {
		List<Poblacion> listaPoblaciones = new ArrayList<Poblacion>();
		ResultSet res = null;
		try {
			EnlaceJDBC enlace = new EnlaceJDBC();
			res = enlace.seleccionRegistros("select idPoblacion, nombrePoblacion, provincia from poblacion");
			while (res.next()) {
				listaPoblaciones.add(new Poblacion(res.getInt("idPoblacion"), res.getString(2), res.getString(3)));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listaPoblaciones;
	}

}
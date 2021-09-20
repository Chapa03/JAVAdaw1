package control;
import java.util.ArrayList;
import java.util.List;

import modelo.clases.Poblacion;

public class Conversiones {
	
	public static List<Poblacion> convertirTexto(List<String> textoLista){
		List<Poblacion> listaPoblaciones = new ArrayList<Poblacion>();
		String[] temporalLinea;
		int idPoblacion = 0;
		int poblacionesRepetidas = 0;
		
//		recorremos la lista obtenida por parametro
		for (String s: textoLista) {
			temporalLinea = s.split(";");
			if (listaPoblaciones.contains(temporalLinea[6])) {
				poblacionesRepetidas++;
			} else {
				listaPoblaciones.add(new Poblacion(idPoblacion, temporalLinea[6], temporalLinea[7]));
			}
			
		}
		System.out.println("Poblaciones repetidas: " + poblacionesRepetidas);
		return listaPoblaciones;
	}
	
//	Con este metodo obtenemos una lista de strings con los campos
//	que necesitemos extraidos de la lista de objetos anteriormente creada
	public static List<String> obtenerListaStrings(List<Poblacion> listaPoblaciones){
		List<String> temp = new ArrayList<String>();
		temp.add("POBLACIONES DE MADRID:");
		temp.add("");
		temp.add("ID:\tPROVINCIA:\tNOMBRE POBLACION:");
		
		listaPoblaciones.remove(0);
		for (Poblacion p : listaPoblaciones) {
			temp.add(p.getIdPoblacion() + "\t" + p.getProvincia() + "\t\t" + p.getNombrePoblacion());
		}
		return temp;
	}
}

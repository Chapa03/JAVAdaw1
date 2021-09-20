import java.util.ArrayList;
import java.util.List;

public class Conversiones {
	
//	Con este metodo instanciamos nuevos objetos de la clase elegida
//	directamente desde el fichero leido (csv) y los almacenamos
//	en una lista de dicha clase
	public static List<ApoyoAeropuerto> convertirTexto(List<String> textoLista){
//		Lista en la que vamos a almacenar los Strings que obtenemos del
//		texto leido y que utilizaremos para formatear o convertir
		List<ApoyoAeropuerto> listaAeropuertos = new ArrayList<ApoyoAeropuerto>();
//		array de String que utilizamos para ir almacenando cada una de las lineas que leemos
//		de la lista obtenida por parametro y darle el formato que necesitemos
		String[] temporalLinea;
//		recorremos la lista obtenida por parametro
		for (String s: textoLista) {
//			por cada elemento o linea que recorremos, almacenamos cada uno
//			de los valores en el array por separado, utilizando los ; como delimitador
			temporalLinea = s.split(";");
//			Instanciamos un nuevo objeto con cada uno de los elementos que hemos almacenado
//			en el array de string en esta linea en el orden que nos interese
			listaAeropuertos.add(new ApoyoAeropuerto(temporalLinea[3], temporalLinea[4], temporalLinea[1], temporalLinea[2]));
		}
		return listaAeropuertos;
	}
	
//	Con este metodo obtenemos una lista de strings con los campos
//	que necesitemos extraidos de la lista de objetos anteriormente creada
	public static List<String> obtenerListaStrings(List<ApoyoAeropuerto> listaAeropuertos){
		List<String> temp = new ArrayList<String>();
		temp.add("LISTADO DE AEROPUERTOS CON CODIGO IANA:");
		temp.add("");
		temp.add("CODIGO:\t\tCIUDAD:\t\t\tNOMBRE:");
		
		listaAeropuertos.remove(0);
		for (ApoyoAeropuerto a : listaAeropuertos) {
			temp.add(a.getCodAeropuertoIATA() + "\t\t" + a.getCiudad() + "\t\t\t" + a.getNombre());
		}
		return temp;
	}
}

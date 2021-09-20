package ejemplos;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Conversiones {
	
	
	public static List<Aeropuerto> convertirTexto(List<String> textoLista) {
		List<Aeropuerto> listaAeropuertos=new ArrayList<Aeropuerto>();
		String [] tempLinea;
		for (String s: textoLista) {
			tempLinea=s.split(";");
			//System.out.println(Arrays.toString(tempLinea ));
			listaAeropuertos.add(new Aeropuerto(tempLinea[3],tempLinea[4],tempLinea[1], tempLinea[2]));
		}
		for (Aeropuerto a: listaAeropuertos) {
			System.out.println(a.getCiudad()+ "\t"+ a.getNombre());
		}
		return listaAeropuertos;
	}
	
	public static List<String> obtListaStrings(List<Aeropuerto> lisAero){
		List<String> temp=new ArrayList<String>();
		temp.add("\t\tLISTADO DE AEROPUERTOS CON CÓDIGO IANA");
		//temp.add("\n");
		temp.add("");
		temp.add("CÓDIGO:\t\tNOMBRE:\tCIUDAD:");
		lisAero.remove(0);
		for (Aeropuerto a:lisAero ) {
			temp.add(a.getCodAeropuertoIATA()+"\t\t\t"+a.getNombre() + "\t" + a.getCiudad());
		}
		
		return temp;
	}	

}

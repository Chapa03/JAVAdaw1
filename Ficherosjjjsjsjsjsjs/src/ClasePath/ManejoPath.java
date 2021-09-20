package ClasePath;

import java.nio.file.*;
import java.util.Iterator;



public class ManejoPath {
	public static void main(String[] args) {
	try{	

	//Un path es cualquiera de los elementos: dir, archivo, o link
	Path nombreFichero=Paths.get("Ficheros/hola.txt");
	System.out.println("1-"+nombreFichero.getFileName());
	System.out.println("2-"+nombreFichero.getParent().getFileName());
	
	//Recogemos una ruta de directorio
	Path rutaDirectorio=Paths.get("C:/Users/letic/OneDrive/Documentos/aeropuertos.csv");
	System.out.format("toString: %s%n", rutaDirectorio.toString());
	System.out.format("getFileName: %s%n", rutaDirectorio.getFileName());
	System.out.format("getName(0): %s%n", rutaDirectorio.getName(2));
	System.out.format("getNameCount: %d%n", rutaDirectorio.getNameCount());
	System.out.format("subpath(0,2): %s%n", rutaDirectorio.subpath(0,2));
	System.out.format("getParent: %s%n", rutaDirectorio.getParent());
	System.out.format("getRoot: %s%n", rutaDirectorio.getRoot());
	
	//Realizamos un recorrido con iterador por todas las carpetas de la ruta de rutaDirectorio
	Iterator<Path> it=rutaDirectorio.iterator();
	
	while(it.hasNext()) {
	 
	System.out.println("3-"+it.next().getFileName());
	}
	}
	catch (Exception e){
		System.out.println("0-"+"error en la ejecuci�n: "+ e.getMessage());
	}
	
}
}
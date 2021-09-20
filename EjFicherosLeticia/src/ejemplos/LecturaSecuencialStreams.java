package ejemplos;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LecturaSecuencialStreams {
	
	public static void LecturaPorCaracteresStream(String file) {
		Path fichero= Paths.get(file);
		InputStream iStream= null;
		int caracter;
		String s="";
		List<String> palabras=new ArrayList<String>();
		try {
			iStream = Files.newInputStream(fichero);
			while ((caracter=iStream.read())!=-1) {
				if (((char)caracter==' ')||((char)caracter=='\n')) {
					palabras.add(s);
					s="";
				}
				s+=(char)caracter;
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s);
		for (String p: palabras) {
			System.out.print(" - " + p);
		}
		palabras.forEach(p->System.out.print(" : "+ p));
		
		
	}

}

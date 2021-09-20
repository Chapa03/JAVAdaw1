package listeventos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class MainEventos {
	/*
	 * Número de asistentes
	 *  b. Recaudación total 
	 *  c. Listado de eventos (ordenado por
	 * fechas de realización: hacerlo cuando veamos el compareTo) 
	 * d. Listado de
	 * películas que se ofrecen 
	 * e. Listado de grupos de los conciertos con sus
	 * fechas 
	 * f. Realizar un menú para gestionarlo
	 */
	private static Scanner scan=new Scanner(System.in);
	private static List<Evento> listaEventos=new ArrayList<Evento>();
	
	
	private static int leerOpcion() {
		System.out.println("Elige la opción deseada:");
		return scan.nextInt();
	}
	public static String verMenu() {
		StringBuilder builder = new StringBuilder();
		builder.append("-------------MENÚ DE EVENTOS --------------------");
		builder.append("\n1. Número de asistentes");
		builder.append("\n2. Recaudación total");
		builder.append("\n3. Listado de eventos");
		builder.append("\n4. Listado de películas");
		builder.append("\n5. Listado de grupos con fechas");
	    builder.append("\n6. Salir");	    
		return builder.toString();
	}
	
	private static void inicializarEventos() {
		Calendar fecha=new GregorianCalendar(2021,10,21);
		
		Grupo[]  grupos= {new Grupo("Metalica"), new Grupo("grupo")};
		Evento e1=new Teatro("Madrid",345,12000,fecha, "La joven");
		Evento e2=new Cine("Plenilunio", 20, 180, new GregorianCalendar(2021,10,21), "Los Vengadores");
		Evento e3=new Actividad();
		Evento e4=new Concierto("Wizink", 2000, 18000, new GregorianCalendar(2021,10,2), new ArrayList<Grupo>(Arrays.asList(grupos)));
		listaEventos.add(e1);
		listaEventos.add(e2);
		listaEventos.add(e3);
		listaEventos.add(e4);
		
	}
	private static int asistentes() {
		int numAsistentes=0;
		for (Evento e: listaEventos) {
			numAsistentes+= e.getAsistentes();
		}
		return numAsistentes;
	}
	private static int recaudacionTotal() {
		int recaudacion=0;
		for (Evento e: listaEventos) {
			recaudacion+= e.getRecaudacion();
		}
		return recaudacion;
	}
	private static void listadoEventos() {
		for (Evento e: listaEventos) {
		System.out.println("Tipo:"+ e.getClass().toString().substring(e.getClass().toString().lastIndexOf('.')+1)+ "\tLugar:"+ e.getLugar()+ "\tAsistentes:"+ e.getAsistentes());
		
		}
		
	}
	
	private static void listadoPeliculas() {
		for (Evento e: listaEventos) {
			if (e instanceof Cine)
			{
				System.out.println(((Cine) ( e)).getPelicula());
			}
		}
	}
	
	private static void acciones(int opcion) {
		switch (opcion) {
		case 1: System.out.println(asistentes());break;
		case 2: System.out.println(recaudacionTotal());break;
		case 3: listadoEventos();break;
		case 4: listadoPeliculas();break;
		case 5:break;
		
			
		}
	}
	
	public static void main(String[] args) {
	
		int opcion=0;
		inicializarEventos();
		System.out.println(listaEventos);
		while (opcion!=6) {			
			System.out.println(verMenu());
			opcion=leerOpcion();
			acciones(opcion);
			}

}
}

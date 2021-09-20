package streaming;
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static String menu() {
		String menu = "";
		String opcion = "";
		while(!opcion.equals("d")) {
			System.out.print("Menu:"
					+ "\nA: Buscar"
					+ "\nB: Dar de alta"
					+ "\nC: Dar de baja"
					+ "\nD: Salir"
					+ "\nElige una opcion del menu: ");
			opcion = sc.next().toLowerCase();
		}
		return menu;
	}

	public static void main(String[] args) {
		List<Emisiones> listaEmisiones = new ArrayList<Emisiones>();
		Calendar fechaInclusion = new GregorianCalendar(2021, 02, 20);
		listaEmisiones.add(new Pelicula(01, "Star Wars", fechaInclusion, 125));
		listaEmisiones.add(new Pelicula(02, "Narnia", fechaInclusion, 125));
		listaEmisiones.add(new Serie(20, "Lost", fechaInclusion, 12, 120));
		listaEmisiones.add(new Serie(21, "Friends", fechaInclusion, 10, 13));
		
		for (Emisiones e: listaEmisiones) {
			System.out.println(e.getTitulo() + ":");
			if (e instanceof Pelicula) {
				System.out.println("(elicula)");
				System.out.println("Codigo de emision: " + ((Pelicula)(e)).getCodEmision());
				System.out.println("Titulo: " + ((Pelicula)(e)).getTitulo());
				System.out.println("Fecha de inclusion: " + ((Pelicula)(e)).getFechaInclusion().get(Calendar.DAY_OF_MONTH) + "/" + ((Pelicula)(e)).getFechaInclusion().get(Calendar.MONTH));
				System.out.println("Duracion: " + ((Pelicula)(e)).getDuracion() + "min");
				System.out.println();
			}
			if (e instanceof Serie) {
				System.out.println("(Serie)");
				System.out.println("Codigo de emision: " + ((Serie)(e)).getCodEmision());
				System.out.println("Titulo: " + ((Serie)(e)).getTitulo());
				System.out.println("Fecha de inclusion: " + ((Serie)(e)).getFechaInclusion().get(Calendar.DAY_OF_MONTH) + "/" + ((Serie)(e)).getFechaInclusion().get(Calendar.MONTH));
				System.out.println("Temporadas: " + ((Serie)(e)).getNumeroTemporadas());
				System.out.println("Numero de capitulos: " + ((Serie)(e)).getTotalCapitulos());
				System.out.println();
			}
		}
		
		System.out.println(menu());
		System.out.println("Programa finalizado");
	}
}

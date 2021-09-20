package ejercicio1;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static String leerOferta(String s) {
		System.out.print("Introduce " + s + ": ");
		return sc.next();
	}

	public static int introducirCandidatos(Oferta o) {
		System.out.print("Introduce nuevas vacantes para el puesto de " + o.getPuesto() + ":");
		return sc.nextInt();
	}

	public static Oferta crearOferta() {
		Oferta o = new Oferta();
		System.out.println("*Creando nueva oferta de trabajo*");
		o.setPuesto(leerOferta("el puesto ofertado"));
		o.setEmpresa(leerOferta("la empresa"));
		o.setFecha("00/00/0000");
		o.setNumCandidatos(0);
		return o;
	}

	public static void nuevaFechaParaOferta(Oferta o) {
		System.out.print("Introduce una nueva fecha para la oferta de " + o.getPuesto() + " ");
		o.activarOferta(sc.next());
	}

	public static void ofertaActivaONo(Oferta o) {
		if (o.estaActiva()) {
			System.out.println(o.toString());
		} else {
			System.out.println("La oferta " + o.getPuesto() + " NO esta activa actualmente" + "\n" + o.getPuesto()
					+ "\n" + o.getEmpresa());
		}
	}

	public static void main(String[] args) {
		Oferta o1 = new Oferta("Java Junior Developer", "00/00/0000", "Google", 0);
		System.out.println(o1.toString());
		ofertaActivaONo(o1);
		nuevaFechaParaOferta(o1);
		ofertaActivaONo(o1);

		Oferta o2 = crearOferta();
		System.out.println(o2.toString());
		ofertaActivaONo(o2);

		o2.incrementarNumCandidatos(introducirCandidatos(o2));
		System.out.println("Las vacantes para " + o2.getPuesto() + " son " + o2.getNumCandidatos());
		nuevaFechaParaOferta(o2);
		ofertaActivaONo(o2);

		sc.close();
	}

}







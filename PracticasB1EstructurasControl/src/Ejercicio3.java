import java.util.Scanner;

public class Ejercicio3 {
//	Leer dos fechas por pantalla, pidiendo dia, luego mes y luego año
//	Decir cuál de ellas es anterior, escribiendo en la pantalla 
//	La fecha ../../…. es anterior a la fecha ../../…
	static Scanner sc = new Scanner(System.in);

	public static int entrada() {
		int lectura = 0;
		lectura = sc.nextInt();
		return lectura;
	}

	public static void ordenarSalida(int dia1Met, int dia2Met, int mes1Met, int mes2Met, int anio1Met, int anio2Met) {
		if (anio1Met == anio2Met) {
			if (mes1Met == mes2Met) {
				if (dia1Met == dia2Met) {
					System.out.println(
							"Las fechas introducidas son la misma: " + dia1Met + "/" + mes1Met + "/" + anio1Met);
				} else if (dia1Met > dia2Met) {
					System.out.println("La fecha " + dia2Met + "/" + mes2Met + "/" + anio2Met + " es anterior a "
							+ dia1Met + "/" + mes1Met + "/" + anio1Met);
				} else {
					System.out.println("La fecha " + dia1Met + "/" + mes1Met + "/" + anio1Met + " es anterior a "
							+ dia2Met + "/" + mes2Met + "/" + anio2Met);
				}
			} else if (mes1Met > mes2Met) {
				System.out.println("La fecha " + dia2Met + "/" + mes2Met + "/" + anio2Met + " es anterior a " + dia1Met
						+ "/" + mes1Met + "/" + anio1Met);
			} else {
				System.out.println("La fecha " + dia1Met + "/" + mes1Met + "/" + anio1Met + " es anterior a " + dia2Met
						+ "/" + mes2Met + "/" + anio2Met);
			}
		} else if (anio1Met > anio2Met) {
			System.out.println("La fecha " + dia2Met + "/" + mes2Met + "/" + anio2Met + " es anterior a " + dia1Met
					+ "/" + mes1Met + "/" + anio1Met);
		} else {
			System.out.println("La fecha " + dia1Met + "/" + mes1Met + "/" + anio1Met + " es anterior a " + dia2Met
					+ "/" + mes2Met + "/" + anio2Met);
		}
	}

	public static void main(String[] args) {
		int dia1 = 0, mes1 = 0, anio1 = 0, dia2 = 0, mes2 = 0, anio2 = 0;

		System.out.println("Piensa dos fechas con el formato XX/XX/XXXX");
		System.out.print("Introduce el dia: ");
		dia1 = entrada();
		System.out.print("Introduce el mes: ");
		mes1 = entrada();
		System.out.print("Introduce el anio: ");
		anio1 = entrada();
		System.out.println("-----------------");

		System.out.println("Y ahora la siguiente:");
		System.out.print("Introduce el dia: ");
		dia2 = entrada();
		System.out.print("Introduce el mes: ");
		mes2 = entrada();
		System.out.print("Introduce el anio: ");
		anio2 = entrada();

		ordenarSalida(dia1, dia2, mes1, mes2, anio1, anio2);

	}

}

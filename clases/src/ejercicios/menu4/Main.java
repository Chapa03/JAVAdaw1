package ejercicios.menu4;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		String menu1 = "\n1. MOSTRAR SALUDO"
//				+ "\n2. GUARDAR NOMBRE"
//				+ "\n3. ESCRIBIR NOMBRE GUARDADO"
//				+ "\n4. GUARDAR EDAD"
//				+ "\n5. ESCRIBIR EDAD GUARDADA"
//				+ "\n6. ADD OPTION"
//				+ "\nX. SALIR"
//				+ "\n\n";
		char opcion = 0;
		int cont = 7;
		Menu m1 = new Menu(01, "\nX. SALIR"
				+ "\n1. MOSTRAR SALUDO"
				+ "\n2. GUARDAR NOMBRE"
				+ "\n3. ESCRIBIR NOMBRE GUARDADO"
				+ "\n4. GUARDAR EDAD"
				+ "\n5. ESCRIBIR EDAD GUARDADA"
				+ "\n6. ADD OPTION"
				+ "\n");
		
		while (Character.toUpperCase(opcion) != 'X') {
			System.out.println(m1.toString());
			System.out.print("Introduce una opcion -> ");
			opcion = sc.next().charAt(0);
			switch (Character.toUpperCase(opcion)) {
			case '1':
				System.out.println("Hola!! Que tal?");
				break;
			case '2':
				System.out.print("Introduce un nombre, por favor: ");
				m1.setNombreGuardado(sc.next());
				System.out.println("Nombre guardado con exito!");
				break;
			case '3':
				System.out.println("El nombre guardado es: " + m1.getNombreGuardado());
				break;
			case '4':
				System.out.print("Introduce una edad, por favor: ");
				m1.setEdadGuardada(sc.nextInt());;
				System.out.println("Edad guardada con exito!");
				break;
			case '5':
				System.out.println("La edad guardada es: " + m1.getEdadGuardada());
				break;
			case '6':
				System.out.println("Escribe el nombre de la opcion que deseas agregar al menu: ");
				m1.addMenuOptions(m1, cont++ + ". " + sc.next());
				System.out.println("Opcion agregada con exito.");
				break;
			case 'X':
				System.out.println("Saliendo del menu");
				break;
			default:
				System.out.println("Opcion no valida. Por favor, intentalo de nuevo.");
			}
		}
		
		System.out.println("Fin del programa");
		sc.close();
	}

}

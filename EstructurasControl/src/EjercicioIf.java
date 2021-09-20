import java.util.Scanner;

public class EjercicioIf {

	public static void main(String[] args) {
		String cad1 = "", cad2 = "";
		int comparar = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el primer String: ");
		cad1 = sc.next();
		System.out.print("Introduce el segundo String: ");
		cad2 = sc.next();
		
		//Nos da un valor entero con la distancia en caracteres que hay entre los dos strings desde los caracteres
		//diferentes. Si no los hay, su valor sera 0. Si su valor es negativo, cad1 va antes en el abecedario
		//si su valor es positivo cad1 va despues que cad2 en el abecedario
		//ademas, estoy comparando los stringg convertidos a minusculas, para que
		comparar = (cad1.toLowerCase()).compareTo(cad2.toLowerCase());
		
		if (comparar == 0) {
			System.out.println("Los dos Strings son iguales");
		} else if (comparar < 0) {
			System.out.println("El primer String (" + cad1 + ") va antes, alfabeticamente hablando que el segundo String (" + cad2 + ")");
		} else {
			System.out.println("El segundo String (" + cad2 + ") va antes, alfabeticamente hablando que el primer String (" + cad1 + ")");
		}
		
		sc.close();
	}
}

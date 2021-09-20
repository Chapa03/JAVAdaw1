import java.util.Scanner;

public class Ejercicio16 {
//	Modificar el programa anterior, para que haga la 
//	dibuje m montañas de altura a. Por ejemplo: 
//		Introduce a: 3 
//		Introduce m: 4
	static Scanner sc = new Scanner(System.in);
	
	public static String salida(int base) {
		String triangulo = "";
		if ((base >= 1) && (base <= 20)) {
			for (int i = 1; i <= base; i++) {
				for (int j = 1; j <= i; j++) {
					triangulo += "*";
				}
				triangulo += "\n";
			}
			for (int i = base-1; i >= 1; i--) {
				for (int j = i; j >= 1; j--) {
					triangulo += "*";
				}
				triangulo += "\n";
			}
			return triangulo;
		} else {
			return "Valor no valido";
		}
	}

	public static void main(String[] args) {
		System.out.println("Introduce la altura de la montania (1<=n<=20): ");
		System.out.println("\n" + salida(sc.nextInt()));
	}

}

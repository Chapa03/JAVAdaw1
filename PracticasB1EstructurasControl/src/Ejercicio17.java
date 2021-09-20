import java.util.Scanner;

public class Ejercicio17 {
//	Modificar el programa anterior, para que haga la “bajada de la montaña” también 
//	Por ejemplo: Introduce n: 7
	static Scanner sc = new Scanner(System.in);

	public static int entrada(String s) {
		System.out.println("Introduce " + s);
		return sc.nextInt();
	}

	public static String salida(int base, int veces) {
		String triangulo = "";
		if ((base >= 1) && (base <= 20)) {
			for (int i = 1; i <= veces; i++) {
				for (int j = 1; j <= base; j++) {
					for (int k = 1; k <= j; k++) {
						triangulo += "*";
					}
					triangulo += "\n";
				}
				for (int j = base - 1; j >= 1; j--) {
					for (int k = j; k >= 1; k--) {
						triangulo += "*";
					}
					triangulo += "\n";
				}
			}
			return triangulo;
		} else {
			return "Valor no valido";
		}
	}

	public static void main(String[] args) {
		System.out.println(
				"\n" + salida(entrada("la altura de las montanias (1<=n<=20): "), entrada("el numero de montanias: ")));
	}

}

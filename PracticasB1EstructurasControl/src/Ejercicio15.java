import java.util.Scanner;

public class Ejercicio15 {
//	Dado un número n, dibujar una figura como ésta, en la que la 
//	base del triángulo más grande es de n asteriscos (tal que 1<= n <= 20) 
//	Por ejemplo: Introduce n: 7 
//	* 
//	** 
//	*** 
//	**** 
//	***** 
//	****** 
//	******* 
	static Scanner sc = new Scanner(System.in);

	public static String salida(int base) {
		String triangulo = "";

//		String asterisco = "*";
//		for (int i=1; i<= base; i++) {
//			triangulo += asterisco.repeat(i) + "\n";
//		}
		if ((base >= 1) && (base <= 20)) {
			for (int i = 1; i <= base; i++) {
				for (int j = 1; j <= i; j++) {
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
		System.out.print("Introduce la base del triangulo (1<=n<=20): ");
		System.out.println("\n" + salida(sc.nextInt()));

	}

}

import java.util.Scanner;

public class Ejercicio18 {
//	Similar al 35, pero haciendo el triángulo a la inversa. 
//	Introduce n: 7
//	      * 
//	     ** 
//	    *** 
//	   **** 
//	  ***** 
//	 ****** 
//	******* 
	static Scanner sc = new Scanner(System.in);
	
	public static int leerBase() {
		System.out.println("Introduce la base del triangulo (1 <= n <= 20): ");
		return sc.nextInt();
	}
	
	public static void salida(int base) {
		if ((base >= 1) && (base <= 20)) {
			for (int i = 1; i <= base; i++) {
				for (int j = base - i; j >= 1; j--) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		salida(leerBase());
	}

}

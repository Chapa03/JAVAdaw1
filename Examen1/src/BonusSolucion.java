import java.util.Scanner;

public class BonusSolucion {
//	(Bonus extra) Realizar un programa que realice la lectura de un número decimal
//	(con 2 decimales obligatoriamente, sino, que vuelva a pedir el número) por
//	pantalla y con él:
//	- Cuántos dígitos tiene menores de 5
//	- Cuántos impares
//	- Cuantos ceros

	public static String leerNum() {
		String numero = "";
		Scanner scan = new Scanner(System.in);
		boolean noEsValido = true;
		while (noEsValido) {
			System.out.println("Dime un número:");
			numero = scan.next();
			if ((numero.charAt(numero.length() - 3) == ',') && (numero.charAt(numero.length() - 1) != '0'))
				noEsValido = false;
			else
				System.out.println("El número sólo debe contener dos decimales.");
		}
		System.out.println(numero);
		scan.close();
		return numero;
	}

	public static void main(String[] args) {
		String numLetras = leerNum().replace(",", "");

		System.out.println(numLetras);
		int i = 0;
		int sumMenos5 = 0;
		int sumImpares = 0;
		int sumCeros = 0;
		while (i < numLetras.length()) {
			char c = numLetras.charAt(i);
			if (c < '5')
				sumMenos5++;
			if (c % 2 != 0)
				sumImpares++;
			if (c == '0')
				sumCeros++;
			i++;
		}
		System.out.println("Menores de 5:" + sumMenos5);
		System.out.println("Impares:" + sumImpares);
		System.out.println("Ceros:" + sumCeros);

	}

}

import java.util.Scanner;

public class EjSwitch {

	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Dime un numero (1 - 10 - 100 - 1000): ");
		num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("UNO");
			break;
		case 10:
			System.out.println("DIEZ");
			break;
		case 100:
			System.out.println("CIEN");
			break;
		case 1000:
			System.out.println("MIL");
			break;
		default:
			System.out.println("El numero no es valido");
		}

		sc.close();
	}

}

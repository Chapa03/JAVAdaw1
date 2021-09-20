package bucles;

public class EjercicioFor {

	public static void main(String[] args) {
		int num = 1;
		while (num <= 10) {
			System.out.print("-> " + num);
			num++;
		}
		
		System.out.println();
		
		//cndiciopn de inicio, condicion de finalizacion y cambio
		//si la variable la declaramos dentro de la condicion inicial del for
		//la variable solo se puede usar dentro del for
		for (int i=1; i<=15; i+=2) {
			System.out.print(" -" + i);
		}
		
		System.out.println();
		
		for (int i=100; i>=15; i-=3) {
			System.out.print(" -" + i);
		}

	}

}

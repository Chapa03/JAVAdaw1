
public class Ejercicio5 {

	public static void main(String[] args) {
//		Mostrar todos los números impares que hay entre el 100 y el 1000
		int numero = 1;
		
		System.out.print("Numeros impares entre el 100 y el 1000:");
		while (numero <999) {
			System.out.print((numero+=2) + ".");
		}
		
		System.out.println();
		
		for (int i=101; i<=1000; i+=2) {
			System.out.print(i + ".");
		}
	}

}

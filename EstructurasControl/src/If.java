
public class If {

	public static void main(String[] args) {
		int num = 6;
		
		if (num > 5) {
			System.out.println("El número es mayor que 5");
		} else if (num < 5){
			System.out.println("El número es menor que 5");
		} else {
			System.out.println("El numero es igual a 5");
		}
		
		System.out.println("Hola desde fuera del if!!!");
	}

}

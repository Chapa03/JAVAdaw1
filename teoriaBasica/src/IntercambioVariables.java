
public class IntercambioVariables {

	public static void main(String[] args) {
		int num1 = 4, num2 = 5;
		int aux;
		
		aux = num1;
		num1 = num2;
		num2 = aux;
		
		System.out.println("num1: " + num1 + " num2: " + num2);
	}

}

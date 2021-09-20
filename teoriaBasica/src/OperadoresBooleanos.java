
public class OperadoresBooleanos {

	public static void main(String[] args) {
		int num1 = 45;
		int num2 = 43;
		boolean resultado = false;
		resultado = num1 >= num2;
		System.out.println(resultado);
		
		//el numero mayor que 50 y menor que 100?
		//numero positivo
		//numero negativo
		//si sin de tercera edad (mayores de 65 incluido)
		//si estan en orden
		
		int numero1, numero2;
		numero1 = 76;
		numero2 = -65;
		boolean comparacion;
		
		comparacion = (numero1 > 50) && (numero1 < 100);
		System.out.println("El primer numero es mayor que 50 y menor que 100? " + comparacion);
		comparacion = numero1 > 0;
		System.out.println("El numero es negativo? " + comparacion);
		comparacion = numero1 >= 65;
		System.out.println("Es mayor o igual a 65? " + comparacion);
		comparacion = numero1 < numero2;
		System.out.println("Están ordenados? " + comparacion);
		
		//posibles expresiones de cosas que querria hacer con restricciones usando comparadores
		//>18 años
		//pcr negativa o positiva
		//temperatura corporal
		//es la hora de entrar?
		
		
		
		
		
	}

}

package ejercicios.arrays;

public class Ejercicio1 {
//	Crear un array de int con 8 elementos, inicializarlo con los 
//	valores y comparar los elementos 2 y 4 , de forma que nos 
//	escriba por pantalla el mayor de los dos

	public static void main(String[] args) {
		int[] array1 ={23,-6,7,4545,-99,0,32,-1222};

		if (array1[1] > array1[3]) {
			System.out.println("El mayor es " + array1[1]);
		} else if (array1[1] < array1[3]){
			System.out.println("El mayor es " + array1[3]);
		} else {
			System.out.println("Los dos elementos son iguales");
		}
	}

}

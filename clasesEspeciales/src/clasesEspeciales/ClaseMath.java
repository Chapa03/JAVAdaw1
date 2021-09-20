package clasesEspeciales;

public class ClaseMath {
//	NO ES NECESARIO CREAR NINGUN OBJETO DE LA CLASE MATH PARA PODER UTILIZAR SUS METODOS Y CONSTANTES
	public static void main(String[] args) {
		int a1 = 98;
		int a2 = 103;
		System.out.println(a1 * Math.PI);
//		nos devuelve el maximo de dos enteros
		System.out.println(Math.max(a1, a2));
//		nos devuelve el minimo de dos enteros
		System.out.println(Math.min(a1, a1));
//		potencia de un numero
		System.out.println(Math.pow(2, 8));
//		raiz cuadrada
		System.out.println(Math.sqrt(a1));
		
//		redondeo
		float f1 = 23.36F;
//		redondeo al numero entero. nos devuelve un entero
		System.out.println(Math.round(f1));
//		redondeo al entero inferior. nos da un double
		System.out.println(Math.floor(f1));
//		redondeo al entero superior. nos da un double
		System.out.println(Math.ceil(f1));
		
		int fConvertido = 0;
		fConvertido = Math.round(f1);
		fConvertido = (int) Math.floor(f1);
		System.out.println(fConvertido);
	}

}

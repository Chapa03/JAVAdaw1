
public class Perimetro {
	public static void main(String[] args) {
		//Calculo del perímetro y área de un rectángulo
		//Dos variables enteras ancho y largo que contendrán las dimensiones
		int largo, ancho, perimetro, area;
		
		largo = 3;
		ancho = 11;
		perimetro = (2*largo) + (2*ancho);
		area = largo * ancho;
		
		System.out.println("Dimensiones del rectángulo:");
		System.out.println("| Largo = " + largo + " | Ancho = " + ancho +" |");
		
		System.out.println("El perímetro del rectángulo es: " + perimetro);
		System.out.println("El área del rectángulo es: " + area);
		
	}

}

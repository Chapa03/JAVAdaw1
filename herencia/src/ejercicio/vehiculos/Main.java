package ejercicio.vehiculos;

public class Main {

	public static void main(String[] args) {
		Taxi t1 = new Taxi("8762TYH", "Ford Focus", 150, 35467);
		System.out.println(t1.toString());
		
		Autobus a1 = new Autobus("8290JRP", "Scania", 190, 45);
		System.out.println(a1.toString());
	}

}

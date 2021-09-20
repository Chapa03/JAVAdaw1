package interfaces;

public class EjemploInterfaceImpl implements EjemploInterface, Comparable{

	@Override
	public void escribirHola() {
		System.out.println("Hola");
		
	}

	@Override
	public void escribirAdios() {
		System.out.println("Adios");
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

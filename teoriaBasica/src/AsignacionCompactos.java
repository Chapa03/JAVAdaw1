
public class AsignacionCompactos {

	public static void main(String[] args) {
		int marcadorP = 0, marcadorC = 0;
		int vuelta = 1;
		System.out.println(vuelta + "-Propios: " + marcadorP + "\tContrarios: " + marcadorC);

		marcadorP = marcadorP + 1;	//marcadorP++;
		marcadorC = marcadorC + 2;	//marcadorC += 2;
		vuelta++;
		System.out.println(vuelta + "-Propios: " + marcadorP + "\tContrarios: " + marcadorC);
		
		marcadorP += 3;
		marcadorC += 4;
		//en el siguiente caso, se usa el valor de vuelta y luego se incrementa
		System.out.println(vuelta++ + "-Propios: " + marcadorP + "\tContrarios: " + marcadorC);
		
		System.out.println(marcadorP > marcadorC ? "\tP es ganador!" : "\tC es ganador!");

	}

}

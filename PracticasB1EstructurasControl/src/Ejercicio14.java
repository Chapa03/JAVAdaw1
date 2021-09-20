
public class Ejercicio14 {
//	Obtener por pantalla todos los valores de una baraja de cartas:
//		Oros - Bastos- Copas- Espadas
//		1,2,3,4,5,6,7,8,9,J,Q,K
//		1 Oros
//		2 Oros
//		…
//		K Espadas


	public static void main(String[] args) {
		String palo = "";
		for (int i=1; i<=4; i++) {
			switch(i) {
			case 1:
				palo = "Oros";
				break;
			case 2:
				palo = "Bastos";
				break;
			case 3:
				palo = "Copas";
				break;
			case 4:
				palo = "Espadas";
				break;
			}
			System.out.println("*** " + palo + " ***");
			for (int j=1; j<=12; j++) {
				switch (j) {
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6: 
				case 7:
				case 8:
				case 9:
					System.out.println(j + " de " + palo);
					break;
				case 10:
					System.out.println("J de " + palo);
					break;
				case 11:
					System.out.println("Q de " + palo);
					break;
				case 12:
					System.out.println("K de " + palo);
					break;
				}
			}
			System.out.println();
		}

	}

}

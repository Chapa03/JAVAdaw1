package bucles;

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
				for (int j=1; j<= 12; j++) {
					if (j <= 9) {
						System.out.println(j + " de " + palo);
					} else if(j == 10) {
						System.out.println("J de " + palo);
					} else if(j == 11) {
						System.out.println("Q de " + palo);
					} else if(j == 12) {						
						System.out.println("K de " + palo);
					}
				}
				break;
			case 2:
				palo = "Bastos";
				for (int j=1; j<= 12; j++) {
					if (j <= 9) {
						System.out.println(j + " de " + palo);
					} else if(j == 10) {
						System.out.println("J de " + palo);
					} else if(j == 11) {
						System.out.println("Q de " + palo);
					} else if(j == 12) {						
						System.out.println("K de " + palo);
					}
				}
				break;
			case 3:
				palo = "Copas";
				for (int j=1; j<= 12; j++) {
					if (j <= 9) {
						System.out.println(j + " de " + palo);
					} else if(j == 10) {
						System.out.println("J de " + palo);
					} else if(j == 11) {
						System.out.println("Q de " + palo);
					} else if(j == 12) {						
						System.out.println("K de " + palo);
					}
				}
				break;
			case 4:
				palo = "Espadas";
				for (int j=1; j<= 12; j++) {
					if (j <= 9) {
						System.out.println(j + " de " + palo);
					} else if(j == 10) {
						System.out.println("J de " + palo);
					} else if(j == 11) {
						System.out.println("Q de " + palo);
					} else if(j == 12) {						
						System.out.println("K de " + palo);
					}
				}
				break;
			}
			
		}

	}

}

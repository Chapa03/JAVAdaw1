package bucles;

public class While {

	public static void main(String[] args) {
		//modificar para que haya 2 jugadores. Uno ++2 y otro +=2.
		int ronda = 1;
		int contador1 = 0;
		int contador2 = 0;
		boolean acierta = true;
		//MIENTRAS QUE contador1 SEA < 21 Y contador2 < 21, EJECUTA EL CODIGO  
		while ((contador1 < 21) && (contador2 < 21)) {
			//juega();
			System.out.println("**Ronda numero: " + ronda);
			if (acierta) {
				System.out.println("Jugador 1: " + contador1);
				System.out.println("Jugador 2: " + contador2);
				contador1++;
				contador2+=2;
			}
			ronda++;
		}
		if (contador1 > contador2) {
			System.out.println("\nPartida finalizada. El ganador es el jugador 1 con " + contador1 + " puntos!");

		} else {
			System.out.println("\nPartida finalizada. El ganador es el jugador 2 con " + contador2 + " puntos!");

		}
	}

}

package ejemplos.Multidimensional;

public class Bidimensional {

	public static void main(String[] args) {
//		Declaracion, instanciacion e inicializacion
		int[][] miABid = {{1,0,0},{0,0,1},{1,0,0}};
//		miABid = new int[3][3];
		String[][] miABidS = {{"Madrid", "Barcelona"},{"Lisboa", "Oporto"},{"Roma", "Florencia"}};
//		Monedas[][] miABMonedas = new Monedas[2][2];
		int[][] miABidI = {{1, 0},{0, 0, 1, 0},{1, 0, 0}};
		
//		Asignar valores
		miABid[1][1] = 4;
		miABidI[0][1] = 5;
		miABidS[0][0] = "Sevilla"; 
		
//		Recorridos
		
//		Inicializar contenido
		for (int i = 0; i < miABid.length; i++) {
			for (int j = 0; j < miABid.length; j++) {
				miABid[i][j] = i * 100 + j;
			}
		}
		
//		Ver contenido
		for (int i = 0; i < miABid.length; i++) {
			for (int j = 0; j < miABid[i].length; j++) {
				System.out.print(miABid[i][j] + "-");
			}
			System.out.println();
		}
		
		for (int i = 0; i < miABidS.length; i++) {
			for (int j = 0; j < miABidS[i].length; j++) {
				System.out.print(miABidS[i][j] + "-");
			}
			System.out.println();
		}
		
		for (int i = 0; i < miABidI.length; i++) {
			for (int j = 0; j < miABidI[i].length; j++) {
				System.out.print(miABidI[i][j] + "-");
			}
			System.out.println();
		}
		
//		FOR EACH
//		Que tipo de elemento quiero obtener por 
//		cada una de las ocurrencias del array
		for (String[] fila:miABidS) {
			for (String ciudad: fila) {
				System.out.print(ciudad + " - ");
			}
			System.out.println();
		}
	}
}

























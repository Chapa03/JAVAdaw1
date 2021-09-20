
public class Gasolina {
	public static void main(String[] args) {
		//Calcular gasto de gasolina en función del precio diario y kilómetros que se vayan a realizar
		
		// - DUDA - Varios sout para varios saltos de línea o mejor uno sólo con \n???
		
		double precioCombustible, litros100, kilometros, consumoLitros, costeViaje;
		
		precioCombustible = 1.27;
		litros100 = 6.7;
		kilometros = 700;
		consumoLitros = (litros100 * kilometros) / 100;
		costeViaje = consumoLitros * precioCombustible;
		
		System.out.println("Para tu viaje de " + kilometros + "km, tu consumo de combustible será de " + consumoLitros + " litros.");
		System.out.println("Teniendo en cuenta el precio del combustible hoy: " + precioCombustible + "€ \n" +
				"y que tu vehículo consume " + litros100 + "l/100km.");
		System.out.println("Esto supondrá un coste total en combustible de " + costeViaje + "€");
		
		
	}
}


public class P11CChaparro {

	public static void main(String[] args) {
//		explicar que hace el programa y Cambiar programa dado para que el IVA se pueda almacenar en una variable
		
		//EXPLICACION: el programa toma dos valores, que son unidad y precio. En base al precio de cada unidad, calcula el 
		//precio total sin iva y luego le añade el 21% de iva al precio final.
		
		int var1, var2;
		var1 = 12;
		var2 = 34;
		int precio = var1 * var2;
		//variable iva añadida
		double iva = 0.21;
		//double totalIva = precio  + (precio * 0.21); Antigua sentencia para calcular el precio final con iva
		double totalIva = precio  + (precio * iva);
		
		
		System.out.println("Unidades: " + var1);
		System.out.println("Precio unitario: " + var2);
		System.out.println("Total sin IVA: " + precio);
		System.out.println("TOTAL CON 21% de IVA: " + totalIva);
		
		
	}

}

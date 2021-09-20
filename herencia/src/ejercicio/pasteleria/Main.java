package ejercicio.pasteleria;

import java.util.Calendar;

public class Main {
	
	public static Calendar tiempoCaduca(ProductoPropio varProd) {
		Calendar fechaHoy = Calendar.getInstance();
		fechaHoy.add(Calendar.HOUR, varProd.getDuracion());
		return fechaHoy;
	}

	public static void main(String[] args) {
//		ProductoPropio pp1 = new ProductoPropio();
		Calendar fechaC = Calendar.getInstance();
		fechaC.add(Calendar.HOUR, 24);
		ProductoPropio pRoscon = new ProductoPropio(1, "Roscon de nata",new TipoProducto("Roscon"), 20F, 15F, 3, 24, 24);
		System.out.println(pRoscon.toString());
		
		ProductoExterno pMiel = new ProductoExterno(2, "Miel de Grazalema", new TipoProducto("Miel"), 12F, 8F, 12);
		System.out.println(pMiel.toString());
		
		Calendar fechaCaducidad = tiempoCaduca(pRoscon);
		System.out.println(fechaCaducidad.get(Calendar.YEAR) + "--" + fechaCaducidad.get(Calendar.MONTH) + "--" + fechaCaducidad.get(Calendar.DAY_OF_MONTH));
	}

}

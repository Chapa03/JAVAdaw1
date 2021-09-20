package ejemplos.CalendarDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
//		recogiendo las caracterisiticas de idioma y lenguaje del equipo
//		para utilizarlo en cualquier sistema
		Locale loc = Locale.getDefault();
		
		Date fecha = new Date();
		System.out.println(fecha);
//		algunos metodos de Date estan deprecated
		System.out.println(fecha.getTime());
//		System.out.println(fecha.getYear());

		System.out.println("---------------------");
		
//		la clase Calendar es mas completa y nueva
		Calendar otraFecha = Calendar.getInstance();
		System.out.println(otraFecha.get(Calendar.YEAR) + " " + otraFecha.get(Calendar.DAY_OF_WEEK));
		System.out.println(otraFecha.getTime());
		
//		getDisplayName(elemento a mostrar, short o long, configuracion de idioma)
//		locale reune las caracteristicas del sistema para
//		poder utilizarlas para mostrar datos en el idioma
//		del sistema
		System.out.println(otraFecha.getDisplayName(Calendar.MONTH, Calendar.SHORT, loc));
		
		Calendar fechaNuestra;
		fechaNuestra = new GregorianCalendar(2000, 8, 23);
//		el setLenient permite contar dias dias de mas para un mes. o meses
//		de mas para un anio. Con esto, si tenemos 45 dias en febrero, nos saldra
//		el 17 de marzo (16 si es bisiesto). Si es false, desactiva este modo permisivo
//		y nos tira una excepcion si no estan bien los dias o meses introducidos
		fechaNuestra.setLenient(false);
		System.out.println(fechaNuestra.getDisplayName(Calendar.MONTH, Calendar.LONG, loc));
		Calendar fechaNuestra1 = new GregorianCalendar(2000, Calendar.AUGUST, 23);
		System.out.println("Get time");
		System.out.println(fechaNuestra1.getTime());
//		add, nos permite "sumar o restar fechas" y roll nos permite lo mismo pero sin variar
//		el resto de parametros
		fechaNuestra1.add(Calendar.MONTH, 10);
		
		System.out.println(fechaNuestra1.getTime());
		System.out.println(fechaNuestra1);
		
		System.out.println(fechaNuestra.getDisplayName(Calendar.DAY_OF_MONTH, Calendar.DATE, loc));
		
	}

}

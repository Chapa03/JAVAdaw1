package listas;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class EjemploListasSegundo {
	
//	para las colecciones pasadar por argumentos estamos pasando la referencia
//	del objeto, no el contenido en si. Por lo que si efectuamos un cambio dentro
//	de lmetodo, se va  aver reflejado en el objeto fuera del metodo
//	public static void llamada(ArrayList<Integer> var) {
//		System.out.println(var);
//		var.set(0, 121);
//	}
	
	public static ArrayList<Integer> llamada(ArrayList<Integer> var){
		ArrayList<Integer> retorno = new ArrayList<Integer>();
		for (int i = 0 ;i < 10; i++) {
			retorno.add(i);
		}
		System.out.println(var);
		var.set(0, 121);
		return retorno;
	}

	public static void main(String[] args) {
//		Los ArrayList son listas de OBJETOS y los tipos simples no lo son
		ArrayList<String> var = new ArrayList<String>();
		
//		ArrayList<int> var2 = new ArrayList<int>();   
//		Como esto no es valido, tenemos
//		que utilizar las clases Wrapper para no utilizar sentencias 
//		como esta, en la que no dejamos claro con que tipo de
//		objetos queremos trabajar
//		ArrayList var2 = new ArrayList();
//		var2.add(34.0F);
//		var2.add(23);
		
		ArrayList<Integer> var2 = new ArrayList<Integer>();
		var2.add(34);
		var2.add(23);
		
		ArrayList<Integer> var4 = new ArrayList<Integer>();
		
		
//		Utilizacion con metodos
		llamada(var2);
		System.out.println(var2);
		var4 = llamada(var2);
		
//		ArrayList con objetos
		ArrayList<Persona> colaBanco = new ArrayList<Persona>();
		colaBanco.add(new Persona("Pepe"));
		colaBanco.add(new Persona("Kikei"));
		colaBanco.get(0).setNombre("Juan");

		System.out.println(colaBanco);
		
		for (int i = 0; i < colaBanco.size(); i++) {
			colaBanco.get(i).setNombre(colaBanco.get(i).getNombre() + " Lopez");
		}
		
		System.out.println(colaBanco);
		
//		Inicializacion con arrays
		ArrayList<Integer> dado = new ArrayList<Integer> (Arrays.asList(1,2,3,4,5,6));
		dado.add(45);
		dado.add(34);
		System.out.println("Con dos aniadidos: " + dado);
		
		dado.remove(1);
		System.out.println("Eliminando la posicion 1: " + dado);
		
//		Mezclas de arrays
//		ArrayList generado desde un Array inicializado
//		List<String> peliculaMosqueteros = new ArrayList<String> (Arrays.asList("D'Artagnan", "Richelieu"));
//		peliculaMosqueteros.add("OtroMosquetero");
		
//		List<String> diasSemana = Arrays.asList("Lunes", "Martes", "Miercoles");
//		System.out.println(diasSemana);
		
		
		
		
	}

}

package ejemplos.editoriales;

public class Main {

	public static void main(String[] args) {
		Editorial e1 = new Editorial(1, "Salamandra", 1975);
		Libro l1 = new Libro("1A", "Harry Potter", 18, 2002, e1);
		System.out.println(l1.getIsbn());
		System.out.println(l1.getEditorial().getNombre());
		System.out.println(l1.toString());
//		puedo cambiar un atributo de un objeto relacionado a otro
//		a traves de su propia clase...
		e1.setCodigo(2);
//		...o a traves del objeto derivado con un get de esa clase y 
//		un set para el atributo de la clase que queremos cambiar
		System.out.println(l1.toString());
		l1.getEditorial().setCodigo(3);
		System.out.println(l1.toString());
		
//		en este caso solo creamos REFERENCIA a un objeto, por lo que no podemos 
//		acceder a sus atributos sin hacerlo a traves del objeto mediante el
//		cual se ha referenciado. Porque no hay un objeto de tipo editorial mediante
//		el cual podamos acceder a sus atributos. solo la referencia a trabes del objeto
//		de tipo libro que hemos creado
		Libro l2 = new Libro("2A", "La camara secreta", 20, 2004, new Editorial(2, "Debolsillo", 1980));
		l2.getEditorial().setCodigo(30);
		System.out.println(l2.toString());
		
	}

}

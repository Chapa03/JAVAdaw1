package ejemplos.productos;

public class Main {

	public static void main(String[] args) {
//		en el momento en que hay un constructor de la clase de la que creamos el 
//		objeto, tenemos que utilizar el constructor para crear el objeto. Si hay constructores sobrecargados
//		podremos utilizar cualquiera de ellos. Y si no lo hay, java interpreta que existe un cnstructor
//		generico de la clase
		Producto prod1 = new Producto();
		
//		si estos atributos de la clase no fueran privados, podriamos acceder a ellos
//		pero esto hay que limitarlo para dejar que sea cada clase la que gestione 
//		sus propios atributos, por lo que los atributos tienen que ser privados
//		y el acceso a ello se realiza mediante los gettres y setters
//		prod1.nombre = "silla";
//		prod1.tipoProducto = "Mueble de comedor";
		
		prod1.setNombre("Mesa");
		prod1.setTipoProducto("Mueble");
		prod1.setPrecio(34.56F);
		
		System.out.println("Nombre: " + prod1.getNombre() + " Precio: " + prod1.getPrecio());

		Proveedor prov1 = new Proveedor();
		prov1.setContacto("Makro");
		System.out.println(prov1.getContacto());
		
		System.out.println(prod1.toString());

	}

}

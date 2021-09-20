import java.util.Scanner;

public class Ejercicio1 {
//	Se desea realizar el registro de un usuario en una aplicación. Desde la clase Uno,
//	leer un usuario y contraseña y almacenarlo en dos variables de tipo String.
//	(1,5 puntos) Crear un método contraseniaValida() al que llamemos con el String de
//	contraseña leído que nos diga si la contraseña leída es válida o no:
//	La contraseña es válida si tiene:
//	▪ alguna mayúscula,
//	▪ alguna minúscula
//	▪ 2 o más dígitos
//	▪ más de 8 caracteres
//	Si la contraseña leída no es válida permitirá que se repita la lectura de
//	contraseña hasta 3 veces y si no se consigue, finalizará el programa.
//	Informará por pantalla si el registro se ha realizado con éxito o no.
	static Scanner sc = new Scanner(System.in);
	
	public static String entradaDatos() {
		String entrada;
		entrada = sc.next();
		return entrada;
	}
	
	public static boolean contraseniaValida(String pass) {
		boolean esValida;
		
		if ((tieneMayusculas(pass)) && (tieneMinusculas(pass)) && (tieneDigitos(pass)) && (pass.length() >= 8)) {
			esValida = true;
		} else {
			esValida = false;
		}
		
		return esValida;
	}
	
	public static boolean tieneMayusculas(String s) {
		boolean resultado = false;
		for (int i=0; i<s.length(); i++) {
			if ((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z')) {
				resultado = true;
			}
		}
		return resultado;
	}
	
	public static boolean tieneMinusculas(String s) {
		boolean resultado = false;
		for (int i=0; i<s.length(); i++) {
			if ((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z')) {
				resultado = true;
			}
		}
		return resultado;
	}
	
	public static boolean tieneDigitos(String s) {
		boolean resultado = false;
		int numeroDigitos = 0;
		
		for (int i=0; i<s.length(); i++) {
			if ((s.charAt(i) >= '0') && (s.charAt(i) <= '9')) {
				numeroDigitos++;
			}
		}
		
		resultado = (numeroDigitos >= 2) ? true : false;
		
		return resultado;
	}

	public static void main(String[] args) {
		String usuario, password;
		int i = 1;
		
		System.out.print("Introduce un nombre: ");
		usuario = entradaDatos();
		System.out.print("Introduce una password: ");
		password = entradaDatos();
		
		while (!(contraseniaValida(password)) && (i < 3)) {
			System.out.println("La password es erronea. Te quedan " + (3 - i) + " intentos. Recuerda:"
					+ "\n\t-Debe tener, como minimo, 8 caracteres."
					+ "\n\t-Debe contener, al menos, una MAYUSCULA y una minuscula."
					+ "\n\t-Debe contener, al menos, 2 numeros.");
			System.out.print("Introduce una password valida: ");
			password = entradaDatos();
			i++;
		}
		
		if (contraseniaValida(password)) {
			System.out.println("El usuario " + usuario + ", se ha registrado con exito.");
		} else {
			System.out.println("Fallo en el registro del usurio " + usuario);
		}
		
		System.out.println("Finalizando programa.");
		sc.close();
		
		System.out.println(usuario.toUpperCase());
	}

}

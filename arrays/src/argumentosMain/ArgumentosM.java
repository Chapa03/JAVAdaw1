package argumentosMain;

import java.util.Arrays;

public class ArgumentosM {

	public static void main(String[] args) {
//		los argumentos del main se encargan de recoger valores externos (ficheros, carpetas)
//		para introducirlos dentro de la aplicacion
//		si intentamos mostrar el contenido del array args no nos va mostrar nada
//		sin embargo, podemos cambiar los argumentos del main en RUN CONFIGURATOR
//		(los cambios se guardan a nivel del main y no afectan a otros main u otras clases)
//		si le introducimos los argumentos "NombreFichero directorio",
//		el resultado de recorrer el array del argumento del main sera:
//			-nombreFichero
//			-directorio
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("-" + args[i]);
		}
		System.out.println(Arrays.toString(args));

	}

}

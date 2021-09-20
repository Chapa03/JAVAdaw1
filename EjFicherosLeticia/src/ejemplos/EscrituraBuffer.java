package ejemplos;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EscrituraBuffer {
	public static void escribir(String fichero, String[] textoAEscribir, Charset charset) {

		Path file = Paths.get(fichero);

		BufferedWriter writer = null;
		try {
			writer = Files.newBufferedWriter(file, charset);

			for (int i = 0; i < textoAEscribir.length; i++) {
				writer.write(textoAEscribir[i], 0, textoAEscribir[i].length());
				if (i < textoAEscribir.length - 1)
					writer.newLine();
			}

		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}


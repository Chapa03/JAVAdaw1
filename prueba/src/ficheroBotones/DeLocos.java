package ficheroBotones;

import java.awt.Color;

public class DeLocos {

	public static void main(String[] args) {		
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.println("JButton btn" + (i < 10 ? "0" + i : i) + (j < 10 ? "0" + j : j) + " = new JButton(\"\");\r\n"
						+ "centroBotones.add(btn" + (i < 10 ? "0" + i : i) + (j < 10 ? "0" + j : j) + ");\r\n"
						+ "btn" + (i < 10 ? "0" + i : i) + (j < 10 ? "0" + j : j) + ".setBackground(new Color(60, 179, 113));\n");
			}
		}
	}
}

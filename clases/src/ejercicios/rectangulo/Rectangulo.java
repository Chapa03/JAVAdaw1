package ejercicios.rectangulo;

public class Rectangulo {
	private int ladoA;
	private int ladoB;
	
	public Rectangulo() {
		
	}
	
	public Rectangulo(int ladoA, int ladoB) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	public int getLadoA() {
		return ladoA;
	}
	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}
	public int getLadoB() {
		return ladoB;
	}
	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}
	
	public int area() {
		return this.ladoA * this.ladoB;
	}
	
	public int perimetro() {
		return ((this.ladoA * 2) + (this.ladoB * 2));
	}
	
	public boolean esCuadrado() {
		return this.ladoA == this.ladoB;
	}
	
	public String pintarRectangulo() {
		String salida = "";
		if (this.esCuadrado()) {
			for (int i=1; i<=this.ladoB; i++) {
				for (int j=1; j<=this.ladoA; j++) {
					salida+= "* ";
				}
				salida+= "\n";
			}
		} else {
			for (int i=1; i<=this.ladoB; i++) {
				for (int j=1; j<=this.ladoA; j++) {
					salida+= "+ ";
				}
				salida+= "\n";
			}
		}
		
		return salida;
	}

	@Override
	public String toString() {
		return "Rectangulo [ladoA=" + ladoA + ", ladoB=" + ladoB + "]";
	}
	
	
}

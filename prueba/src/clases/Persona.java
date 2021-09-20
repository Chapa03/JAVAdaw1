package clases;

public class Persona {
	private String nombre;
	private float altura;
	private int peso;
	
	public Persona(String nombre, float altura, int peso) {
		this.nombre = nombre;
		this.altura = altura;
		this.peso = peso;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double alturaMasPeso() {
		return this.altura + this.peso;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", altura=" + altura + ", peso=" + peso + "]";
	}
	
	
}

package herencia.ejemplo1;

import java.util.Calendar;

//mamifero es una clase heredada de animal
public class Mamifero extends Animal{
	private String tipoPiel;
	private int mesesGestacion;
	
	public Mamifero() {
		
	}
	
//	esta sobrecarga del constructor, aporta todos los atributos de la subclase y la
//	superclase al objeto tipo Mamifero que creemos con este
	public Mamifero(String nombre, String raza, Calendar fechaNacimiento, String tipoPiel, int mesesGestacion) {
		super(nombre, raza, fechaNacimiento);
		this.tipoPiel = tipoPiel;
		this.mesesGestacion = mesesGestacion;
	}
	
	public Mamifero(String tipoPiel, int mesesGestacion) {
//		con super(), el constructor de una subclase, llama al constructor
//		vacio de la superclase
		super();
		this.tipoPiel = tipoPiel;
		this.mesesGestacion = mesesGestacion;
	}
	
	public String getTipoPiel() {
		return tipoPiel;
	}
	public void setTipoPiel(String tipoPiel) {
		this.tipoPiel = tipoPiel;
	}
	public int getMesesGestacion() {
		return mesesGestacion;
	}
	public void setMesesGestacion(int mesesGestacion) {
		this.mesesGestacion = mesesGestacion;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Mamifero [tipoPiel=" + tipoPiel + ", mesesGestacion=" + mesesGestacion + "]";
	}
	
	
	
}

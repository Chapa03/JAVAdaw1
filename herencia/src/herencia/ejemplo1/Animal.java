package herencia.ejemplo1;

import java.util.Calendar;

public class Animal {
	private String nombre;
	private String raza;
	private Calendar fechaNacimiento;
	
	public Animal() {
		
	}
	
	public Animal(String nombre, String raza, Calendar fechaNacimiento) {
		this.nombre = nombre;
		this.raza = raza;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	@Override
	public String toString() {
//		modifico el tostring para que la fecha de nacimiento me la saque,
//		no por defecto, sino como nos interese, con getTime
		return "Animal [nombre=" + nombre + ", raza=" + raza + ", fechaNacimiento=" + fechaNacimiento.getTime() + "]";
	}
	
	
	
}

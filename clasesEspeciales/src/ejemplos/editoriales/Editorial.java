package ejemplos.editoriales;

public class Editorial {
	private int codigo;
	private String nombre;
	private int year;
	
	public Editorial(int codigo, String nombre, int year) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.year = year;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Editorial [codigo=" + codigo + ", nombre=" + nombre + ", year=" + year + "]";
	}
	
}

package ejemplos.editoriales;

public class Libro {
	private String isbn;
	private String titulo;
	private int precio;
	private int year;
	private Editorial editorial;
	
	public Libro(String isbn, String titulo, int precio, int year, Editorial editorial) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.precio = precio;
		this.year = year;
		this.editorial = editorial;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", precio=" + precio + ", year=" + year + ", editorial="
				+ editorial + "]";
	}
	
}

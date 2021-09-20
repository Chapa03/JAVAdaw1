package ejercicios.menu4;

public class Menu {
	private int idMenu;
	private String menu;
	private String nombreGuardado;
	private int edadGuardada;

	public Menu(int idMenu, String menu) {
		this.idMenu = idMenu;
		this.menu = menu;
	}
	
	public int getIdMenu() {
		return idMenu;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}
	
	
	public String getNombreGuardado() {
		return nombreGuardado;
	}

	public void setNombreGuardado(String nombreGuardado) {
		this.nombreGuardado = nombreGuardado;
	}

	public int getEdadGuardada() {
		return edadGuardada;
	}

	public void setEdadGuardada(int edadGuardada) {
		this.edadGuardada = edadGuardada;
	}

	public void addMenuOptions(Menu m, String nuevaOpcion) {
		this.menu = menu.concat(nuevaOpcion.toUpperCase() + "\n");
	}
	
	public void removeMenuOptions() {
		
	}

	@Override
	public String toString() {
		return "\nMenu " + idMenu + ": \n" + menu;
	}
	
}

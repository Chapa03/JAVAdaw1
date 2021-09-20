package abstractas;

public abstract class CAbstracta {
	private int num;
	
//	un metodo abstracto es un metodo que esta sin definir
//	en la clase padre abstracta y que debe ser implementado
//	y sobrescrito en las clases hijas o heredadas
	abstract public int dimeNumero();
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
}

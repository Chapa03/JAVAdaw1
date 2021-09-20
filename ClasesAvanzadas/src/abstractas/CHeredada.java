package abstractas;

public class CHeredada extends CAbstracta {
//	las clases heredadas de clases abstractas, deben implementar sus 
//	metodos abstractos sobrescritos
	
	@Override
	public int dimeNumero() {
		System.out.println(this.getNum());
		return 0;
	}

}

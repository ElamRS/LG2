package Interface;

public class Pedido implements IList {
	// ItensdeLinha ser do tipo IList cria depend�ncia de Pedido com rela��o a IList
	IList ItensdeLinha[];
	
	// Implementa��o dos m�todos abstratos herdados de ICollection
	public String get() {
		// TODO
		return "";
	}
	
	public void add() {
		// TODO
	}
	
	// Implementa��o do m�todo abstrato get() herdado de IList
	public void equal() {
		// TODO
	}
}

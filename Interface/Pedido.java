package Interface;

public class Pedido implements IList {
	// ItensdeLinha ser do tipo IList cria dependência de Pedido com relação a IList
	IList ItensdeLinha[];
	
	// Implementação dos métodos abstratos herdados de ICollection
	public String get() {
		// TODO
		return "";
	}
	
	public void add() {
		// TODO
	}
	
	// Implementação do método abstrato get() herdado de IList
	public void equal() {
		// TODO
	}
}

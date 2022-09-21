package Complex_Diagram;

public class Source {
	// Atributos
	private String name;
	
	// Agregação com Sequence
	Sequence sequence[] = new Sequence[100];
	
	public void agreg_Sequence() {
		for (int i=0; i<sequence.length; ++i) {
			sequence[i] = new Sequence();
			// TODO
		}
	}
	
	// Métodos de Acesso
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

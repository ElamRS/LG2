package Complex_Diagram;

public class Alignment {
	// Atributos
	private String name;
	private String description;
	
	// Associa��o Reflexiva
	private Alignment alignment[]; 
	
	// M�todos
	public void displayName() {
		System.out.print(name);
	}
	
	// M�todos de Acesso
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Alignment[] getAlignment() {
		return alignment;
	}

	public void setAlignment(Alignment[] alignment) {
		this.alignment = alignment;
	}
}

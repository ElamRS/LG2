package Complex_Diagram;

public class Variation {
	// Atributos
	private String name;
	private String description;
	private String translationType;
	
	// Agregação com PatternLocation
	PatternLocation localizacao_padrao[] = new PatternLocation[1000];
	
	public void method() {
		for (int i=0; i<localizacao_padrao.length; ++i) {
			localizacao_padrao[i] = new PatternLocation();
			// TODO
		}
	}
	
	// Métodos
	public void displayName() {
		System.out.print(name);
	}
	
	public void scannerModuleName() {
		// TODO
	}
	
	// Métodos de Acesso
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

	public String getTranslationType() {
		return translationType;
	}

	public void setTranslationType(String translationType) {
		this.translationType = translationType;
	}
}

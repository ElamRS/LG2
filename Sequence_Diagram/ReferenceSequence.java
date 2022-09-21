package Complex_Diagram;

public class ReferenceSequence {
	// Atributos
	private String name;
	
	// Agregação com FeatureLocation
	FeatureLocation featureloc[] = new FeatureLocation[1];
	
	public void agreg_FeatureLocation() {
		for (int i=0; i<featureloc.length; ++i) {
			featureloc[i] = new FeatureLocation();
			// TODO 
		}
	}
	
	// Métodos
	public void displayName() {
		System.out.print(name);
	}

	// Métodos de Acesso
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

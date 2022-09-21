package Complex_Diagram;

public class Feature {
	// Atributos
	private String name;
	private String description;
	
	// Associa��o com FeatureLocation
	private FeatureLocation location;
	
	// Associa��o Reflexiva
	private Feature feature[]; 
	
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

	public FeatureLocation getLocation() {
		return location;
	}

	public void setLocation(FeatureLocation location) {
		this.location = location;
	}

	public Feature[] getFeature() {
		return feature;
	}

	public void setFeature(Feature[] feature) {
		this.feature = feature;
	}
}

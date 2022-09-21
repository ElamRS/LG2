package Complex_Diagram;

public class Feature {
	// Atributos
	private String name;
	private String description;
	
	// Associação com FeatureLocation
	private FeatureLocation location;
	
	// Associação Reflexiva
	private Feature feature[]; 
	
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

package population_exercise;

public class Population {
	// Atributos de Population
	public String race;
	public String ethnicity;
	public String primary_language;
	public String language_family;
	
	// Associação com Molecular_sample e cardinalidade N
	private Molecular_sample amostra_molecula[];
	// Associação com Geographic_location
	private Geographic_location geo_location;
	// Associação com Taxon e cardinalidade N
	private Taxon taxonomia[];
	
	// Métodos de Population

	// Métodos de Acesso
	public Molecular_sample[] getAmostra_molecula() {
		return amostra_molecula;
	}

	public void setAmostra_molecula(Molecular_sample[] amostra_molecula) {
		this.amostra_molecula = amostra_molecula;
	}
	
	public Geographic_location getGeo_location() {
		return geo_location;
	}

	public void setGeo_location(Geographic_location geo_location) {
		this.geo_location = geo_location;
	}

	public Taxon[] getTaxonomia() {
		return taxonomia;
	}

	public void setTaxonomia(Taxon[] taxonomia) {
		this.taxonomia = taxonomia;
	}
}

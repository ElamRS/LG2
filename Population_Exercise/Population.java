package population_exercise;

public class Population {
	// Atributos de Population
	public String race;
	public String ethnicity;
	public String primary_language;
	public String language_family;
	
	// Associa��o com Molecular_sample e cardinalidade N
	private Molecular_sample amostra_molecula[];
	// Associa��o com Geographic_location
	private Geographic_location geo_location;
	// Associa��o com Taxon e cardinalidade N
	private Taxon taxonomia[];
	
	// M�todos de Population

	// M�todos de Acesso
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

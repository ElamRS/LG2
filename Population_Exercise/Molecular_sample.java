package population_exercise;

public class Molecular_sample {
	// Atributos de Molecular_sample
	public String molecule;
	
	// Associação com Anatomic_location e cardinalidade N
	private Anatomic_location location[];
	// Associação com Population e cardinalidade de min 0 e max 1
	private Population population[] = new Population[1];
	// Auto-Associação e cardinalidade N
	private Molecular_sample amostra_molecula[];
	
	// Métodos de Molecular_sample
	
	// Métodos de Acesso
	public Anatomic_location[] getLocation() {
		return location;
	}

	public void setLocation(Anatomic_location[] location) {
		this.location = location;
	}

	public Population[] getPopulation() {
		return population;
	}

	public void setPopulation(Population[] population) {
		this.population = population;
	}

	public Molecular_sample[] getamostra_molecula() {
		return amostra_molecula;
	}

	public void setAmostra_molecula(Molecular_sample[] outra_amostra_molecula) {
		this.amostra_molecula = outra_amostra_molecula;
	}
}

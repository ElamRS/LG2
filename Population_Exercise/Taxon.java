package population_exercise;

public class Taxon {
	// Atributos de Taxon
	public String rank;
	public String scientific_name;
	
	// Associa��o com Population e cardinalidade N
	private Population population[];
	
	// M�todos de Taxon
	
	// M�todos de Acesso
	public Population[] getPopulation() {
		return population;
	}

	public void setPopulation(Population[] population) {
		this.population = population;
	}
}

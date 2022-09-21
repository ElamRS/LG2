package population_exercise;

public class Taxon {
	// Atributos de Taxon
	public String rank;
	public String scientific_name;
	
	// Associação com Population e cardinalidade N
	private Population population[];
	
	// Métodos de Taxon
	
	// Métodos de Acesso
	public Population[] getPopulation() {
		return population;
	}

	public void setPopulation(Population[] population) {
		this.population = population;
	}
}

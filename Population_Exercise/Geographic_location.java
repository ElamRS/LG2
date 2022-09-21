package population_exercise;

public class Geographic_location {
	// Atributos de Geographic_location
	public double max_longitude;
	public double max_latitude;
	public double min_longitude;
	public double min_latitude;
	
	// Associação com Population e cardinalidade N
	private Population population[];
	
	// Métodos de Geographic_location
	
	// Métodos de Acesso
	public Population[] getPopulation() {
		return population;
	}

	public void setPopulation(Population[] population) {
		this.population = population;
	}
}

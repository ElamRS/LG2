package population_exercise;

public class Geographic_location {
	// Atributos de Geographic_location
	public double max_longitude;
	public double max_latitude;
	public double min_longitude;
	public double min_latitude;
	
	// Associa��o com Population e cardinalidade N
	private Population population[];
	
	// M�todos de Geographic_location
	
	// M�todos de Acesso
	public Population[] getPopulation() {
		return population;
	}

	public void setPopulation(Population[] population) {
		this.population = population;
	}
}

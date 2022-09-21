package population_exercise;

public class Anatomic_location {
	// Associação com Molecular_sample e cardinalidade N
	private Molecular_sample amostra_molecula[];
	
	// Métodos de Anatomic_location
	
	// Métodos de Acesso
	public Molecular_sample[] getAmostra_molecula() {
		return amostra_molecula;
	}

	public void setAmostra_molecula(Molecular_sample[] amostra_molecula) {
		this.amostra_molecula = amostra_molecula;
	}
}

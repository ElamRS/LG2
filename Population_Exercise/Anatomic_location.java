package population_exercise;

public class Anatomic_location {
	// Associa��o com Molecular_sample e cardinalidade N
	private Molecular_sample amostra_molecula[];
	
	// M�todos de Anatomic_location
	
	// M�todos de Acesso
	public Molecular_sample[] getAmostra_molecula() {
		return amostra_molecula;
	}

	public void setAmostra_molecula(Molecular_sample[] amostra_molecula) {
		this.amostra_molecula = amostra_molecula;
	}
}

package population_exercise;

public class Panel extends Population {
	// Atributos de Panel
	public long size;
	public String count_unit;
	public boolean pooled;
	public String type;
	
	// Agrega��o com Individual e cardinalidade N
	Individual individual[];
	// Auto-Associa��o e cardinalidade N
	private Panel painel[];
	
	// M�todos de Panel
	
	// M�todos de Acesso
	public Panel[] getPainel() {
		return painel;
	}
	
	public void setPainel(Panel[] painel) {
		this.painel = painel;
	}
}

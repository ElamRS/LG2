package population_exercise;

public class Panel extends Population {
	// Atributos de Panel
	public long size;
	public String count_unit;
	public boolean pooled;
	public String type;
	
	// Agregação com Individual e cardinalidade N
	Individual individual[];
	// Auto-Associação e cardinalidade N
	private Panel painel[];
	
	// Métodos de Panel
	
	// Métodos de Acesso
	public Panel[] getPainel() {
		return painel;
	}
	
	public void setPainel(Panel[] painel) {
		this.painel = painel;
	}
}

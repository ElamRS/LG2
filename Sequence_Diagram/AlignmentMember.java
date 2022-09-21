package Complex_Diagram;

public class AlignmentMember {
	// Atributos
	private int referenceMember;
	
	// Agregação com AllignedSegment
	private AlignedSegment segmentaligned[];

	// Métodos de Acesso
	public int getReferenceMember() {
		return referenceMember;
	}

	public void setReferenceMember(int referenceMember) {
		this.referenceMember = referenceMember;
	}

	public AlignedSegment[] getSegmentaligned() {
		return segmentaligned;
	}

	public void setSegmentaligned(AlignedSegment[] segmentaligned) {
		this.segmentaligned = segmentaligned;
	}
}

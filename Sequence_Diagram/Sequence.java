package Complex_Diagram;

public class Sequence {
	// Atributos
	private long sequenceID;
	private String format;
	
	// Associação com ReferenceSequence
	private ReferenceSequence refseq;
	
	// Métodos de Acesso
	public long getSequenceID() {
		return sequenceID;
	}
	public void setSequenceID(long sequenceID) {
		this.sequenceID = sequenceID;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public ReferenceSequence getRefseq() {
		return refseq;
	}
	public void setRefseq(ReferenceSequence refseq) {
		this.refseq = refseq;
	}
}

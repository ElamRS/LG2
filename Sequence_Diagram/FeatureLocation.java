package Complex_Diagram;

public class FeatureLocation {
	// Agregação com FeatureSegment
	FeatureSegment segment[] = new FeatureSegment[100];
	// Agregação com Variation
	Variation variation[] = new Variation[1000];
	
	public void agreg_Variation() {
		for (int i=0; i<variation.length; ++i) {
			variation[i] = new Variation();
			// TODO
		}
	}
	
	public void agreg_FeatureSegment() {
		for (int i=0; i<segment.length; ++i) {
			segment[i] = new FeatureSegment();
			// TODO
		}
	}
}

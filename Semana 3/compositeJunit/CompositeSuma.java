package compositeJunit;

public class CompositeSuma extends Composite {
	

	public CompositeSuma(Composite c1, Composite c2) {
		super(c1,c2);
	}


	@Override
	public double getValor() {
		return compositeLeft.getValor() + compositeRight.getValor();
	}

}

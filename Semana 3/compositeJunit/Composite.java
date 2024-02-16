package compositeJunit;

public abstract class Composite {
	
	Composite compositeLeft;
	Composite compositeRight;

	public Composite(Composite c1, Composite c2) {
		compositeLeft = c1;
		compositeRight = c2;
	}

	abstract double getValor();

}

package compositeJunit;

public class LeafConstante extends Composite {
	
	double valor;

	//ESTO NO SE DEBE HACER
	public LeafConstante(double valor) {
		super(null,null);
		this.valor = valor;
	}

	@Override
	public double getValor() {
		return valor;
	}

}

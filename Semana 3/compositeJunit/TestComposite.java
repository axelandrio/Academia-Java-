package compositeJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestComposite {

	@Test
	void test() {
		double d1 = 4.0;
		double d2 = 4.0;
		assertEquals(d1,d2);
	}
	
	@Test
	void testConstante() {
		double valor = 6.0;
		Composite c = new LeafConstante(valor);
		assertEquals(c.getValor(),6.0);
	}
	
	@Test
	void testSuma() {
		double valor1 = 6.0;
		double valor2 = 8.0;
		Composite c1 = new LeafConstante(valor1);
		Composite c2 = new LeafConstante(valor2);
		Composite c3 = new CompositeSuma(c1,c2);
		assertEquals(c3.getValor(),valor1+valor2);
	}
	
	@Test
	void testResta() {
		double valor1 = 6.0;
		double valor2 = 8.0;
		Composite c1 = new LeafConstante(valor1);
		Composite c2 = new LeafConstante(valor2);
		Composite c3 = new CompositeResta(c1,c2);
		assertEquals(c3.getValor(),valor1-valor2);
	}
	
	@Test
	void testMulti() {
		double valor1 = 6.0;
		double valor2 = 8.0;
		Composite c1 = new LeafConstante(valor1);
		Composite c2 = new LeafConstante(valor2);
		Composite c3 = new CompositeMulti(c1,c2);
		assertEquals(c3.getValor(),valor1*valor2);
	}
	
	@Test
	void testDiv() {
		double valor1 = 6.0;
		double valor2 = 8.0;
		Composite c1 = new LeafConstante(valor1);
		Composite c2 = new LeafConstante(valor2);
		Composite c3 = new CompositeDiv(c1,c2);
		assertEquals(c3.getValor(),valor1/valor2);
	}
	
	@Test
	void sumaCompleja() {
		double d1 = 4.0;
		double d2 = 8.0;
		double d3 = 6.0;
		
		Composite c = new CompositeSuma(
				new LeafConstante(d1)
				,
				new CompositeSuma(
						new LeafConstante(d2)
						, 
						new LeafConstante(d3))
				);
		assertEquals(c.getValor(), d1+d2+d3);
	}
	
	@Test
	void sumaCompleja2() {
		double d1 = 2.0;
		double d2 = 3.0;
		double d3 = 4.0;
		double d4 = 8.0;
		double d5 = 6.0;
		
		Composite c = new CompositeMulti(
				new CompositeSuma(
						new LeafConstante(d1)
						,
						new LeafConstante(d2)
						),
				new CompositeResta(
						new LeafConstante(d3), 
						new CompositeDiv(
								new LeafConstante(d4), 
								new LeafConstante(d5)
								)
						)
				); 
		assertEquals(c.getValor(), (d1 + d2) * (d3 - (d4 / d5)));
	}
	
	@Test
	void operacionCompleja2() {
		
		double d1= 2.0;
		double d2= 3.0;
		double d3= 4.0;
		double d4= 8.0;
		double d5= 6.0;
		
		Composite c = new CompositeMulti(
                new CompositeSuma(
                        new LeafConstante(d1),
                        new LeafConstante(d2)
                ),
                new CompositeResta(
                        new LeafConstante(d3),
                        new CompositeDiv(
                                new LeafConstante(d4),
                                new LeafConstante(d5)
                        )
                )
        );
		
		System.out.println(c.getValor());
		
		assertEquals(c.getValor(),13.333,0.001);

	}
	
	@Test
	void resta() {
		double d1 = 5.0;
		double d2 = 7.0;
		double d3 = 3.0;
		
		Composite c = new CompositeResta(
				new LeafConstante(d1),
				new CompositeSuma(
						new LeafConstante(d2),
						new LeafConstante(d3)
						)
				);
		assertEquals(c.getValor(), d1 - (d2 + d3));
	}

}

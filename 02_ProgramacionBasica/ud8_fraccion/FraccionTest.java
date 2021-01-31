package ud8_fraccion;

import static org.junit.Assert.*;

import org.junit.Test;

public class FraccionTest {

	@Test
	public void testInvertir() {
		Fraccion f = new Fraccion(2,3);
		Fraccion r = new Fraccion(3,2);
		
		f = f.invertir();
		
		assertEquals(f, r);		
	}

	@Test
	public void testSimplificar() {
		Fraccion f = new Fraccion(130,195);
		Fraccion r = new Fraccion(2,3);

		f = f.simplificar();
		
		assertEquals(f, r);	
	}

	@Test
	public void testSumarInt() {
		Fraccion f = new Fraccion(2,5);
		Fraccion r = new Fraccion(12,5);
		
		f = f.sumar(2);

		assertEquals(f, r);
	}

	@Test
	public void testSumarFraccion() {
		Fraccion f = new Fraccion(1,14);		
		Fraccion r = new Fraccion(3,7);

		f = f.sumar( new Fraccion(5,14) );
		
		assertEquals(f, r);
	}

	@Test
	public void testRestarInt() {
		Fraccion f = new Fraccion(9,3);
		Fraccion r = new Fraccion();
		
		f = f.restar(2);
		
		assertEquals(f, r);
	}

	@Test
	public void testRestarFraccion() {
		Fraccion f = new Fraccion(9,3);
		Fraccion r = new Fraccion();

		f = f.restar( new Fraccion(2) );
		
		assertEquals(f, r);
	}

	@Test
	public void testDividirInt() {
		Fraccion f = new Fraccion(3,7);
		Fraccion r = new Fraccion(1,7);
		
		f = f.dividir(3);
		
		assertEquals(f, r);
	}

	@Test
	public void testDividirFraccion() {
		Fraccion f = new Fraccion(3,5);
		Fraccion r = new Fraccion();
		
		f = f.dividir( new Fraccion(3,5) );
		
		assertEquals(f, r);
	}

	@Test
	public void testMultiplicarInt() {
		Fraccion f = new Fraccion(3,10);
		Fraccion r = new Fraccion(3,2);
		
		f = f.multiplicar(5);
		
		assertEquals(f, r);
	}

	@Test
	public void testMultiplicarFraccion(){
		Fraccion f = new Fraccion(2,3);
		Fraccion r = new Fraccion(4,9);
		
		f = f.multiplicar(f);
		
		assertEquals(f, r);
	}

	@Test
	public void testMultiplicarFraccionFraccion() {
		Fraccion f = new Fraccion(2,3);
		Fraccion r = new Fraccion(4,9);
		
		f = Fraccion.multiplicar(f, f);
		
		assertEquals(f, r);
	}

}
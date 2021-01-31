package ud8_monedas;

public class Moneda {

	private static final String[] listaLados   = { "Cara", "Cruz" };	
	private static final String[] listaValores = { "1 ctmo", "2 ctmos", "5 ctmos", "10 ctmos",
												   "20 ctmos", "50 ctmos", "1 euro", "2 euros" };
	
	private static final int[] listaPrecios = { 1, 2, 5, 10, 20, 50, 100, 200 };
	
	//Atributos
	private int lado;
	private int valor;	
	
	//Constructor
	public Moneda(int valor, int lado) {
		this.valor = valor;
		this.lado  = lado;
	}

	//Getters and Setters
	public int getValor() {
		return valor;
	}
	
	public int getLado() {
		return lado;
	}

	public int getValorCtmos() {
	
		return this.listaPrecios[this.valor];
	}
	
	//Métodos
	
	@Override
	public String toString() {
		
		return String.format("%8s - %s", listaValores[this.valor], listaLados[this.lado]);
	}

	
	
}
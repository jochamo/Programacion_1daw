package ud11_milpies;

public class MilpiesEsquiador extends Milpies {
	
	protected int numeroDePiesRotos;
	
	public MilpiesEsquiador() {
		numeroDePiesRotos = 100;
	}

	public void escribirPies() {
		System.out.println("A un Milpiés esquiador le quedan " +
				(numeroDePies - numeroDePiesRotos) + " pies");
	}
	
}
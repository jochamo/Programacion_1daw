package ud11_milpies;

public class Milpies {
	
	protected int numeroDePies;
	
	public Milpies() {
		numeroDePies = 1000;
		escribirPies();
	}
	
	public void escribirPies() {
		System.out.println("Un Milpiés o Cochinilla tiene " +
				numeroDePies + " pies");
	}
}
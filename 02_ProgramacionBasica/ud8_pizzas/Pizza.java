package ud8_pizzas;

public class Pizza {

	private static int totalPedidas;
	private static int totalServidas;
	
	private String tamanyo;
	private String tipo;
	private String estado;
	
	public Pizza(String tamanyo, String tipo) {
	
		this.tamanyo = tamanyo;
		this.tipo    = tipo;
		this.estado  = "pedida";
		
		totalPedidas++;
	}
	
	public void sirve() {
		
		if (this.estado.equals("pedida")) {
			this.estado  = "servida";
			totalServidas++;	
		}
		else {
			System.out.println("esa pizza ya se ha servido");
		}		
	}
	
	public static int getTotalPedidas() {
		return totalPedidas;
	}
	
	public static int getTotalServidas() {
		return totalServidas;
	}

	@Override
	public String toString() {
		return "Pizza " + tamanyo + " " + tipo + ", " + estado;
	}
	
}
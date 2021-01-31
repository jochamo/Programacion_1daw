package ud8_vehiculos;

public abstract class Vehiculo {

	//Atributos de clase
	public static int vehiculosCreados;	
	public static double kilometrosTotales;
	
	//Atributos de instancia
	protected double kilometrosRecorridos;

	//Constructor
	public Vehiculo() {
		
		vehiculosCreados++;
		
		this.kilometrosRecorridos = 0;
	}
	
	//Getters and Setters
	public double getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}

	public void setKilometrosRecorridos(double kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}	
	
	//Métodos
	public abstract void andar();
	
	
}
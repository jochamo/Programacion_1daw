package ud8_vehiculos;

public class Bicicleta extends Vehiculo {

	//Constructor
	public Bicicleta() {
		
		super();
		
		
	}	
	
	//Métodos
	
	@Override
	public void andar() {
		
		this.kilometrosRecorridos = this.kilometrosRecorridos + 25;
		
		this.kilometrosTotales += this.kilometrosRecorridos;
	}
	
	public void caballito() {
		
		this.kilometrosRecorridos = this.kilometrosRecorridos + 10;
		
		this.kilometrosTotales += this.kilometrosRecorridos;
	}	

}
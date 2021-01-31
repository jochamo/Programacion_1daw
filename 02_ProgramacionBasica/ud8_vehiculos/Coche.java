package ud8_vehiculos;

public class Coche extends Vehiculo {

	//Constructor
	public Coche() {
	
		super();

	
	}

	//Métodos
	
	@Override
	public void andar() {		
		
		this.kilometrosRecorridos = this.kilometrosRecorridos + 50;		
		this.kilometrosTotales += this.kilometrosRecorridos;
	}
	
	public void quemarRueda() {

		//
	}

}
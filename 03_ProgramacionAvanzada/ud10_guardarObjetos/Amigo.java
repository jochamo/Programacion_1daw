package ud10_guardarObjetos;

import java.io.Serializable;

public class Amigo implements Serializable {

	protected String nombre;
	protected long telefono;
	
	public Amigo(String nombre, long telefono) {
		this.nombre   = nombre;
		this.telefono = telefono;
	}
	
	public void print() {
		System.out.println(nombre + " -> " + telefono);
	}
	
}
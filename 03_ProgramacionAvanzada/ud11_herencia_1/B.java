package ud11_herencia_1;

import java.util.ArrayList;

import ud11_herencia_2.K;

public class B extends A {

	//Atributos
	private int b1;
	protected int b2;
	
	protected ArrayList<K> listaK;
	
	//Constructores
	public B() {
		super();
		
		listaK = new ArrayList<K>();
	}
	
	//Metodos
	
	public void insertarEnListaK(K k) {
		listaK.add(k);
	}
	
	public ArrayList<K> getListaK() {
		return listaK;
	}
	
	@Override
	public void metodoA1() {
	
		//this.a1;
		this.a2++;
		
	}
	
}
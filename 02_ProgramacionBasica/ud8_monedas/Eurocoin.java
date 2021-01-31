package ud8_monedas;

import java.util.ArrayList;
import java.util.Random;

public class Eurocoin {

	//Atributos
	private ArrayList<Moneda> listaMonedas;
	
	//Constructor
	public Eurocoin() {
		listaMonedas = new ArrayList<Moneda>(5);		
	}
	
	//Metodos
	public ArrayList<Moneda> generarListaMonedas(int n){
		
		int valor, lado, cambio; 
		Random r = new Random();
		
		int valorAnterior = r.nextInt(8);
		int ladoAnterior  = r.nextInt(2);
		
		Moneda m = new Moneda( valorAnterior, ladoAnterior );		
		listaMonedas.add(m);	
		
		for (int i = 1; i < n; i++) {
			
			cambio = r.nextInt(100);
			
			if (cambio%2 == 0) {
			
				//
				do {
					valor = r.nextInt(8);	
					
				}while (valor == m.getValor());
				
				//
				lado = m.getLado();
			}
			else {
			
				//
				do {
					lado = r.nextInt(2);	
					
				}while (lado == m.getLado());
				
				//
				valor = m.getValor();
			}
						
			//Generar moneda
			m = new Moneda( valor, lado );
			
			//Insertar moneda en la lista
			listaMonedas.add(m);
		}
	
		return this.listaMonedas;
	}

}
package ud8_monedas;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Moneda> lista;
		
		//Crear maquina Eurocoin
		Eurocoin e = new Eurocoin();
		
		//Generar lista monedas
		lista = e.generarListaMonedas(25);
		
		//Imprimir
		for(Moneda m: lista) {
			System.out.println( m );
		}

	}

}
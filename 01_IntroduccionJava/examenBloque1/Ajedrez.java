package examenBloque1;

import java.util.Scanner;

public class Ajedrez {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Pedimos datos al usuario
		System.out.println("Tamanyo de los escaques:");
		int tamanyo = sc.nextInt(); sc.nextLine();

		System.out.println("Simbolo de los escaques:");
		String simbolo = "" + sc.nextLine().charAt(0);

		//Calcular numero de filas/columnas del tablero
		int ajedrez = 8 * tamanyo;

		//----------------------------------
		//Preparar escaques blanco & negro
		//----------------------------------
		String escaqueBlanco = "";
		String escaqueNegro  = "";
		for (int i = 0; i < tamanyo; i++) {
			escaqueBlanco = escaqueBlanco + " ";
			escaqueNegro  = escaqueNegro  + simbolo;
		}		

		//----------------------------------
		//Preparar filas PAR e IMPAR
		//----------------------------------
		String filaPar   = "|";
		String filaImpar = "|";

		for (int i = 0; i < 4; i++) {

			filaPar   = filaPar   + escaqueBlanco + escaqueNegro;
			filaImpar = filaImpar + escaqueNegro  + escaqueBlanco;
		}

		filaPar   = filaPar   + "|";		
		filaImpar = filaImpar + "|";

		//----------------------------------
		//Preparar PRIMERA y ÚLTIMA fila
		//----------------------------------
		String primera_y_ultima = "|";
		for (int i = 0; i < ajedrez; i++) {
			primera_y_ultima += "-";	
		}
		primera_y_ultima += "|";		
		
		//----------------------------------
		//Imprimir 1era fila
		//----------------------------------
		System.out.println( primera_y_ultima );

		//----------------------------------
		//Imprimir resto de filas
		//----------------------------------
		for (int i = 0; i < 4; i++) {

			//Fila PAR
			for (int x = 0; x < tamanyo; x++) {				
				System.out.println( filaPar );		
			}

			//Fila IMPAR
			for (int y = 0; y < tamanyo; y++) {
				System.out.println( filaImpar );								
			}
		}

		//----------------------------------
		//Imprimir última fila
		//----------------------------------
		System.out.println( primera_y_ultima );

	}

}
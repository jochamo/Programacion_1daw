package examenBloque1;

import java.util.Scanner;

public class Ajedrez3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Pedimos datos al usuario
		System.out.println("Tamanyo de los escaques:");
		int tamanyo = sc.nextInt(); sc.nextLine();

		System.out.println("Tamanyo de los escaques:");
		String simbolo = "" + sc.nextLine().charAt(0);

		//Calcular numero de filas/columnas del tablero
		int ajedrez = 8 * tamanyo;

		//----------------------------------
		//Imprimir 1era fila
		//----------------------------------
		System.out.printf("|");
		for (int i = 0; i < ajedrez; i++) {
			System.out.printf("-");	
		}
		System.out.println("|");			

		//----------------------------------
		//Imprimir resto de filas
		//----------------------------------
		for (int i = 0; i < 4; i++) {

			//Fila par
			for (int x = 0; x < tamanyo; x++) {

				System.out.printf("|");			
				for (int j = 0; j < 4; j++) {				

					for (int k = 0; k < tamanyo; k++) {
						System.out.printf( " " );	
					}
					for (int k = 0; k < tamanyo; k++) {
						System.out.printf( simbolo );
					}					
				}
				System.out.println("|");				
			}

			//Fila impar
			for (int x = 0; x < tamanyo; x++) {

				System.out.printf("|");			
				for (int j = 0; j < 4; j++) {				

					for (int k = 0; k < tamanyo; k++) {
						System.out.printf( simbolo );	
					}
					for (int k = 0; k < tamanyo; k++) {
						System.out.printf( " " );
					}					
				}
				System.out.println("|");				
			}

		}

		//----------------------------------
		//Imprimir última fila
		//----------------------------------
		System.out.printf("|");
		for (int i = 0; i < ajedrez; i++) {
			System.out.printf("-");	
		}
		System.out.println("|");

	}

}
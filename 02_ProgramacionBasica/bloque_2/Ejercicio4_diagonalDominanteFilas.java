package bloque_2;

import ud5_estructurasEstaticas.Ejercicio_3_1_Matrices;

public class Ejercicio4_diagonalDominanteFilas {

	public static void main(String[] args) {

		int[][] a={{10,2,-3,4},{5,21,7,-8},{-9,10,-40,12},{-13,14,-15,51}};

		// Inicializo variables
		int[][] matriz = {{10, 1, 1, 1, 1},
				{1, 10, 1, 1, 1},
				{1, 1, -10, 1, 1},
				{1, 1, 1, 10, 1},
				{1, 1, 1, 1, -10}};

		int suma;
		boolean dominanteXFilas = true;

		// Filas
		for(int i=0 ; i<matriz.length && dominanteXFilas ; i++) {
			suma = 0;
			// Columnas
			for(int j=0; j<matriz.length ; j++) {
				// Sumo los elementos que no están en la diagonal
				if(i != j) {
					suma += Math.abs(matriz[i][j]);
				}
			}

			// Si la condición de dominante por filas deja de cumplirse, termino
			if(Math.abs(matriz[i][i]) <= suma) {
				dominanteXFilas = false;
			}
		}

		// Imprimo la matriz
		Ejercicio_3_1_Matrices.imprimirMatriz(matriz);

		if(dominanteXFilas) {
			System.out.printf("\nEs estrictamente diagonal dominante por filas");
		} else {
			System.out.printf("\nNO es estrictamente diagonal dominante por filas");
		}
	}
}
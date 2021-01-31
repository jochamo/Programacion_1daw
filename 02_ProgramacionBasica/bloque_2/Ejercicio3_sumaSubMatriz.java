package bloque_2;

import ud5_estructurasEstaticas.Ejercicio_3_1_Matrices;

public class Ejercicio3_sumaSubMatriz {

	public static void main(String[] args) {
		
		int[][] matriz = {	{10,  10, 15,  1,  1},
							{10, -10, 15,  1,  1},
							{ 1,   1, 10, 50,  1},
							{ 1,   1,  1, 10,  1},
							{ 1,   1,  1,  1, 10}
						 };

		int suma           = 0;
		boolean encontrado = false;
		int numFila        = 0;
		int numColumna     = 0;

		// Pido matriz
		Ejercicio_3_1_Matrices.imprimirMatriz(matriz);		

		// Recorro matriz
		
		int numFilas    = matriz.length;
		int numColumnas = matriz[0].length;
		
		//
		for(int i=1; i<numFilas && !encontrado; i++) {
			for(int j=1; j<numColumnas && !encontrado; j++) {
				
				//reinicio la suma
				suma = 0;
				
				// Recorro submatriz
				for(int x=0 ; x<i ; x++) {
					for(int y=0 ; y<j ; y++) {
						
						//calculo suma de submatriz
						suma = suma + matriz[x][y];
					}
				}

				//comparar suma de submatriz con el elemento actual
				if(suma == matriz[i][j]) {
					
					encontrado = true;
					numFila    = i;
					numColumna = j;
				}				
			}
		}

		if(encontrado) {
			System.out.printf("\nEl elemento en la posición [%d][%d] = %d, %nes " 
					+ "igual a la suma de elementos de la submatriz %ncomprendida desde"
					+ "[0][0] hasta [%d][%d]", numFila, numColumna, 
					matriz[numFila][numColumna], numFila-1, numColumna-1);
		} else {
			System.out.printf("\nNo se ha encontrado ningún elemento igual " 
					+ "a la suma de elementos de su submatriz");
		}
	}
	
}
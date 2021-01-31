package ud6_programacionEstructurada;

import ud5_estructurasEstaticas.Ejercicio_3_1_Matrices;

public class ExamenNoviembre2018 {

	public static void main(String[] args) {
		
		//matriz molona
		int[][] m = {{1,2,3},{1,2,3},{1,2,3}};
		System.out.println(ejecutaEjercicio(m));
		
		//matriz con numeros
		Ejercicio_3_1_Matrices.imprimirMatrizToGuapo( ejecutaEjercicio(5), '_' );
	}
	
	public static boolean ejecutaEjercicio(int[][] matriz) {
		
		boolean esMolona = true;
		
		
		
		return esMolona;
	}
	
	public static int[][] ejecutaEjercicio(int n){
		
		int[][] m = new int[n][n];	
		
		int numero = n*n;
		
		//Columna 0
		for (int i = 0; i < n; i++) {

			m[i][0] = numero;
			numero--;
		}

		//Columna 1
		for (int i = 0; i < n-1; i++) {

			m[i][1] = m[i][0] - 15;
			numero--;			
		}

		//Columna 2
		for (int i = 0; i < n-2; i++) {

			m[i][2] = m[i][1] - 7;
			numero--;			
		}

		return m;
	}

}

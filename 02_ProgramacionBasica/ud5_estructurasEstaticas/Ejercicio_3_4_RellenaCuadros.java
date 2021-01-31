package ud5_estructurasEstaticas;

public class Ejercicio_3_4_RellenaCuadros {

	public static void main(String[] args) {

		int[][] miMatriz;

		//1.-
		miMatriz = rellenaCuadros();
		Ejercicio_3_1_Matrices.imprimirMatriz(miMatriz);
		
		//2.-
		int n = 6;
		miMatriz = rellenaCuadros(n);
		Ejercicio_3_1_Matrices.imprimirMatriz(miMatriz);
		
		//3.-
		miMatriz = rellenaCuadros(n, 27, 15, 39, 51);
		Ejercicio_3_1_Matrices.imprimirMatriz(miMatriz);
		
	}
	
	public static int[][] rellenaCuadros(){

		int[][] matriz = rellenaCuadros(4, 1, 2, 3, 4);

		return matriz;
	}

	public static int[][] rellenaCuadros(int tamanyo){

		int[][] matriz = rellenaCuadros(tamanyo, 1, 2, 3, 4);
		
		return matriz;
	}

	public static int[][] rellenaCuadros(int tamanyo, int a, int b, int c, int d){

		int[][] matriz = new int[tamanyo][tamanyo];

		int mitad = tamanyo / 2;

		//1.- Cuadrante superior izquierdo
		for (int i = 0; i < mitad; i++){
			for(int j = 0; j < mitad; j++){
				matriz[i][j] = a;				
			}
		}

		//2.- Cuadrante superior derecho
		for (int i = 0; i < mitad; i++){
			for(int j = mitad; j < tamanyo; j++){
				matriz[i][j] = b;
			}
		}

		//3.- Cuadrante inferior izquierdo
		for (int i = mitad; i < tamanyo; i++){
			for(int j = 0; j < mitad; j++){
				matriz[i][j] = c;
			}
		}

		//4.- Cuadrante inferior izquierdo
		for (int i = mitad; i < tamanyo; i++){
			for(int j = mitad; j < tamanyo; j++){
				matriz[i][j] = d;
			}
		}

		return matriz;
	}

}
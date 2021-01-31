package ud5_estructurasEstaticas;

public class Ejercicio_3_3_CuadradoMagico {

public static void main(String[] args) {
		
		int[][] miMatriz11 = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] miMatriz13 = {{8,1,6}, {3,5,7}, {4,9,2}};
		int[][] miMatriz15 = {{16,3,2,13}, {5,10,11,8}, {9,6,7,12}, {4,15,14,1}};

		Ejercicio_3_1_Matrices.imprimirMatriz(miMatriz11);
				
		if (cuadradoMagico(miMatriz11)){
			System.out.println("La matriz 11 SI es un cuadrado mágico");
		}
		else{
			System.out.println("La matriz 11 NO es un cuadrado mágico");
		}
		
		Ejercicio_3_1_Matrices.imprimirMatriz(miMatriz13);
		
		if (cuadradoMagico(miMatriz13)){
			System.out.println("La matriz 13 SI es un cuadrado mágico");
		}
		else{
			System.out.println("La matriz 13 NO es un cuadrado mágico");
		}
		
		Ejercicio_3_1_Matrices.imprimirMatriz(miMatriz15);
		
		if (cuadradoMagico(miMatriz15)){
			System.out.println("La matriz 15 SI es un cuadrado mágico");
		}
		else{
			System.out.println("La matriz 15 NO es un cuadrado mágico");
		}		
	}	

	public static boolean cuadradoMagico(int[][] cuadrado){

		//1.- Calcular SUMA fila 1
		int sumaFila1 = 0;
		for (int i = 0; i < cuadrado.length; i++){			
				sumaFila1 = sumaFila1 + cuadrado[0][i];
		}
		
		//2.- Comprobar Filas, Columnas, Diagonal 1 y Diagonal 2
		boolean esMagico = ( (comprobarFilas(cuadrado, sumaFila1)) && 
							 (comprobarColumnas(cuadrado, sumaFila1)) &&
							 (comprobarDiagonal1(cuadrado, sumaFila1)) &&
							 (comprobarDiagonal2(cuadrado, sumaFila1)) );
		
		return esMagico;
	}
	
	public static boolean comprobarFilas(int[][] cuadrado, int res){
	
		boolean igual = true;
		int suma;
		
		for(int i=0; i<cuadrado.length; i++){
			suma = 0;
			for(int j=0; j<cuadrado.length; j++){
				suma = suma + cuadrado[i][j];
			}
			if(suma!=res){
				igual = false;
				break;
			}
		}
		return igual;
	}
	
	public static boolean comprobarColumnas(int[][] cuadrado, int res){
		
		boolean igual = true;
		int suma;
		
		for(int i=0; i<cuadrado.length; i++){
			suma = 0;
			for(int j=0; j<cuadrado[0].length; j++){
				suma = suma + cuadrado[j][i];
			}
			if(suma!=res){
				igual = false;
				break;
			}
		}		
		return igual;
	}
	
	public static boolean comprobarDiagonal1(int[][] cuadrado, int res){
		
		boolean igual = true;
		int suma = 0;
		
		for(int i=0; i<cuadrado.length; i++){
			suma = suma + cuadrado[i][i];
		}
		if(suma!=res){
			igual = false;		
		}
		
		return igual;
	}
	
	public static boolean comprobarDiagonal2(int[][] cuadrado, int res){
		
		boolean igual = true;
		int suma = 0;

		//for(int i=0; i<cuadrado.length; i++){
		//	suma = suma + cuadrado[i][cuadrado.length - 1 - i];
		//}		
		
		for(int i=0, j=cuadrado.length-1; i<cuadrado.length; i++, j--){
			suma = suma + cuadrado[i][j];
		}		
		
		if(suma!=res){
			igual = false;		
		}
		
		return igual;
	}
	
}
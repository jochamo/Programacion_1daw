package examenes;

import java.util.Scanner;

public class DeAlumnos_Borrar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		
		int[][] m = matricesCuriosas(5);
		
		for (int i = 0; i < m.length; i++) {
			
			for (int j = 0; j < m.length; j++) {
				System.out.printf("%5d", m[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static int[][]matrizCuriosa(int n){

		int [][] matriz = new int [n][n];
		int num = 0;
		int contador = 0;
		int columnas = matriz[0].length;


		while (contador < matriz[0].length) {

			for (int i = 0; i < columnas; i++) {

				matriz[i+contador][i] = num ++;

			}
			contador++;
			columnas--;
		}

		return matriz;	

	}

	
	public static int[][] generarCuriosa(int n) {
		
		int[][] matriz = new int[n][n];		
		int contador   = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0, aux = i; j < matriz.length && aux < matriz.length; j++, aux++) {
				
				contador++;
				matriz[j][aux] = contador;				
			}
		}
		
		return matriz;		
	}

	public static int[][] matricesCuriosas(int n) {

		int valor = 1;

		int[][] matriz = new int[n][n];

		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (j < i) {
					matriz[i][j] = 0;
				} else if (i == j) {
					matriz[j][i] = valor;
					valor++;
				}
				else {
					matriz[i][j] = matriz[i][j - 1] + n - j + i + 1;
				}
			}
		}

		return matriz;
	}

	
		
}
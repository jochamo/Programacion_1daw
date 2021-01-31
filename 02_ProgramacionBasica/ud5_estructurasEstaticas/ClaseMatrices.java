package ud5_estructurasEstaticas;

import java.util.Scanner;

public class ClaseMatrices {

	public static void main(String[] args) {
	

		
		boolean[] v;
		double[][] m;
		
		
		int[] v1 = {1,2,3};
		int[][] m1 = { {1,2,3}, {4,5,6} }; 
		
		int filas = 4;
		int columnas = 6;
		
		int[][] m2 = new int[filas][columnas];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dime num-");
		for (int i = 0; i < filas; i++) {			
			
			for (int j = 0; j < columnas; j++) {
				
				m2[i][j] = sc.nextInt();				
			}
			
		}
		
		
		
		for (int i = 0; i < filas; i++) {			
			
			
			for (int j = 0; j < columnas; j++) {
				
				System.out.printf("%4d", m2[i][j]);								
			}
			
			System.out.printf("%n");
			
		}


		
		
		

	}

}
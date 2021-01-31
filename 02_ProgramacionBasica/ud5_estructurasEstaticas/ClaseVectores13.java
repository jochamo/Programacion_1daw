package ud5_estructurasEstaticas;

import java.util.Scanner;

public class ClaseVectores13 {

	public static void main(String[] args) {
		
		int[] v;		
		//v = rellenarVector( 5 );
		//imprimirVector(v);
		//imprimeRaro(v);
		/*
		char[] c;		
		
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		
		c = letras.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			
			System.out.println(c[i]);
			
		}
		*/

		v = intercambiarPosiciones();
		
		imprimirVector(v);
	}	
	
	public static int[] intercambiarPosiciones() {
		
		int[] v = {4, 9};		
		
		//1.- Intercambiar CON auxiliar		
		//int aux;		
		//aux = v[1];
		//v[1] = v[0];
		//v[0] = aux;		
		
		//2.- Intercambiar SIN auxiliar
		
		
		v[0] = v[0] + v[1];
		//v = {13, 9};
		
		v[1] = v[0] - v[1]; // v[0] + v[1] - v[1] = v[0]
		//v = {13, 4}
		
		v[0] = v[0] - v[1];
		//v = {9, 4}
		
				    
		return v;
		
		/**
		 * Intercambio de valores entre dos variables sin utilizar variable auxiliar.
		 * En ese caso se resuelve utilizando aritmética básica:
		 * 
		 * A = 4, B = 9
		 * 
		 * A = A + B;
		 * B = A - B;
		 * A = A - B;
		 * 		 
		 * A = B - A;
		 * B = B - A;
		 * A = A + B;
		 *  
		 * 
		 * Si por ejemplo A = 5 y B = 3
		 * 
		 * A = 5 + 3 = 8
		 * B = 8 - 3 = 5
		 * A = 8 - 5 = 3
		 * 
		 * */

		//A la posición v[0] le asigno el valor de v[0] + v[1]
		//v[0] = v[0] + v[1]; 
		//En este paso el valor de v[0] es = 13 (4 + 9)

		//A v[1] le asigno el resultado de resta al valor calculado anteriormente de v[0] con el valor inicial de v[1]
		//v[1] = v[0] - v[1]; 
		//En este paso el valor de v[1] es = (4 + 9) – 9 = 4  
		//v[1] = v[0] – v[1] = (4 + 9) – 9 

		//Y una vez realizado el cálculo de v[1] le resto el valor v[0] la variable de v[0] el nuevo valor de v[1]
		//v[0] = v[0] - v[1];
		//    (4 + 9) - 4

	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int[] rellenarVector( int n ) {
		
		int[] v = new int[n];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime numeros:");
		for (int i = 0; i < v.length; i++) {
			
			v[i] = sc.nextInt();
		}
		
		return v;		
	}	
	
	public static void imprimirVector( int[] v ) {
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
		
	}
	
	
	
	public static void imprimeRaro(int[] v) {
		
		
		for (int i = 0, j=v.length-1 ; i < v.length; i++, j--) {
			
			
			System.out.println(v[i] + " - " + v[j]);
			
		}
		
		
	}
	
	public static int maximoNumero(int[] miVector){

		int max = miVector[0];

		//Buscar el mayor elemento
		for (int i = 1; i < miVector.length; i++) {
			if (miVector[i] > max){
				max = miVector[i];
			}
		}
		return max;
	}
	
}
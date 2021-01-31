package bloque_1;

import java.util.Scanner;

public class Ejercicio02_SumaNenteros {

	public static void main(String[] args) {
		
		/**
		 * Se pide representar el algoritmo que nos calcule la suma de 
		 * los N primeros números naturales. N se leerá por teclado 
		 * (no tenemos porque llamar a la variable N, podemos llamarla como queramos).
		 */
		
		//
		int n;
		int suma = 0;

		//La variable "sc" se usará para leer los datos
		Scanner sc = new Scanner(System.in);

		//Preguntar el valor de N
		System.out.println("Introducir valor de N: ");    	    

		//Leer un entero
		n = sc.nextInt();

		//Bucle para sumar N veces
		for (int i = 1; i < n+1; i++) {
						
			suma = suma + i;
		}
		
		//Imprimir resultado
		System.out.println("La suma de los " + n + " primeros números es: " + suma);
	}

}
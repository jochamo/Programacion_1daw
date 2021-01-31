package bloque_1;

import java.util.Scanner;

public class Ejercicio05_MediaHastaMenos1 {

	public static void main(String[] args) {

		/**Dada una secuencia de números leídos por teclado, que 
		 * acabe con un –1,por ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,...,-1; 
		 * Realizar el algoritmo que calcule la media aritmética. 
		 * Suponemos que el usuario no insertara numero negativos.
		 */

		//Declaración de variables
		Scanner sc = new Scanner(System.in);	    
		int a = 0;
		int i = 0;
		int suma = 0;
		double media = 0;
		boolean masNumeros = true;

		//Pedir los números al usuario e informar de como terminar 
		System.out.println("Introducir los números para calcular la media: ");
		System.out.println("NOTA: para terminar introduzca -1");	    

		while (masNumeros) {

			//Leer un entero
			a = sc.nextInt();	

			//Si se ha introducico un -1...
			if (a == -1) {
				//...se terimna de pedir números...
				masNumeros = false;
			}
			else{
				//...sinó, se suma el número
				suma = suma + a;
				i++;
			}		    
		}

		//Calcular la media
		media = (double) suma / i;

		//Mostrar resultado
		System.out.println("La media de los " + i + " números introducidos es: " + media);	    
	}
	
}
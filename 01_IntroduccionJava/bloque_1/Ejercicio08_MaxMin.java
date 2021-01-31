package bloque_1;

import java.util.Scanner;

public class Ejercicio08_MaxMin {

	public static void main(String[] args) {

		/**Algoritmo que lea números enteros hasta teclear 0, 
		 * y nos muestre el máximo, el mínimo y la media de todos 
		 * ellos. Piensa como debemos inicializar las variables.
		 */

		//Declaración de variables
		Scanner sc = new Scanner(System.in);	    
		int a = 0;
		int i = 0;
		int suma = 0;
		int max = 0;	    
		int min = Integer.MAX_VALUE;
		boolean masNumeros = true;

		//
		System.out.println("Introducir los números para calcular la media: ");
		System.out.println("NOTA: para terminar introduzca 0");	    

		//Mientras no se introduzca un 0...
		while (masNumeros) {

			//Leer un entero
			a = sc.nextInt();

			//Si a es igual a 0...
			if (a == 0) {
				//...ya no se piden más números
				masNumeros = false;
			}
			else{
				//Calcuar la suma de los números para la media
				suma = suma + a;

				//Si a es mayor que el actual máximo...
				if(a > max){
					//...a es el nuevo máximo
					max = a;
				}

				//Si a es menor que el actual mínimo...
				if(a < min){
					//...a es el nuevo mínimo
					min = a;
				}
				i++;
			}		    
		}

		//Mostrar resultado
		System.out.println("La media de los " + i + " números introducidos es: " + suma / i);
		System.out.println("El máximo de los números introducidos es: " + max);
		System.out.println("El mínimo de los números introducidos es: " + min);	    
	}

}
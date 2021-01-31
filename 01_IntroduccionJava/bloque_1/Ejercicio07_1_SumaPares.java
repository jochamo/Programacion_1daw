package bloque_1;

import java.util.Scanner;

public class Ejercicio07_1_SumaPares {

	/**
	 * Se pide representar el algoritmo que nos calcule la suma 
	 * de los N primeros números pares. Es decir, si insertamos 
	 * un 5, nos haga la suma de 6+8+10+12+14.	 * 
	 */

	public static void main(String[] args) {	

		//
		int a = 0;
		int n = 0;
		int suma = 0;

		//La variable "sc" se usará para leer los datos
		Scanner sc = new Scanner(System.in);

		//Preguntar el valor de A
		System.out.println("Introducir valor de A: ");    	    

		//Leer un entero
		a = sc.nextInt(); 

		//Copia para el for	    
		n = a;

		//Si el número es impar, sumar 1
		if (a%2 != 0){
			a++;
		}

		//Imprimir mensaje
		System.out.println("La suma de los " + n + " primeros números pares es: ");

		//Bucle para sumar N veces
		for(int i=0; i<n; i++){

			if (i == n-1){
				System.out.print( a + " " );
			}
			else{
				System.out.print( a + " + ");
			}

			//
			suma = suma + a;

			//Para sumar los PARES
			a = a + 2;	    	
		}

		//
		System.out.println("= " + suma);		

	}

}
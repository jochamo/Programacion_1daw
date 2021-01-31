package bloque_1;

import java.util.Scanner;

public class Ejercicio07_2_SumaPares {

public static void main(String[] args) {
		
		int i = 0;
		int n = 0;
		int num = 0;
		int suma = 0;
		
		/**
		 * Se pide representar el algoritmo que nos calcule la suma 
		 * de los N primeros números pares. Es decir, si insertamos 
		 * un 5, nos haga la suma de 6+8+10+12+14.	 * 
		 */
		
		//sc se usará para leer los datos
	    Scanner sc = new Scanner(System.in);
	     
	    //Preguntar el valor de A
	    System.out.println("Introducir un número: ");    	    
	    
	    //Leer un entero
	    n = sc.nextInt();
	    
	    num = n;
	    
	    while (i<n){
	    	
	    	if (num%2==0){
	    		suma = suma + num;
	    		i++;
	    	}
	    	num++;	    	
	    }
	    
	    System.out.println("La suma es " + suma);
	    		
	}

}
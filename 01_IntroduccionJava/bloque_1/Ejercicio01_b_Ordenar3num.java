package bloque_1;

import java.util.Scanner;

public class Ejercicio01_b_Ordenar3num {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
	    System.out.println("Introducir el valor de A:");
	    a = sc.nextInt();
	    
	    System.out.println("Introducir el valor de B:");
	    b = sc.nextInt();
	    
	    System.out.println("Introducir el valor de C:");
	    c = sc.nextInt();
	    
	    if (a > b) {
	    	if(a > c) {
	    		if(b > c) {
	    			System.out.println( a + " - " + b + " - " + c );
	    		}
	    		else {
	    			System.out.println( a + " - " + c + " - " + b );
	    		}
	    	}
	    	else {
	    		System.out.println( c + " - " + a + " - " + b );	    		
	    	}
	    }
	    else {
	    	if(b > c) {
	    		if(a > c) {
	    			System.out.println( b + " - " + a + " - " + c );	    				
	    		}
	    		else {
	    			System.out.println( b + " - " + c + " - " + a );	    			
	    		}
	    	}
	    	else {
	    		System.out.println( c + " - " + b + " - " + a );
	    	}	    	
	    }
	}

}
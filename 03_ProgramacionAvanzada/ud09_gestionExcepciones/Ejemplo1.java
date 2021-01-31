package ud09_gestionExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
				
		sumar();		
	}
	
	public static void sumar(){

		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 3;
		
		try{
			
			System.out.println("Introducir valor de A: ");
			a = sc.nextInt();
			System.out.println("Introducir valor de B: ");
			b = sc.nextInt();	
			
			//Mostrar la suma
			System.out.println("La suma de a y b es " + (a+b) );
			
		}		
		catch(InputMismatchException e){
			
			System.out.println("No es un numero.");		
			
		}		
		finally{
			
			System.out.println("Esto se ejecuta siempre...");			
		}	
		
	}

}
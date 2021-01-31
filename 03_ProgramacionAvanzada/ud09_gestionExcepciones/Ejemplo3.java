package ud09_gestionExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {

		sumar();		
	}
	
	public static void sumar() {

		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		try{
			
			System.out.println("Introducir valor de A: ");
			a = sc.nextInt();
			
			if (a < 0) {
				throw new NegativoException();
			}				 
			
			System.out.println("Introducir valor de B: ");
			b = sc.nextInt();
			
		}
		catch(InputMismatchException e){
			System.out.println("no es un numero");	
			
		} 
		catch (NegativoException e) {
			System.out.println( e.excErrorPersonalizado() );
			
		}
		finally{
			System.out.println("esto se ejecuta siempre");
			//Mostrar la suma
			System.out.println("La suma de a y b es " + (a+b) );
		}	
		
		
		
	}

}
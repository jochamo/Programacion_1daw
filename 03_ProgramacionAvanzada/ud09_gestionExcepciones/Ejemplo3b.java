package ud09_gestionExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo3b {

	public static void main(String[] args) {

		
		try {
			
			f1();
			
		} catch (NegativoException e) {
			
			System.out.println( e.excErrorPersonalizado() );
		}
		catch(InputMismatchException e){
			
			System.out.println("No ha introducido un numero...");			
		} 
		
	}
	
	public static void f1() throws NegativoException {
		
		sumar();
		
	}
	
	public static void sumar() throws InputMismatchException, NegativoException{

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
		catch (NegativoException e) {
			System.out.println( e.excErrorPersonalizado() );
			
		}
		finally{
			System.out.println("Esto se ejecuta siempre:");			
		}
		
		//Mostrar la suma
		System.out.println("La suma de a y b es " + (a+b) );		
	}

}
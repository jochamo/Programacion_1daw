package ud09_ejercicio4;

import java.util.InputMismatchException;

public class Ejercicio4 {

	public static void main(String[] args) {

		/*
		 * Ejercicio 4
		 * 
		 * Indicar qué aparece por pantalla si en los puntos suspensivos marcados se
		 * producen las siguientes excepciones:
		 * 
		 */
				
		try {
			metodo1();
			metodo2();
			metodo3();			
		}		
		catch (Excepcion1 e) { 
			System.out.println("texto1");
		}
		catch (Excepcion2 e) { 
			System.out.println("texto2");
		}
		catch (Excepcion3 e) { 
			System.out.println("texto3");
		}
		catch (InputMismatchException e) {
			System.out.println("texto4");
		}
		finally { 
			System.out.println("texto5 "); 
		}
	}

	public static void metodo1() throws Excepcion1, Excepcion2 {
		//... (1)
		
		//a) En (1) la excepción de usuario Excepcion1.
		//throw new Excepcion1();
		
		//b) En (1) la excepción unchecked IndexOutOfBoundsException.
		//int[] v = new int[5];
		//v[10] = 7;				
		
		//c) En (1) la excepción de usuario Excepcion2.
		//throw new Excepcion2();
	}

	public static void metodo2() {
		try {
			//... (2) 
			
			//d) En (2) la excepción unchecked InputMismatchException.
			//throw new InputMismatchException();
			
			//e) En (2) la excepción unchecked IndexOutOfBoundsException.		
			//throw new IndexOutOfBoundsException();	

		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("texto0"); 
		}
	}
	
	public static void metodo3() throws Excepcion3, Excepcion1 {
		//... (3)
	
		//f) En (3) la excepción de usuario Excepcion3.
		//throw new Excepcion3();		
		
		//g) En (3) la excepción unchecked InputMismatchException.		
		//throw new InputMismatchException();
		
	}

}
package ud09_gestionExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		/*
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		try{				
			sumar();			
		}
		catch(InputMismatchException e){
			System.out.println("No se ha podido efectuar la suma");			
		}		
		
	}
	
	public static void sumar() throws InputMismatchException {

		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;

		System.out.println("Introducir valor de A: ");
		a = sc.nextInt();
		System.out.println("Introducir valor de B: ");
		b = sc.nextInt();
		
		//Mostrar la suma
		System.out.println("La suma de a y b es " + (a+b) );

	}	
}
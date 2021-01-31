package ud09_gestionExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = leerEnteroPositivo( sc );
		System.out.println( a );
		
	}

	public static int leerEnteroPositivo(Scanner t) {
		
		boolean salir = false;
		int leido = 0;
		
		do {
			
			try {
				System.out.print("Introduce un entero positivo: ");
				leido = t.nextInt();
				if (leido<0)
					System.out.println("Error: no es positivo");
				else 
					salir = true;
			}
			catch (InputMismatchException e) {
				System.out.println("Error: no es un entero");
			}
			finally {
				//finally OBLIGATORIO para continuar leyendo INT
				t.nextLine();
			}
			
		} while(!salir);
		
		
		return leido;
	}

}

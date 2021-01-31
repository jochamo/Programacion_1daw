package bloque_1;

import java.util.Scanner;

public class Ejercicio06_Eureka {

	public static void main(String[] args) {

		/**Teniendo en cuenta que la clave es “eureka”, 
		 * escribir un algoritmo que nos pida una clave. 
		 * Solo tenemos 3 intentos para acertar, si fallamos 
		 * los 3 intentos nos mostrara un mensaje indicándonos 
		 * que hemos agotado esos 3 intentos. 
		 * (Recomiendo utilizar un interruptor).
		 *  Si acertamos la clave, saldremos directamente del programa.
		 */

		String clave;

		//La variable "sc" se usará para leer los datos
		Scanner sc = new Scanner(System.in);

		int i = 0;
		boolean correcto = false;

		//El bucle terminará cuando i<3 ó cuando la clave sea correcta
		while (i < 3 && !correcto){
			
			//Preguntar por la clave
			System.out.println("Dime la clave...");    	    
			clave = sc.nextLine();

			//Si la clave es correcta...
			if (clave.equals("eureka")){
				//...marcar que es correcto y mostrar por pantalla
				correcto = true;
				System.out.println("CORRECTO");
			}	    	
			i++;
		}

		//Si ha salido del bucle sin ser correcto...
		if (!correcto){
			//...es porque se han escrito 3 contraseñas incorrectas
			System.out.println("Has agotado los 3 intentos");
		}		
		
	}
	
}
package ud4_estructurasDeControl_Diagramas;

import java.util.Scanner;

public class Potencia {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//Declarar variables
		int b;
		int n;
		int r = 1;

		//Preguntar valor de B
		System.out.println("Dime el numero real");

		//Leer valor de B
		b = sc.nextInt();
		
		//Preguntar valor de N
		System.out.println("Dime a cuanto la quieres elevar");

		//Leer valor de N
		n = sc.nextInt();
		
		if(n <= 0) {
			System.out.println("No has seleccionado un numero correcto");
		}else {
			
			//
			for(int i=0; i<n;i++){
				r=r*b;
			}
			
			//
			System.out.println("La potencia ("+n+") de "+b+" es "+r);
		}	
	}
}
package ud4_estructurasDeControl;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
			
		
		
		boolean otroNombre = true;
		
		//pasan muchas cosas		
		
		int x = 1;
		
		while ( otroNombre ) {
			
			x++;
			
			if (x > 10) {
				otroNombre = false;	
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime num1:");
		int num1 = sc.nextInt();
		
		System.out.println("Dime num2:");
		int num2 = sc.nextInt();
		
		if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
			System.out.println("El producto de los dos números es negativo");
		}
		else {
			System.out.println("El producto de los dos números es positivo o nulo");			
		}				
	}

}
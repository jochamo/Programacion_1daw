package ud09_gestionExcepciones;

import java.util.Scanner;

public class Ejemplo4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el número de mediciones: ");
		
		int num = sc.nextInt();
		
		double[] resultado;
		
		try {
			resultado = new double[num];
		}
		catch (NegativeArraySizeException e) {
			
			System.out.println("Se ha producido el error " + e );
			System.out.println(num + "<0 --> se le cambia el signo.");			
			System.out.println("Array de " + (-num) + " elementos.");
			num *= -1;
			resultado = new double[num];
		}		
	}
}
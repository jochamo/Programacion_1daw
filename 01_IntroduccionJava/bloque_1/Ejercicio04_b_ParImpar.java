package bloque_1;

import java.util.Scanner;

public class Ejercicio04_b_ParImpar {

	public static void main(String[] args) {
		
		int a = 0;
		int resto = 0;

		//La variable "sc" se usará para leer los datos
		Scanner sc = new Scanner(System.in);

		do{	    	
			//Preguntar el valor de A
			System.out.println("Introducir valor de A: ");    	    

			//Leer un entero
			a = sc.nextInt();

		}while (a == 0);

		//Calcular el resto
		resto = a % 2;

		//Si el resto es 0...
		if (resto == 0){
			//...el número es par...
			System.out.println(a + " es par");
		}
		else{
			//...sinó, el número es impar
			System.out.println(a + " es impar");
		}
	}
	
}
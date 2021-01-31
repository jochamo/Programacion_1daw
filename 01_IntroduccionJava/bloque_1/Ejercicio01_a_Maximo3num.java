package bloque_1;

import java.util.Scanner;

public class Ejercicio01_a_Maximo3num {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;

		//La variable "sc" se usará para leer los datos
		Scanner sc = new Scanner(System.in);

		//Preguntar el valor de A
		System.out.println("Introducir valor de A: ");    	    

		//Leer un entero
		a = sc.nextInt();	    

		//Preguntar el valor de B
		System.out.println("Introducir valor de B: ");

		//Leer un entero
		b = sc.nextInt();

		//Preguntar el valor de C
		System.out.println("Introducir valor de C: ");

		//Leer un entero
		c = sc.nextInt();

		if (a==b || a==c || b==c) {
			System.out.println("Existen valores duplicados");
		} 
		else {
			if (a>b && a>c) {
				System.out.println("A es el mayor");
			} 
			else {
				if (b>a && b>c) {
					System.out.println("B es el mayor");
				} 
				else {
					System.out.println("C es el mayor");
				}
			}
		}
	}
}
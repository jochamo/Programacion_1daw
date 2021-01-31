package bloque_1;

import java.util.Scanner;

public class Ejercicio04_a_ParImpar {

	public static void main(String[] args) {
	
		int a = 0;

		//La variable "sc" se usará para leer los datos
		Scanner sc = new Scanner(System.in);

		//Preguntar el valor de A
		System.out.println("Introducir valor de A: ");    	    

		//Leer un entero
		a = sc.nextInt();	    

		//Si ha introducido un 0...
		if (a == 0){
			//...no es ni par ni impar...
			System.out.println("El número introducido no es ni par ni impar");
		} 
		else {
			//...sinó, comprobar si es par o no...
			if(a%2 == 0){
				System.out.println("El número introducido es par");
			}
			else {
				System.out.println("El número introducido es impar");
			}
		}
	}
	
}
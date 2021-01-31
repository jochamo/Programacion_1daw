package bloque_1;

import java.util.Scanner;

public class Ejercicio03_PotenciaRaiz {

	public static void main(String[] args) {

		int a = 0;

		//La variable "sc" se usará para leer los datos
		Scanner sc = new Scanner(System.in);

		//Preguntar el valor de A
		System.out.println("Introducir valor de A: ");    	    

		//Leer un entero
		a = sc.nextInt();

		//Si el número es 0 o negativo...
		if (a < 1) {
			//...mostrar ERROR...
			System.out.println("ERROR: Introduzca un número mayor a 0");
		}  
		else {
			//...sinó, mostrar el cuadrado...
			System.out.println("El cuadrado del valor es: "+ a*a);
			
			//...y la raiz
			System.out.println("La raiz del valor es: "+ Math.pow(a, 0.5));			
		}
	}
	
}
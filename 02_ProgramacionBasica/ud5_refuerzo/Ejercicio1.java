package ud5_refuerzo;

import java.util.Scanner;

public class Ejercicio1 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//Pedir al usuario una frase
		System.out.println("Introduce una frase:");
		String cadena = sc.nextLine();
		
		//Crear vector con tamaño igual al tamaño de la cadena
		char[] miVector = new char[cadena.length()];
		
		//Pasar de String a Vector
		for (int i = 0; i<cadena.length(); i++){			
			miVector[i] = cadena.charAt(i);			
		}
		
		//char[] miVector = cadena.toCharArray();
		
		//Imprimir vector
		for (int i = 0; i<miVector.length; i++){
			System.out.printf("%s", miVector[i]);
		}
	}

}
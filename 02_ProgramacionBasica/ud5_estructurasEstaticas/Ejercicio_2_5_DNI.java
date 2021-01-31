package ud5_estructurasEstaticas;

import java.util.Scanner;

public class Ejercicio_2_5_DNI {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//Pedir al usuario el tamaño del vector
		System.out.println("Introduce el número del DNI: ");
		int dni = sc.nextInt();
				
		char letraDNI = calcularLetraDNI(dni);
		
		System.out.println("La letra de tu DNI es: " + letraDNI);
	}
	
	public static char calcularLetraDNI(int dni){
		
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};		
		
		//String letrasStr = "TRWAGMYFPDXBNJZSQVHLCKE";
		//char[] letras    = letrasStr.toCharArray();
		
		int resto = dni % 23;
		
		return letras[resto];
	}
	
	public static char calcularLetraDNI(int dni, int a){
		
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
		return letras[dni % 23];
	}
	
}
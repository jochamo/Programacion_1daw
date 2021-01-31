package ud5_estructurasEstaticas;

import java.util.Scanner;

public class Ejercicio_2_3_Random {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Pedir al usuario el tamaño del vector
		System.out.println("Introduce el tamaño del vector:");
		int n = sc.nextInt();
		System.out.println("DESDE que número:");
		double ini = sc.nextInt();
		System.out.println("HASTA que número:");
		double fin = sc.nextInt();

		//
		int[] aleatorio = generarVectorRandom(n, ini, fin); 

		//Imprimir el vector con los datos introducidos por el usuario
		Ejercicio_2_1_Vectores.imprimirVector( aleatorio );

		//Calcular la suma de todos los elementos del vector
		int suma = Ejercicio_2_1_Vectores.sumarElementos( aleatorio );
		System.out.println("La suma de los elementos del vector es: " + suma);

	}


	public static int[] generarVectorRandom(int n, double ini, double fin){

		int[] aleatorio = new int[n];

		for (int i=0; i<n; i++){

			aleatorio[i] = (int)((Math.random()*(fin-ini+1)) + ini);
		}
		
		return aleatorio;
	}

}
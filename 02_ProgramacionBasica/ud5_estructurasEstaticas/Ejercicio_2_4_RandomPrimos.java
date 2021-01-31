package ud5_estructurasEstaticas;

import java.util.Scanner;

public class Ejercicio_2_4_RandomPrimos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Pedir al usuario el tamaño del vector
		System.out.println("Introduce el tamaño del vector:");
		int n = sc.nextInt();
		System.out.println("DESDE que número:");
		int ini = sc.nextInt();
		System.out.println("HASTA que número:");
		int fin = sc.nextInt();

		int[] aleatorio;

		aleatorio = generarVectorRandomPrimos(n, ini, fin); 

		//Imprimir el vector
		Ejercicio_2_1_Vectores.imprimirVector(aleatorio);

		//Obtener el valor máximo de los elementos del vector
		int max = Ejercicio_2_1_Vectores.maximoNumero(aleatorio);
		System.out.println("El valor máximo de los elementos del vector es: " + max);
	}

	public static int[] generarVectorRandomPrimos(int n, int ini, int fin){

		int numAleatorio = 0;
		int i = 0;

		//Comprobar que n es positivo para que no de error de ejecución al crear el vector
		int[] aleatorio = new int[1];		
		if (n>0) {		
			aleatorio = new int[n];
		}

		//Comprobar que hay primos entre ini y fin para evitar un bucle infinito
		if (hayPrimosEntre(ini, fin)) {

			while (i < n){

				numAleatorio = (int)((Math.random()*(fin-ini+1)) + ini);

				if (esPrimo(numAleatorio)){

					aleatorio[i] = numAleatorio;

					i++;
				}			
			}			
		}		

		return aleatorio;
	}

	private static boolean hayPrimosEntre(int ini, int fin) {


		boolean hayPrimos = false;

		for (int i = ini; i <= fin; i++) {


			if (esPrimo(i)) {

				hayPrimos = true;
				break;
			}			
		}

		return hayPrimos;		
	}


	public static boolean esPrimo(int n){

		boolean primo = true;
		int i = 2;

		while((i<n) && (primo)){

			if (n%i==0){
				primo = false;
			}
			i++;
		}

		return primo;
	}

}
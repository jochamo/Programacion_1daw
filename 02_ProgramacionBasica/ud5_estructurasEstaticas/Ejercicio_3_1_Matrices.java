package ud5_estructurasEstaticas;

import java.util.Scanner;

public class Ejercicio_3_1_Matrices {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Declarar una matriz		
		int[][] matriz;
		int[][] matrizTraspuesta;

		//Inicializar una matriz (no se usa en el programa)
		int[][] inicializada = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

		//Pedir al usuario el tamaño de la Matriz
		System.out.println("Introduce el número de filas:");
		int n = sc.nextInt();
		System.out.println("Introduce el número de columnas:");
		int m = sc.nextInt();

		//Crear Matriz de tamaño que quiera el usario
		matriz = rellenarMatrizConsecutivos(n, m );		

		//Imprimir el Matriz con los datos introducidos por el usuario
		imprimirMatrizToGuapo( matriz, '_' );

		//Calcular la suma de todos los elementos de la Matriz
		int suma = sumarElementos( matriz );
		System.out.println("La suma de los elementos de la matriz es: " + suma);

		//Obtener el valor máximo de los elementos de la Matriz
		int max = maximoNumero( matriz );
		System.out.println("El valor máximo de los elementos de la matriz es: " + max);

		//Invertir los valores de la Matriz e imprimir el resultado
		//Matriz traspuesta !!!
		matrizTraspuesta = invertirMatriz( matriz );
		System.out.println("La matriz traspuesta es: ");
		imprimirMatriz( matrizTraspuesta );		

	}	

	public static int[][] rellenarMatriz(int filas, int columnas){

		Scanner sc = new Scanner(System.in);

		//Crear un array de tamaño pasado como parámetro
		int[][] miMatriz = new int[filas][columnas];

		//Recorrer un Matriz desde la posicion 0 a tamanyoMatriz-1
		for (int i = 0; i < filas; i++){

			for(int j = 0; j < columnas; j++){

				System.out.printf("Introduce el valor de la posición %d - %d\n", i, j);

				//Asignar valor a la posición i del Matriz
				miMatriz[i][j] = sc.nextInt();	
			}
		}

		return miMatriz;
	}

	public static int[][] rellenarMatrizConsecutivos(int filas, int columnas){

		//Crear un array de tamaño pasado como parámetro
		int[][] miMatriz = new int[filas][columnas];

		int contador = 1;		

		//Recorrer un Matriz desde la posicion 0 a tamanyoMatriz-1
		for (int i = 0; i < filas; i++){

			for(int j = 0; j < columnas; j++){

				//Asignar valor a la posición i del Matriz
				miMatriz[i][j] = contador;
				contador++;
			}
		}

		return miMatriz;
	}

	public static void imprimirMatriz(int[][] miMatriz){

		System.out.printf("Matriz:\n");

		int filas    = miMatriz.length;		
		int columnas = miMatriz[0].length;

		//Imprimir todos los elementos del Matriz
		for (int i = 0; i < filas; i++){

			for(int j = 0; j < columnas; j++){

				//Recuperar el valor de la posición i del Matriz
				System.out.printf("%4d", miMatriz[i][j]);
			}
			System.out.printf("\n");
		}		
	}

	public static void imprimirMatrizToGuapo(int[][] miMatriz, char caracter){

		System.out.printf("Matriz:\n");

		int filas = miMatriz.length;
		int columnas = miMatriz[1].length;

		int tamanyoFila = miMatriz.length * 5 + miMatriz.length + 1;

		imprimirFilaLineas(tamanyoFila, caracter);			

		//Imprimir todos los elementos del Matriz
		for (int i = 0; i < filas; i++){

			System.out.printf("|");

			for(int j = 0; j < columnas; j++){

				//Recuperar el valor de la posición i del Matriz
				System.out.printf("%5d", miMatriz[i][j]);

				System.out.printf("|");	

			}
			System.out.printf("%n");
			imprimirFilaLineas(tamanyoFila, caracter);
		}				
	}	

	private static void imprimirFilaLineas(int n, char caracter) {

		for (int i = 0; i < n; i++) {
			System.out.printf("%s", caracter);
		}
		System.out.printf("%n", caracter);
	}


	public static int sumarElementos(int[][] miMatriz){

		int suma = 0;

		//Sumar todos los elementos del Matriz
		int filas    = miMatriz.length;
		int columnas = miMatriz[0].length;

		//Imprimir todos los elementos del Matriz
		for (int i = 0; i < filas; i++){

			for(int j = 0; j < columnas; j++){

				suma = suma + miMatriz[i][j];
			}
		}

		return suma;
	}

	public static int sumarElementosDiagonal(int[][] miMatriz){

		int suma = 0;

		//Sumar todos los elementos del Matriz
		int filas    = miMatriz.length;
		int columnas = miMatriz[0].length;

		//Imprimir todos los elementos del Matriz
		for (int i = 0; i < filas; i++){

			suma = suma + miMatriz[i][i];			
		}

		return suma;
	}

	public static int maximoNumero(int[][] miMatriz){

		int max = miMatriz[0][0];

		//Buscar el mayor elemento
		int filas = miMatriz.length;
		int columnas = miMatriz[1].length;

		//Imprimir todos los elementos del Matriz
		for (int i = 0; i < filas; i++){

			for(int j = 0; j < columnas; j++){

				if (miMatriz[i][j] > max){
					max = miMatriz[i][j];
				}				
			}
		}

		return max;
	}

	public static int[][] invertirMatriz(int[][] miMatriz) {

		int filas    = miMatriz.length;
		int columnas = miMatriz[1].length;

		int[][] result = new int[columnas][filas];

		//Imprimir todos los elementos del Matriz
		for (int i = 0; i < filas; i++){

			for(int j = 0; j < columnas; j++){

				result[i][j] = miMatriz[j][i];
			}
		}

		return result;
	}

	public static void imprimirMatrizConIndices( int[][] m ) {

		System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
		System.out.print("│ Matriz ");
		for (int i = 0; i < m[0].length; i++) {
			System.out.printf("│%4d ", i);
		}

		for (int i = 0; i < m.length; i++) {

			System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
			System.out.printf("│ %5d  ", i);
			for (int j = 0; j < m[0].length; j++) {
				System.out.printf("│%4d ", m[i][j]);
			}
		}		

		System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");	    
	}

}
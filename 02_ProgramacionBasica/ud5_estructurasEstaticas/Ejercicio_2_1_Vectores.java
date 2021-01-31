package ud5_estructurasEstaticas;

import java.util.Scanner;

public class Ejercicio_2_1_Vectores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Declarar un array		
		int[] numeros;
		int[] numerosInvertidos;
		int[] numerosOrdenado;

		//Inicializar un vector (no se usa en el programa)
		int[] inicializado = {1, 2, 3, 4, 5};

		//Pedir al usuario el tamaño del vector
		System.out.println("Introduce el tamaño del vector:");
		int n = sc.nextInt();

		//Crear vector de tamaño que quiera el usario
		numeros = rellenarVector( n );		

		//Imprimir el vector con los datos introducidos por el usuario
		imprimirVector( numeros );

		//Calcular la suma de todos los elementos del vector
		int suma = sumarElementos( numeros );
		System.out.println("La suma de los elementos del vector es: " + suma);

		//Obtener el valor máximo de los elementos del vector
		int max = maximoNumero( numeros );
		System.out.println("El valor máximo de los elementos del vector es: " + max);

		//Invertir los valores del vector e imprimir el resultado
		numerosInvertidos = invertirVector( numeros );
		System.out.println("El vector invertido es: ");
		imprimirVector( numerosInvertidos );

		//Ordenar vector
		numerosOrdenado = ordenarVector(numerosInvertidos);
		System.out.println("El vector ordenador es: ");
		imprimirVector( numerosOrdenado );
		
		/*
		 * EXTRA:
La biblioteca de clases de Java incluye una clase auxiliar llamada java.util.Arrays que 
incluye como métodos algunas de las tareas que se realizan más a menudo con vectores:

- Arrays.sort(v) ordena los elementos del vector.
- Arrays.equals(v1,v2) comprueba si dos vectores son iguales.
- Arrays.fill(v,val) rellena el vector v con el valor val.
- Arrays.toString(v) devuelve una cadena que representa el contenido  del vector.
- Arrays.binarySearch(v, k) busca el valor k dentro del vector v (que previamente ha de estar ordenado).
		 * */		
	}

	public static int[] rellenarVector(int tamanyo){

		Scanner sc = new Scanner(System.in);

		//Crear un array de tamaño pasado como parámetro
		int[] miVector = new int[tamanyo];

		//Obtener tamaño de un array
		int tamanyoVector = miVector.length;

		//Recorrer un vector desde la posicion 0 a tamanyoVector-1
		for (int i = 0; i < tamanyoVector; i++){

			System.out.printf("Introduce el valor de la posición %d\n", i);

			//Asignar valor a la posición i del vector
			miVector[i] = sc.nextInt();			
		}

		return miVector;
	}


	public static void imprimirVector(int[] miVector){

		//Imprimir todos los elementos del vector
		for (int i = 0; i < miVector.length; i++) {

			//Recuperar el valor de la posición i del vector
			System.out.printf("%4d", miVector[i]);
		}		
		System.out.printf("\n");
	}

	public static int sumarElementos(int[] miVector){

		int total = 0;

		//Sumar todos los elementos del vector
		for (int i = 0; i < miVector.length; i++) {
			total = total + miVector[i];
		}

		return total;
	}

	public static int maximoNumero(int[] miVector){

		int max = miVector[0];

		//Buscar el mayor elemento
		for (int i = 1; i < miVector.length; i++) {
			if (miVector[i] > max){
				max = miVector[i];
			}
		}
		return max;
	}

		
	
	public static int metodo(int[] miVector){

		int N = miVector[0];

		for (int i = 1; i < miVector.length; i++) {
			if (miVector[i] > N){
				N = miVector[i];
			}
		}
		return N;	
	}	
		
	
	public static int[] invertirVector(int[] miVector) {

		int aux;
		
		for (int i = 0; i < miVector.length/2; i++) {

			//Intercambiar valores de las posiciones del vector
			aux 						  = miVector[miVector.length-1-i];
			miVector[miVector.length-1-i] = miVector[i];
			miVector[i]                   = aux;			
		}

		return miVector;
		
		
		//return invertirValores(miVector, 0, miVector.length-1);
		
	}	

	//No hay comentarios porque está explicado en clase xD
	public static int[] ordenarVector(int[] vec) {
	
		int aux;
		
		for(int i=0; i<vec.length-1; i++) {
			
	        for(int j=0; j<vec.length-1-i; j++) {
	        	
	            if (vec[j] > vec[j+1]) {
	                
	                aux      = vec[j];
	                vec[j]   = vec[j+1];
	                vec[j+1] = aux;
	            }
	        }
	    }
		return vec;
	}

	
	public static int[] generarVectorRandom(int n, int ini, int fin){

		int[] aleatorio = new int[n];

		for (int i = 0; i < aleatorio.length; i++) {

			aleatorio[i] = (int)((Math.random()*(fin-ini+1)) + ini);			
		}

		return aleatorio;
	}

	public static void imprimirVectorConIndices( int[] v ) {

		System.out.println("Vector:");		
		System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");		
		System.out.print("│ Índice ");
		for (int i = 0; i < v.length; i++) {
			System.out.printf("│%4d ", i);
		}
		System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
		System.out.print("│ Valor  ");
		for (int i = 0; i < v.length; i++) {
			System.out.printf("│%4d ", v[i]);
		}
		System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");	    
	}


	public static int[] invertirValores(int[] v, int izq, int der){

		//	b) Dadas dos posiciones, izq y der, del array, 0≤izq≤der≤v.length-1, 
		//     invierta todos los elementos del array situados entre dichas posiciones,
		//     esto es, al finalizar la ejecución del método el array contendrá en su
		//     posición izq el elemento que inicialmente ocupaba la posición der, 
		//     en su posición izq+1 el elemento que inicialmente ocupaba la posición 
		//     der-1 y así sucesivamente.
		
		int[] res = v.clone();
		
		for(int i=izq, j=der; i<=der; i++, j--){
			
			//Invertir valores
			res[i] = v[j];
		}

		return res;
	}
	
}
package ud5_estructurasEstaticas;

import java.util.Scanner;

public class Ejercicio_2_6_Vectores {

	public static void main(String[] args) {
		
		//Variable donde se guarda la opción del usuario
		String opcion = "";
		
		//Bucle infinito
		while (true)
		{
			//Mostrar por pantalla el menú
			System.out.printf("\na.- int[] multiplicarPor2(int[] v, int izq, int der)");
			System.out.printf("\nb.- int[] invertirValores(int[] v, int izq, int der)");
			System.out.printf("\nc.- int elementosImparesEnPosicionesPares(int[] v)");
			System.out.printf("\nd.- int elementosMenores(int[] v, int x, int n)");
			System.out.printf("\ne.- boolean ordenadoAscendentemente(int[] v)");
			System.out.printf("\nf.- int subsecuenciaTresConsecutivos(int[] v)");
			System.out.printf("\ng.- boolean sumaMayorQue(int[] v, int x)");
			System.out.printf("\nh.- int subsecuenciaMayores(int[] v, int x, int y)");
			System.out.printf("\ni.- int posicionUltimoImpar(int[] v)");
			System.out.printf("\nj.- int sumaTrasPrimerImpar(int[] v)");
			System.out.printf("\n\nx.- Salir");
			System.out.printf("\n\nOpcion: ");			
			
			Scanner sc = new Scanner(System.in);

			//Leer la opción escogida por el usuario
			opcion = sc.nextLine();
			opcion = opcion.toUpperCase();
						
			int[] r;			
			int res, izq, der, x, n;
			
			//
			switch(opcion){
			case "A":
			{	
				int[] vA = {7,4,5,3,1,9,8,2,6};
				izq = 1;
				der = 4;
				
				Ejercicio_2_1_Vectores.imprimirVector(vA);
				
				r = multiplicarPor2(vA, izq, der);
				Ejercicio_2_1_Vectores.imprimirVector(r);
				break;
			}
			case "B":
			{	
				int[] vB = {1,2,3,4,5,6,7,8,9};
				Ejercicio_2_1_Vectores.imprimirVector(vB);
				
				izq = 2;
				der = 5;
				//comprobar que (izq > 0) y (der < tamaño-1)
								
				r = invertirValores(vB, izq, der);
				Ejercicio_2_1_Vectores.imprimirVector(r);
				break;
			}
			case "C":
			{				
				int[] vC = {7,4,5,3,1,9,8,2,6};
				Ejercicio_2_1_Vectores.imprimirVector(vC);
				
				res = elementosImparesEnPosicionesPares(vC);
				System.out.println("El número de elementos impares en posiciones pares es: " + res);
				break;
			}
			case "D":
			{			
				int[] vD = {7,4,5,3,1,9,8,2,6};
				Ejercicio_2_1_Vectores.imprimirVector(vD);
				
				x = 2;
				n = 4;				
				
				res = elementosMenores(vD, x, n);
				System.out.printf("El número de elementos que son menores que %d hasta la posición %d del array son: %d%n", x, n, res);								
				break;
			}
			case "E":
			{				
				int[] vE = {7,4,5,3,1,9,8,2,6};				
				Ejercicio_2_1_Vectores.imprimirVector(vE);
				
				if (ordenadoAscendentemente(vE)){
					System.out.println("El vector SI está ordenado ascendentemente");
				}
				else{
					System.out.println("El vector NO está ordenado ascendentemente");
				}
				break;
			}
			case "F":
			{				
				int[] vF = {7,8,5,6,7,9,8,2,6};
				Ejercicio_2_1_Vectores.imprimirVector(vF);
				
				res = subsecuenciaTresConsecutivos(vF);
				
				if (res == -1){
					System.out.println("NO existe subsecuencia de 3 números consecutivos");
				}
				else{
					System.out.println("La subsecuencia de 3 números consecutivos empieza en " + res);
				}
				break;
			}
			case "G":
			{	
				int[] vG = {7,4,5,3,1,9,8,2,6};
				Ejercicio_2_1_Vectores.imprimirVector(vG);
				
				x = 2;				
				
				if (sumaMayorQue(vG, x)){
					System.out.printf("La suma de los elementos del vector SI es mayor que %d", x);
				}
				else{
					System.out.printf("La suma de los elementos del vector NO es mayor que %d", x);
				}
				break;
			}
			case "H":
			{	
				int[] vH = {7,4,5,3,1,9,8,2,6};			
				Ejercicio_2_1_Vectores.imprimirVector(vH);
				
				x   = 7;
				n   = 2;				
				res = subsecuenciaMayores(vH, x, n);
				
				if (res == -1){
					System.out.printf("NO existe subsecuencia de %d números consecutivos mayores que %d%n", n, x);
				}
				else{
					System.out.printf("La subsecuencia empieza en la posición %d%n", res);
				}				
				break;
			}
			case "I":
			{				
				int[] vI = {7,4,5,3,1,9,8,2,6};
				Ejercicio_2_1_Vectores.imprimirVector(vI);
				
				posicionUltimoImpar(vI);
				break;
			}
			case "J":
			{			
				int[] vJ = {7,4,5,3,1,9,8,2,6};
				Ejercicio_2_1_Vectores.imprimirVector(vJ);
				
				res = sumaTrasPrimerImpar(vJ);	
				System.out.printf("La suma de los elementos que aparecen tras el primer impar es: %d%n", res);				
				break;
			}					
			case "X":
			{
				System.out.println("\nFIN del programa");
				System.exit(0);
			}
			default:
			{
				System.out.printf("\n\nOpción incorrecta\n");
				break;
			}
			}
		}
	}

	public static int[] multiplicarPor2(int[] v, int izq, int der){

		// a) Dadas dos posiciones, izq y der, del array, 0≤izq≤der≤v.length-1, 
		//    multiplique por 2 el valor de los elementos del array situados 
		//    entre dichas posiciones.
		
		for(int i=izq; i<=der; i++){
			
			v[i] = v[i] * 2;			
		}

		return v;
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

	public static int elementosImparesEnPosicionesPares(int[] v){

		//  c) Cuente el número de elementos impares en posiciones pares.
		
		int cont = 0;
		
		//Recorrer de 2 en 2...
		for(int i=0; i<v.length; i=i+2){			
			//Si es impar
			if(v[i]%2 == 1){
				cont++;				
			}			
		}
		
		return cont;		
	}

	public static int elementosMenores(int[] v, int x, int n){

		//  d) Cuente el número de elementos que son menores que un 
		//     valor dado x hasta una posición n del array.
		
		int cont = 0;
		
		for(int i=0; i<=n; i++){
			//
			if(v[i] < x){
				cont++;
			}
		}
		
		return cont;		
	}

	public static boolean ordenadoAscendentemente(int[] v){

		//  e) Determine si dicho array está ordenado ascendentemente.
		
		boolean ordenado = true;
		
		for(int i=0; i<v.length-1; i++){
			//
			if(v[i] > v[i+1]){
				ordenado = false;
				break;
			}
		}
		
		return ordenado;
	}

	public static int subsecuenciaTresConsecutivos(int[] v){

		//  f) Determine la posición, si existe, de la primera subsecuencia del array
		//     que comprenda, al menos tres números consecutivos en posiciones 
		//     consecutivas del array.
		
		int posicion = -1;
		
		for(int i=0; i<v.length-2; i++){
			
			if ((v[i] == v[i+1]-1) && (v[i] == v[i+2]-2)){
				
				posicion = i;
				break;
			}			
		}
		
		return posicion;
	}

	public static boolean sumaMayorQue(int[] v, int x){

		//  g) Dado un entero x no negativo, determine si la suma de los elementos del 
		//     array es mayor que x, recorriendo el mínimo imprescindible de elementos.
		
		boolean esMayor = false;
		int suma = 0;
		
		for(int i=0; i<v.length; i++){
			
			suma = suma + v[i];
			
			if (suma > x){
				
				esMayor = true;
				break;
			}			
		}
		
		return esMayor;
	}

	public static int subsecuenciaMayores(int[] v, int x, int n){

		//  h) Dados dos valores enteros x y n, devuelva la posición de la primera 
		//     subsecuencia de n enteros mayores que x, o devuelva -1 en caso de que
		//     no exista dicha subsecuencia en el array.
		
		int posicion = -1;		 
			
		//Si el tamaño del vector es menor a n... no existe la subsecuencia de n enteros
		if (v.length >= n) {
						
			for(int i=0; i<v.length-n+1; i++){
				
				int hasta = i + n;
				boolean haySubsecuencia = true;
				
				for (int j = i; j < hasta; j++) {
				
					if (v[j] <= x){
						
						haySubsecuencia = false;						
						break;
					}
				}						
				if (haySubsecuencia) {
					posicion = i;
					break;
				}
			}			
		}		
		
		return posicion;
	}

	public static int posicionUltimoImpar(int[] v){

		//  i) Obtenga la posición del último elemento impar del array, si existe.
		
		int posicion = -1;
		
		for (int i=v.length-1; i>=0; i--){
			
			if(v[i]%2 == 1){
				posicion = i;
				break;
			}
		}
		
		return posicion;
	}

	public static int sumaTrasPrimerImpar(int[] v){

		//j) Sume los elementos que aparecen tras el primer impar, si existe.

		int suma = 0;
		boolean puedeSumar = false;
				
		for (int i=0; i<v.length; i++){
			
			if(v[i]%2 == 1){				
				puedeSumar = true;				
			}
			if (puedeSumar){
				suma = suma + v[i];
			}
		}
		
		return suma;
	}
	
}
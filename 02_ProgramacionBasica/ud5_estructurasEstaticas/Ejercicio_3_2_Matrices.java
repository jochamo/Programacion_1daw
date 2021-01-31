package ud5_estructurasEstaticas;

import java.util.Scanner;

public class Ejercicio_3_2_Matrices {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el número DESDE que desea generar números aleatorios:");
		double ini = sc.nextInt();
		System.out.println("Introduzca el número HASTA que desea generar números aleatorios:");
		double fin = sc.nextInt();

		int[][] matriz;
		int num   = 0;
		int veces = 0;

		//Crear Matriz de tamaño que quiera el usario
		matriz = rellenarMatrizRandom( 10, 10, ini, fin );

		Ejercicio_3_1_Matrices.imprimirMatriz(matriz);		

		String siono = "s";

		while (siono.equals("s")){
			//
			System.out.println("Dime el número a buscar:");
			num = sc.nextInt();

			if ((num >= ini) && (num <= fin)){

				if (existeNumero(matriz, num)){
					
					System.out.println("El número SI está...");
					
					veces = numVecesNumero(matriz, num);
					
					System.out.printf("...y aparece %d veces.\n", veces);
				}
				else{
					System.out.println("El número NO está");
				}					
			}
			else{
				System.out.println("El número NO está en el RANGO indicado");
			}				

			System.out.println("¿Desea buscar más números? (s/n)");
			sc.nextLine();
			siono = sc.nextLine();
		}
		System.out.println("");
		System.out.println("FIN del programa");
	}

	public static int[][] rellenarMatrizRandom( int filas, int columnas, double ini, double fin ){

		int[][] aleatorio = new int[filas][columnas];

		for (int i=0; i<filas; i++){
			for (int j=0; j<columnas; j++){
				aleatorio[i][j] = (int)((Math.random()*(fin-ini+1)) + ini);
			}
		}
		return aleatorio; 
	}	

	public static boolean existeNumero(int[][] matriz, int num){

		boolean existe = false;

		for (int i=0; i<matriz.length; i++){
			for (int j=0; j<matriz[i].length; j++){

				if (matriz[i][j] == num){
					existe = true;					
				}				
			}
			if (existe){
				break;
			}
		}		

		return existe;
	}

	public static int numVecesNumero(int[][] matriz, int num){

		int veces = 0;

		for (int i=0; i<matriz.length; i++){
			for (int j=0; j<matriz[i].length; j++){

				if (matriz[i][j] == num){
					veces++;
				}				
			}			
		}

		return veces;
	}
	
}
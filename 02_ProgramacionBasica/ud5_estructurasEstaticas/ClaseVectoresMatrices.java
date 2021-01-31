package ud5_estructurasEstaticas;

public class ClaseVectoresMatrices {

	public static void main(String[] args) {
		
		//*****************************************************************
		//			VECTORES
		//*****************************************************************
		
		//Declarar un vector
		int[] numeros;		
		
		//Crear un vector
		numeros = new int[10];		
		
		//Declarar y crear un vector de tamaño 7 (0..6)
		String[] dias = new String[7];		
		
		//Crear e Inicializar un vector
		int[] inicializado = {1, 15, 3, 4, 5};		
		
		//Modificar el valor de una posición del vector
		dias[0] = "lunes";
		dias[3] = "jueves";		
		
		//Acceder al valor de una posición del vector
		int valor = inicializado[2];		
		System.out.println( valor ); //valor = 3
		
		//Acceder al valor de un vector de String
		String dia3 = dias[3];
		System.out.println( dia3 );
		
		//Modificar valor y comprobar si es mayor que 5
		inicializado[2] = 8;				
		if (inicializado[2] > 5) {
			System.out.println("el valor es mayor que 5");
		}
		else {
			System.out.println("el valor es menor que 5");
		}		
		
		//Recorrer un vector de forma ascendente
		for (int i = 0; i < inicializado.length; i++) {
			
			System.out.println( inicializado[i] );	
		}

		//Recorrer un vector de forma descendente
		for (int i = inicializado.length-1; i >= 0; i--) {

			System.out.println( inicializado[i] );	
		}
		
		//Buscar un numero en el vector
		int numeroABuscar = 15;
		
		for (int i = 0; i < inicializado.length; i++) {
			
			if (inicializado[i] == numeroABuscar) {
				System.out.println( "se ha encontrado en la posicion " + i );
				break;
			}			
		}
		
		//*****************************************************************
		//			MATRICES
		//*****************************************************************
		
		int[][] matriz = new int[5][5];

		int a = matriz[3][1];
		
		int[][] inicializada = { {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5} };
		
		//Obtener numero de filas y columnas
		int filas    = matriz.length;
		int columnas = matriz[0].length;
		
		//Recorrer filas
		for (int i = 0; i < filas; i++) {
			
			//Recorrer columnas
			for (int j = 0; j < columnas; j++) {
				
				matriz[i][j] = i*5 + j + 1;						
			}			
		}

		//recorrer filas
		for (int i = 0; i < filas; i++) {

			//recorrer columnas
			for (int j = 0; j < columnas; j++) {

				System.out.printf(matriz[i][j] + ", ");						
			}			
			System.out.println("");
		}
		
		
	}
	
}
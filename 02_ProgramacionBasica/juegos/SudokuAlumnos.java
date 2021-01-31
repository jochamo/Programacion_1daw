package juegos;

import java.util.Scanner;

public class SudokuAlumnos {

	//http://jonathan-palomino.blogspot.com.es/2011/07/sodoku.html
	//http://www.sudokumania.com.ar/sm1/solucionar-sudoku.php
	
	//Método para cargar el juego dependiendo del nivel
	public static int[][] cargarJuego( int nivel ){

		switch (nivel){

		case 1:

			int[][] matriz1 = {
					{0,1,5, 3,8,4, 2,7,6},
					{8,4,3, 7,2,6, 0,1,5},
					{7,6,2, 5,0,1, 4,8,3},

					{6,9,8, 2,5,7, 3,4,1},
					{3,2,7, 1,4,8, 5,6,9},
					{1,5,4, 6,3,9, 8,2,7},

					{4,3,6, 9,7,2, 1,5,8},
					{2,7,9, 8,1,5, 6,3,4},
					{5,8,1, 4,6,3, 7,9,2} };

			return matriz1;

		case 2:

			int[][] matriz2 = {
					{4,0,0, 0,0,6, 0,0,0},
					{0,0,0, 3,5,4, 0,0,9},
					{0,0,0, 0,0,9, 0,0,3},

					{0,8,0, 1,4,0, 5,9,0},
					{0,3,0, 0,0,0, 0,8,0},
					{0,0,0, 8,7,0, 2,0,0},

					{0,0,0, 9,0,0, 6,0,7},
					{2,4,0, 0,0,0, 3,0,0},
					{8,0,7, 0,0,0, 0,0,5} };

			return matriz2;

		case 3:
		default:

			int[][] matriz3 = {
					{7,0,0, 0,5,0, 4,0,0},
					{4,0,0, 1,9,0, 6,2,7},
					{0,0,6, 0,0,0, 0,0,9},

					{9,0,3, 0,0,0, 8,0,0},
					{0,0,0, 4,0,3, 0,0,0},
					{0,0,8, 0,0,0, 5,0,2},

					{5,0,0, 0,0,0, 2,0,0},
					{2,9,1, 0,4,7, 0,0,8},
					{0,0,7, 0,1,0, 0,0,5} };

			return matriz3;
		}
	}

	//METODO PARA CARGAR LA SOLUCIÓN DEL JUEGO
	/*public static int[][] cargarSolucion( int nivel ){

		switch (nivel){

		case 1:

			int[][] matriz1 = {
					{9,1,5, 3,8,4, 2,7,6},
					{8,4,3, 7,2,6, 9,1,5},
					{7,6,2, 5,9,1, 4,8,3},

					{6,9,8, 2,5,7, 3,4,1},
					{3,2,7, 1,4,8, 5,6,9},
					{1,5,4, 6,3,9, 8,2,7},

					{4,3,6, 9,7,2, 1,5,8},
					{2,7,9, 8,1,5, 6,3,4},
					{5,8,1, 4,6,3, 7,9,2} };

			return matriz1;

		case 2:

			int[][] matriz2 = {
					{4,9,3, 7,1,6, 8,5,2},
					{6,2,8, 3,5,4, 1,7,9},
					{1,7,5, 2,8,9, 4,6,3},

					{7,8,2, 1,4,3, 5,9,6},
					{5,3,4, 6,9,2, 7,8,1},
					{9,1,6, 8,7,5, 2,3,4},

					{3,5,1, 9,2,8, 6,4,7},
					{2,4,9, 5,6,7, 3,1,8},
					{8,6,7, 4,3,1, 9,2,5} };

			return matriz2;

		case 3:
		default:

			int[][] matriz3 = {
					{7,0,0, 0,5,0, 4,0,0},
					{4,0,0, 1,9,0, 6,2,7},
					{0,0,6, 0,0,0, 0,0,9},

					{9,0,3, 0,0,0, 8,0,0},
					{0,0,0, 4,0,3, 0,0,0},
					{0,0,8, 0,0,0, 5,0,2},

					{5,0,0, 0,0,0, 2,0,0},
					{2,9,1, 0,4,7, 0,0,8},
					{0,0,7, 0,1,0, 0,0,5} };

			return matriz3;
		}
	}*/
	
	//Método para no modificar valores del sudoku original
	public static boolean esValorOriginal( int fila, int columna, int[][] matriz ){

		boolean resultado = false;

		if ( matriz[fila][columna] != 0){
			resultado = true;
		}

		return resultado;
	}

	//Método que determina si el juego ha terminado
	public static boolean juegoTerminado( int[][] matriz ){

		boolean terminado = true;

		for ( int i = 0; ((i < matriz.length)&&(terminado)); i++){
			for ( int j = 0; j < matriz[0].length; j ++){
				//Si hay alguna celda vacía el juego NO ha terminado
				if ( matriz[i][j] == 0 ){
					terminado = false;
					break;
				}
			}
		}

		return terminado;
	}

	//METODO QUE IMPRIME UN MENSAJE CON BORDE.
	public static void mensaje( String mensaje ){

		//CABECERA.
		System.out.println("");
		System.out.print("");
		for(int i = 0; i < (mensaje.length() + 20); i ++ )
			System.out.print ("*");
		System.out.print("\n");

		//CUERPO.
		System.out.print("          ");
		System.out.print( mensaje );
		System.out.print("          \n");

		//PIE
		System.out.print("");
		for(int i = 0; i < (mensaje.length() + 20); i ++ )
			System.out.print("*");

		System.out.print("\n\n");
	}

	//Método que imprime el sudoku
	public static void imprimirSudoku( int[][] matriz ){

		for (int i = 0; i < 9; ++i) {

			if (i % 3 == 0){
				System.out.println(" -----------------------");
			}

			for (int j = 0; j < 9; ++j) {

				if (j % 3 == 0){
					System.out.printf("| ");
				}

				if ( matriz[i][j] != 0 ){
					System.out.print( matriz[i][j] );
				}					
				else{
					System.out.printf(" ");
				}
				
				System.out.printf(" ");
			}

			System.out.println("|");
		}

		System.out.println(" -----------------------");
	}

	//Método para comprobar los índices de la FILA y la COLUMNA
	public static boolean comprobarIndice( int indice ){

		if ( indice > 0 && indice < 10)
			return true;
		else
			return false;
	}

	//Método para comprobar los VALORES
	public static boolean comprobarValor( int valor ){

		if ( valor >= 0 && valor < 10)
			return true;
		else
			return false;
	}

	//Método para comprobar si el valor dado existe en la FILA
	public static boolean existeNumeroEnFila( int numero, int fila, int[][] matriz ){

		boolean resultado = false;

		for ( int i = 0; i < matriz.length; i ++ ){

			if ( matriz[(fila-1)][i] == numero ){
				resultado = true;
				break;
			}
		}

		//COMPROBAMOS SI ES 0.
		if ( numero == 0 ) resultado = false;

		return resultado;
	}

	//Método para comprobar si el valor dado existe en la COLUMNA
	public static boolean existeNumeroEnColumna( int numero, int columna, int[][] matriz ){

		boolean resultado = false;

		for ( int i = 0; i < matriz.length; i ++ ){

			if ( matriz[i][(columna-1)] == numero ){
				resultado = true;
				break;
			}
		}

		//COMPROBAMOS SI ES 0.
		if ( numero == 0 ) resultado = false;

		return resultado;
	}

	//METODO PARA COMPROBAR LAS CAJAS.
	public static boolean existeNumeroEnCaja( int valor, int fila, int columna, int[][] matriz ){

		//VARIABLES.
		int minimo_fila;
		int maximo_fila;
		int minimo_columna;
		int maximo_columna;
		boolean resultado = false;

		//DETERMINAMOS LAS FILAS DE LA CAJA.
		if ( fila > 0 && fila < 4){
			minimo_fila = 0;
			maximo_fila = 2;
		}else if ( fila > 3 && fila < 7 ){
			minimo_fila = 3;
			maximo_fila = 5;
		}else{
			minimo_fila = 6;
			maximo_fila = 8;
		}

		//DETERMINAMOS LAS COLUMNAS DE LA CAJA.
		if ( columna > 0 && columna < 4){
			minimo_columna = 0;
			maximo_columna = 2;
		}else if ( columna > 3 && columna < 7 ){
			minimo_columna = 3;
			maximo_columna = 5;
		}else{
			minimo_columna = 6;
			maximo_columna = 8;
		}

		//RECORREMOS EL RANGO DE LA CAJA, Y BUSCAMOS EL VALOR.
		for ( int i = minimo_fila; i <= maximo_fila; i++ ){
			for ( int j = minimo_columna; j <= maximo_columna; j++){

				if ( matriz[i][j] == valor ){
					resultado = true;
					break; 
				}
			}
		}

		//COMPROBAMOS SI ES 0.
		if ( valor == 0 ) resultado = false;

		//REGRESAMOS EL VALOR BOOLEANO.
		return resultado;
	}

	public static boolean existeNumeroEnSolucion( int valor, int fila, int columna, int[][] solucion ){

		return (valor == solucion[fila-1][columna-1]);
	}

	//Método Principal
	public static void main ( String[] args ) 
	{
		Scanner teclado = new Scanner(System.in);
			
		//Variables
		int[][] sudoku = new int[9][9];

		int fila    = 0;
		int columna = 0;
		int valor   = 0;
		int nivel   = 1;
			
		//Cargar el Sudoku		
		sudoku = cargarJuego( nivel );

		//Mientras no se acaben los niveles
		while ( nivel < 4 ){

			//Imprimir el Sudoku
			imprimirSudoku( sudoku );

			//Pedir los datos
			System.out.println("Inserte las coordenadas del elemento a modificar: ");

			//1.- Fila
			System.out.print("[fila]: ");
			fila = teclado.nextInt();

			//2.- Columna
			System.out.print("[columna]: ");
			columna = teclado.nextInt();

			//3.- Valor
			System.out.print("[valor]: ");
			valor = teclado.nextInt();

			//Comprobamos que la FILA está en el rango 1..9
			if ( !comprobarIndice(fila) )
				mensaje ("El valor de la fila no es correcto...");

			//Comprobamos que la COLUMNA está en el rango 1..9
			else if ( !comprobarIndice(columna) )
				mensaje("El valor de la columna no es correcto...");

			//Comprobamos que el VALOR está en el rango 0..9
			else if ( !comprobarValor(valor) )
				mensaje("El valor introducido no es válido...");

			//Comprobamos que sea una casilla modificable (no sea un valor original)
			else if ( esValorOriginal((fila - 1),(columna - 1), cargarJuego( nivel )) )
				mensaje("Ese valor es predeterminado del juego...");

			//Comprobar que no se repita el valor en la FILA
			else if ( existeNumeroEnFila( valor, fila, sudoku ) )
				mensaje("El valor " + valor + " ya ha sido usado en la fila...");

			//Comprobar que no se repita el valor en la COLUMNA
			else if ( existeNumeroEnColumna( valor, columna, sudoku ) )
				mensaje("El valor " + valor + " ya ha sido usado en la columna...");
			
			//Comprobar que no se repita el valor en la CAJA
			else if ( existeNumeroEnCaja( valor, fila, columna, sudoku ) )
				mensaje("El valor ya existe en la caja...");

			//Introducimos el valor en la matriz (sudoku)
			else {
				sudoku[(fila - 1)][(columna - 1)] = valor;
				mensaje("[" + fila + "," + columna + "] = " + valor + " Correcto!");
			}

			//Comprobar si se ha terminado el Juego
			if ( juegoTerminado( sudoku ) ){

				mensaje("Felicidades !!! Has completado el Sudoku !!!");
				imprimirSudoku( sudoku );
				System.out.println("Presiona INTRO para pasar al siguiente nivel..");
				teclado.nextLine();
				teclado.nextLine();

				//Aumentar el NIVEL del Juego
				nivel ++;
				sudoku = cargarJuego( nivel );
				mensaje("SUDOKU NIVEL " + nivel );
			}
		}
	}	
	
}
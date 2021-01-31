package juegos;

import java.util.Scanner;

public class Sudoku{

	//Método para cargar el juego dependiendo del nivel
	public static int[][] cargarJuego( int nivel ){
		//
		int[][] sudoku = new int[9][9];
		return sudoku;
	}

	//Método para no modificar valores del sudoku original
	public static boolean esValorOriginal( int fila, int columna, int[][] matriz ){

		//
		return true;
	}

	//Método que determina si el juego ha terminado
	public static boolean juegoTerminado( int[][] matriz ){

		//
		return true;
	}

	//Método que imprime un mensaje con borde
	public static void mensaje( String mensaje ){

		//
	}

	//Método que imprime el sudoku
	public static void imprimirSudoku( int[][] matriz ){

		//
	}

	//Método para comprobar los índices de la FILA y la COLUMNA
	public static boolean comprobarIndice( int indice ){

		//
		return true;
	}

	//Método para comprobar los VALORES
	public static boolean comprobarValor( int valor ){

		//
		return true;
	}

	//Método para comprobar si el valor dado existe en la FILA
	public static boolean existeNumeroEnFila( int numero, int fila, int[][] matriz ){

		//
		return true;
	}

	//Método para comprobar si el valor dado existe en la COLUMNA
	public static boolean existeNumeroEnColumna( int numero, int columna, int[][] matriz ){

		//
		return true;
	}

	//Método para comprobar si el valor dado existe en la CAJA
	public static boolean existeNumeroEnCaja( int valor, int fila, int columna, int[][] matriz ){
		
		//
		return true;
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
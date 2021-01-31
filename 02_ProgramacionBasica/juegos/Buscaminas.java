package juegos;

import java.util.Scanner;

public class Buscaminas {

	//Método para cargar el juego dependiendo del nivel
	public static int[][] cargarJuego( int nivel ){

		switch (nivel){

		case 1:

			/*int[][] matriz1 = {
					{1,1,2,9, 2,1,1,0},
					{1,9,2,1, 2,9,1,0},
					{1,1,1,0, 1,1,2,1},
					{1,1,0,0, 1,1,2,9},
					{9,2,0,0, 1,9,3,2},
					{9,2,0,0, 2,3,9,1},
					{1,1,0,0, 1,9,3,2},
					{0,0,0,0, 1,1,2,9} };
			*/
			
			int[][] matriz1 = {				
					
					{1,1,0,0, 1,9,3,2},
					{0,0,0,0, 1,1,2,9} };
			
			
			return matriz1;

		case 2:

			int[][] matriz2 = {
					{1,1,2,9, 2,1,1,0},
					{1,9,2,1, 2,9,1,0},
					{1,1,1,0, 1,1,2,1},
					{1,1,0,0, 1,1,2,9},
					{9,2,0,0, 1,9,3,2},
					{9,2,0,0, 2,3,9,1},
					{1,1,0,0, 1,9,3,2},
					{0,0,0,0, 1,1,2,9} };

			return matriz2;

		case 3:
		default:

			int[][] matriz3 = {
					{1,1,2,9, 2,1,1,0},
					{1,9,2,1, 2,9,1,0},
					{1,1,1,0, 1,1,2,1},
					{1,1,0,0, 1,1,2,9},
					{9,2,0,0, 1,9,3,2},
					{9,2,0,0, 2,3,9,1},
					{1,1,0,0, 1,9,3,2},
					{0,0,0,0, 1,1,2,9} };

			return matriz3;
		}
	}

	//Método que determina si el juego ha terminado
	public static boolean juegoTerminado( boolean[][] matriz ){

		boolean terminado = true;

		for ( int i = 0; ((i < matriz.length)&&(terminado)); i++){
			for ( int j = 0; j < matriz[0].length; j ++){
				//Si hay alguna celda vacía el juego NO ha terminado
				if ( !matriz[i][j] ){
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
	public static void imprimirBuscaMinas( int[][] matriz, boolean[][] jugado, int[][] original ){


		System.out.println("\n┌─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[0].length; j++) {


				//Imprimir una bandera
				if (matriz[i][j] == 10) {					
					System.out.printf("│%3s  ", "¶");
				}
				else {
					//Imprimir un interrogante
					if (matriz[i][j] == 11) {
						System.out.printf("│%3s  ", "?");
					}
					else {

						if (jugado[i][j]) {					

							//Imprimir una mina
							if (matriz[i][j] == 9) {					
								System.out.printf("│%3s  ", "*");
							}
							else {	
								System.out.printf("│%3s  ", original[i][j]);	
							}

						}
						else {
							System.out.printf("│%3s  ", " ");
						}
					}
				}				
			}

			if (i != matriz.length-1) {
				System.out.println("│\n├─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");	
			}			
		}	

		System.out.println("│\n└─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");


	}

	//Método para comprobar los índices de la FILA y la COLUMNA
	public static boolean comprobarIndice( int indice ){

		if ( indice > 0 && indice < 9)
			return true;
		else
			return false;
	}

	//Método para comprobar los VALORES
	public static boolean comprobarValor( int valor ){

		if ( valor == 10 || valor == 11 || valor == 12)
			return true;
		else
			return false;
	}

	//Método Principal
	public static void main ( String[] args ) 
	{
		Scanner teclado = new Scanner(System.in);

		//Variables
		int[][] buscaMinas = new int[9][9];
		int[][] original   = new int[9][9];
		boolean[][] jugado = new boolean[9][9];

		int fila    = 0;
		int columna = 0;
		int valor   = 0;
		int nivel   = 1;

		//Cargar el BuscaMinas		
		buscaMinas = cargarJuego( nivel );
		original   = cargarJuego( nivel );

		//Mientras no se acaben los niveles
		while ( nivel < 4 ){

			//Imprimir el BuscaMinas
			imprimirBuscaMinas( buscaMinas, jugado, original );

			//Pedir los datos
			System.out.println("Inserte las coordenadas de la casilla a modificar: ");

			//1.- Fila
			System.out.print("[fila]: ");
			fila = teclado.nextInt();

			//2.- Columna
			System.out.print("[columna]: ");
			columna = teclado.nextInt();

			//3.- Valor
			System.out.println("¿Bandera (10), Interrogante (11) o Descubrir casilla (12)?");
			valor = teclado.nextInt();

			//Comprobamos que la FILA está en el rango 1..8
			if ( !comprobarIndice(fila) )
				mensaje ("El valor de la fila no es correcto...");

			//Comprobamos que la COLUMNA está en el rango 1..8
			else if ( !comprobarIndice(columna) )
				mensaje("El valor de la columna no es correcto...");

			//Comprobamos que el VALOR sea 10, 11 o 12
			else if ( !comprobarValor(valor) )
				mensaje("El valor introducido no es válido...");

			//Comprobamos que no se haya descubierto ya esa casilla
			else if ( jugado[fila-1][columna-1] )
				mensaje("La casilla introducida ya ha sido descubierta...");

			//Comprobamos que no se haya descubierto ya esa casilla
			else if ( buscaMinas[fila-1][columna-1] == 9 ) {
				mensaje("Ha perdido...");
				jugado[fila-1][columna-1] = true;
				imprimirBuscaMinas( buscaMinas, jugado, original );
				nivel = 9;
			}				

			//Introducimos el valor en la matriz (buscaMinas)
			else {

				buscaMinas[(fila - 1)][(columna - 1)] = valor;

				if (valor == 12) {					
					jugado[(fila - 1)][(columna - 1)] = true;
				}

				//Comprobar si se ha terminado el Juego
				if ( juegoTerminado( jugado ) ){

					mensaje("Felicidades !!! Has completado el BuscaMinas !!!");
					imprimirBuscaMinas( buscaMinas, jugado, original );
					System.out.println("Presiona INTRO para pasar al siguiente nivel..");
					teclado.nextLine();
					teclado.nextLine();

					//Aumentar el NIVEL del Juego
					nivel ++;
					buscaMinas = cargarJuego( nivel );
					original   = cargarJuego( nivel );
					jugado     = new boolean[9][9];
					mensaje("BuscaMinas NIVEL " + nivel );
				}
			}
		}
	}

}
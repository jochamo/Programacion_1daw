package juegos;

import java.util.Scanner;

public class ConectaCuatro {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		//Variables
		int fila;
		int columna;
		int jugadorActual;		
		boolean partidaTerminada;

		//Mientras el usuario quiera jugar partidas...
		String seguirJugando = "s";		
		while( seguirJugando.equals("s") ) {

			//Inicializar partida
			int[][] tablero = new int[6][7];

			jugadorActual    = 1;			
			partidaTerminada = false;

			//Empezar a jugar...	
			while (!partidaTerminada) {

				//Imprimir el tablero
				imprimirTablero( tablero );			

				//Pedir columna en la que se quiere jugar...
				System.out.printf("%nJugador %d: Inserte la posición de la columna donde quiere jugar:%n%n", jugadorActual);
				columna = teclado.nextInt();

				//Comprobamos que la COLUMNA está en el rango 1..7
				if ( !comprobarRangoColumna(columna) )
					mensaje("El valor de la columna no es correcto...");
				
				//Comprobamos que la COLUMNA está en el rango 1..7
				else if ( columnaLlena(tablero, columna-1) )
					mensaje("Columna llena: no se puede insertar más fichas...");

				//Introducimos el valor en la matriz (tablero)
				else {

					fila = 0;
					
					//Insertar Ficha
					for (int i=tablero.length-1; i>= 0; i--) {
						
						if (tablero[i][columna-1] == 0) {
							tablero[i][columna-1] = jugadorActual;
							fila = i;
							break;
						}
					}

					//Comprobar si se ha ganado la partida
					if ( comprobarCuatroEnRaya(tablero, fila, columna-1, jugadorActual) ){

						mensaje("Felicidades !!! Has GANADO Jugador " + jugadorActual + " !!!");
						imprimirTablero(tablero);
						partidaTerminada = true;					
					}
					else {
						//Cambiar de jugador
						if (jugadorActual == 1) {
							jugadorActual = 2;
						}
						else{
							jugadorActual = 1; 	
						}	
					}
					
					//Comprobar el EMPATE
					if ( hayEmpate(tablero) ) {
						
						mensaje("Bonita partida! Resultado: EMPATE !!!");
						imprimirTablero(tablero);
						partidaTerminada = true;
					}
				}				
			}			

			//
			teclado.nextLine();
			System.out.println("¿ Desea jugar otra partida ? (s/n)");
			seguirJugando = teclado.nextLine();
		}
	}

	//**********************************************************************
	
	public static boolean hayEmpate( int[][] tablero ) {
		
		for (int i = 0; i < tablero[0].length; i++) {
			
			if (tablero[0][i] == 0) {
				
				return false;					
			}						
		}
		
		return true;
	}
	
	public static boolean comprobarCuatroEnRaya( int[][] tablero, int fila, int columna, int jugador ) {
		
		return comprobarHorizontal(tablero, fila, jugador)  ||
				comprobarVertical(tablero, columna, jugador)||
				comprobarDiagonalSupDer(tablero, jugador)   ||
				comprobarDiagonalSupIzq(tablero, jugador)   ||
				comprobarDiagonalInfIzq(tablero, jugador )  ||
				comprobarDiagonalInfDer(tablero, jugador );		
	}
	
	public static boolean comprobarHorizontal( int[][] tablero, int fila, int jugador ) {

		for (int i = 0; i < 4; i++) {
		
			if ( (tablero[fila][i] == jugador) &&
					(tablero[fila][i+1] == jugador) &&
					(tablero[fila][i+2] == jugador) &&
					(tablero[fila][i+3] == jugador) ){
				return true;
			}
		}
		
		return false;
	}

	public static boolean comprobarVertical( int[][] tablero, int columna, int jugador ) {

		for (int i = 0; i < 3; i++) {
			
			if ( (tablero[i][columna] == jugador) &&
					(tablero[i+1][columna] == jugador) &&
					(tablero[i+2][columna] == jugador) &&
					(tablero[i+3][columna] == jugador) ){
				return true;
			}
		}
		
		return false;
	}

	public static boolean comprobarDiagonalSupIzq( int[][] tablero, int jugador ) {

		for (int i = 3; i < tablero.length; i++) {
			
			for (int j = 3; j < tablero.length; j++) {
								
				if ( (tablero[i][j] == jugador) &&
						(tablero[i-1][j-1] == jugador) &&
						(tablero[i-2][j-2] == jugador) &&
						(tablero[i-3][j-3] == jugador) ){
					return true;
				}				
			}
		}
		
		return false;
	}

	public static boolean comprobarDiagonalSupDer( int[][] tablero, int jugador ) {

		for (int i = 3; i < tablero.length; i++) {
			
			for (int j = 0; j < 4; j++) {
								
				if ( (tablero[i][j] == jugador) &&
						(tablero[i-1][j+1] == jugador) &&
						(tablero[i-2][j+2] == jugador) &&
						(tablero[i-3][j+3] == jugador) ){
					return true;
				}				
			}
		}
		
		return false;		
	}

	public static boolean comprobarDiagonalInfIzq( int[][] tablero, int jugador ) {

		for (int i = 0; i < 3; i++) {
			
			for (int j = 3; j < tablero[0].length; j++) {
								
				if ( (tablero[i][j] == jugador) &&
						(tablero[i+1][j-1] == jugador) &&
						(tablero[i+2][j-2] == jugador) &&
						(tablero[i+3][j-3] == jugador) ){
					return true;
				}				
			}
		}
		
		return false;
	}

	public static boolean comprobarDiagonalInfDer( int[][] tablero, int jugador ) {

		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 4; j++) {
								
				if ( (tablero[i][j] == jugador) &&
						(tablero[i+1][j+1] == jugador) &&
						(tablero[i+2][j+2] == jugador) &&
						(tablero[i+3][j+3] == jugador) ){
					return true;
				}				
			}
		}
		
		return false;
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

		System.out.print("\n");
	}

	public static void imprimirTablero( int[][] tablero ) {

		System.out.println("\n|     |     |     |     |     |     |     |");

		for (int i = 0; i < tablero.length; i++) {

			for (int j = 0; j < tablero[0].length; j++) {

				if (tablero[i][j] == 0) {
					System.out.printf("│%3s  ", " ");
				}
				else {					
					if (tablero[i][j] == 1) {
						System.out.printf("│%3s  ", "X");
					}
					else {
						System.out.printf("│%3s  ", "O");
					}
				}				
			}

			if (i != tablero.length-1) {
				System.out.println("│\n├─────┼─────┼─────┼─────┼─────┼─────┼─────┤");	
			}			
		}	

		System.out.println("│\n└─────┴─────┴─────┴─────┴─────┴─────┴─────┘");		
		System.out.println("   1     2     3     4     5     6     7   ");
	}

	public static boolean columnaLlena(int[][] tablero, int columna) {
						
		if (tablero[0][columna] == 0) {
			return false;	
		}
		else {
			return true;
		}		
	}
	
	//Método para comprobar los índices de la FILA y la COLUMNA
	public static boolean comprobarRangoColumna( int indice ){

		if ( indice > 0 && indice < 8)
			return true;
		else
			return false;
	}

}
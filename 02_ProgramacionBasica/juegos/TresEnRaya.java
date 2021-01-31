package juegos;

import java.util.Scanner;

public class TresEnRaya {

	public static void imprimirTablero( char[][] tablero ) {

		System.out.println("\n┌─────┬─────┬─────┐");

		for (int i = 0; i < tablero.length; i++) {

			for (int j = 0; j < tablero[0].length; j++) {

				System.out.printf("│%3s  ", tablero[i][j]);
			}

			if (i != tablero.length-1) {
				System.out.println("│\n├─────┼─────┼─────┤");	
			}			
		}	

		System.out.println("│\n└─────┴─────┴─────┘");		
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

	//Método para comprobar los índices de la FILA y la COLUMNA
	public static boolean comprobarIndice( int indice ){

		if ( indice > 0 && indice < 4)
			return true;
		else
			return false;
	}

	//Método para comprobar los índices de la FILA y la COLUMNA
	public static boolean comprobarPosicion(char[][] tablero, int fila, int columna) {

		return (tablero[fila][columna] == ' ');
	}

	public static boolean tresEnRaya( char[][] tablero, char valor_juego) {

		
		if((tablero[0][0]==valor_juego) && (tablero[0][1]==valor_juego) && (tablero[0][2]==valor_juego)){
	        return true;
	    }
	    if((tablero[1][0]==valor_juego) && (tablero[1][1]==valor_juego) && (tablero[1][2]==valor_juego)){
	        return true;
	    }
	    if((tablero[2][0]==valor_juego) && (tablero[2][1]==valor_juego) && (tablero[2][2]==valor_juego)){
	        return true;
	    }
	    if((tablero[0][0]==valor_juego) && (tablero[1][0]==valor_juego) && (tablero[2][0]==valor_juego)){
	        return true;
	    }
	    if((tablero[0][1]==valor_juego) && (tablero[1][1]==valor_juego) && (tablero[2][1]==valor_juego)){
	        return true;
	    }
	    if((tablero[0][2]==valor_juego) && (tablero[1][2]==valor_juego) && (tablero[2][2]==valor_juego)){
	        return true;
	    }
	    if((tablero[0][0]==valor_juego) && (tablero[1][1]==valor_juego) && (tablero[2][2]==valor_juego)){
	        return true;
	    }
	    if((tablero[0][2]==valor_juego) && (tablero[1][1]==valor_juego) && (tablero[2][0]==valor_juego)){
	        return true;
	    }
	    return false;
	}	

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		//**************************************************************************
		String s = "Vamos a jugar al 3 en raya...";
		char[] c = s.toCharArray();		
		try {			
			for (int i = 0; i < c.length; i++) {				
				System.out.printf("%s", c[i]);
				Thread.sleep(100);
			}			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//**************************************************************************

		int fila;
		int columna;
		char jugadorActual;		
		boolean partidaTerminada;

		String seguirJugando = "s";		
		while( seguirJugando.equals("s") ) {

			//Inicializar partida
			char[][] tablero = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '} };			
			jugadorActual    = 'X';			
			partidaTerminada = false;

			//Empezar a jugar...	
			while (!partidaTerminada) {

				//Imprimir el tablero
				imprimirTablero( tablero );			

				//Pedir posición en la que se quiere jugar...
				System.out.println("Inserte las coordenadas de la posición donde quiere jugar: ");

				//1.- Fila
				System.out.print("[fila]: ");
				fila = teclado.nextInt();

				//2.- Columna
				System.out.print("[columna]: ");
				columna = teclado.nextInt();		

				//Comprobamos que la FILA está en el rango 1..3
				if ( !comprobarIndice(fila) )
					mensaje ("El valor de la fila no es correcto...");

				//Comprobamos que la COLUMNA está en el rango 1..3
				else if ( !comprobarIndice(columna) )
					mensaje("El valor de la columna no es correcto...");

				//Comprobamos que la POSICIÓN no está utilizada previamente...
				else if ( !comprobarPosicion(tablero, fila-1, columna-1) )
					mensaje("La posición ya está ocupada...");

				//Introducimos el valor en la matriz (tablero)
				else {
					tablero[(fila - 1)][(columna - 1)] = jugadorActual;

					//Comprobar si se ha ganado la partida
					if ( tresEnRaya( tablero, jugadorActual) ){

						mensaje("Felicidades !!! Has GANADO !!!");
						imprimirTablero(tablero);
						partidaTerminada = true;					
					}
					else {
						//Cambiar de jugador
						if (jugadorActual == 'X') {
							jugadorActual = 'O';
						}
						else{
							jugadorActual = 'X'; 	
						}	
					}
				}				
			}			

			//
			teclado.nextLine();
			System.out.print("¿ Desea jugar otra partida ? (s/n)");
			seguirJugando = teclado.nextLine();
		}
	}
}
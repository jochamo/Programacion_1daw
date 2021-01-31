package juegos;

import java.util.ArrayList;

public class Bingo {

	public static void main(String[] args) {

		//1.- Generar Cartones
		int[][] carton1 = generarCarton();
		int[][] carton2 = generarCarton();

		//2.- Imprimir Carton 1
		System.out.println("Cartón 1:");
		imprimirCarton( carton1 );
		System.out.println("");
		System.out.println("Cartón 2:");
		imprimirCarton( carton2 );
		
		//3.- Generar ArrayList con números aleatorios del 1 al 90
		ArrayList<Integer> numeros = generarNumeros();
		
		//4.- Sacar número del bombo
		int numActual;
		
		for (int i = 0; i < numeros.size(); i++) {
			
			numActual = numeros.get(i);
		
			System.out.println("Número: " + numActual);
			
			//5.- Tachar número
			carton1 = tacharNumero( carton1 );
			carton2 = tacharNumero( carton2 );
			
			//6.- Comprobar ganador
			if (ganaCarton(carton1)) {
				
			}
			if (ganaCarton(carton2)) {
				
			}
			
		}		
	}

	public static boolean cabeOtroNumeroEnFila(int fila, int[][] carton){

		int contador = 0;

		for(int i=0; i<9; i++){

			if (carton[fila][i] != 0){

				contador++;
			}			
		}

		return (contador < 5);
	}

	public static int[][] generarCarton(){

		int detectarBucleInfinito   = 0;
		boolean cartonPuedeTerminar = true;
		boolean cartonTerminado     = false;

		int ini  = 0;
		int fin  = 9;
		int max  = 0;
		int cont = 0;
		int fila = 0;

		//Crear el carton del BINGO
		int[][] carton = new int[3][9];

		while( !cartonTerminado ){

			cartonPuedeTerminar = true;
			cartonTerminado     = false;

			//Reiniciar valores del carton (todo a 0)
			for (int i=0; i<3; i++){
				for (int j=0; j<9; j++){
					carton[i][j] = 0;
				}				
			}			

			//Crear las 3 columnas que tienen 1 valor
			int[] columna = {-1,-2,-3};
			int i = 0;
			while (i<3){

				columna[i] = (int)((Math.random()*9));

				if ( (columna[0] != columna[1]) && (columna[0] != columna[2]) && (columna[1] != columna[2]) ){		

					i++;
				}
			}

			//			
			ini = 0;
			fin = 9;

			//Recorrer COLUMNAS
			for(int j = 0; ((j<9)&&(cartonPuedeTerminar)); j++){


				if ((j == columna[0]) || (j == columna[1]) || (j == columna[2])){
					//3 columnas con 1 número
					max  = 1;
					cont = 0;
				}
				else{
					//6 columnas con 2 números
					max  = 2;
					cont = 0;
				}

				detectarBucleInfinito = 0;
				
				//
				while ( (cont < max) && (cartonPuedeTerminar) ){

					//Insertar en fila aleatoria
					fila = (int)((Math.random()*3));

					//
					if ( cabeOtroNumeroEnFila(fila, carton) ){

						if (carton[fila][j] == 0) {

							carton[fila][j] = (int)((Math.random()*(fin-ini+1)) + ini);
							cont++;
						}					
					}

					detectarBucleInfinito++;

					if (detectarBucleInfinito > 40){
						cartonPuedeTerminar = false;
					}
				}

				//
				ini = ini + 10;
				fin = fin + 10;				
			}

			if ((fin == 99) && (cartonPuedeTerminar)){
				cartonTerminado = true;
			}			
		}

		return carton;		
	}

	public static void imprimirCarton(int[][] carton){

		for (int i = 0; i < carton.length; i++){

			for(int j = 0; j < carton[0].length; j++){

				//
				if(carton[i][j] == 0){
					System.out.printf("%3s |", " ");
				}
				else{
					System.out.printf("%3d |", carton[i][j]);	
				}

			}
			System.out.printf("\n");			
		}		
	}
	
	public static ArrayList<Integer> generarNumeros() {
		
		ArrayList<Integer> aleatorio = new ArrayList<Integer>();
		
		int cont = 0;
		int num;
		
		while (cont < 90) {			

			num = (int)((Math.random()*90 + 1));
			
			if ( !aleatorio.contains(num) ) {
				
				aleatorio.add( num );
				cont++;
			}			
		}
		
		return aleatorio;			
	}

	public static int[][] tacharNumero( int[][] carton ){
	
		return null;
	}
	
	public static boolean ganaCarton( int[][] carton ) {
		
	
		return true;		
	}	
	
}
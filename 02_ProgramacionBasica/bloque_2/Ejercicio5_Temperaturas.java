package bloque_2;

public class Ejercicio5_Temperaturas {

	public static void main(String[] args) {

		final String[] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		// NUM_DIAS[0] = 0 y NUM_DIAS[i] = número días del mes i, 1<=i<=12
		final int[] NUM_DIAS = {0,31,28,31,30,31,30,31,31,30,31,30,31};

		// tempMed[0] = null y tempMed[i] representa el mes i, 1<=i<=12
		double[][] tempMed = new double[13][];

		// El número elementos de tempMed[i] = NUM_DIAS[i]+1, 1<=i<=12
		for (int i=1; i<tempMed.length; i++){
			tempMed[i] = new double[NUM_DIAS[i]+1];
		}

		int minima = 3;
		int maxima = 38;
		
		for (int i=1; i<tempMed.length; i++){			
			for(int j=1; j<tempMed[i].length; j++){
				tempMed[i][j] = ((Math.random()*(maxima-minima+1)) + minima);				
			}
		}
		
		//System.out.printf("%10s", "");
		//System.out.printf("%7d", i);		
		//System.out.printf("\n");
		
		//Imprimir todos los elementos del Matriz
		for (int i=1; i<tempMed.length; i++){
			System.out.printf("%10s |", MESES[i-1]);
			for(int j=1; j<tempMed[i].length; j++){
				//Recuperar el valor de la posición i del Matriz
				System.out.printf("%7.2f |", tempMed[i][j]);
			}
			System.out.printf("\n");
		}
		
		
		/*
		 * 3.- Obtener por pantalla el histograma de frecuencia de temperaturas:

		a) Sabiendo que la temperatura mínima fue de 0 grados y la máxima de 38. 
		El histograma constará de 39 líneas con las temperaturas de 0 a 38 
		y el número de días en que se alcanzó dicha temperatura.
		
		b) Si no se sabe cuáles fueron las temperaturas máxima y mínima y sabiendo que una o
		ambas pueden ser negativas (por ejemplo, temperaturas máxima y mínima de Moscú -10 o
		C y +38 o C, respectivamente).
		*/
		
		//double max = temperaturaMaxima(tempMed);
		int n = maxima-minima+5;
		int indice = 0;
		
		int[] frecuencia = new int[n];
		
		for (int i=1; i<tempMed.length; i++){
			for(int j=1; j<tempMed[i].length; j++){
				
				indice = (int) tempMed[i][j];
						
				frecuencia[indice] = frecuencia[indice] + 1;				
			}
		}
		
		
		int f = 0;
		
		for (int i=0; i<frecuencia.length; i++){
			
			f = frecuencia[i];
			System.out.printf("%3dº grados: (%2d)", i, f);
			
			for(int j=0; j<f; j++){
				
				System.out.printf("*");
			}
			System.out.printf("%n");
		}		
	}	
	
	public static double temperaturaMaxima(double[][] miMatriz){

		double max = miMatriz[0][0];

		//Buscar el mayor elemento
		int filas = miMatriz.length;
		int columnas = miMatriz[1].length;

		//Imprimir todos los elementos del Matriz
		for (int i = 0; i < filas; i++){

			for(int j = 0; j < columnas; j++){

				if (miMatriz[i][j] > max){
					max = miMatriz[i][j];
				}				
			}
		}

		return max;
	}
	
	
	public static double temperaturaMinima(double[][] miMatriz){

		double min = miMatriz[0][0];

		//Buscar el mayor elemento
		int filas = miMatriz.length;
		int columnas = miMatriz[1].length;

		//Imprimir todos los elementos del Matriz
		for (int i = 0; i < filas; i++){

			for(int j = 0; j < columnas; j++){

				if (miMatriz[i][j] < min){
					min = miMatriz[i][j];
				}				
			}
		}

		return min;
	}
	
	
}
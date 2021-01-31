package bloque_2;

import java.util.Scanner;

public class Ejercicio5_Temperaturas3d {

	static final int TEMPERATURA = 0;
	static final int LLUVIA      = 1;
	static final int HUMEDAD     = 2;
	
	static final String[] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

	// NUM_DIAS[0] = 0 y NUM_DIAS[i] = número días del mes i, 1<=i<=12
	static final int[] NUM_DIAS = {0,31,28,31,30,31,30,31,31,30,31,30,31};

	// elTiempo[0] = null y elTiempo[i] representa el mes i, 1<=i<=12
	static double[][][] elTiempo;

	static int tempMinima = 3;
	static int tempMaxima = 38;
	static int lluviaMin  = 0;
	static int lluviaMax  = 50;
	static int humedadMin = 0;
	static int humedadMax = 100;	

	public static void main(String[] args) {		

		//Crear datos meteorológicos
		crearDatosElTiempo();

		int opcion;
		while (true)		
		{	
			//Mostrar por pantalla el menú
			System.out.printf("\n1.- Imprimir Temperaturas");
			System.out.printf("\n2.- Imprimir LLuvias");
			System.out.printf("\n3.- Imprimir Humedad\n");
			System.out.printf("\n4.- Max/Min Temperaturas");
			System.out.printf("\n5.- Max/Min LLuvias");
			System.out.printf("\n6.- Max/Min Humedad\n");
			System.out.printf("\n7.- Obtener datos meteorológicos de un dia\n");
			System.out.printf("\n8.- Histograma de frecuencia de Temperaturas");
			System.out.printf("\n\n9.- Salir");
			System.out.printf("\n\nOpcion: ");

			Scanner sc = new Scanner(System.in);
			//Leer la opción escogida por el usuario
			opcion = sc.nextInt();

			switch(opcion){
			case 1:
			{
				imprimirMedicion(TEMPERATURA);
				break;
			}
			case 2:
			{
				imprimirMedicion(LLUVIA);
				break;
			}
			case 3:
			{
				imprimirMedicion(HUMEDAD);				
				break;
			}
			case 4:
			{				
				System.out.println("\n**********************************************");
				System.out.println("La temperatura MÍNIMA de todo el año es: " + (int) medicionMinima(elTiempo, TEMPERATURA) + "ºC");
				System.out.println("La temperatura MÁXIMA de todo el año es: " + (int) medicionMaxima(elTiempo, TEMPERATURA) + "ºC");
				System.out.println("**********************************************");
				break;
			}
			case 5:
			{
				System.out.println("\n**********************************************");
				System.out.println("La lluvia MÍNIMA de todo el año es: " + (int) medicionMinima(elTiempo, LLUVIA) + "m3");
				System.out.println("La lluvia MÁXIMA de todo el año es: " + (int) medicionMaxima(elTiempo, LLUVIA) + "m3");
				System.out.println("**********************************************");
				break;
			}
			case 6:
			{
				System.out.println("\n**********************************************");
				System.out.println("La humedad MÍNIMA de todo el año es: " + (int) medicionMinima(elTiempo, HUMEDAD) + "%");
				System.out.println("La humedad MÁXIMA de todo el año es: " + (int) medicionMaxima(elTiempo, HUMEDAD) + "%");
				System.out.println("**********************************************");
				break;
			}
			case 7:
			{
				System.out.println("Dia:");
				int dia = sc.nextInt();
				System.out.println("Mes:");
				int mes = sc.nextInt();				
				
				System.out.println("\n**********************************************");
				System.out.println("Temperatura: " + elTiempo[mes][dia][0] + "ºC");
				System.out.println("Lluvia: " + elTiempo[mes][dia][1] + "m3");
				System.out.println("Humedad: " + elTiempo[mes][dia][2] + "%");				
				System.out.println("**********************************************");
				
				break;
			}
			case 8:
			{			
				//Mostrar histograma de frecuencia de Temperatura
				mostrarHistogramaTemperaturas();
				break;
			}
			case 9:
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

	private static void crearDatosElTiempo() {

		// elTiempo[0] = null y elTiempo[i] representa el mes i, 1<=i<=12
		elTiempo = new double[13][][];

		// El número elementos de elTiempo[i] = NUM_DIAS[i]+1, 1<=i<=12		
		for (int i=1; i<elTiempo.length; i++){
			elTiempo[i] = new double[NUM_DIAS[i]+1][3];
		}		

		for (int i=1; i<elTiempo.length; i++){			
			for(int j=1; j<elTiempo[i].length; j++){				
				elTiempo[i][j][0] = ((Math.random()*(tempMaxima-tempMinima+1)) + tempMinima);				
				elTiempo[i][j][1] = ((Math.random()*(lluviaMax-lluviaMin+1)) + lluviaMin);				
				elTiempo[i][j][2] = ((Math.random()*(humedadMax-humedadMin+1)) + humedadMin);							
			}
		}		
	}		

	public static void imprimirMedicion(int medicion) {

		for (int i=1; i<elTiempo.length; i++){
			System.out.printf("%10s |", MESES[i-1]);
			for(int j=1; j<elTiempo[i].length; j++){
				System.out.printf("%7.2f |", elTiempo[i][j][medicion]);
			}
			System.out.printf("\n");
		}
	}

	public static void mostrarHistogramaTemperaturas() {

		/*
		 * 3.- Obtener por pantalla el histograma de frecuencia de temperaturas:

		a) Sabiendo que la temperatura mínima fue de 0 grados y la máxima de 38. 
		El histograma constará de 39 líneas con las temperaturas de 0 a 38 
		y el número de días en que se alcanzó dicha temperatura.

		b) Si no se sabe cuáles fueron las temperaturas máxima y mínima y sabiendo que una o
		ambas pueden ser negativas (por ejemplo, temperaturas máxima y mínima de Moscú -10 o
		C y +38 o C, respectivamente).
		 */

		int n = tempMaxima - tempMinima + 5;
		int indice = 0;

		int[] frecuencia = new int[n];

		for (int i=1; i<elTiempo.length; i++){
			for(int j=1; j<elTiempo[i].length; j++){

				indice = (int) elTiempo[i][j][0];

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

	public static double medicionMaxima(double[][][] miMatriz, int medicion){

		double max = miMatriz[1][1][0];

		for (int i = 1; i < miMatriz.length; i++){
			for(int j = 1; j < miMatriz[i].length; j++){

				if (miMatriz[i][j][medicion] > max){
					max = miMatriz[i][j][medicion];
				}				
			}
		}

		return max;
	}	

	public static double medicionMinima(double[][][] miMatriz, int medicion){

		double min = miMatriz[1][1][0];

		for (int i = 1; i < miMatriz.length; i++){
			for(int j = 1; j < miMatriz[i].length; j++){

				if (miMatriz[i][j][medicion] < min){
					min = miMatriz[i][j][medicion];
				}				
			}
		}

		return min;
	}	

}
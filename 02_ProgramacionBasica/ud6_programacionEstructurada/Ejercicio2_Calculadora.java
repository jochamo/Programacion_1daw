package ud6_programacionEstructurada;

import java.util.Scanner;

public class Ejercicio2_Calculadora {

	//Variables globales de la clase
	private static Scanner sc = new Scanner(System.in);
	
	private static final int OP_SUMA     = 1;  
	private static final int OP_RESTA    = 2;
	private static final int OP_MULT     = 3;
	private static final int OP_DIVISION = 4;
	private static final int OP_POTENCIA = 5;
	private static final int OP_RAIZ     = 6;
		
	//Función PRINCIPAL
	public static void main(String[] args) {

		//Variables para cálculos
		double a = 0;
		double b = 0;
		double c = 0;

		//Variable donde se guarda la opción del usuario
		int opcion;

		//Bucle infinito
		while (true)
		{
			//Mostrar por pantalla el menú
			System.out.printf("\n1.- Sumar");
			System.out.printf("\n2.- Restar");
			System.out.printf("\n3.- Multiplicar");
			System.out.printf("\n4.- Dividir");
			System.out.printf("\n5.- Potencia");
			System.out.printf("\n6.- Raiz");
			System.out.printf("\n\n9.- Salir");
			System.out.printf("\n\nOpcion: ");

			//Leer la opción escogida por el usuario
			opcion = sc.nextInt();

			switch(opcion){
			case OP_SUMA:
			{
				a = leerNumero(" primer");
				b = leerNumero(" segundo");
				c = sumar(a, b);
				imprimirResultado(a, b, c, OP_SUMA, "sumar", "mas");
				break;
			}
			case OP_RESTA:
			{
				a = leerNumero(" primer");
				b = leerNumero(" segundo");
				c = restar(a, b);
				imprimirResultado(a, b, c, OP_RESTA, "restar", "menos");
				break;
			}
			case OP_MULT:
			{
				a = leerNumero(" primer");
				b = leerNumero(" segundo");
				c = multiplicar(a, b);
				imprimirResultado(a, b, c, OP_MULT, "multiplicar", "por");
				break;
			}
			case OP_DIVISION:
			{				
				a = leerNumero(" primer");
				b = leerNumero(" segundo");
				c = dividir(a, b);
				imprimirResultado(a, b, c, OP_DIVISION, "dividir", "entre");
				break;
			}
			case OP_POTENCIA:
			{
				a = leerNumero(" primer");
				b = leerNumero(" segundo");
				c = potencia(a, b);
				imprimirResultado(a, b, c, OP_POTENCIA, "elevar", "a");
				break;
			}
			case OP_RAIZ:
			{
				a = leerNumero("");
				c = raiz(a);						
				imprimirResultado(a, b, c, OP_RAIZ, "", "");
				break;
			}
			case 9:
			{
				System.out.println("\nFIN del programa");
				System.exit(0);
			}
			default:
			{
				System.out.printf("\nOpción incorrecta\n");
				break;
			}
			}			
		}
	}

	//Función que lee un número decimal introducido por teclado
	public static double leerNumero(String texto){

		double numero = 0.0;
		
		System.out.printf("\nIntroduza el%s número:\n", texto);
		
		numero = sc.nextDouble();
				
		return numero;
	}

	//Función que imprime el resultado de las operaciones de una calculadora
	public static void imprimirResultado(double a, double b, double c, int opcion, 
			String texto1, String texto2){
		
		//La raiz se imprime diferente al resto de opciones
		if (opcion == OP_RAIZ){
			//Imprimir resultado RAIZ
			System.out.printf("\nLa RAIZ cuadrada de %.2f es: %.2f\n", a, c);
		}
		else
		{
			//Imprimir el resto de operaciones
			System.out.printf("\nEl resultado de %S %.2f %s %.2f es: %.2f\n", 
					texto1, a, texto2, b, c);				
		}
		
		
		
		/*
		switch(opcion){
		case OP_SUMA: case OP_RESTA: case OP_MULT: case OP_DIVISION: case OP_POTENCIA:
		{
			System.out.printf("\nEl resultado de %S %.2f %s %.2f es: %.2f\n", texto1, a, texto2, b, c);				
			break;
		}		
		case OP_RAIZ:
		{
			System.out.printf("\nLa RAIZ cuadrada de %.2f es: %.2f\n", a, c);					
			break;
		}		
		default:
		{
			System.out.printf("\nOpción incorrecta\n");
			break;
		}
		}
		*/		
	}

	//Función que calcula la suma de dos números pasados como parámetros
	public static double sumar(double a, double b){

		return a + b;
	}

	//Función que calcula la diferencia de dos números pasados como parámetros
	public static double restar(double a, double b){

		return a - b;
	}

	//Función que calcula el producto de dos números pasados como parámetros
	public static double multiplicar(double a, double b){

		return a * b;
	}

	//Función que calcula el cociente de dos números pasados como parámetros
	public static double dividir(double a, double b){

		return a / b;
	}

	//Función que calcula la potencia de dos números pasados como parámetros
	public static double potencia(double a, double b){

		return Math.pow(a, b);
	}

	//Función que calcula la raiz cuadrada de un número pasado como parámetro
	public static double raiz(double a){

		return Math.sqrt(a);
	}
	
}
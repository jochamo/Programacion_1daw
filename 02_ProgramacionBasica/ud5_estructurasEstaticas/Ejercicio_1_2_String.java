package ud5_estructurasEstaticas;

import java.util.Scanner;

public class Ejercicio_1_2_String {

	public static void main(String[] args) {

		//Variable donde se guarda la opción del usuario
		int opcion = 0;

		//Bucle infinito
		while (true)
		{
			//Mostrar por pantalla el menú
			System.out.printf("\n1.- Longitud de una cadena");
			System.out.printf("\n2.- Comparación de dos cadenas");
			System.out.printf("\n3.- Concatenación de dos cadenas");
			System.out.printf("\n4.- Obtener subcadenas");
			System.out.printf("\n5.- Invertir cadenas");
			System.out.printf("\n6.- Palabra o frase palíndromo");
			System.out.printf("\n\n9.- Salir");
			System.out.printf("\n\nOpcion: ");

			Scanner sc = new Scanner(System.in);

			//Leer la opción escogida por el usuario
			opcion = sc.nextInt();

			switch(opcion){
			case 1:
			{		
				longitudCadena();								
				break;
			}
			case 2:
			{
				compararCadenas();
				break;
			}
			case 3:
			{
				concatenarCadenas();				
				break;
			}
			case 4:
			{
				obtenerSubcadenas();				
				break;
			}
			case 5:
			{
				cadenaInvertida();				
				break;
			}
			case 6:
			{
				esPalindromo();				
				break;
			}
			
			
			case 7:
			{
				imprimirPalabraLetraALetra();				
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

	public static void longitudCadena(){

		//Pedir cadena a usuario
		String cadena = pedirCadena();

		//Imprimir resultado
		System.out.printf("\nLa longitud de la cadena %s es %d\n", cadena, cadena.length());
	}

	public static void compararCadenas(){

		String cadena1 = pedirCadena();
		String cadena2 = pedirCadena();

		int comparacion = cadena1.compareTo(cadena2);
		
		//Imprimir resultado
		if (comparacion == 0){
			System.out.println("\nLas dos cadenas son iguales");
		}
		else{
			if(comparacion > 0){
				System.out.printf("\nLa cadena %s es alfabeticamente MAYOR que %s\n", cadena1, cadena2);
			}
			else{
				System.out.printf("\nLa cadena %s es alfabeticamente MENOR que %s\n", cadena1, cadena2);
			}
		}		
	}

	public static void concatenarCadenas(){

		String cadena1 = pedirCadena();
		String cadena2 = pedirCadena();

		//Imprimir resultado
		System.out.printf("\nEl resultado de concatenar %s y %s es: %s\n", cadena1, cadena2, cadena1+cadena2);
	}

	public static void obtenerSubcadenas(){

		String cadena = pedirCadena();

		int inicio = 0;
		int fin    = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("DESDE que caracter quieres cortar la cadena:");
		inicio = sc.nextInt();
		System.out.println("HASTA que caracter quieres cortar la cadena:");
		fin = sc.nextInt();
				
		//Imprimir resultado
		System.out.printf("\nLa subcadena entre %d y %d de %s es: %s\n", inicio, fin, cadena, cadena.substring(inicio, fin));
	}

	public static String invertirCadena(String cadenaOriginal){
		
		String cadenaResultado = "";
		
		for (int i = cadenaOriginal.length()-1; i >= 0; i--){
			
			cadenaResultado = cadenaResultado + cadenaOriginal.charAt(i);			
		}
		
		return cadenaResultado;
	}
	
	public static void cadenaInvertida(){

		String cadenaOriginal  = pedirCadena();
		String cadenaResultado = invertirCadena( cadenaOriginal );		
		
		//Imprimir resultado
		System.out.printf("\n%S es la cadena invertida de %S\n", cadenaResultado, cadenaOriginal);
	}

	public static void esPalindromo(){

		String cadenaOriginal  = pedirCadena();
				
		cadenaOriginal = cadenaOriginal.toLowerCase();
		cadenaOriginal = cadenaOriginal.replace(" ", "");
		
		String cadenaResultado = invertirCadena( cadenaOriginal );
		
		//
		if (cadenaOriginal.equals(cadenaResultado)){
			System.out.printf("\nLa cadena %s SI es palíndromo\n", cadenaOriginal);
		}
		else{
			System.out.printf("\nLa cadena %s NO es palíndromo\n", cadenaOriginal);
		}
	}

	public static String pedirCadena(){		

		Scanner sc = new Scanner(System.in);

		System.out.println("\nIntroducir cadena: ");

		String cadena = sc.nextLine();

		return cadena;
	}
	
	private static void imprimirPalabraLetraALetra() {
		
		
		String palabra = pedirCadena();
		
		
		for (int i = 0; i < palabra.length(); i++) {
		
			
			System.out.println(   palabra.charAt( i )    );
		}
		
	}	
}
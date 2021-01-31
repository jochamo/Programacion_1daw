package ud6_programacionEstructurada;

public class ClaseFunciones {

	//Método Principal
	public static void main(String[] args) {

		//1.- Método VOID sin parámetros 
		imprimeHolaMundo();
		
		//2.- Método VOID con 1 parámetro
		int a = 5;		
		imprimeNumero(a);
		imprimeNumero(13);		
		
		//3.- Método VOID con 2 parámetros
		int b = 7;
		imprimeDosNumeros(a, b);		
		imprimeDosNumeros(b, a);
		System.out.println( a );
		 
		//4.- Método INT con 2 parámetros		
		int c = 0;
		
		c = sumar(a, b, 7);
		
		System.out.println("La suma es: " + c);
		 
		//5.- Método BOOLEAN con 1 parámetro
		int año = 2012;

		if(   esBisiesto(año)     )  //llamada al método
			System.out.println("Bisiesto");
		else
			System.out.println("No es bisiesto");
	}

	//1.- Método VOID sin parámetros
	private static void imprimeHolaMundo() {

		System.out.println("Hola Mundo");
	}

	//2.- Método VOID con 1 parámetro
	private static void imprimeNumero(int x) {

		System.out.println("El número es: " + x);		
	}

	//3.- Método VOID con 2 parámetros
	private static void imprimeDosNumeros(int x, int y) {
	
		System.out.println("El primer número es: " + x);
		System.out.println("El segundo número es: " + y);
	}

	//4.- Método INT con 2 parámetros
	private static int sumar(int x, int y, int z) {

		int a = 0;
	
		a = x + y + z;

		return a;
	}	
		
	//5.- Método BOOLEAN con 1 parámetro
	//    Método que calcula si un año es o no bisiesto    
	private static boolean esBisiesto(int anyo){  
		
		if(anyo%4 == 0 && anyo%100 != 0 || anyo%400 == 0)
			return true;
		else
			return false;
	}	
	
}
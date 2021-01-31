package ud6_programacionEstructurada;

public class ClaseFunciones13 {

	public static void main(String[] args) {

		int x = 7;

		// 1.- Función VOID sin Parámetros
		imprimeHolaMundo();
		String texto = "otro texto";

		// 2.- Función VOID con 1 parámetro
		int a = 5;
		imprimeNumero(a);
		imprimeNumero(7);

		// 3.- Función VOID con 2 parámetros
		imprimeDosNumeros(a, 7);
		imprimeDosNumeros(a, a);

		// 4.- Función INT con 2 parámetros
		int suma = 0;
		suma = sumar(x, a);
		imprimeNumero(suma);

		// 5.- Función BOOLEAN con 1 parámetro
		int anyo = 2013;
		
		if (    esBisiesto( anyo )    ){
			imprimeTexto("Es bisiesto");
		}
		else{
			imprimeTexto("NO es bisiesto");
		}
		
		
	}

	public static void imprimeHolaMundo() {
		System.out.println("Hola Mundo");
	}

	public static void imprimeTexto(String texto) {
		System.out.println(texto);
	}

	public static void imprimeNumero(int x) {
		System.out.println("El número es " + x);
	}

	public static void imprimeDosNumeros(int x, int y) {
		System.out.printf("Los números son %d y %d%n", x, y);
	}

	public static int sumar(int n, int m) {
		int suma = 0;

		suma = n + m;

		return suma;
	}	
	
	public static boolean esBisiesto( int anyo ){
		
		boolean bisiesto;
		
		
		if (anyo%4 == 0){			
			bisiesto = true;
		}
		else{
			bisiesto = false;
		}
		
		return bisiesto;	
		
		
	}
	
	
	
	
	
	
}
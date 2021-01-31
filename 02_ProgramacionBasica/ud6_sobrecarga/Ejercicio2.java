package ud6_sobrecarga;

public class Ejercicio2 {

	public static void main(String[] args) {

		//Imprimir resultados funciones sobrecargadas		
		System.out.println( mayor(5, 9) );
		System.out.println( mayor(5, 13, 9) );
		System.out.println( mayor(5, 13, 18, 9) );		
		System.out.println( mayor("hola", "adiós") );
	}

	public static int mayor(int a, int b) {

		return mayor(a, b, Integer.MIN_VALUE);
	}

	public static int mayor(int a, int b, int c) {

		int res = Integer.MIN_VALUE;

		if ((a > b) && (a > c)) { res = a; }

		if ((b > a) && (b > c)) { res = b; }

		if ((c > a) && (c > b)) { res = c; }

		return res;
	}

	public static int mayor(int a, int b, int c, int d) {

		int res = mayor(a, b, c);
		
		if (d > res) {
			 res = d;
		}				
		return res;
	}

	public static int mayor(String a, String b) {

		//Programar la función como el compareTo de la clase String

		return 0;
	}  

}
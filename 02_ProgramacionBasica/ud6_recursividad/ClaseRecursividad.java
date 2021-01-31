package ud6_recursividad;

public class ClaseRecursividad {

	public static void main(String[] args) {

		// int f = factorial( 6 );
		System.out.println("1024 = " + powRTC(2, 10));
		System.out.println("1    = " + powRTC(1, 10));
		System.out.println("10   = " + powRTC(10, 1));
		System.out.println("1    = " + powRTC(10, 0));
		System.out.println("0    = " + powRTC(0, 10));

		System.out.println("0120345 = " + sumarDigitos(0120345));
		
		System.out.println("2 SI es par   = " + esPar(2));
		System.out.println("3 NO es par   = " + esPar(3));
		System.out.println("2 NO es impar = " + esImpar(2));
		System.out.println("3 SI es impar = " + esImpar(3));
		
		System.out.println("7 - 2 = " + trianguloPascal(7, 2));		
	}

	public static int trianguloPascal(int f, int i) {

		// 1.- 1
		// 2.- 1 1
		// 3.- 1 2 1
		// 4.- 1 3 3 1
		// 5.- 1 4 6 4 1
		// 6.- 1 5 10 10 5 1
		// 7.- 1 6 15 20 15 6 1

		if ((i == 1) || (i == f)) {
			return 1;
		} else {
			return trianguloPascal(f - 1, i) + trianguloPascal(f - 1, i - 1);
		}
	}
	
	//
	public static boolean esPar(int n) {

		if (n == 0) {

			return true;

		} else {

			return esImpar(n - 1);
		}
	}

	public static boolean esImpar(int n) {

		if (n == 0) {

			return false;

		} else {

			return esPar(n - 1);
		}
	}

	public static int sumarDigitos(int n) {

		// Devuelve la suma de los dígitos de un número natural n ≥ 0

		if (n == 0) {

			return 0;
		} else {
			return sumarDigitos(n / 10) + (n % 10);
		}

	}

	public static int powRTC(int a, int b) {

		if (b == 0) {
			return 1;
		} else {
			return a * pow(a, b - 1);
		}
	}

	public static int pow(int a, int b) {

		// a^b = 1, si b = 0,
		// a^b = a, si b = 1,
		// a^b = (a^b/2)*(a^b/2), si b > 1 y b es par, y
		// a^b = (a^b/2)*(a^b/2)* a, si b > 1 y b es impar.

		int res = 0;

		if (b == 0) {
			res = 1;
		} else {
			if (b == 1) {
				res = a;
			} else {
				if (b % 2 == 0) {
					// par
					res = pow(a, b / 2) * pow(a, b / 2);
				} else {
					// impar
					res = pow(a, b / 2) * pow(a, b / 2) * a;
				}
			}
		}

		return res;
	}

	public static int factorial(int n) {

		if (n <= 1) {

			return 1;
		} else {

			return n * factorial(n - 1);
		}
	}

}
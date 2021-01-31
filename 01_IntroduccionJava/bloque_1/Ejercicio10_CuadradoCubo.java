package bloque_1;

import java.util.Scanner;

public class Ejercicio10_CuadradoCubo {

	public static void main(String[] args) {

		int n = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce número");
		n = sc.nextInt();

		String texto1 = "Número";
		String texto2 = "Cuadrado";
		String texto3 = "Cubo";

		System.out.printf("%12s%12s%12s%n", texto1, texto2, texto3);
		for (int i = 0; i < 42; i++) {
			System.out.printf("-");	
		}		
		System.out.printf("%n");

		for (int i = 0; i < 5; i++) {

			System.out.printf("%12d", n);
			System.out.printf("%12d", (n*n));
			System.out.printf("%12d %n", (n*n*n));

			n++;
		}
	}

}
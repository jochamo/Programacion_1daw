package ud5_estructurasEstaticas;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_1_3_Random {

	public static void main(String[] args) {

		int numAzar = 0;
		String respuesta = " ";

		Random x = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.printf("Hola, %nTe propongo un juego. %nYo pienso en un número entre 1 y 100, y tú tienes que acertarlo. %nTe diré si es más o menos según el número que me digas ¿sí? %n%n¿Quieres jugar? (s/n)");
		respuesta = sc.nextLine();

		if (respuesta.equals("s")) {

			do {
				numAzar = (x.nextInt(100 + 1));
				int intentos = 0;
				int n = 0;

				while (n != numAzar) {

					System.out.printf("Dime un número");
					n = sc.nextInt();

					intentos++;

					if (n == numAzar) {
						System.out.printf("%nFELICIDADES, acertaste el número %nHas necesitado %d intentos.%n", intentos);
					}
					else {
						if (numAzar > n) {
							System.out.printf("%nMi número es mayor.%n");
						}
						else {
							System.out.printf("%nMi número es menor.%n");
						}						
					}

				}
				System.out.printf("%n¿Quieres jugar otra vez?");
				sc.nextLine();
				respuesta = sc.nextLine();

			} while (respuesta.equals("s"));

		}
		System.out.println("¡¡Nos vemos!! (^-^)");

	}

}
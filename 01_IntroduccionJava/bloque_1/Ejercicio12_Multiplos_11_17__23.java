package bloque_1;

import java.util.Scanner;

public class Ejercicio12_Multiplos_11_17__23 {

	public static void main(String[] args) {

		String opcion = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Este programa mostrará los múltiplos de un número hasta 100.");
		//	bucle infinito
		while (true) {
			System.out.printf("%n%n Escoge una de las siguiente opciones: %n");
			System.out.println("a) 11");
			System.out.println("b) 17");
			System.out.println("c) 23");
			System.out.printf("%nPulse ENTER para Salir%n");

			opcion = sc.nextLine();

			int multi = 1;
			int total = 0;

			switch (opcion) {
			case "a":
			{
				while (total<100) {
					total = 11 * multi;
					if (total <=100) {

						System.out.printf("%d %n", total);
					}
					multi++;
				}
				break;
			}
			case "b":
			{	
				while (total<100) {
					total = 17 * multi;
					if (total <=100) {

						System.out.printf("%d %n", total);
					}
					multi++;
				}
				break;
			}
			case "c":
			{
				while (total<100) {
					total = 23 * multi;
					if (total <=100) {

						System.out.printf("%d %n", total);
					}
					multi++;
				}
				break;
			}
			case "":
			{
				System.out.println("FIN del programa");
				System.exit(0);
			}
			default:
			{
				System.out.printf("%nOpción incorrecta");
				break;
			}
			}
		}
	}

}
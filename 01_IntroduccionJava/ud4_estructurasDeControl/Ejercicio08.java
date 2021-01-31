package ud4_estructurasDeControl;

import java.util.Scanner;

public class Ejercicio08 {

	static final String piedra  = "piedra";
	static final String papel   = "papel";
	static final String tijeras = "tijeras";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String opPlayer1 = "";
		String opCPU     = "";

		System.out.println("Player 1:");
		opPlayer1 = sc.nextLine();		
		
		//TODO hacer un RANDOM
		opCPU = piedra;

		System.out.println("CPU: " + opCPU);
		if (opPlayer1.equals(opCPU)) {
			System.out.println("EMPATE");
		}
		else {

			if ((opPlayer1.equals(piedra) && opCPU.equals(tijeras)) ||
				(opPlayer1.equals(papel) && opCPU.equals(piedra)) ||
				(opPlayer1.equals(tijeras) && opCPU.equals(papel)) ){

				System.out.println("Player 1 wins!");
			}
			else {
				System.out.println("Player 1 lose!");
			}
		}
	}

}
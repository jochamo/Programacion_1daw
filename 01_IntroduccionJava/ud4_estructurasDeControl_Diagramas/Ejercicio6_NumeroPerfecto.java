package ud4_estructurasDeControl_Diagramas;

public class Ejercicio6_NumeroPerfecto {

	public static void main(String[] args) {

		int s, c;		
		int n = 6; //6 - 28 - 496 - 8128 ;

		if (n>1) {

			s = 1;
			c = 1;

			do {
				c++;

				if (n % c == 0) {
					s = s + c;
				}

			}while(c < (n/2));

			if (s == n) {
				System.out.println( n + " SI es perfecto");				
			}
			else {
				System.out.println( n + " NO es perfecto");
			}

		}
		else {
			System.out.println( n + " NO es perfecto");
		}
	}

}
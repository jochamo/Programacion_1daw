package examenBloque1;

import java.util.Scanner;

public class Diagrama {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n;
		int c   = 0;
		int mc  = 0;
		int mec = 0;
		
		do {			
			c = c + 1;
			n = sc.nextInt();
			
			if (n > 0) {
				mc = mc + 1;
			}
			else {
				mec = mec + 1;
			}
			
		}while(c != 10);

		System.out.println("Numeros positivos: " + mc);
		System.out.println("Numeros negativos o nulos: " + mec);
	}

}
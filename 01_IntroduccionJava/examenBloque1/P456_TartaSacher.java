package examenBloque1;

import java.util.Scanner;

public class P456_TartaSacher {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		int n, m, r, total;
		
		for (int i = 0; i < casos; i++) {
		
			n = sc.nextInt();
			m = sc.nextInt();
			r = sc.nextInt();

			total = n * m;
			
			if (r % total == 0) {
				System.out.println( r / total  );
			}
			else {
				System.out.println( r / total + 1 );
			}
		}
	}

}
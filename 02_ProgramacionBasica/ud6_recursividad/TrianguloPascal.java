package ud6_recursividad;

public class TrianguloPascal {

	public static void main(String[] args) {

		int n = 12;
		int aux = n;

		for (int f = 1; f < n; f++) {

			for (int j = aux; j > 0; j--) {
				System.out.printf("    ");
			}

			for (int i = 1; i <= f; i++) {

				System.out.printf("%8d", trianguloPascal(f, i));
			}

			System.out.printf("%n");

			aux--;
		}

		/*
		 * int n = 10;
		 * 
		 * int b = n; for (int i = 1; i <= n; i++) { System.out.printf("%"+(b*2)+"s",
		 * " "); for (int j = 1; j <= i; j++) { System.out.printf("%4d",
		 * trianguloPascal(i, j)); } System.out.println(); b--; }
		 */

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

}
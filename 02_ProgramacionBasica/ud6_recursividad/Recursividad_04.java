package ud6_recursividad;

public class Recursividad_04 {

	public static void main(String[] args) {

		int [][]matriz = {{2,4,4},{6,6,9},{8,10,12}};

		//imprimirMatriz(matriz, 0, 0);

		int v2[] = {0, 11, 2, 13, 4, 5, 6, 17, 8};
		f(v2, 0);
	}

	public static void f(int[] v, int i) {
		
		if (i>=v.length) {
			System.out.println("-------------");
		}
		else {
			if (i==v[i]) {
				System.out.printf("v[%d]==%d\n", i, v[i]);
				f(v,i+1);
			}
			else {
				f(v,i+1);
				System.out.printf("v[%d]!=%d\n", i, i);
			}
		}
	}

	public static void imprimirMatriz(int[][] m, int fila, int columna) {

		if (columna < m[0].length) {

			System.out.printf( "%3d", m[fila][columna] );

			//Cambio de columna
			imprimirMatriz(m, fila, columna+1);

			//
			if ( (fila+1 < m.length) && (columna == m[0].length-1)) {

				//Siguiente fila
				System.out.println();

				//Cambio de fila
				imprimirMatriz(m, fila+1, 0);	
			}			
		}
	}


}

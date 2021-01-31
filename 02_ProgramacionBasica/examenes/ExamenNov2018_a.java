package examenes;

public class ExamenNov2018_a {

	public static void main(String[] args) {

		System.out.println();
		matrizCuriosa( 3 );				
		System.out.println();
		matrizCuriosa( 5 );				
		System.out.println();
		matrizCuriosa( 7 );				
		System.out.println();

		//
		int[][] a = {{7, 13, 13},{13, 7, 13},{13, 13,  7}};
		int[][] b = {{7,  7, 13},{13, 7, 13},{13,  7, 13}};
		int[][] c = {{7, 13, 83},{13, 7, 13},{13,  7, 13}};
		int[][] d = {{1, 0, 0},{0, 1, 0},{0, 0, 1}};
		System.out.println( "Es molona a: " + esMolona(a) );
		System.out.println( "Es molona b: " + esMolona(b) );
		System.out.println( "Es molona c: " + esMolona(c) );
		System.out.println( "Es molona d: " + esMolona(d, 0, 1) );
		System.out.println();
		
		//
		System.out.println("Es referencia 'Arco': " + esReferenciaMorse("Arco"));
		System.out.println("Es referencia 'Bolo': " + esReferenciaMorse("Bolo"));
		System.out.println("Es referencia 'Corazon': " + esReferenciaMorse("Corazon"));
		System.out.println("Es referencia 'Drogada': " + esReferenciaMorse("Drogada"));
	}

	public static boolean esReferenciaMorse(String palabra) {

		/*
		A   .-			N	-.
		B	-...		O	---
		C	-.-.		P	.--.
		D	-..			Q	--.-
		E	.			R	.-.
		F	..-.		S	...
		G	--.			T	-
		H	....		U	..-
		I	..			V	...-
		J	.---		W	.--
		K	-.-			X	-..-
		L	.-..		Y	-.--
		M	--			Z	--..
		 */

		String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", 
				"--.", "....", "..", ".---", "-.-", ".-..",	"--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
				"...-", ".--", "-..-", "-.--", "--.."};
		
		String[][] morseABC = {{"A", ".-"}, {"B", "-..."}, {"C", "-.-."}, {"D", "-.."},
				{"E", "."}, {"F", "..-."}, {"G", "--."}, {"H", "...."}, 
				{"I", ".."}, {"J", ".---"}, {"K", "-.-"}, {"L", ".-.."},	
				{"M", "--"}, {"N", "-."}, {"O", "---"}, {"P", ".--."}, 
				{"Q", "--.-"}, {"R", ".-."}, {"S", "..."}, {"T", "-"},
				{"U", "..-"}, {"V", "...-"}, {"W", ".--"}, {"X", "-..-"}, 
				{"Y", "-.--"}, {"Z", "--.."}};
		
		boolean esReferencia = true;
		String codigo = "";
		
		//1.- Pasar palabra a minúsculas (o mayúsculas)
		palabra = palabra.toUpperCase();
		
		//2.- Construir codigo Morse
		for (int i = 0; i < palabra.length(); i++) {
			//2.a.- Para la vocal 'o' una raya
			if (palabra.charAt(i) == 'O') {
				codigo += "-";
			}
			else {
				//2.b.- Para el resto de vocales, un punto
				if ((palabra.charAt(i) == 'A') || (palabra.charAt(i) == 'E') || (palabra.charAt(i) == 'I') || (palabra.charAt(i) == 'U')) {
					codigo += ".";	
				}
			}			
		}

		//3.- (opcion A) Comprobar si el código morse existe en el VECTOR
		int pos = -1;
		for (int i = 0; i < morse.length; i++) {
			if (morse[i].equals(codigo)) {
				pos = i;
				break;
			}
		}
		
		//3.- (opcion B) Comprobar si el código morse existe en la MATRIZ
		pos = -1;
		for (int i = 0; i < morseABC.length; i++) {
			if (morseABC[i][1].equals(codigo)) {
				pos = i;
				break;
			}
		}

		//4.- (opcion A) Comprobar si la primera letra de la palabra es igual a la letra del codigo morse generado
		int prim = palabra.charAt(0);
		esReferencia = (prim == (97 + pos));
		
		//4.- (opcion B) Comprobar si la primera letra de la palabra es igual a la letra del codigo morse generado
		esReferencia = morseABC[pos][0].equals( "" + palabra.charAt(0) );

		//5.- Devolver el resultado
		return esReferencia;
	}

	public static boolean esMolona(int[][] m) {

		//Sobrecarga de funciones !!!
		return esMolona(m, 7, 13);
	}

	public static boolean esMolona(int[][] m, int a, int b) {
		
		boolean esMolona = true;

		//Recorrer mismo número de filas que de columnas
		for (int i = 0; i < m.length; i++) {
			
			if (!comprobarFila(m, i, a, b)) {
				esMolona = false;
				break;	
			}
			if (!comprobarColumna(m, i, a, b)) {
				esMolona = false;
				break;	
			}
		}

		return esMolona;
	}
	
	public static boolean comprobarFila(int[][] m, int fila, int a, int b) {

		boolean filaOK = true;
		int veces_b    = 0;

		for (int i = 0; i < m.length; i++) {			

			if (m[fila][i] == b) {
				veces_b++;
			}
			else {
				if (m[fila][i] != a) {
					filaOK = false;
					break;
				}
			}

			if (veces_b > 1) {
				filaOK = false;
				break;
			}					
		}

		return filaOK;
	}

	public static boolean comprobarColumna(int[][] m, int columna, int a, int b) {

		boolean columnaOK = true;
		int veces_b       = 0;

		for (int i = 0; i < m.length; i++) {			

			if (m[i][columna] == b) {
				veces_b++;
			}
			else {
				if (m[i][columna] != a) {
					columnaOK = false;
					break;
				}
			}

			if (veces_b > 1) {
				columnaOK = false;
				break;
			}					
		}

		return columnaOK;
	}

	public static void matrizCuriosa( int n ) {

		int[][] m = new int[n][n];
		
		/*
		int x = 1;
		int y = 1;
		int z = 1;

		//Generar matriz curiosa
		for (int i = 0; i < n; i++) {

			//Recorrer a partir del elemento (i, i)
			m[i][i] = x;			

			//1.- Para pasar al siguiente elemento, la primera vez se suma el tamaño de la matriz
			y = x + n;
			
			x = x + 1;
			z = 1;

			//Recorrer el resto de elementos del triangulo superior
			for (int j = i+1; j < n; j++) {

				m[i][j] = y;

				//2.- El resto de veces se suma uno menos cada vez
				y = y + n - z;
				z = z + 1;
			}			
		}

		*/		
		
		int i = 0;
		int j = 0;
		
		int cont = 1;		
		int col  = 0;
		
		while (j < m.length) {
			
			m[i][j] = cont;	
			cont++;
			
			if (j != m.length-1) {				
				i++;
				j++;				
			}
			else {
				i = 0;
				col++;
				j = col;					
			}			
		}
		
		//Imprimir matriz
		for (i = 0; i < m.length; i++) {			
			for (j = 0; j < m.length; j++) {
				System.out.printf("%5d", m[i][j]);
			}
			System.out.println();
		}
	}

}
package ud6_recursividad;

public class Recursividad_02 {

	public static void main(String[] args) {

		//
		int[] v = {0,0,0,1,2,3,4,5,5,5,5,6,0,0,0,0};
		int[] r = null;

		//0.- 
		System.out.println("Los elementos del vector son: ");
		
		System.out.printf("  Ascendente:  ");
		imprimirVectorAscendente( v );
		System.out.println("");
		
		System.out.printf("  Descendente: ");
		imprimirVectorDescendente( v );
		System.out.println("");
		
		//15.-

		//a.- 		
		System.out.println("La suma de todos los elementos del vector es: " + sumarVector( v ));

		//b.1.-
		System.out.println("El valor del máximo elemento del vector es: " + valorMaximo(v, 0, v.length-1));
		//b.2.-
		int[] v2 = {1,2,3,7,4};
		//System.out.println("La posición del máximo elemento del vector es: " + posicionMaximo(v2, 0, v2.length-1, Integer.MIN_VALUE));
		System.out.println("La posición del máximo elemento del vector es: " + posicionMaximo(v2, 0, v2.length-1));
		System.out.println("La posición del 7en el vector es: " + posicionDelNumeroX(v2, 0, v2.length-1, 7));		

		//c.- 		
		System.out.println("El entero 5 aparece en el vector " +  vecesRepetido(v, 5) + " veces.");

		//d.-
		int[] v3 = {0,1,2,3,4};		
		System.out.println("El vector está ordenado ascendentemente: " + ordenadoAscendente(v3));

		//e.- 		
		System.out.println("La posición del primer elemento no nulo del array es: " + posicionPrimerNoNulo(v));

		//f.- 		
		System.out.println("Al final del vector hay " + cerosFinales(v, 0, v.length-1) + " ceros consecutivos.");
		
		//g.- 		
		System.out.println("El vector con las posiciones invertidas desde 3 hasta 11 es: ");
		r = invertirElementos(v, 4, 10);
		imprimirVectorAscendente( r );		
		System.out.println("");
		
		//h.-
		System.out.println("El vector con los valores duplicados desde 3 hasta 11 es: ");
		r = duplicarElementos(v, 4, 10);
		imprimirVectorAscendente( r );
		System.out.println("");
		
		//i.-
		int[] v13 = {1,2,3,4,5};
		System.out.println("La suma de todas las componentes del vector es igual a 10 ?? " + esIgualSuma(v13, 15));
		
		//j.-
		System.out.println("El número de elementos menores de 3 son: " + contarNumerosMenores(v, 3));
		
		//k.-
		System.out.println("El número de elementos impares que ocupan posiciones pares en el vector es: " + elementosImparesEnPosicionesPares(v, 0, v.length-1));

		//l.-
		int[] v5 = {0,0,8,5,2,3,4,5,5,5,5,6,0,0,0,0};
		System.out.println("La posición de la primera subsecuencia de 3 números consecutivos es: " + posicionSubsecuenciaTresConsecutivos(v5, 0, v5.length-2));
		
		//16.- 
		String[] frase = {"hola","pepe","hola"};
		
		/*

		16. Dado un array de String v, escribir un método de clase recursivo que:

		a) determine si es capicúa, esto es, si la primera y última palabra del array son la misma, 
		   la segunda y la penúltima palabras también lo son, y así sucesivamente. 
		   El método retornará true si el array es capicúa o false en caso contrario. 

		b) dada una palabra pal, determine la existencia de dicha palabra en el array entre dos posiciones 
		   dadas ini y fin que cumplen inicialmente:   0≤ini≤fin<v.length. 
		   Caso de existir la palabra, el método devolverá la primera posición donde se encuentre la misma, 
		   y de no existir el método devolverá el valor -1. 

		 */

		//17.

		String s1 = "cadenaca";
		String s2 = "ca";

		//a.- 		
		System.out.println("s2 es  prefijo  de s1: " + esPrefijo(s1, s2));

		//b.- 		
		System.out.println("s2 es  sufijo   de s1: " + esSufijo(s1, s2));

		//c.- 		
		System.out.println("s2 es subcadena de s1: " + esSubcadena(s1, s2));

		/*

		18. Escribir un método de clase recursivo que, dados un String s y su longitud l, muestre en orden inverso los caracteres de s.

		19. Escribir un método de clase recursivo que dé el mismo resultado que el ejercicio previo pero recibiendo sólo la cadena (String). 
		Ayuda: usar el método substring.
		
		*/

		//20.- Escribir un método de clase recursivo que compruebe si un String s dado es palíndromo.
		String s = "Ana";
		System.out.println("Ana es palíndromo: " + esPalindromo(s));
		System.out.println("Ana es palíndromo: " + esPalindromoAlumnos(s));
			
				
		//Euclides
		System.out.println("El m.c.d.(108, 12) es: " + euclides(1024, 384));
		
		//Triángulo Pascal
		int n = 10;
		
		/*for (int f=1; f<=n; f++){
			
			for (int i=1; i<=f; i++){
			
				System.out.printf("%5d", trianguloPascal(f, i));
			}			
			System.out.printf("%n");
		}*/
		
		System.out.println("");
		
		int aux = n;

		for (int f=1; f<=n; f++){
			
			for (int j = aux; j>=1; j--)
			{			
				System.out.printf("  ");
			}
			
			for (int i=1; i<=f; i++)
			{
				System.out.printf("%4d", trianguloPascal(f, i));
			}
			
			System.out.printf("%n");
			aux --;
		}	
		
		
		System.out.println("");
		
		//Contar Aes
		System.out.println("El número de 'a' en 'casablanca' es: " + cuentaAs("casablanca"));
		System.out.println("El número de 'a' en 'casablanca' es: " + cuentaAes("casablanca"));
				
		
		
		
		//
		System.out.println("mayMin_MinMay('AbCdE', 2): " + mayMin_MinMay("AbCdE", 2));
		
		
		
		
		
		//
		int[] v6 = {10,0,2,2,4,4,8,4,6};
		System.out.println("La posición del último impar es: " + posicionUltimoImpar(v6, 0, v6.length-1));
		
		//IMPRIMIR PIRÁMIDE ASUN
		
		//para las filas, desde que i=0  hasta que i sea menor que el número deseado
		for(int i=0; i<10; i++){		
					
			//en cada fila se imprimen espacios delante, desde 5 hasta 1 (margen)
			//se inicia en i=0 para que (n-i) no resulte nunca 0
			System.out.printf("%"+(10-i)+"s", " ");  
			
			//para cada columna se imprimen tantos asteriscos como el número de fila (aumenta
			//hasta que i vale n-1 (lado del triángulo)
			for(int j=0; j<=i; j++){		
				
				System.out.printf("%s","* ");				
			}
			
			System.out.printf("\n");
		}
		
		
		char[] c1 = {'n','o','a','n','o','n','i','s','t','n','o'};

		char[] c2 = sustituirNOxSI(c1);
		for(int i=0; i<c2.length; i++){
			System.out.printf("%2s", c2[i]);
		}
		
		
	}

	//**********************************************************************
	
	public static void imprimirVectorAscendente(int[] v){
		
		imprimirVectorAscendente(v, 0, v.length-1);		
	}  
	
	private static void imprimirVectorAscendente(int[] v, int ini, int fin){	
		
		if (ini > fin){
			//No hago nada
		}
		else{
			System.out.printf("%3d", v[ini]);
			imprimirVectorAscendente(v, ini+1, fin);			
		}
	}	
	
	//**********************************************************************
	
	public static void imprimirVectorDescendente(int[] v){
		
		imprimirVectorDescendente(v, 0, v.length-1);
	}
	
	private static void imprimirVectorDescendente(int[] v, int ini, int fin){

		if (fin < ini){
			//No hago nada
		}
		else{
			System.out.printf("%3d", v[fin]);
			imprimirVectorDescendente(v, ini, fin-1);
		}
	}
	
	//**********************************************************************
	
	//**************************************	
	//   Esquemas recursivos de RECORRIDO	
	//**************************************
	
	public static int sumarVector(int[] v){

		//a) Obtenga la suma de todos los elementos del array.

		return sumarVector(v, 0, v.length-1);
	}
	
	public static int sumarVector(int[] v, int ini, int fin){

		//a) Obtenga la suma de todos los elementos del array.
		int res = 0;

		if (ini > fin){
			res = 0;
		}
		else{
			res = v[ini] + sumarVector(v, ini+1, fin);			
		}

		return res;
	}

	public static int valorMaximo(int[] v, int ini, int fin, int max){

		//b.1) Obtenga el valor máximo (mínimo) del array. 

		int res = 0;

		if (ini > fin){
			//
		}
		else{
			if (v[ini] > max){
				max = v[ini];
			}	

			res = Math.max(max, valorMaximo(v, ini+1, fin, max));
		}

		return res;
	} 
	
	/*
	public static int posicionMinimo(int s[],int ini, int fin)
	{
		if(ini > fin)
			return 0;
		else
		{
			if (s[ini] < valorMinimo(s, ini+1, fin))
				return 0;
			else
				return 1 + posicionMinimo(s, ini+1, fin);
		}

	}
	*/	
	
	public static int posicionMaximo(int[] v, int ini, int fin)
	{
		//b.2) Obtenga la posición del máximo (mínimo) del array.		
		int res = 0;		
		if(ini > fin){			
			res = 0;
		}			
		else
		{
			if (v[ini] > valorMaximo(v, ini+1, fin, 0)){
				res = 0;
			}				
			else{
				res = 1 + posicionMaximo(v, ini+1, fin);
			}				
		}		
		return res;
	}
	
	public static int posicionMaximoKevin(int[] v, int ini, int fin)
	{
		int pos;

		if (ini>fin) 
		
			pos = v.length-1;		
		else {
			
			pos = posicionMaximoKevin(v, ini+1, fin);
			
			if (v[ini] > v[pos]) {
				pos = ini;
			}
		} 

		return pos;	
	}
			
	public static int valorMaximo(int[] v, int ini, int fin)
	{
		int max;

		if (ini > fin) 
		
			max = v[v.length-1];
		
		else {
			
			max = valorMaximo(v, ini+1, fin);
			
			if (v[ini] > max) {
				max = v[ini];
			}
		} 

		return max;	
	}
	
	public static int posicionDelNumeroX(int[] v, int ini, int fin, int x){

		int res = -1;
		
		if (ini > fin){
			//
		}
		else{
			if (v[ini] == x){
				res = ini;
			}
			else{
				res = posicionDelNumeroX(v, ini+1, fin, x);
			}			
		}
		return res;
	}
	
	public static int vecesRepetido(int[] v, int x){

		//c) Dado un entero x, cuente cuántas veces aparece en el array.
		return vecesRepetido(v, 0, v.length-1, x);
	}

	public static int vecesRepetido(int[] v, int ini, int fin, int x){

		//c) Dado un entero x, cuente cuántas veces aparece en el array.
		int res = 0;

		if (ini > fin){
			//
		}
		else{
			if (v[ini] == x){
				res = vecesRepetido(v, ini+1, fin, x) + 1;
			}	
			else{
				res = vecesRepetido(v, ini+1, fin, x);				
			}			
		}

		return res;
	}
	
	public static boolean ordenadoAscendente(int[] v){

		//d) Compruebe si el array está ordenado ascendentemente.
		return ordenadoAscendente(v, 0, v.length-2); //OJO !!! hasta length-2 !!!
	}
	
	public static boolean ordenadoAscendente(int[] v, int ini, int fin){

		//d) Compruebe si el array está ordenado ascendentemente.
		boolean ordenado = true;

		if (ini > fin){
			//
		}
		else{
			if (v[ini] > v[ini+1]){
				ordenado = false;				
			}	
			else{
				ordenado = ordenadoAscendente(v, ini+1, fin);				
			}			
		}	
		
		return ordenado;
	}

	//*************************************	
	//   Esquemas recursivos de BÚSQUEDA	
	//*************************************
	
	public static int posicionPrimerNoNulo(int[] v){

		//e) Determine la posición del primer (último) elemento no nulo del array. 
		return posicionPrimerNoNulo(v, 0, v.length-1);
	}
	
	public static int posicionPrimerNoNulo(int[] v, int ini, int fin){

		//TODO pagina 256 del libro !!! modificar APUNTES !!!
		
		//e) Determine la posición del primer (último) elemento no nulo del array. 
		int res = -1;
		
		//if (ini<=fin)
			
		if (v[ini] != 0){
			res = ini;
		}
		else{
			res = posicionPrimerNoNulo(v, ini+1, fin);
		}
		
		return res;
	}

	public static int cerosFinales(int[] v, int ini, int fin){

		//f) Determine cuántos ceros consecutivos hay al ﬁnal del array.
		int res = 0;

		if (fin < ini){
			res = 0;
		}
		else{
			if (v[fin] == 0){
				res = cerosFinales(v, ini, fin-1) + 1;
			}		
		}

		return res;
	}

	public static int[] invertirElementos(int[] v, int izq, int der){

		//g) Dadas dos posiciones, izq y der, del array, 0≤izq≤der≤v.length-1, invierta todos los elementos del array situados entre dichas posiciones, 
		//   esto es, al ﬁnalizar la ejecución del método el array contendrá en su posición izq el elemento que inicialmente ocupaba la posición der, 
		//   en su posición izq+1 el elemento que inicialmente ocupaba la posición der-1 y así sucesivamente. 

		int aux = 0;
		
		if (izq > der){
			//
			return v;
		}
		else{
			//if (izq != der){			
				aux    = v[izq];
				v[izq] = v[der];
				v[der] = aux;
				
				return invertirElementos(v, izq+1, der-1);
			//}
			//return v;
		}
	}

	public static int[] duplicarElementos(int[] v, int izq, int der){

		//h) Dadas dos posiciones, izq y der, del array, 0≤izq≤der≤v.length-1, duplique el valor de los elementos del array situados entre dichas posiciones.

		if (izq > der){
			//
			return v;
		}
		else{
			v[izq] = v[izq] * 2;				
				
			return duplicarElementos(v, izq+1, der);
		}
	}

	public static boolean esIgualSuma(int[] v, int b){

		//i) Dado un entero b>0, determine si b es igual a la suma de todas las componentes de v.

		return esIgualSuma(v, 0, v.length-1, b);
	}	
	
	public static boolean esIgualSuma(int[] v, int ini, int fin, int b){
		
		//i) Dado un entero b>0, determine si b es igual a la suma de todas las componentes de v.
		
		boolean esIgual = true;
		
		if (ini > fin){
			//
			esIgual = (b == 0);			
		}
		else{
			b = b - v[ini];
			
			esIgual = esIgualSuma(v, ini + 1, fin, b);			
		}
		
		return esIgual;
	}
	
	public static int contarNumerosMenores(int[] v, int x){

		//j) Dado un entero x, determine la cantidad de elementos del array que son menores que x.
		
		return contarNumerosMenores(v, 0, v.length-1, x);
	}
	
	public static int contarNumerosMenores(int[] v, int ini, int fin, int x){

		//j) Dado un entero x, determine la cantidad de elementos del array que son menores que x.
		
		int res = 0;

		return res;
	}
	
	public static int elementosImparesEnPosicionesPares(int[] v, int izq, int der){
	
		//k) Determine la cantidad de elementos impares que ocupan posiciones pares del array.
		
		int res = 0;

		return res;		
	}	
	
	public static int posicionSubsecuenciaTresConsecutivos(int[] v, int izq, int der){
		
		//l) Determine la posición, si existe, de la primera subsecuencia del array que comprenda, 
		//   al menos tres números enteros consecutivos en posiciones consecutivas del array.
		
		int pos = -1;

		if (izq > der){
			//
		}
		else{
			if ((v[izq] == v[izq+1]-1) && (v[izq] == v[izq+2]-2)){
				pos = izq;				
			}		
			else{
				pos = posicionSubsecuenciaTresConsecutivos(v, izq + 1, der);
			}
		}

		return pos;	
	}
	
	//**********************************************************************
	
	//16.-
	
	
	
	
	
	
	//**********************************************************************
	
	//17.-

	public static boolean esPrefijo(String s1, String s2){

		//a) si s2 es preﬁjo de s1.

		return true;
	}

	public static boolean esSufijo(String s1, String s2){

		//b) si s2 es suﬁjo de s1.
		
		

		return true;
	}	

	public static boolean esSubcadena(String s1, String s2){

		//c) si s2 es una subcadena de s1.

		return true;
	}	

	//**********************************************************************
	
	//18.-
	
	
	
	//**********************************************************************
	
	//19.-
	
	
	
	
	
	//**********************************************************************

	//20.-
	
	public static boolean esPalindromo(String s){

		boolean espalindromo = true;

		if (s.length()==0){
			espalindromo = true;
		}
		else{
			if (s.toLowerCase().charAt(0) != s.toLowerCase().charAt(s.length()-1)){
				espalindromo = false;
			}				
			else{
				if (s.length() > 1){
					espalindromo = esPalindromo(s.substring(1, s.length()-1));					
				}				
			}				
		}
		
		return espalindromo;
	}
	
	public static boolean esPalindromoAlumnos(String s){

		boolean res = false;

		if (s.length()<=1){
			res = true;
		}
		else{
			if (s.charAt(0) == s.charAt(s.length()-1)){
				res = esPalindromo( s.substring(1, s.length()-1) );
			}				
			else{				
				res = false;	
			}				
		}
		
		return res;
	}
	
	//**********************************************************************
	
	public static int trianguloPascal(int f, int i){

		//1.-  1
		//2.-  1   1
		//3.-  1   2   1
		//4.-  1   3   3   1
		//5.-  1   4   6   4   1
		//6.-  1   5  10  10   5   1
		//7.-  1   6  15  20  15   6   1
		
		if ( (i == 1) || (i == f) ){
			return 1;			
		}
		else{
			return trianguloPascal( f-1, i) + trianguloPascal( f-1, i-1 );
		}		
	}

	public static int euclides(int a, int b) {
	
		//Si el resto de a/b es 0, el m.c.d. es b.
		//En otro caso, el m.c.d. es el m.c.d. de b y el resto de a/b.
		
		if (a%b==0)
			return b;
		else 
			return	euclides(b, a%b);
	}

	//
	public static int cuentaAs(String s) {
		
		// Caso base: String vacía.
		if (s.length()==0) 
			return 0;
		// Caso general: No vacía. Tratar la substring posterior.
		else 
			if (s.charAt(0)=='a') 
				return 1 + cuentaAs(s.substring(1));
			else 
				return cuentaAs(s.substring(1));
	}

	public static int cuentaAes(String s){
		int cont = 0;
		if (s.length() == 0);
		else {
			cont = cuentaAes(s.substring(1));
			if (s.charAt(0) == 'a') {
				cont++;
			}
		}
		
		return cont;
	}
	
	public static int posicionUltimoImpar(int[] v, int ini, int fin){
		
		//Obtenga la posición del último elemento impar del array, si existe.
		
		int pos = -1;

		if (fin < ini){
			pos = 0;
		}
		else{
			if (v[fin]%2 == 0){
				pos = posicionUltimoImpar(v, ini, fin-1);
			}		
			else{
				pos = fin;
			}
		}

		return pos;
	}
	
	public static String mayMin_MinMay(String s, int pos) {
		
		
		if (pos >= s.length()) {
			// Caso base: String vacía
			return "";
		}		
		else {
			// Caso general: No vacía. Tratar la substring posterior.
			
			char c = s.charAt(pos);
			
			if (Character.isLetter(c)) {
				
				if (Character.isUpperCase(c)) {
					c = Character.toLowerCase(c);
				}
				else {
					c = Character.toUpperCase(c);
				}
			}
				
			
			return c + mayMin_MinMay(s,pos+1);
		}
	}
	
	public static char[] sustituirNOxSI(char[] s, int izq, int der){

		if (izq > der - 1){
			return s;		
		}
		else{
			if ((s[izq] == 'n') && (s[izq+1] == 'o')){
				s[izq]   = 's';
				s[izq+1] = 'i';
			}		
			
			return sustituirNOxSI(s, izq + 1, der);			
		}
	}
	
	public static char[] sustituirNOxSI(char[] s){

		return sustituirNOxSI(s, 0, s.length-1);			
	}
	
}
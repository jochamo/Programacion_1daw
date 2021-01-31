package ud6_recursividad;

public class Recursividad_01 {

	public static void main(String[] args) {
		
		//0.-        
        for (int i = 0; i <= 15; i++)
        	System.out.printf("%4d,", fibonacci(i));
        System.out.println("");
		
		//1.- 
		int fact = factorial(5);
		System.out.println("Factorial de 5: " + fact);

		//2.- 
		imprimirDescendente(5); 
		System.out.println("");

		//3.-
		imprimirAscendente(5);  
		System.out.println("");

		//4.- 
		System.out.printf("Escribe raro: ");
		escribeRaro(5);
		System.out.println("");

		//5.- 
		System.out.println("La division entera entre 14 y 3 es: " + divisionEntera(14, 3));

		//6.- 
		System.out.println("El producto de 5 por 4 es: " + productoRecursivo(5, 4)); 

		//7.- 
		System.out.println("El producto de 6 por 4 es: " + productoRecursivoRuso(6, 4)); 

		//8.-
		System.out.println("La potencia de 2 elevado a 10 es: " + potenciaRecursiva(2, 10));

		//9.- 
		System.out.println("La suma de los dígitos del número 816245 es: " + sumarDigitos(816245));
		System.out.println("La suma de los dígitos según Ivan del número 12345 es: " + sumarDigitosString(12345));
		
		//10.- 
		System.out.println("El número de dígitos del número 12000 es: " + contarDigitos(12000));
		
		//11.- 
		System.out.println("El número 100200 en orden inverso es: " + invertirDigitos(102));
		
		//12.- OJO !! este método sólo deja pasar de decimal a Binario hasta el 1023
		//			  con un número mayor, da error el último Integer.ParseInt
		//			  Solución: que el método devuelva un String
		System.out.println("El número 725 en binario es (función devuelve Int   ): " + decimalBinario(725));
		System.out.println("El número 725 en binario es (función devuelve String): " + decimalBinarioString(725));
		
		//13.-
		int[] v1 = {1, 2, 3, 4, 5}; 
		System.out.println("Suma total: " + sumav(v1, 3, 1));

		//14.-
		int v2[] = {0, 11, 2, 13, 4, 5, 6, 17, 8}; 
		f(v2, 0);
		
		//15.-
		System.out.println("Par: " + par(7));
		System.out.println("Impar: " + impar(9));

		System.out.println("Par: " + Es_par(8));
		System.out.println("Impar: " + Es_impar(8));

	}
	
	public static int fibonacci(int n) {
		
        if (n <= 1){
        	
        	return n;
        }
        else{
        	return fibonacci(n-1) + fibonacci(n-2);
        }
    }
	
	public static int factorial(int n){

		// Si n = 0 entonces
		//		 0! = 1
		// si n > 0 entonces
		//		 n! = n * (n-1)! = n * (n-1) * (n-2) * ... * 3 * 2 * 1 

		if (n == 0){
			return 1;
		}
		else{
			return n * factorial(n - 1);
		}
	}	
	
	public static void imprimirDescendente(int x) {

		if (x>0) {
			System.out.printf("%2d", x);
			imprimirDescendente(x-1);
		}
	}

	public static void imprimirAscendente(int x) {

		if (x>0) {
			imprimirAscendente(x-1);
			System.out.printf("%2d", x);
		}
	}

	public static void escribeRaro(int n) { 

		if (n>0) {			
			System.out.print(n); 
			escribeRaro(n-1);    
			System.out.print(n);			
		} 
		else {
			System.out.print(0);
		}
	}

	public static int divisionEntera(int a, int b){

		//a/b = 0, si a < b, 
		//a/b = (a−b)/b + 1, si a ≥ b.

		int res = 0;

		if (a < b){
			res = 0;
		}
		else{
			res = divisionEntera(a-b, b) + 1;
		}

		return res;
	}
	
	public static int productoRecursivo(int a, int b){

		//a·b = 0, si b = 0, 
		//a·b = a·(b−1) + a, si b > 0.

		int res = 0;	

		if (b == 0){
			res = 0;
		}
		else{
			res = productoRecursivo(a, b-1) + a;
		}

		return res;
	}

	public static int productoRecursivoRuso(int a, int b){

		//a·b = 0, si b = 0, 
		//a·b = (a·2)·(b/2), si b > 0 y b es par, y 
		//a·b = (a·2)·(b/2) + a, si b > 0 y b es impar.

		int res = 0;	

		if (b == 0){
			res = 0;
		}
		else{
			if (b%2 == 0){
				res = productoRecursivoRuso(a*2, b/2);
			}
			else{
				res = productoRecursivoRuso(a*2, b/2) + a;
			}
		}

		return res;
	}

	public static int potenciaRecursiva(int a, int b){

		//a^b = 1, si b = 0, 
		//a^b = a, si b = 1, 
		//a^b = (a^b/2)*(a^b/2), si b > 1 y b es par, y 
		//a^b = (a^b/2)*(a^b/2)* a, si b > 1 y b es impar. 

		int res = 0;

		if (b == 0){
			res = 1;
		}
		else{
			if (b == 1){
				res = a;
			}
			else{
				if (b%2 == 0){
					res = potenciaRecursiva(a, b/2) * potenciaRecursiva(a, b/2);
				}
				else{
					res = potenciaRecursiva(a, b/2) * potenciaRecursiva(a, b/2) * a;
				}
			}
		}

		return res;
	}

	public static int sumarDigitosString(int n){
	
		//Devuelve la suma de los dígitos de un número natural n ≥ 0
				
		int res = -1;		
		int b;
		
		//ejemplo --> n = 85126 --> res = 22
		
		//Convierte un Entero (int) en una Cadena (String)
		String cadena = Integer.toString(n);
		
		//Convierte un Char (que tiene que ser un número) en un Entero (int)
		int a = Character.getNumericValue( cadena.charAt(0) );
		
		//
		if (cadena.length() == 1){
		
			//1.- Caso base
			res = a;
		}
		else{		
			//2.- Caso recursivo
		
			//Devuelve una subcadena entre 1 y length()
			cadena = cadena.substring(1, cadena.length());
		
			//Convierte una Cadena (String) en un Entero (int)
			b = Integer.parseInt( cadena );
			
			//Llamada recursiva
			res = a + sumarDigitosString( b );			
		}
		
		return res;
	}
	
	//
	public static int sumarDigitos(int n){
		
		//Devuelve la suma de los dígitos de un número natural n ≥ 0		
		int res = 0;
		
		if (n == 0){
			
			res = 0;
		}
		else{
			res = sumarDigitos( n/10 ) + ( n%10 );
		}
	
		return res;
	}
	
	public static int contarDigitos(int n){
		
		//Devuelve el número de dígitos de un número natural n ≥ 0
		int res;
		
		if (n == 0){
			res = 0;
		}
		else{	
			res = contarDigitos( n/10 ) + 1 ;
		}
	
		return res;
	}	
	
	public static int invertirDigitos(int n){

		//Mostrar en orden inverso los dígitos que componen un número natural n ≥ 0
		
		//Caso base:        devuelve el mismo número si el tamaño es 1
		
		//Caso recurivo:	llamada recursiva con el número quitando el primer dígito + el primer dígito

		/*
		invertirDigitos(45625)
		
		invertirDigitos(5625) + 4
		
		invertirDigitos(625) + 5
		
		invertirDigitos(25) + 6
		
		invertirDigitos(5) + 2
		
		invertirDigitos(5)
		*/
		
		String cadena = Integer.toString(n);

		int res = 0;		
		int sub = 0;
		
		if (cadena.length() == 1){
			//Caso base
			res = n;
		}
		else{
			//Caso recursivo
			
			//TODO arreglar los putos 0 !!!
			
			res = Integer.parseInt( Integer.toString( n%10 ) + Integer.toString( invertirDigitos(n/10) ) );					
		}

		return res;
	}
	
	public static int decimalBinario(int n){

		//Devolver el valor binario (representado como un entero) de un número natural n ≥ 0

		//Por ejemplo, si n=5 el método devuelve 101, pero si n=31 el método devuelve 11111.
		
		int res = 0;

		//Caso base -->   devuelve 0 si n = 0;
		//Caso base -->   devuelve 1 si n = 1;
		//		
		//if (n < 2){ 
		if (n/2 == 0){
			res = n;
		}
		else{
			res = Integer.parseInt( Integer.toString(decimalBinario( n/2 )) + Integer.toString( n%2 ) );
		}

		return res;
	}
		
	public static String decimalBinarioString(int n){

		//Devolver el valor binario (representado como un entero) de un número natural n ≥ 0

		//Por ejemplo, si n=5 el método devuelve 101, pero si n=31 el método devuelve 11111.
		
		String res = "";

		//		
		if (n < 2){
			res = Integer.toString(n);
		}
		else{
			res = decimalBinario( n/2 ) + Integer.toString(n%2);
		}

		return res;
	}
	
	public static int sumav(int[] v, int i, int x) { 

		//int[] v1 = {1, 2, 3, 4, 5}; 
		//System.out.println("Suma total: " + sumav(v1, 4, 2));
		
		//15
		//10
		//6
		
		//31
		
		int suma = 0; 

		if (i<0) return suma; 

		if (v[i]==x) return suma; 

		for (int j=0; j<=i; j++) {
			suma = suma + v[j];
		}

		System.out.println("Suma parcial: " + suma);

		return suma + sumav(v, i-1, x); 
	}

	public static void f(int[] v, int i) { 

		if (i>=v.length) {
			System.out.println("-------------"); 
		}
		else {
			if (i==v[i]) { 
				System.out.printf("v[%d]==%d\n", i, v[i]); f(v,i+1); 
			} 
			else { 
				f(v,i+1); 
				System.out.printf("v[%d]!=%d\n", i, i); 
			} 
		}
	}

	public static int par(int nump) {
		
		if (nump == 0){
			return 1;
		}
			
		return( impar(nump-1) ); 
	}

	public static int impar (int numi) {
		
		if(numi == 0){
			return 0;
		}
			 
		return( par(numi-1)); 
	}
	
	//
	public static boolean Es_par(int n){

		if (n==0){

			return true;

		}else{

			return Es_impar(n-1);
		}
	}
	public static boolean Es_impar(int n ){

		if ( n==0 ){

			return false;

		}else{

			return Es_par(n-1);
		}
	}	

}
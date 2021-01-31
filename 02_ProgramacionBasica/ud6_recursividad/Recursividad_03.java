package ud6_recursividad;

public class Recursividad_03 {

	public static void main(String[] args) {

		//System.out.println( bisect(1, 70));

		//f(16,3);
		
		//for (int i = 0; i < 200; i++) {
			
		//	System.out.println( i + ": " + f(i) );
		//}
		
		
		//System.out.println( decimalHexadecimal(221) );
		
		//cancionCerveza(99);
		
		//int[] v = {1,2};
		//System.out.println( resuelveRecursivo(v, 0, v.length-1) );
		
		System.out.println( mayMin_MinMay("mOlIn4a", 1, 4) );
		
	}


	static final double N = 2;
	static final double	PREC = 1e-6;

	static double f (double x)
	{
		return x*x-N;
	}
	static double bisect (double min, double max)
	{
		double med = (min+max)/2;

		if (max-min<PREC) {
			return med;
		} else if (f(min)*f(med)<0) {
			return bisect (min,med);
		} else {
			return bisect (med,max);
		}
	}


	static void f(int num, int div)
	{
		if (num>1) {
			
			if ((num%div) == 0) {
				System.out.println(div);
				
				f(num/div,div);
				
			} else {
				f(num,div+1);
			}
		}
	}


	static int f (int x)
	{
		if (x > 100)
			return (x - 10);
		else
			return (f (f (x+11)));
	}

	
	
	static String decimalHexadecimal(int n) {
	
		String res = "";
		/*
		Construya una función que convierta un número decimal en una cadena que represente
		el valor del número en hexadecimal (base 16). A continuación, generalice la función
		para convertir un número decimal en un número en base B (con B<10).
		
		Recordatorio: El cambio de base se realiza mediante divisiones sucesivas por 16
		en las cuales los restos determinan los dígitos hexadecimales del número según
		la siguiente correspondencia:		
		
		Resto	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		Dígito	0 1 2 3 4 5 6 7 8 9 A B C D E F
				
		*/	
		//					 0 	 1 	 2 	 3 	 4 	 5 	 6 	 7 	 8 	 9 	 10  11  12  13  14  15
		String[] digitos = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
		
		//if (n < 2){
		//	res = Integer.toString(n);
		//}
		//else{
		//	res = decimalHexadecimal( n/2 ) + Integer.toString(n%2);
		//}
		
		if (n < 16){
			res = digitos[n];
		}
		else{
			res = decimalHexadecimal( n/16 ) + digitos[n%16];
		}			
		
		return res;		
	}
	

	
	public static void cancionCerveza(int botellas) {
		
		if (botellas < 1) {
			System.out.printf("%n%nNo hay más botellas de cerveza en la pared, no hay más botellas de cerveza, %n" + 
					"no las agarrarás, y no las pasarás, porque no hay más botellas de cerveza en la pared.");
		}
		else {
			System.out.printf("%nHay %d botellas de cerveza en la pared, hay %d botellas de cerveza, %n" + 
					"una sola agarrás, y después la pasás, hay %d botellas de cerveza en la %n" + 
					"pared.", botellas, botellas, botellas-1);
			cancionCerveza(botellas - 1);
		}
	}
	
	/*
	 
	La primera estrofa de la canción “99 Botellas de Cerveza” dice:
	
		Hay 99 botellas de cerveza en la pared, hay 99 botellas de cerveza,
		una sola agarrás, y después la pasás, hay 98 botellas de cerveza en la
		pared.
		
		Las estrofas siguientes son idénticas excepto por el número de botellas que va 
		haciéndose menor en uno en cada estrofa, hasta que el último verso dice:
		
		No hay más botellas de cerveza en la pared, no hay más botellas de cerveza, 
		no las agarrarás, y no las pasarás, porque no hay más botellas de cerveza en la pared.
		
		Y luego la canción (por fin) termina.
		
		Escribí un programa que imprima la letra completa de “99 Botellas de Cerveza.” 
		
		Tu programa debería incluir un método recursivo que realice la parte difícil,
		pero también puede que quieras escribir métodos adicionales para separar las diferentes 
		funcionalidades del programa.
		
		A medida que desarrolles tu código, probablemente quieras testearlo con un
		número más bajo de estrofas, como “3 Botellas de Cerveza.”
		
		El propósito de este ejercicio es tomar un problema y partirlo en problemas
		más pequeños, y resolver los problemas pequeños escribiendo métodos simples y
		sencillos de depurar.
	*/
		
	public static String mayMin_MinMay(String s, int ini, int fin) {
		
		String res;
		
		if (ini > fin) {
			// Caso base: String vacía
			res = "";
		}		
		else {
			// Caso general: No vacía. Tratar la substring posterior.
			
			char c = s.charAt(ini);
			
			if (Character.isLetter(c)) {
				
				if (Character.isUpperCase(c)) {
					c = Character.toLowerCase(c);
				}
				else {
					c = Character.toUpperCase(c);
				}
			}
			
			res = c + mayMin_MinMay(s, ini+1, fin);
		}
		
		return res;
	}



	public static int resuelveRecursivo(int[] secuencia, int ini, int fin) {
		
		int solucion = 0;	
		
		if (ini == fin){
			
			solucion = secuencia[ini];		
		}
		else{			
			solucion = 1 + secuencia[ini] * (resuelveRecursivo(secuencia, ini+1, fin)*2+1);			
		}		
		
		return solucion;
	}


		
}
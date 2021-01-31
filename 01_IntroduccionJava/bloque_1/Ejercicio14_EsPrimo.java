package bloque_1;

public class Ejercicio14_EsPrimo {

	public static void main(String[] args) {
		
		int columnas = 2;		
		int contador = 1;
		
		//Recorrer los números del 1 al 1000
		for (int i = 1; i <= 1000; i++) {
			
			//Si es múltiplo de 3...
			if (i % 3 == 0) {
				
				//Imprimo el número en 5 columnas
				if (contador % columnas != 0) {
					System.out.printf("%7d", i);					
				}
				else {
					System.out.printf("%7d%n", i);					
				}
				
				contador++;
			}			
		}
	}

}
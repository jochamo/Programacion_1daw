package ud3_entradaSalidaConsola_Refuerzo;

public class CuadroTexto {

	public static void main(String[] args) {
		
		int n = 8;
		int numEspacios = 0;
		String espacio = " ";
		String texto = "";
		
		//Imprimir primera fila
		for (int i=0; i<n; i++){
			
			System.out.printf("*");
		}
		
		System.out.printf("%n");
		
		//Imprimir resto de filas
		for (int i=1; i<n-1; i++){

			numEspacios = n-2;
			
			texto = "*%" + numEspacios + "s* %n";
			
			System.out.printf(texto, espacio);
		}
		
		//Imprimir última fila
		for (int i=0; i<n; i++){
			
			System.out.printf("*");
		}

	}

}
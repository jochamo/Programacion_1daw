package ud6_programacionEstructurada;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio3_CajaTexto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String cadena;
		System.out.print("Introduce cadena de texto: ");
		cadena = sc.nextLine();
		cajaTexto(cadena); //llamada al método
	}

	//Método que muestra un String rodeado por un borde
	public static void cajaTexto(String str){
		
		int n = str.length();
		
		for (int i = 0; i < n + 4; i++){
			System.out.print("#");
		}
		
		System.out.println();		
		System.out.println("# " + str + " #");
		
		for (int i = 0; i < n + 4; i++){
			System.out.print("#");
		}
		System.out.println();
	}

}

package ud10_ficheros;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		//Construir un programa que permita buscar palabras en un fichero de texto.
		//Se debe mostrar el número de línea y su contenido, para cada línea que contenga la palabra buscada.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la palabra a buscar en el fichero:");
		String palabra = sc.nextLine();
		String linea;
		
		try {
			Scanner scanner = new Scanner(new File("fichero1.txt"));
			
			while (scanner.hasNextLine()) {
				
				linea = scanner.nextLine();
				
				if (palabra.equals(linea)) {
					System.out.println("Encontrado");
				}
			}
			
			scanner.close();
		}
		catch (FileNotFoundException ex) {
			System.err.println("El fichero no existe." + ex);
		}
	}

}
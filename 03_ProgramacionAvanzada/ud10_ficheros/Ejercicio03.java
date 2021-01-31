package ud10_ficheros;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ejercicio03 {

	public static void main(String[] args) {

		//Construir un programa que escriba en un fichero de texto los números del 1 al 999 
		//y posteriormente los vuelva a leer de ese fichero para realizar la suma
		//de los mismos. Verificar que el resultado es correcto.

		//Comprobar la diferencia de tamaños entre el fichero generado en el ejercicio 2 
		//y el generado por este ejercicio.

		String fichero = "numeros.txt";
		
		try {
			PrintWriter pw = new PrintWriter(new File(fichero));
			
			for (int i = 1; i < 1000; i++) {
				
				pw.println( i );
			}
			pw.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("Problemas al abrir el fichero");
		}

	}

}
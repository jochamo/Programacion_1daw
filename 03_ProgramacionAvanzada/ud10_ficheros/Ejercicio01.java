package ud10_ficheros;
import java.io.File;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		//Construir un programa Java que reciba como argumento de línea de coman-
		//dos la ruta a un fichero y que muestre por pantalla información básica sobre
		//el mismo (como mínimo el nombre del fichero, directorio donde se encuentra
		//y su tamaño expresado en kbytes).
		
		
		//File f = new File("src/fichero1.txt");
		File f = new File( args[0] );
		
		if (f.exists()) {
			System.out.println("El fichero existe!");
			System.out.println("getName(): " + f.getName());
			System.out.println("getPath(): " + f.getPath());			
			System.out.println("getParent(): " + f.getParent());
			System.out.println("length(): " + f.length());
		} 
		else {
			System.err.println("El fichero NO existe!");
		}
		
	}

}
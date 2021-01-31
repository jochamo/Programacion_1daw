package ud10_ficheros;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerFicheroBinario {

	public static void main(String[] args) {

		String fichero = "numeros.dat";

		try {
			//Lectura
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(fichero));

			int a, suma = 0;

			for (int i = 1; i < 1000; i++) {			

				//Leer entero
				a = in.readInt();

				//Mostrar entero por pantalla
				System.out.println( a );

				//Calucular suma
				suma += a;				
			}			

			//Imprimir suma
			System.out.println( suma );

			//Cerrar fichero
			in.close();			

		} 
		catch (IOException e) {
			System.err.println("Problemas con el fichero.");
		}
	}

}
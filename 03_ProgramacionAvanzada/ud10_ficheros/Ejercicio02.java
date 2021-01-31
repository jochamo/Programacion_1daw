package ud10_ficheros;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		//2.a.- Escribir un método estático que escriba en un fichero binario 
		//      los números del 1 al 999
		
		//2.b.- Escribir un método estático que lea el fichero generado por el programa del
		//      ejercicio 2 y sume dichos números. Comprobar que el resultado es correcto
		//      implementando un bucle adicional que realice dicha suma		

		String fichero = "numeros.dat";
		
		try {
			//Escritura
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fichero));

			for (int i = 1; i < 1000; i++) {
			
				out.writeInt( i );
			}			
			out.close();

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
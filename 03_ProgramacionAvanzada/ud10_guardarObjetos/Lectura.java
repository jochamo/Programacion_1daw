package ud10_guardarObjetos;

import java.io.*;

public class Lectura {

	public static void main(String[] args) {

		//Lectura del fichero
		try {
			File f = new File("src/amigos.txt");

			if (f.exists()) {
				FileInputStream fis   = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);

				while (true) {
					Amigo a = (Amigo) ois.readObject();
					a.print();
				}	
			}
			else {
				System.out.println("El fichero no existe");
			}

		} catch (EOFException e) {
			System.out.println("Se alcanzó el final.");			
		} catch (ClassNotFoundException e) {
			System.out.println("Error, el tipo de objeto no es compatible.");		
		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());
			e.printStackTrace();
		}		
	}
	
}
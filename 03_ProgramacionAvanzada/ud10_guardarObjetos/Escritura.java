package ud10_guardarObjetos;

import java.io.*;

public class Escritura {

	public static void main(String[] args) {

		String[] amigos = {"Paco Pérez", "Pedro Ruiz", "Isaac Nacher", "Ricardo García"};
		long[] telefonos = {666777888, 678999000, 632444111, 654111777};		
		
		try {
			FileOutputStream fs = new FileOutputStream("src/amigos.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fs);
		
			for (int i = 0; i < 4; i++) {
				Amigo a = new Amigo(amigos[i], telefonos[i]);
				
				oos.writeObject(a);
			}
			
			if (oos != null) {
				oos.close();
				fs.close();
			}			
		
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

}
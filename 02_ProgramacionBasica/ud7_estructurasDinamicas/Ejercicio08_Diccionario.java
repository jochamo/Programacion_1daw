package ud7_estructurasDinamicas;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio08_Diccionario {

	public static void main(String[] args) {

		/*
		a) Crea un mini-diccionario español-inglés que contenga, al menos, 20
		palabras (con su correspondiente traducción). Utiliza un objeto de la clase
		HashMap para almacenar las parejas de palabras. El programa pedirá una
		palabra en español y dará la correspondiente traducción en inglés.

		b) Realiza un programa que escoja al azar 5 palabras en español del
		minidiccionario del ejercicio anterior. El programa irá pidiendo que el usuario
		teclee la traducción al inglés de cada una de las palabras y comprobará si
		son correctas. Al final, el programa deberá mostrar cuántas respuestas son
		válidas y cuántas erróneas.
		 */

		Scanner sc = new Scanner(System.in);

		boolean continuar = true;
		int opcion, i;
		String key, value, s;

		// Crear HashMap     
		HashMap <String, String> map = new HashMap <String, String>();

		// Insertar elementos		
		map.put("perro", "dog");
		map.put("gato", "cat");
		map.put("tiburon", "shark");
		map.put("delfin", "dolphin");
		map.put("mariposa", "butterfly");
		map.put("toro", "bull");		
		map.put("vaca", "cow");
		map.put("pollo", "chicken");
		map.put("burro", "donkey");
		map.put("cerdo", "pig");
		map.put("caballo", "horse");		
		map.put("cangrejo", "crab");
		map.put("medusa", "jellyfish");
		map.put("pulpo", "octopus");
		map.put("murciélago", "bat");

		while (continuar)		
		{	
			//Mostrar por pantalla el menú Secundario
			System.out.println("1.- Traducir palabra");
			System.out.println("2.- Concurso 5 palabras");
			System.out.println("9.- Salir");
			
			//Leer la opción escogida por el usuario
			try {
				opcion = sc.nextInt();	
			}
			catch (InputMismatchException e){
				opcion = 7;
			}
			 
			
			sc.nextLine();

			switch(opcion){
			case 1:
			{
				//Traducir 1 palabra
				System.out.println("Dime palabra");
				s = sc.nextLine();
				s = map.get(s);
				
				if (s == null) {
					System.out.println("La palabra no se encuentra en el diccionario");
				}
				else {
					System.out.println( s );	
				}
				
				break;
			}
			case 2:
			{
				Random r = new Random();
				
				for (int j = 0; j < 5; j++) {
				
					i = r.nextInt( map.size() );			
					
					key = (String) map.keySet().toArray()[i];
					
					System.out.println( "Traduce: " + key );
					
					if (sc.nextLine().equals(map.get(key))) {				
						System.out.println("Muy Bien !!");
					}
					else {
						System.out.println("Muy Mal !!");
					}
					
				}
				
				break;
			}
			case 9:
			{
				continuar = false;
				break;
			}
			default:
			{
				System.out.printf("\n\nOpción incorrecta\n");
				break;
			}
			}
		}

		System.out.printf("\n\nHASTA PRONTO !!!\n");
	}
}
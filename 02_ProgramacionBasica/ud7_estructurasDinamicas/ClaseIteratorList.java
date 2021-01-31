package ud7_estructurasDinamicas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ClaseIteratorList {
	
	public static void main(String[] args) {

		// Crear una lista
		ArrayList<String> miListaAlumnos = new ArrayList<String>();
		
		// Insertar 5 valores distintos en la lista
		miListaAlumnos.add("Pedro");
		miListaAlumnos.add("Arturo");
		miListaAlumnos.add("Ernesto");
		miListaAlumnos.add("Victor");
		miListaAlumnos.add("Arturo");		
		
		// Iterar via "bucle for"
		System.out.println("==> Ejemplo: Bucle For");
		for (int i = 0; i < miListaAlumnos.size(); i++) {
			System.out.println(miListaAlumnos.get(i));
		}

		// Iterar via "bucle for (nueva opción)"
		System.out.println("\n==> Ejemplo avanzado: Bucle for");
		for (String s : miListaAlumnos) {
			System.out.println( s );
		}

		// Iterar via "Bucle Iterator"
		System.out.println("\n==> Ejemplo: Iterator");
		Iterator<String> miListaIterator = miListaAlumnos.iterator();
		while (miListaIterator.hasNext()) {
			System.out.println( miListaIterator.next() );
		}
		
		// Iterar via "Bucle While"
		System.out.println("\n==> Ejemplo: Bucle While");
		int i = 0;
		while (i < miListaAlumnos.size()) {
			System.out.println( miListaAlumnos.get(i) );
			i++;
		}

		// Ordenar ArrayList - ASCENDENTE !		
		Collections.sort( miListaAlumnos );
		
		System.out.println("\n==> Sorted....");
		System.out.println( miListaAlumnos );
		
		// Ordenar ArrayList - DESCENDENTE !
		Collections.sort( miListaAlumnos, Collections.reverseOrder() );		

		// Collection stream() util: Devuelve una secuencia con los datos de la lista
		System.out.println("\n==> Collection stream() util....");
		miListaAlumnos.forEach((temp) -> {
			System.out.println(temp);
		});		
		
	}

	
}
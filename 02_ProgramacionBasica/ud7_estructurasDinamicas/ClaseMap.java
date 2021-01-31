package ud7_estructurasDinamicas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ClaseMap {

	public static void main(String[] args) {

		// Crear HashMap     
		HashMap <Integer, String> map = new HashMap <Integer, String>();

		// Insertar elementos		
		map.put(1, "Java");		
		map.put(4, "SQL");
		map.put(5, "C++");
		map.put(2, "Python");
		map.put(3, "PHP");
		
		String s = map.get( 19 );
		
		// Imprimir
		System.out.println("HasMap:" + map);
		
				
		HashMap <String, Integer> clasificacion = new HashMap <String, Integer>();
		
		clasificacion.put("1", 1);
		
		
		

		/*
		// Obtener el valor de una clave
		System.out.println("Valor de la clave 2: " + map.get(2));
		
		// Eliminar el valor de la clave 4
		map.remove(4);

		// Imprimir
		System.out.println("HasMap (después de eliminar):" + map);

		// Imprimir con Iterator
		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.println("Clave: "+ mentry.getKey() + " - Valor: " + mentry.getValue());
		}
		
		
		Set s = map.keySet();
		
		//opcion A
		int i = (int) map.keySet().toArray()[1];
		
		System.out.println( i );
	    System.out.println( map.get(i) );
	    
	    //opcion B
		Object[] a = map.keySet().toArray();
		int j = (int) a[2];		
		
		System.out.println( j );
	    System.out.println( map.get(j) );
	    	     
	     

	     */

	}
}
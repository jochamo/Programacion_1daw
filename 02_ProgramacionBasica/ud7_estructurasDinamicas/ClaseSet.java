package ud7_estructurasDinamicas;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ClaseSet {

	public static void main(String[] args) {

		int[] v = new int[50];
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();

		set.add("Uno");
		set.add("Dos");
		set.add("Tres");
		set.add("Uno");
		set.add("Cuatro");
		
		//if (!set.add("Uno")) {
		//	System.out.println("error al insertar !!");
		//}

		Iterator<String> j = set.iterator();
		while (j.hasNext()) {
			System.out.println(j.next());
		}

		//Prueba de inserción

		//1.- HashSet
		Set<Integer> hashSet = new HashSet<Integer>(1_000_000);
		
		Long startHashSetTime = System.currentTimeMillis();
		
		for (int i = 0; i < 1_000_000; i++) {
			hashSet.add(i);
		}
		
		Long endHashSetTime = System.currentTimeMillis();		
		
		System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));

		//2.- TreeSet
		Set<Integer> treeSet = new TreeSet<Integer>();
		
		Long startTreeSetTime = System.currentTimeMillis();
		
		for (int i = 0; i < 1_000_000; i++) {
			treeSet.add(i);
		}
		
		Long endTreeSetTime = System.currentTimeMillis();
		
		System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));
		
		//3.- LinkedHashSet		
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>(1_000_000);
		
		Long startLinkedHashSetTime = System.currentTimeMillis();
		
		for (int i = 0; i < 1_000_000; i++) {
			linkedHashSet.add(i);
		}
		
		Long endLinkedHashSetTime = System.currentTimeMillis();
		
		System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));
		
	}

}
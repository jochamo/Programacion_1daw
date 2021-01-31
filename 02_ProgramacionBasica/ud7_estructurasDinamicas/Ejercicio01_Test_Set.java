package ud7_estructurasDinamicas;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio01_Test_Set {

	public static void main(String[] args) {

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

		//3.- LinkedHashSet
		System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>(1_000_000);

		Long startLinkedHashSetTime = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
			linkedHashSet.add(i);
		}
		Long endLinkedHashSetTime = System.currentTimeMillis();
		System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));

	}

}
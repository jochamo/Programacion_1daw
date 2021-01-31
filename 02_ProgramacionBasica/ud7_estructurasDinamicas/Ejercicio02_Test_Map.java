package ud7_estructurasDinamicas;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ejercicio02_Test_Map {

	public static void main(String[] args) {

		//1.- HashMap
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>(1_000_000);

		Long startHashMapTime = System.currentTimeMillis();

		for (int i = 0; i < 1_000_000; i++) {
			hashMap.put(i, i+1);
		}

		Long endHashMapTime = System.currentTimeMillis();

		System.out.println("Time spent by HashMap: " + (endHashMapTime - startHashMapTime));

		//2.- TreeMap
		Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		
		Long startTreeMapTime = System.currentTimeMillis();
		
		for (int i = 0; i < 1_000_000; i++) {
			treeMap.put(i, i+1);
		}
		
		Long endTreeMapTime = System.currentTimeMillis();
		
		System.out.println("Time spent by TreeMap: " + (endTreeMapTime - startTreeMapTime));
		
		//3.- LinkedHashMap
		Map<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>(1_000_000);

		Long startLinkedHashMapTime = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
			linkedHashMap.put(i, i+1);
		}
		
		Long endLinkedHashMapTime = System.currentTimeMillis();
		
		System.out.println("Time spent by LinkedHashMap: " + (endLinkedHashMapTime - startLinkedHashMapTime));


	}

}
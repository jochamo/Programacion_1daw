package ud7_ampliacionRefuerzo;

import java.util.ArrayList;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		
		l1.add( 4);
		l1.add( 6);
		l1.add( 8);
		l1.add(10);
		
		l2.add( 4);
		l2.add( 8);
		l2.add(12);
		l2.add(16);
		l2.add(20);
		
		ArrayList<Integer> l3 = diferenciaSimetrica_2(l1, l2);

		System.out.println(l1);
		System.out.println(l2);
		System.out.println(  );
		System.out.println(l3);		
	}

	public static ArrayList<Integer> diferenciaSimetrica_1(ArrayList<Integer> l1, ArrayList<Integer> l2) {

		ArrayList<Integer> l3 = new ArrayList<Integer>();
		
		for (int i = 0; i < l1.size(); i++) {
			
			int elem = l1.get(i);
			
			if (!l2.contains(elem)) {
				l3.add(elem);
			}
		}
		
		for (int i = 0; i < l2.size(); i++) {
			
			int elem = l2.get(i);
			
			if (!l1.contains(elem)) {
				l3.add(elem);
			}
		}
				
		return l3;
	}

	private static ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2) {
		
		ArrayList<Integer> l3 = new ArrayList<Integer>(l1);
		
		for (Integer worte: l2) {
			
			if (!l1.contains(worte))
				
				l3.add(worte);
		}
		
		return l3;
	}
	
	private static ArrayList<Integer> interseccion(ArrayList<Integer> l1, ArrayList<Integer> l2) {
		
		ArrayList<Integer> c = new ArrayList<Integer>();
		
		ArrayList<Integer> iter = l1.size() > l2.size() ? l1 : l2;
		
		for (Integer elem : iter) {
			
			if (l1.contains(elem) && l2.contains(elem)) {
				c.add(elem);
			}
		}
		
		return c;
	}
	
	// A - B
	private static ArrayList<Integer> diferencia(ArrayList<Integer> a, ArrayList<Integer> b){
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		for(Integer elem: a) {
			
			if(!b.contains(elem)){
				res.add(elem);
			}
		}
			
		return res;
	}
	
	// A - B
	private static ArrayList<Integer> diferenciaOle(ArrayList<Integer> l1, ArrayList<Integer> l2){
		
		ArrayList<Integer> l3 = new ArrayList<Integer>(l1);
		
		l3.removeAll(l2);		
		
		return l3;
	}
	
	
	public static ArrayList<Integer> diferenciaSimetrica_2(ArrayList<Integer> l1, ArrayList<Integer> l2) {	
		
		ArrayList<Integer> l1_menos_l2 = diferencia(l1, l2);
		ArrayList<Integer> l2_menos_l1 = diferencia(l2, l1);
				
		l1_menos_l2.addAll(l2_menos_l1);
        
        return l1_menos_l2;
	}
	
}
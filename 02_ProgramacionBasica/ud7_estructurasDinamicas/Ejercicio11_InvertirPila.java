package ud7_estructurasDinamicas;

import java.util.Collections;
import java.util.HashSet;
import java.util.Stack;

public class Ejercicio11_InvertirPila {

	public static void main(String[] args) {
		
		//TODO
		// en los apuntes pone que no se insertan ordenados
		// al ejecutar este codigo salen ordenados !!
		// probar imprimir con iterator !!
		
		/*
		HashSet<Integer> hs = new HashSet();
		hs.add(1);
		hs.add(4);
		hs.add(3);
		hs.add(5);
		hs.add(2);
		System.out.println( hs ); 
		*/
		
		Stack<Integer> myStack = new Stack<>();
		
		myStack.add( 1 );
		myStack.add( 2 );
		myStack.add( 3 );
		myStack.add( 4 );
		myStack.add( 5 );
		
		
		
		System.out.println( myStack );

		//Collections.reverse(myStack);
		
		Stack n = invertirPilaRecursivo( myStack, myStack.size() );
		
		System.out.println( n );
		
		/*
		int suma = 0;
		for (int i = 0; i < myStack.size(); i++) {
			
			suma = suma + myStack.get(i);		
		}
		
		System.out.println( suma );
		System.out.println( myStack );
		*/
	}

	public static Stack<Integer> invertirPilaIterativo(Stack<Integer> s) {
		
		Stack<Integer> n = new Stack<Integer>();

		while( !s.isEmpty() ) {
			n.push( s.pop() );
		}
		
		return n;		
	}
	
	public static Stack<Integer> invertirPilaRecursivo(Stack<Integer> s, int i) {
		
		Stack<Integer> n = new Stack<Integer>();
		
		//if (s.isEmpty()) {
		if (i == 0) {
			
		}
		else {

			n = invertirPilaRecursivo(s, --i);			

			n.push( s.pop() );			
		}
		
		return n;		
	}
	
}

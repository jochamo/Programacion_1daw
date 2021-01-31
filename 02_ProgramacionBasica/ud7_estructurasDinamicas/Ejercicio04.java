package ud7_estructurasDinamicas;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		//Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en
		//un ArrayList y que luego calcule la suma, la media, el máximo y el mínimo 
		// de esos números.
		
		//El tamaño de la lista también será aleatorio y podrá oscilar entre 10 y 20
		//elementos ambos inclusive.
		
		int random;
		int suma = 0;
		double media;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		Random x = new Random();		
		int a = x.nextInt(10);
		
		ArrayList list = new ArrayList();
		
		for (int i = 0; i < a; i++) {
		
			random = x.nextInt(100);
			suma   = suma + random;
			
			if (random < min) min = random;
			if (random > max) max = random;
			
			list.add( random );			
		}
		
		media = (double) suma / (double) a;
		
		for (int i = 0; i < a-1; i++) {
			System.out.print(list.get(i) + " - ");	
		}
		System.out.println( list.get(a-1) );
		
		System.out.println("Tamaño: " + a);
		System.out.println("Suma:   " + suma);
		System.out.println("Media:  " + media);
		System.out.println("Máximo: " + max);
		System.out.println("Mínimo: " + min);

	}

}

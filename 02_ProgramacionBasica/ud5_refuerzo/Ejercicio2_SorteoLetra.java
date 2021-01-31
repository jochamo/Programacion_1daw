package ud5_refuerzo;

public class Ejercicio2_SorteoLetra {
	
	public static void main(String[] args) {
		
		
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		char[] abcChar = abc.toCharArray();
		
		int aleatorio = (int)(Math.random()*26);	
		System.out.println(abcChar[aleatorio]);
		
		String[] animales = {"perro", "gato", "leon", "elefante", "delfin"};
		int aleatorio2 = (int)(Math.random()*5);		
		System.out.println(animales[aleatorio2]);		 
	}
	
}
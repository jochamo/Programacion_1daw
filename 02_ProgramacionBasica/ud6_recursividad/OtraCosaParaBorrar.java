package ud6_recursividad;

public class OtraCosaParaBorrar {

	public static void main(String[] args) {
		

		String s = "Ana";		
		System.out.println("Ana es palíndromo: " + esPalindromoAlumnos(s));

		String s1 = "bueno123";		
		String s2 = "o123";
		System.out.println("ísimo es sufijo buenísimo ?? " + esSufijo(s1, s2));
	}

	public static boolean esPalindromoAlumnos(String s){

		boolean res;

		if (s.length()<=1){
			res = true;
		}
		else{
			if (s.toLowerCase().charAt(0) == s.toLowerCase().charAt(s.length()-1)){
				res = esPalindromoAlumnos( s.substring(1, s.length()-1) );
			}				
			else{
				res = false;				
			}				
		}
		
		return res;
	}

	public static boolean esSufijo(String s1, String s2){

		boolean res = false;
		
		//Caso base
		if (s2.length() == 0){
			
			res = true;
		}	
		else{
			//Caso recursivo
			if (s1.charAt(s1.length()-1) == s2.charAt(s2.length()-1)){
			
				res = esSufijo(s1.substring(0, s1.length()-1), s2.substring(0, s2.length()-1));
			}
			else{
				res = false;
			}			
		}

		return res;
	}	
	
}
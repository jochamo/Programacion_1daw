package ud6_sobrecarga;

public class Ejercicio1 {

	public static void main(String[] args) {
		

		int i = 5;
		int j = 7;		
		
		int res = suma(i, j);
		
		System.out.println( res );
		
		System.out.println( i );		
	}	
	
	public static int suma(int a, int b) {
		
		return suma(a, b, 0, 0);		
	}
	
	public static int suma(int x, int y, int z) {
		
		return suma(x,y,z,0);		
	}
	
	public static int suma(int i, int j, int k, int l) {
		
		return i+j+k+l;		
	}
	
}
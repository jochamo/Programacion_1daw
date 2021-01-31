package ud6_sobrecarga;

public class ClaseSobrecarga {

	public static void main(String[] args) {

		int a = 3;
		int b = 6;		
		int c = 7;
		int d = 9;		

		int res = suma(a, b, c, d);

		System.out.println( res );
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
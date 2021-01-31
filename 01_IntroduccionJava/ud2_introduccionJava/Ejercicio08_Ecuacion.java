package ud2_introduccionJava;

public class Ejercicio08_Ecuacion {

	public static void main(String[] args) {
		
		double x, y, z;
		
		x = 1;
		y = 1;
		
		z = (1 + (x*x/y)) / ((x*x*x)/(1+y));
		
		System.out.println( z );
	}

}
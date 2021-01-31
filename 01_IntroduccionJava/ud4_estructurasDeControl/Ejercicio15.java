package ud4_estructurasDeControl;

public class Ejercicio15 {

	public static void main(String[] args) {

		int n = 13;

		double resultado;
		int i;
		
		if (n<0) i = -n;
		else i = n;
		
		resultado = 0.0;
		
		while (i>=1) {
			resultado += (1/i);
			i--;
		}
		
		System.out.println( i + " - " + resultado );
	}

}
package ud4_estructurasDeControl_Diagramas;

public class Ejercicio4_Raiz {

	public static void main(String[] args) {
		

		double x = 8.0;
		
		double b = x;
		
		double aux = 0.0;
		
		while (b != aux) {
			
			aux = (x/b);
			
			b = (double)(aux+b)/2;
			
			aux = redondearDecimales(aux, 4);
			b   = redondearDecimales(b  , 4);
			
		}
		
		System.out.println( b );

	}

	
	 public static double redondearDecimales(double valorInicial, int numeroDecimales) {
	        double parteEntera, resultado;
	        resultado = valorInicial;
	        parteEntera = Math.floor(resultado);
	        resultado=(resultado-parteEntera)*Math.pow(10, numeroDecimales);
	        resultado=Math.round(resultado);
	        resultado=(resultado/Math.pow(10, numeroDecimales))+parteEntera;
	        return resultado;
	    }
	 
}
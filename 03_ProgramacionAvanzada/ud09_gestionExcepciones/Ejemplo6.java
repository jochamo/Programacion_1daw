package ud09_gestionExcepciones;

import java.util.*;

public class Ejemplo6 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		
		boolean salir = false;
		int respuesta;
		
		while (!salir) {
			
			try {
				respuesta = leerEnteroPositivo(tec);
				System.out.println("Se ha leído el número " + respuesta);
				salir = true;
			}
			catch (InputMismatchException e) {
				System.out.println(e + ": Error: no es un entero");
				
				//NOTA: A partir de la versión 7.0 de Java, un único bloque catch puede utilizarse para
				//      capturar más de un tipo de excepción, separando estas por una barra vertical (|).
				
			}
			catch (NegativoException e) {
				//System.out.println(e + ": Error: no es positivo");
				System.out.println(e.excErrorPersonalizado());			
			}
			finally {
				tec.nextLine();
			}
		}
	}
	private static int leerEnteroPositivo(Scanner t) throws InputMismatchException, NegativoException {
		
		System.out.print("Introduce un entero positivo: ");
		int leido = t.nextInt();
		
		if (leido<0) throw new NegativoException();
		
		return leido;
	}
}
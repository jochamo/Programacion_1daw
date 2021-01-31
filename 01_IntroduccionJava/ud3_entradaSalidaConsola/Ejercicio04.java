package ud3_entradaSalidaConsola;

public class Ejercicio04 {

	public static void main(String[] args) {
		

		double megas = 3425;		
		
		double kilos = megas * 1024;
		double bytes = kilos * 1024;
		
		double gigas = megas / 1024.0;
		double teras = gigas / 1024.0;
		
		String texto1 = "texto";
		System.out.printf("%.3f %s %.3f %n", megas, texto1, bytes);
		
		
		
		//System.out.printf("%10.2f %10.2f %10.2f %10.2f %10.2f", bytes, kilos, megas, gigas, teras);
		

	}

}

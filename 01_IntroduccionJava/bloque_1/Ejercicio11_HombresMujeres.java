package bloque_1;

import java.util.Scanner;

public class Ejercicio11_HombresMujeres {

	public static void main(String[] args) {

		String respuesta = "";
		double v = 0;
		double m = 0;
		double estV = 0;
		double estM = 0;
		double sumaEstaV = 0;
		double sumaEstaM = 0;
		double mediaV = 0;
		double mediaM = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Hombre o mujer (v/m)");
			respuesta = sc.nextLine();
			
			System.out.println("Introduzca estatura (en metros)");
			
			if (respuesta.equals("v")) {
				estV = sc.nextFloat();
				v++;
				sumaEstaV = sumaEstaV + estV;
			}
			else {
				estM = sc.nextFloat();
				m++;
				sumaEstaM = sumaEstaM + estM;
			}
			
			sc.nextLine();			
			System.out.println("¿Desea continuar? (s/n)");
			respuesta = sc.nextLine();			
			
		} while (respuesta.equals("s"));
		
		mediaV = sumaEstaV / v;
		mediaM = sumaEstaM / m;
		
		System.out.println("   Hombres   Mujeres");
		System.out.println("-----------------------");
		
		System.out.printf("%10.0f", v);
		System.out.printf("%10.0f %n", m);
		System.out.printf("%10.2f", mediaV);
		System.out.printf("%10.2f %n", mediaM);

	}

}
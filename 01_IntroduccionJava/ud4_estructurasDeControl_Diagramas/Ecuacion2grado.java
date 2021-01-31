package ud4_estructurasDeControl_Diagramas;

import java.util.Scanner;

public class Ecuacion2grado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Declarar variables
		int a;
		int b;
		int c;
		int discriminante;
		float x1;
		float x2;
		float raiz;

		//Preguntar valor de A
		System.out.println("Dime el valor de A");

		//Leer valor de A
		a = sc.nextInt();

		//Preguntar valor de B
		System.out.println("Dime el valor de B");

		//Leer valor de B
		b = sc.nextInt();

		//Preguntar valor de C
		System.out.println("Dime el valor de C");

		//Leer valor de C
		c = sc.nextInt();

		discriminante=(b*b)-(4*a*c);

		//
		if(discriminante<0) {
			System.out.println("No hay soluciones");
		}else{
			if(discriminante==0) {
				//1 única solución
				x1=-b/(2*a);
				System.out.println("La unica solución es "+x1);
			}else {
				//2 soluciones
				raiz=(float)Math.sqrt(discriminante);
				x1=(-b+raiz)/(2*a);
				x2=(-b-raiz)/(2*a);
				System.out.println("La primera solución es "+x1);
				System.out.println("La segunda solución es "+x2);
			}
		}		
	}
}
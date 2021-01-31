package ud6_recursividad;

import java.util.Scanner;

public class ExamenAlumnos2018 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);		

		int opcion = 0;
		int num1 = 0;
		int num2 = 0;
		String palabra = "";

		while(true) {
			
			System.out.println("1 - Ejercicio_1, Cancion cerveza");
			System.out.println("2 - Ejercicio_B, Orden descendente");
			System.out.println("3 - Ejercicio_C, Suma del array");
			System.out.println("4 - Ejercicio_D, Repeticiones de un numero en el array");
			System.out.println("0 - Salir");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				cervezas(99,99);
				System.out.println();

				break;
			case 2:


				break;
			case 3:
				System.out.println("Dime filas");
				num1 = sc.nextInt();

				int n = num1;
				int aux = n;
				for (int f=1; f<=n; f++){
					for (int j = aux; j>=1; j--)
					{
						System.out.printf("  ");
					}
					for (int i=1; i<=f; i++)
					{
						System.out.printf("%4d", Pascal(f, i));
					}
					System.out.printf("%n");
					aux --;
				}
				System.out.println();

				break;
			case 4:
				System.out.println("Dime palabra:");
				sc.nextLine();
				palabra = sc.nextLine();

				System.out.println(MayusPorMinusYViceversa(palabra));
				break;

			case 0:
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}

	private static void cervezas(int cervezas,int contador) {
		
		if(cervezas == 0){
			System.out.println("No hay más botellas de cerveza en la pared, no hay más botellas de cerveza");
			System.out.println("no las agarrarás, y no las pasarás, porque no hay más botellas de cerveza en la pared.");
		}else{
			System.out.println("Hay "+cervezas+" botellas de cerveza en la pared, hay "+cervezas+" botellas de cerveza,");
			contador=contador-1;
			System.out.println("una sola agarrarás, y después la pasarás, hay "+contador+" botellas de cerveza en la pared.");
			System.out.println();
			cervezas(cervezas-1,contador);
		}
	}

	public static int Pascal(int f, int i){
		
		if ( (i == 1) || (i == f) ){
			return 1;
		} else{
			return Pascal(f-1, i) + Pascal(f-1, i-1);
		}
		
	}

	private static String MayusPorMinusYViceversa(String palabra) {

		if (palabra.equals("")) return palabra;		

		if(Character.isUpperCase(palabra.charAt(0))) {
			return Character.toLowerCase(palabra.charAt(0))+ MayusPorMinusYViceversa(palabra.substring(1));
		}
		else if	(Character.isLowerCase(palabra.charAt(0))) {
			return Character.toUpperCase(palabra.charAt(0))+ MayusPorMinusYViceversa(palabra.substring(1));
		}
		return palabra.charAt(0)+MayusPorMinusYViceversa(palabra.substring(1));

	}

}
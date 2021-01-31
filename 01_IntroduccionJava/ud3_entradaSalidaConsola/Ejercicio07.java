package ud3_entradaSalidaConsola;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		//Escribe un programa que dado el número de clase del alumno, el nombre
		//completo y las notas de 3 exámenes, calcule la nota media.

		//Scanner sc = new Scanner(System.in);

		//Número de clase		
		//System.out.println("Número de clase?");
		//int numClase = sc.nextInt();
		int numClase = 9;

		//Nombre.
		//System.out.println("Nombre?");
		//sc.nextLine();
		//String nombre = sc.nextLine();
		String nombre = "9 - Jose Chamorro";

		//Nota 1 examen
		//System.out.println("Nota 1er examen?");
		//double nota1 = sc.nextDouble();
		double nota1 = 5.5;

		//Nota 2 examen
		//System.out.println("Nota 2ndo examen?");
		//double nota2 = sc.nextDouble();
		double nota2 = 8.7;

		//Nota 3 examen
		//System.out.println("Nota 3er examen?");
		//double nota3 = sc.nextDouble();
		double nota3 = 6.3;

		//Calcular nota media
		double notaMedia = (nota1 + nota2 + nota3) / 3;
		
		//IMPRIMIR
		System.out.println("");
		System.out.println("┌─────────────────────────────────┬────────┬────────┬────────┬────────┐");		
		System.out.printf( "│ Alumno: %-22s  │  ex.1  │  ex.2  │  ex.3  │  media │\n", nombre);
		System.out.println("├─────────────────────────────────┼────────┼────────┼────────┼────────┤");    
		System.out.printf( "│ Notas 1era Evaluación           │   %.1f  │   %.1f  │   %.1f  │   %.2f │\n", nota1, nota2, nota3, notaMedia);
		System.out.println("└─────────────────────────────────┴────────┴────────┴────────┴────────┘");    
	}

}
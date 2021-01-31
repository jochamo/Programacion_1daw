package ud3_entradaSalidaConsola;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Fecha de nacimiento: tres números enteros.		
		System.out.println("Fecha de nacimiento: dia, mes y año?");
		int dia = sc.nextInt();
		int mes = sc.nextInt();
		int ano = sc.nextInt();
		
		//NIF.
		System.out.println("NIF?");
		sc.nextLine();
		String nif = sc.nextLine();
		
		//Nombre.
		System.out.println("Nombre?");
		String nombre = sc.nextLine();
		
		//Dirección: calle y numero.
		System.out.println("Dirección: calle y numero?");
		String direccion = sc.nextLine();
		
		//Código postal y población.
		System.out.println("Código postal y población?");
		String poblacion = sc.nextLine();
		
		//Teléfono fijo.
		System.out.println("Teléfono fijo?");
		String telFijo = sc.nextLine();
		
		//Teléfono móvil.
		System.out.println("Teléfono móvil?");
		String telMovil = sc.nextLine();
		
		//Salario bruto: un número real con dos decimales.
		System.out.println("Salario bruto?");
		double bruto = sc.nextDouble();
		
		//Retención: un número entero.
		System.out.println("Retención?");
		sc.nextLine();
		int retencion = sc.nextInt();

		//Calcular salario neto
		double neto = bruto - ((bruto * retencion) / 100);		
		
		//IMPRIMIR		
		System.out.printf("Nombre.............: %s%n", nombre.trim());
		System.out.printf("%n");
		System.out.printf("Dirección..........: %s%n", direccion.trim());
		System.out.printf("%n");
		System.out.printf("Teléfono fijo......: %s%n", telFijo.trim());
		System.out.printf("Teléfono móvil.....: %s%n", telMovil.trim());
		System.out.printf("%n");
		System.out.printf("NIF................: %s%n", nif.trim());
		System.out.printf("%n");
		System.out.printf("Fecha de nacimiento: %d %d %d%n", dia, mes, ano);
		System.out.printf("%n");
		System.out.printf("Salario bruto......: %f%n", bruto);
		System.out.printf("Retención..........: %d%n", retencion);
		System.out.printf("Salaroi neto.......: %f%n", neto);
	}

}
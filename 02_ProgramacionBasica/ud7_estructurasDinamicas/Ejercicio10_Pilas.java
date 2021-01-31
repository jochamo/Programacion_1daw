package ud7_estructurasDinamicas;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio10_Pilas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean continuar = true;
		int opcion;
		String persona;

		Stack<String> miPila = new Stack<>();
		
		//Insert 	add(e) 	    offer(e)
		//Remove 	remove() 	poll()
		//Examine 	element() 	peek()
		
		
		while (continuar)		
		{	
			//Mostrar por pantalla el menú Secundario
			imprimirMenu();			

			//Leer la opción escogida por el usuario
			opcion = sc.nextInt(); sc.nextLine();

			switch(opcion){
			case 1:
			{	
				// Insertar elemento (Apilar)
				System.out.println("Persona que llega:");
				persona = sc.nextLine();

				miPila.push( persona );				
				
				break;
			}
			case 2:
			{
				// Eliminar elemento (Desapilar) 
				String p = miPila.pop();
				System.out.println("He eliminado a " + p);				
								
				break;
			}
			case 3:
			{
				// Consultar primer/último elemento
				System.out.println("Primer elemento: " + miPila.peek());
				
				break;
			}
			case 4:
			{
				// Buscar elemento	
				System.out.println("Persona a buscar:");
				persona = sc.nextLine();

				if (miPila.contains( persona )) {

					System.out.println("SI está esperando la persona en la pila.");
				}
				else {
					System.out.println("NO está esperando la persona en la pila.");
				}			
				
				break;
			}
			case 5:
			{
				// Numero de elementos de la Pila
				System.out.println("Número de elementos: " + miPila.size());
				
				break;
			}
			case 6:
			{
				// Comprobar si la Pila está vacía
				if (miPila.isEmpty()) {
					System.out.println("Pila vacía.");
				}
				else {
					System.out.println("Pila con elementos.");
				}
				
				break;
			}
			case 7:
			{
				// Eliminar todos los elementos de la Pila
				miPila.clear();
				
				break;
			}
			case 8:
			{
				System.out.println( miPila );
				
				// Imprimir Pila
				int i = miPila.size()-1;
				System.out.println("|            |");
				while (i >= 0) {
					System.out.printf( "%s%10s%s%n", "|", miPila.get(i), "  |"  );
					i--;
				}
				System.out.println("|____________|");
				
				
				
				break;
			}			
			case 9:
			{
				continuar = false;
				break;
			}
			default:
			{
				System.out.printf("\n\nOpción incorrecta\n");
				break;
			}
			}
		}
		
		System.out.printf("\n\nHASTA PRONTO !!!\n");
	}

	public static void imprimirMenu() {	
		System.out.printf("\n  1.- Insertar elemento (Apilar)");
		System.out.printf("\n  2.- Eliminar elemento (Desapilar)");
		System.out.printf("\n  3.- Consultar primer/último elemento");
		System.out.printf("\n  4.- Buscar elemento");
		System.out.printf("\n  5.- Numero de elementos de la Pila");
		System.out.printf("\n  6.- Comprobar si la Pila está vacía");
		System.out.printf("\n  7.- Eliminar todos los elementos de la Pila");
		System.out.printf("\n  8.- Imprimir Pila");			
		System.out.printf("\n\n  9.- Salir");
		System.out.printf("\n\nOpcion: ");
	}
	
}
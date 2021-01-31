package ud7_estructurasDinamicas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio09_Colas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean continuar = true;
		int opcion;
		String persona;

		Queue<String> miCola = new LinkedList<>();
		
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
				// Insertar elemento (Encolar)
				System.out.println("Persona que llega:");
				persona = sc.nextLine();

				if (miCola.add( persona )) {
					
					System.out.println("Persona insertada correctamente");
				}
				else {
					System.out.println("ERROR al insertar la persona");
				}
				
				break;
			}
			case 2:
			{
				// Eliminar elemento (Desencolar) 
				miCola.poll();
				
				//if (miCola.remove("Roberto")) {
				//	System.out.println("He eliminado a Roberto.");
				//}
								
				break;
			}
			case 3:
			{
				// Consultar primer/último elemento
				System.out.println("Primer elemento: " + miCola.peek());
				//System.out.println("Primer elemento: " + miCola.element());
				
				break;
			}
			case 4:
			{
				// Buscar elemento	
				System.out.println("Persona a buscar:");
				persona = sc.nextLine();

				if (miCola.contains( persona )) {

					System.out.println("SI está esperando la persona en la cola.");
				}
				else {
					System.out.println("NO está esperando la persona en la cola.");
				}			
				
				break;
			}
			case 5:
			{
				// Numero de elementos de la Cola
				System.out.println("Número de elementos: " + miCola.size());
				
				break;
			}
			case 6:
			{
				// Comprobar si la Cola está vacía
				if (miCola.isEmpty()) {
					System.out.println("Cola vacía.");
				}
				else {
					System.out.println("Cola con elementos.");
				}
				
				break;
			}
			case 7:
			{
				// Eliminar todos los elementos de la Cola
				miCola.clear();
				
				break;
			}
			case 8:
			{
				// Imprimir Cola
				System.out.println("Lista de espera: " + miCola);
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
		System.out.printf("\n  1.- Insertar elemento (Encolar)");
		System.out.printf("\n  2.- Eliminar elemento (Desencolar)");
		System.out.printf("\n  3.- Consultar primer/último elemento");
		System.out.printf("\n  4.- Buscar elemento");
		System.out.printf("\n  5.- Numero de elementos de la Cola");
		System.out.printf("\n  6.- Comprobar si la Cola está vacía");
		System.out.printf("\n  7.- Eliminar todos los elementos de la Cola");
		System.out.printf("\n  8.- Imprimir Cola");			
		System.out.printf("\n\n  9.- Salir");
		System.out.printf("\n\nOpcion: ");
	}
	
}
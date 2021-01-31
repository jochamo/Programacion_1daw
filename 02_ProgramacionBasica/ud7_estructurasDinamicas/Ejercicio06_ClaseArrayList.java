package ud7_estructurasDinamicas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio06_ClaseArrayList {

	/*

	Algunos métodos que proporciona ArrayList son:

	MÉTODO					DESCRIPCIÓN

	size()					Devuelve el número de elementos (int)
	add(X)					Añade el objeto X al final. Devuelve true.
	add(posición, X)		Inserta el objeto X en la posición indicada.
	get(posicion)			Devuelve el elemento que está en la posición indicada.
	remove(posicion)		Elimina el elemento que se encuentra en la posición indicada. Devuelve el elemento eliminado.
	remove(X)				Elimina la primera ocurrencia del objeto X. Devuelve true si el elemento está en la lista.
	clear()					Elimina todos los elementos.
	set(posición, X)		Sustituye el elemento que se encuentra en la posición indicada por el objeto X. Devuelve el elemento sustituido.
	contains(X)				Comprueba si la colección contiene al objeto X. Devuelve true o false.
	indexOf(X)				Devuelve la posición del objeto X. Si no existe devuelve -1

	Los puedes consultar todos en:

		http://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html

	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int opcion;		
		while (true)		
		{	
			//Mostrar por pantalla el menú Principal
			imprimirMenuPpal();			

			opcion = sc.nextInt();
			switch(opcion){
			case 1:
			{
				funcionalidadArrayListEnteros();
				break;
			}
			case 2:
			{
				funcionalidadArrayListStrings();				
				break;
			}
			case 3:
			{
				funcionalidadArrayListMixto();				
				break;
			}
			case 9:
			{
				System.out.println("\nFIN del programa");				
				System.exit(0);
			}
			default:
			{
				System.out.printf("\n\nOpción incorrecta\n");
				break;
			}
			}
		}
	}

	public static void imprimirMenuPpal() {	
		System.out.printf("\n1.- ArrayList de enteros");
		System.out.printf("\n2.- ArrayList de Strings");
		System.out.printf("\n3.- ArrayList mixto");			
		System.out.printf("\n\n9.- Salir");
		System.out.printf("\n\nOpcion: ");
	}

	public static void imprimirMenuSecundario() {	
		System.out.printf("\n  1.- Insertar elemento al final");
		System.out.printf("\n  2.- Insertar elemento en la posición indicada");
		System.out.printf("\n  3.- Eliminar elemento (primera ocurrencia)");
		System.out.printf("\n  4.- Eliminar elemento en la posición indicada");
		System.out.printf("\n  5.- Eliminar todos los elementos");
		System.out.printf("\n  6.- Buscar elemento");
		System.out.printf("\n  7.- Numero de elementos del ArrayList");
		System.out.printf("\n  8.- Imprimir ArrayList");			
		System.out.printf("\n\n  9.- Volver al menú principal");
		System.out.printf("\n\nOpcion: ");
	}

	public static void funcionalidadArrayListEnteros() {

		Scanner sc = new Scanner(System.in);

		int opcion;
		int numero;
		int posicion;
		boolean continuar = true;

		/* 
		 * 
		 * De forma general un ArrayList en Java se crea de la siguiente forma:
		 * 
		 * 		ArrayList nombreArray = new ArrayList();
		 * 
		 * Esta instrucción crea el ArrayList nombreArray vacío.
		 * Un arrayList declarado así puede contener objetos de cualquier tipo.
		 * 
		 * Crear ArrayList de un tipo concreto
		 *  
		 * 		ArrayList<tipo> nombreArray = new ArrayList<tipo>();
		 * 
		 * tipo debe ser una clase. Indica el tipo de objetos que contendrá el array.
		 * No se pueden usar tipos primitivos. Para un tipo primitivo se debe utilizar su clase envolvente.
		 * 
		 * Crear ArrayList de enteros
		 * 
		 * 		ArrayList<Integer> numeros = new ArrayList<Integer>();
		 *
		 */

		ArrayList<Integer> numeros = new ArrayList<Integer>();		

		while (continuar)		
		{	
			//Mostrar por pantalla el menú Secundario
			imprimirMenuSecundario();			

			//Leer la opción escogida por el usuario
			opcion = sc.nextInt();

			switch(opcion){
			case 1:
			{
				//1.- Insertar elemento al final
				System.out.println("Número a insertar:");
				numero = sc.nextInt();

				if (numeros.add( numero )) {
					
					System.out.println("Número insertado correctamente");
				}
				else {
					System.out.println("ERROR al insertar el número");
				}
				
				break;
			}
			case 2:
			{
				//2.- Insertar elemento en la posición indicada
				System.out.println("Número a insertar:");
				numero = sc.nextInt();
				
				System.out.println("Posición:");
				posicion = sc.nextInt();

				//Si la posición está en el rango adecuado...
				if (posicion >= 0 && posicion <= numeros.size()) {
					//...insertar el elemento en la posición indicada
					numeros.add( posicion, numero );
					System.out.println("Número insertado correctamente");	
				}
				else {
					//...sinó, mostrar error
					System.out.println("La posición indicada es incorrecta");
				}
								
				break;
			}
			case 3:
			{
				//3.- Eliminar elemento (primera ocurrencia)
				System.out.println("Número a eliminar:");
				numero = sc.nextInt();
				
				if (numeros.remove( (Object) numero )) {

					System.out.println("Elemento eliminado correctamente");
				}
				else {
					System.out.println("NO existe el número a eliminar en el ArrayList");
				}
				
				break;
			}
			case 4:
			{
				//4.- Eliminar elemento en la posición indicada
				System.out.println("Posición del número a eliminar:");
				posicion = sc.nextInt();
				
				//Si la posición está en el rango adecuado...
				if (posicion >= 0 && posicion < numeros.size()) {
					//...eliminar el número
					System.out.println("El número eliminado es " + numeros.remove( posicion ));	
				}
				else {
					//...sinó, mostrar error
					System.out.println("La posición indicada es incorrecta");
				}								
				
				break;
			}
			case 5:
			{
				//5.- Eliminar todos los elementos del ArrayList	
				numeros.clear();
				break;
			}
			case 6:
			{
				//6.- Buscar elemento	
				System.out.println("Número a buscar:");
				numero = sc.nextInt();

				if (numeros.contains( numero )) {

					System.out.println("SI existe el número en el ArrayList");
				}
				else {
					System.out.println("NO existe el número en el ArrayList");
				}
				
				break;
			}
			case 7:
			{
				//7.- Numero de elementos del ArrayList		
				System.out.println("Número de elementos: " + numeros.size());
				break;
			}
			case 8:
			{
				//8.- Imprimir ArrayList	

				/*
				 * 
				 * RECORRER UN ARRAYLIST
				 * 
				 * Podemos recorrerlo de forma clásica con un bucle for:
				 * 
				 * for(int i = 0;i<array.size();i++){
				 * 		System.out.println(array.get(i));
				 * }
				 * 
				 * Con un bucle foreach:
				 * 
				 * Si suponemos el array de enteros llamado numeros:
				 * 
				 * for(Integer i: numeros){
				 *		System.out.println( i );
				 * }
				 *  
				 * Si el array contiene objetos de tipos distintos o desconocemos el tipo:
				 * 
				 * for(Object o: nombreArray){
				 * 		System.out.println( o );
				 * }
				 * 				
				 */

				for(int i = 0; i < numeros.size(); i++){

					System.out.println( numeros.get(i) );
				}

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
	}

	public static void funcionalidadArrayListStrings() {

		Scanner sc = new Scanner(System.in);

		int opcion;
		int numero;
		boolean continuar = true;

		while (continuar)		
		{	
			//Mostrar por pantalla el menú Secundario
			imprimirMenuSecundario();			

			opcion = sc.nextInt();
			switch(opcion){
			case 1:
			{
				//1.- Insertar elemento al final
				break;
			}
			case 2:
			{
				//2.- Insertar elemento en la posición indicada		
				break;
			}
			case 3:
			{
				//3.- Eliminar elemento (primera ocurrencia)		
				break;
			}
			case 4:
			{
				//4.- Eliminar elemento en la posición indicada		
				break;
			}
			case 5:
			{
				//5.- Eliminar todos los elementos		
				break;
			}
			case 6:
			{
				//6.- Buscar elemento		
				break;
			}
			case 7:
			{
				//7.- Numero de elementos del ArrayList		
				break;
			}
			case 8:
			{
				//8.- Imprimir ArrayList	
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
	}

	public static void funcionalidadArrayListMixto() {

		Scanner sc = new Scanner(System.in);

		int opcion;
		int numero;
		boolean continuar = true;

		while (continuar)		
		{	
			//Mostrar por pantalla el menú Secundario
			imprimirMenuSecundario();			

			opcion = sc.nextInt();
			switch(opcion){
			case 1:
			{
				//1.- Insertar elemento al final				
				break;
			}
			case 2:
			{
				//2.- Insertar elemento en la posición indicada		
				break;
			}
			case 3:
			{
				//3.- Eliminar elemento (primera ocurrencia)		
				break;
			}
			case 4:
			{
				//4.- Eliminar elemento en la posición indicada		
				break;
			}
			case 5:
			{
				//5.- Eliminar todos los elementos		
				break;
			}
			case 6:
			{
				//6.- Buscar elemento		
				break;
			}
			case 7:
			{
				//7.- Numero de elementos del ArrayList		
				break;
			}
			case 8:
			{
				//8.- Imprimir ArrayList	
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
	}

}
package ud09_agenda;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AgendaMenu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcion    = 0;
		boolean salir = false;

		Agenda a = new Agenda();

		while( true ){

			//Bucle para escoger una opción correcta
			while (!salir) {

				try {
					opcion = menu(sc);
					salir  = true;
				}
				catch (InputMismatchException e) {
					System.out.printf("%nError: no ha introducido un número entero%n%n");					
				}
				catch (AgendaExcFueraRango e) {
					System.out.printf("%n%s%nEscoja otra opción.%n%n", e.mensajeError() );					
				}
				finally {
					sc.nextLine();
				}
			}

			//
			switch(opcion) {

			case 1:{
				//Cargar Fichero Agenda
				a.cargarFichero();
				break;
			}
			case 2:{
				System.out.printf("%nHa escogido Guardar Fichero Agenda.%n%n");
				a.guardarFichero();
				break;
			}
			case 3:{
				System.out.printf("%nHa escogido Buscar Nombre.%n%n");
				a.buscarNombre();
				break;
			}
			case 4:{
				System.out.printf("%nInsertar NUEVO CONTACTO.%n");

				System.out.printf("%nInsertar NOMBRE:%n%n");
				String nombre = sc.nextLine();
				System.out.printf("%nInsertar APELLIDOS:%n%n");
				String apellidos = sc.nextLine();
				System.out.printf("%nInsertar TELEFONO:%n%n");
				String telefono = sc.nextLine();
				System.out.printf("%nInsertar EDAD:%n%n");
				int edad = sc.nextInt(); sc.nextLine();
				
				AgendaContacto c = new AgendaContacto( nombre, apellidos, telefono, edad );
				a.insertarContacto( c );								
				break;
			}
			case 5:{
				System.out.printf("%nHa escogido Eliminar Nombre.%n%n");
				a.eliminarNombre();				
				break;
			}
			case 6:{
				//Imprimir Agenda
				a.imprimirAgenda();
				break;
			}
			case 0: {
				System.out.printf("%n%nFIN.");
				System.exit( opcion );
			}
			}

			salir = false;
		}
	}

	private static int menu(Scanner teclado) throws AgendaExcFueraRango, InputMismatchException {

		System.out.println("Menú de Agenda ");
		System.out.println("--------------------------");
		System.out.println("1.- Cargar Fichero Agenda");
		System.out.println("2.- Guardar Fichero Agenda");		
		System.out.println("3.- Buscar Nombre");
		System.out.println("4.- Insertar Nuevo Nombre");
		System.out.println("5.- Eliminar Nombre");
		System.out.println("6.- Imprimir Agenda");
		System.out.println("");
		System.out.println("0.- Salir");
		System.out.println("");
		System.out.print("Seleccione [0..5]: ");

		int opcion = teclado.nextInt();

		//Si el número introducido está fuera del rango [0..5]
		if ( (opcion < 0) || (opcion > 6) )
			//Se lanza la nueva excepción conteniendo
			throw new AgendaExcFueraRango( opcion );

		return opcion;
	}

}
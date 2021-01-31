package ud09_agenda;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;

public class Agenda {

	//private static final String rutaFichero = "/home/profe/fichero.txt";
	private static final String rutaFichero = "C:/fichero.txt";

	//Atributos
	private Vector<AgendaContacto> listaContactos;

	//Constructor
	public Agenda(){

		listaContactos = new Vector<AgendaContacto>( 10 );
	}

	//Métodos
	public void cargarFichero(){

		File f = new File( rutaFichero );

		if (f.exists()) {

			System.out.println("El fichero existe!");
			System.out.println("getName(): " + f.getName());
			System.out.println("getParent(): " + f.getParent());
			System.out.println("length(): " + f.length());

			//
			cargarContactosAgenda();

		} else {
			System.err.println("El fichero NO existe!");
		}
	}

	public void cargarContactosAgenda(){

		try {
			Scanner sc = new Scanner(new File(rutaFichero));

			while (sc.hasNextLine()) {

				String nombre    = sc.nextLine();
				String apellidos = sc.nextLine();
				String telefono  = sc.nextLine();							
				int edad         = sc.nextInt();
				sc.nextLine();
				sc.nextLine();

				//
				AgendaContacto c = new AgendaContacto(nombre, apellidos, telefono, edad);

				listaContactos.addElement( c );				
			}		

			sc.close();
		} 
		catch (FileNotFoundException ex) {
			System.err.println("El fichero no existe." + ex);
		}

	}

	public void guardarFichero(){

		try {

			PrintWriter pw = new PrintWriter(new File(rutaFichero));

			//
			for (int i = 0; i < listaContactos.size(); i++) {

				AgendaContacto c = listaContactos.elementAt(i);

				pw.println( c.getNombre() );
				pw.println( c.getApellidos() );
				pw.println( c.getTelefono() );
				pw.println( c.getEdad() );
				pw.println( "" );
			}

			pw.close();

		} catch (FileNotFoundException e) {
			System.err.println("Problemas al abrir el fichero");
		}

	}

	public void imprimirAgenda(){

		//		
		if (listaContactos.isEmpty()){

			//Imprimir Agenda vacía
			System.out.printf("%nAgenda vacía%n%n");
		}
		else{
			//
			for (int i = 0; i < listaContactos.size(); i++) {

				AgendaContacto c = listaContactos.elementAt(i);

				System.out.printf("%s%n%s%n%s%n%d%n%n", 
						c.getNombre(),
						c.getApellidos(),
						c.getTelefono(),
						c.getEdad());			
			}
		}		
	}

	public void buscarNombre(){

	}

	public void insertarContacto( AgendaContacto c ){

		listaContactos.addElement( c );
	}

	public void eliminarNombre(){

	}

}
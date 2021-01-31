package ud4_estructurasDeControl;
import java.util.Scanner;

public class ClaseMenuSwitch {

	public static void main(String[] args) {

		//Variable donde se guarda la opción del usuario
		int opcion;

		//Bucle infinito
		while (true)		
		{	
			//Mostrar por pantalla el menú
			System.out.printf("\n1.- Opción 1");
			System.out.printf("\n2.- Opción 2");
			System.out.printf("\n3.- Opción 3");
			System.out.printf("\n4.- Opción 4");
			System.out.printf("\n\n9.- Salir");
			System.out.printf("\n\nOpcion: ");

			Scanner sc = new Scanner(System.in);
			
			//Leer la opción escogida por el usuario
			opcion = sc.nextInt();
			
			switch(opcion){
			case 1:
			{
				System.out.println("\nHas escogido la opción 1");
				break;
			}
			case 2:
			{
				System.out.println("\nHas escogido la opción 2");
				break;
			}
			case 3:
			{
				System.out.println("\nHas escogido la opción 3");				
				break;
			}
			case 4:
			{
				System.out.println("\nHas escogido la opción 4");				
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
	
}
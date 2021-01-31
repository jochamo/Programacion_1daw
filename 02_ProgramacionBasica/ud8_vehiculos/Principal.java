package ud8_vehiculos;

import java.util.Scanner;

public class Principal {

	
	public static void main(String[] args) {
	
		
		
		Coche c1     = new Coche();
		Bicicleta b1 = new Bicicleta();
		
		System.out.println( Vehiculo.vehiculosCreados );
		
		
		
		
		
		
		
	}
	
	
	
	/*
	public static void main(String[] args) {

		//Variable donde se guarda la opción del usuario
		int opcion;

		//Crear objetos
		Bicicleta b = new Bicicleta();
		Coche c = new Coche();		
		
		//Bucle infinito
		while (true)		
		{	
			//Mostrar por pantalla el menú
			System.out.println("");
			System.out.println("VEHÍCULOS");
			System.out.println("=========");			
			System.out.println("1. Anda con la bicicleta");
			System.out.println("2. Haz el caballito con la bicicleta");
			System.out.println("3. Anda con el coche");
			System.out.println("4. Quema rueda con el coche");
			System.out.println("5. Ver kilometraje de la bicicleta");
			System.out.println("6. Ver kilometraje del coche");
			System.out.println("7. Ver kilometraje total");
			System.out.println("8. Ver vehículos totales");
			System.out.println("");
			System.out.println("9. Salir");
			System.out.println("");
			System.out.println("Elige una opción (1-9):");

			Scanner sc = new Scanner(System.in);

			//Leer la opción escogida por el usuario
			opcion = sc.nextInt();

			switch(opcion){			
			case 1:
			{
				System.out.println("Andando con la bicicleta...");
				b.andar();
				break;
			}
			case 2:
			{
				System.out.println("Caballito con la bicicleta...");
				b.caballito();
				break;
			}
			case 3:
			{
				System.out.println("Andando con el coche...");
				c.andar();			
				break;
			}
			case 4:
			{
				System.out.println("Quemando con el coche...");
				c.quemarRueda();				
				break;
			}
			case 5:
			{
				System.out.println("Km de la bici: " + b.getKilometrosRecorridos());
				break;
			}
			case 6:
			{
				System.out.println("Km del coche: " + c.getKilometrosRecorridos());				
				break;
			}
			case 7:
			{
				System.out.println("Km TOTALES: " + Vehiculo.kilometrosTotales);				
				break;
			}
			case 8:
			{
				System.out.println("Número de vehículos: " + Vehiculo.vehiculosCreados);				
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

*/
}
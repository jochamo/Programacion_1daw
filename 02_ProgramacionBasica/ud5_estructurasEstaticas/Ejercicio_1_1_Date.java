package ud5_estructurasEstaticas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ejercicio_1_1_Date {

	public static void main(String[] args) {

		//Variable donde se guarda la opción del usuario
		int opcion = 0;

		//Bucle infinito
		while (true)
		{
			//Mostrar por pantalla el menú
			System.out.printf("\n1.- Obtener fecha actual");
			System.out.printf("\n2.- Obtener hora actual");
			System.out.printf("\n3.- Sumar días a la fecha actual");
			System.out.printf("\n4.- Diferencia entre dos fechas");
			System.out.printf("\n5.- Anterior o Posterior");
			System.out.printf("\n\n9.- Salir");
			System.out.printf("\n\nOpcion: ");

			Scanner sc = new Scanner(System.in);

			//Leer la opción escogida por el usuario
			opcion = sc.nextInt();

			switch(opcion){
			case 1: fechaActual(); 			 break;
			case 2: horaActual(); 			 break;
			case 3: sumarDias(); 			 break;
			case 4: diferenciaEntreFechas(); break;
			case 5: anteriorPosterior(); 	 break;
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

	public static void fechaActual(){

		Date ahora = new Date();		

		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("EEE',' dd 'de' MMMM 'de' yyyy");

		System.out.println("Fecha actual: " + formatoDelTexto.format(ahora));
	}

	public static void horaActual(){

		Date ahora = new Date();		

		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("HH:mm:ss");

		System.out.println("Hora actual: " + formatoDelTexto.format(ahora));
	}

	public static void sumarDias(){

		int dias = 0;		

		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuántos dias quieres sumar a la fecha de hoy?");    	    
		dias = sc.nextInt();

		//Crear fecha actual
		Date fecha = new Date();
		
		//Crear variable Calendario Gregoriano
		Calendar cal = new GregorianCalendar();
		
		//Marcar en la variable Calendario la fecha actual
		cal.setTimeInMillis( fecha.getTime() );
		//La siguiente instrucción comentada realiza la misma operación que la anterior
		//cal.setTime( fecha );

		//Sumar los dias a la fecha actual marcada en el calendario
		cal.add(Calendar.DATE, dias);
		
		//Pasar la fecha del calendario a una variable tipo fecha (Date)
		Date fechaSuma = new Date( cal.getTimeInMillis() );    

		//Imprimir resultado
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("EEEE',' dd 'de' MMMM 'de' yyyy");
		System.out.println("Hoy + " + dias + " dias: " + formatoDelTexto.format( fechaSuma ));
	}

	public static Date pedirFecha(){
		
		int dia = 0;
		int mes = 0;
		int ano = 0;

		Scanner sc = new Scanner(System.in);

		//Pedir fecha al usuario
		
		System.out.println("Introducir dia: ");	    
		dia = sc.nextInt();
		
		System.out.println("Introducir mes: ");
		mes = sc.nextInt();
		
		System.out.println("Introducir año: ");	    
		ano = sc.nextInt();

		//Crear la cadena de texto con la fecha del usuario
		String fechaString = dia + "-" + mes + "-" + ano;
		 
		/*
		System.out.println("Introducir fecha: (dia-mes-año)");		
		String fechaString = sc.nextLine();
		*/
		
		//Indicar el formato de la fecha
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
			
		Date fechaUsuario = null;
		try {
			//Pasar de texto a fecha
			fechaUsuario = formatoDelTexto.parse( fechaString );

		} catch (ParseException e) {
			//e.printStackTrace();
			System.out.println("Fecha INCORRECTA");
		}
		
		return fechaUsuario;
	}
	
	public static void diferenciaEntreFechas(){

		//Pedir 2 fechas al usuario
		System.out.println("\nIntroducir valores Fecha 1: ");
		Date fecha1 = pedirFecha();
		
		System.out.println("\nIntroducir valores Fecha 2: ");
		Date fecha2 = pedirFecha();

		//Calcular la diferencia
		long diferencia = fecha1.getTime() - fecha2.getTime();
		
		//Pasar de milisegundos a dias
		diferencia = diferencia/(1000 * 60 * 60 * 24);
		
		//Imprimir resultado
		//System.out.println("La diferencia en dias entre las fechas introducidas es: " + diferencia);
		
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MMMM/yyyy");
				
		System.out.println("La diferencia en dias entre la fecha: " + formatoDelTexto.format( fecha1 ));
		System.out.println("y la fecha: " + formatoDelTexto.format( fecha2 ));
		System.out.println("es: " + diferencia);
	}

	public static void anteriorPosterior(){
		
		//Pedir fecha al usuario
		Date fecha = pedirFecha();
		
		//Obtener fecha actual
		Date hoy = new Date();
		
		//Comprobar si la fecha es ANTERIOR o POSTERIOR y mostrar resultado
		if (fecha.after(hoy)){
			System.out.println("\nLa fecha introducida es POSTERIOR a la fecha actual");	
		}
		else{
			System.out.println("\nLa fecha introducida es ANTERIOR a la fecha actual");
		}
	}
}
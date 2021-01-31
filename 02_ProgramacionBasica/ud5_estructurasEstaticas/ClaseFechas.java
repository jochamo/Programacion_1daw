package ud5_estructurasEstaticas;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class ClaseFechas {

	public static void main(String[] args) {

		//1.- Metodo usado para obtener la fecha y hora actual del sistema
		Date ahora = new Date();

		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss");
		System.out.println("Fecha y hora actual: " + formatoDelTexto.format(ahora));
		
		formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Fecha actual: " + formatoDelTexto.format(ahora));

		formatoDelTexto = new SimpleDateFormat("hh:mm:ss");
		System.out.println("Hora  actual: " + formatoDelTexto.format(ahora));
		
		formatoDelTexto = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("ES"));
		System.out.println("Fecha con el nombre del mes: " + formatoDelTexto.format(ahora));
		
		formatoDelTexto = new SimpleDateFormat("EEEE',' dd 'de' MMMM 'de' yyyy", new Locale("ES"));
		System.out.println("Fecha completa: " + formatoDelTexto.format(ahora));
		
		//2.- Sumarle 20 dias a la fecha de hoy		
		int dias = 20;
		
		//Obtener fecha ACTUAL
		Date fecha = new Date();

		//Crear un calendario VACÍO
		Calendar cal = new GregorianCalendar();
		
		//Asignar al calendario la fecha ACTUAL
		cal.setTimeInMillis( fecha.getTime() );
			
		//Sumar dias al calendario
		cal.add(Calendar.DATE, dias);
		
		//Extraer la fecha del calendario
		Date fechaSuma = new Date( cal.getTimeInMillis() );

		//Establecer formato
		formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
		
		//Imprimir fecha suma
		System.out.println("Hoy + 20 dias: " + formatoDelTexto.format( fechaSuma ) + " (fechaSuma)");
		
		//3.- Restarle 15 dias a una fecha determinada
		dias = 15;		
		cal.setTimeInMillis( fecha.getTime() );
		cal.add(Calendar.DATE, -dias);

		Date fechaResta = new Date( cal.getTimeInMillis() );    

		formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Hoy - 15 dias: " + formatoDelTexto.format( fechaResta ) + " (fechaResta)");
				 
		//4.- Diferencias entre dos fechas
		long diferencia = 0;
		
		long horas      = 0;
		long minutos    = 0;
		long segundos   = 0;

		//Calcular la diferencia entre fechas
		diferencia = fechaSuma.getTime() - fechaResta.getTime();
		
		System.out.println("la diferencia en milisengundos es " + diferencia);
		
		//Calcular la diferencia en DIAS y mostrarla por pantalla
		System.out.println("La diferencia en dias entre fechaSuma y fechaResta es: " + diferencia/(1000 * 60 * 60 * 24));
		
		//Calcular la diferencia en HORAS, MINUTOS Y SEGUNDOS y mostrarla por pantalla		
		segundos = diferencia / 1000; 		  //Pasar de milisegundos a segundos
		horas    = segundos / 3600; 		  //Pasar de segundos a horas exactas
		segundos = segundos - (horas * 3600); //Obtener segundos del resto
		//segundos = segundos % 3600;         //Obtener segundos del resto
		minutos  = segundos / 60; 			  //Pasar de segundos a minutos
		segundos = segundos - (minutos * 60); //Obtener segundos del resto
		
		System.out.println("La diferencia en Horas Minutos y Segundos entre fechaSuma y fechaResta es: " + horas + "h " + minutos + "min " + segundos + "seg");
		 
		//5.- Preguntar si una fecha es posterior o anterior a otra
		System.out.println("¿Es fechaSuma posterior a fechaResta?: " + fechaSuma.after(fechaResta));
		System.out.println("¿Es fechaSuma anterior  a fechaResta?: " + fechaSuma.before(fechaResta));
				
		//6.- Algoritmo 19
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
		String fechaString = dia + "/" + mes + "/" + ano;
		
		//Indicar el formato de la fecha
		formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
		
		Date fechaUsuario = null;		
		try {
			//Pasar de texto a fecha
			fechaUsuario = formatoDelTexto.parse( fechaString );

			System.out.println("Fecha usuario: " + formatoDelTexto.format( fechaUsuario ));

		}catch (ParseException e) {			
			//e.printStackTrace();
			System.out.println("Fecha INCORRECTA");
		}

		//7.- @Deprecated
		Date fechaMenor = new Date(2016, 03, 15, 8, 15, 23);
		Date fechaMayor = new Date(2016, 03, 15, 11, 20, 40);

		Calendar fechaCreada1 = new GregorianCalendar();
		//Los meses van desde 0 (enero) hasta 11 (diciembre)
		fechaCreada1.set(2016, 11, 25);
		Date fechaCreada2 = new Date( fechaCreada1.getTimeInMillis() );
		formatoDelTexto = new SimpleDateFormat("EEEE',' dd 'de' MMMM 'de' yyyy", new Locale("ES"));
		System.out.println("Fecha creada: " + formatoDelTexto.format( fechaCreada2 ) );		

		//Siempre hay una opción mejor...
		dia = fechaMayor.getDay();
		mes = fechaMayor.getMonth();
		ano = fechaMayor.getYear();

		dia = Calendar.DAY_OF_MONTH;
		mes = Calendar.MONTH;
		ano = Calendar.YEAR;
		
		
	}
}
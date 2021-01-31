package bloque_1;

import java.util.Scanner;

public class Ejercicio09_FechaValida {

public static void main(String[] args) {
		
		/*19) Leer tres números que denoten una fecha (día, mes, año). 
		 * Comprobar que es una fecha válida.
		 * Si no es válida escribir un mensaje de error. 
		 * Si es válida escribir la fecha cambiando el número del mes por su nombre. 
		 * 
		 * Ej. si se introduce 1 2 2006, se deberá imprimir “1 de febrero de 2006”. 
		 * El año debe ser mayor que 0. (Recuerda la estructura segun sea).
		 */		
		
		Scanner sc = new Scanner(System.in);
		
		int dia;
		int mes;
		int anyo;
		String textoMes = "";
		
		//System.out.println("Dime el dia:");		
		dia = sc.nextInt();
		
		System.out.println("Dime el mes:");		
		mes = sc.nextInt();		
		
		System.out.println("Dime el anyo:");		
		anyo = sc.nextInt();
		
				
		boolean incorrecta = false;
		
		//1.- Comprobar que el año no sea negativo
		if (anyo < 0) {
			
			incorrecta = true;			
		}
		else {
			//2.- Comprobar que el mes esté entre 1 y 12
			if ((mes < 1) || (mes > 12)) {
				
				incorrecta = true;
			}
			else {
				
				//3.- Comprobar el dia correcto de cada mes
				switch (mes) {
				//3.1.- Comprobar meses de 31 dias
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:{
								
					if ((dia < 1) || (dia > 31)) {
				
						incorrecta = true;
					}
					break;
				}
				//3.2.- Comprobar meses de 30 dias
				case 4: case 6: case 9: case 11:{
					if ((dia < 1) || (dia > 30)) {
						
						incorrecta = true;
					}
					break;
				}
				//3.3.- Comprobar febrero
				case 2:{
					if ((dia < 1) || (dia > 28)) {
						
						incorrecta = true;
					}
					break;
				}				
				}
			}
		}		
		
		//4.- Mostrar resultado
		if (incorrecta) {
			
			//4.1.- Mostrar fecha incorrecta
			System.out.println("Fecha incorrecta");
		}
		else {
		
			//4.2.- Mostrar fecha correcta...
			//      ...cambiando el dia del mes por el nombre del mes
			switch (mes) {
			case 1:  textoMes = "enero";	  break;
			case 2:  textoMes = "febrero";	  break;
			case 3:  textoMes = "marzo";	  break;
			case 4:  textoMes = "abril"; 	  break;
			case 5:  textoMes = "mayo";		  break;
			case 6:  textoMes = "junio";	  break;
			case 7:  textoMes = "julio";	  break;
			case 8:  textoMes = "agosto"; 	  break;
			case 9:  textoMes = "septiembre"; break;
			case 10: textoMes = "octubre"; 	  break;
			case 11: textoMes = "noviembre";  break;
			case 12: textoMes = "diciembre";  break;
			}
			
			//4.2.- Mostrar fecha correcta
			System.out.println("Fecha: " + dia + " de " + textoMes + " de " + anyo );
		}
	}

}
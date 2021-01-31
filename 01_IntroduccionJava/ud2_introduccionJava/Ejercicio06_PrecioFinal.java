package ud2_introduccionJava;

import java.util.Scanner;

public class Ejercicio06_PrecioFinal {

	public static void main(String[] args) {

		/*
		Escribe un programa que calcule el precio final de un producto según su
		base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
		reducido o superreducido) y el código promocional.
		
		Los tipos de IVA general,reducido y superreducido son del 21%, 10% y 4% respectivamente.
		 
		Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
		respectivamente que no se aplica promoción, el precio se reduce a la mitad,
		se descuentan 5 euros o se descuenta el 5%.
		
		El ejercicio se da por bueno si se muestran los valores correctos, 
		aunque los números no estén tabulados.
		
		Ejemplo:
		
		Introduzca la base imponible: 25
		Introduzca el tipo de IVA (general, reducido o superreducido): reducido
		Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
		
		Base imponible			25.00
		IVA (10%)				2.50
		Precio con IVA			27.50
		Cód. promo. (mitad): 	-13.75
		TOTAL					13.75
	*/
		
		final String general       = "general";
		final String reducido	   = "reducido";
		final String superreducido = "superreducido"; 
		
		Scanner sc = new Scanner(System.in);
		
		double base, importeIVA, importeConIVA, importePromo, total;
		int iva = 0;
		String promo, tipoIva;
		
		//1.- Base imponible
		System.out.println("Introduzca la base imponible:");		
		base = sc.nextDouble();
		sc.nextLine();
		
		//2.- IVA
		do{
			System.out.println("Introduzca el tipo de IVA:");
			System.out.println("- General");
			System.out.println("- Reducido");
			System.out.println("- Superreducido");

			tipoIva = sc.nextLine();
			tipoIva = tipoIva.toLowerCase();
			
		}while(!tipoIva.equals(general) && !tipoIva.equals(reducido) && !tipoIva.equals(superreducido));
		
		if (tipoIva.equals(general))       iva = 21;	
		if (tipoIva.equals(reducido))      iva = 10;
		if (tipoIva.equals(superreducido)) iva = 4;		
		
		importeIVA    = (base * iva) / 100;
		importeConIVA = base + importeIVA;		
		
		//3.- Código promocional
		System.out.println("Introduzca el código promocional:");
		
		promo = sc.nextLine();
		
		switch (promo) {
		case "mitad":{			
			importePromo = importeConIVA / 2;			
			break;
		}
		case "meno5":{			
			importePromo = importeConIVA - 5;			
			break;
		}
		case "5porc":{			
			importePromo = importeConIVA * 0.95;			
			break;
		}
		default:{
			//nopro o cualquier otra cosa			
			importePromo = 0;			
			break;
		}			
		}

		//4.- Calcular el TOTAL
		total = importeConIVA - importePromo;
		
		//5.- Mostrar resultados
		String stringIVA   = "IVA(" + iva + "%)";
		String stringPromo = "Cód. promo. (" + promo + "):"; 
		
		System.out.println("");
		System.out.printf("%-30s%.2f%n", "Base imponible", base);		
		System.out.printf("%-30s%.2f%n", stringIVA, importeIVA);
		System.out.printf("%-30s%.2f%n", "Precio con IVA", importeConIVA);
		System.out.printf("%-30s%.2f%n", stringPromo, importePromo);
		System.out.printf("%-30s%.2f%n", "TOTAL" , total);		
	}

}
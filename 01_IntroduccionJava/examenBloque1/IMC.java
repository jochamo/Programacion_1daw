package examenBloque1;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int alturaCM, edad;
		double peso, alturaM, pesoMin, pesoMax, imc;
		String nombre, rango, continuar;		

		do {
			//Pedir datos
			System.out.println("Altura:");
			alturaCM = sc.nextInt();
			System.out.println("Peso:");
			peso     = sc.nextDouble(); sc.nextLine();
			System.out.println("Nombre:");
			nombre   = sc.nextLine();
			System.out.println("Edad:");
			edad     = sc.nextInt(); sc.nextLine();

			//Calcular IMC
			alturaM = (double) alturaCM / 100.0;
			imc     = (peso) / (alturaM * alturaM);

			//Calcular rango
			if(imc < 16.00){
				rango = "Infrapeso: Delgadez Severa";
			}else if(imc <= 16.99){
				rango = "Infrapeso: Delgadez moderada";
			}else if(imc <= 18.49){
				rango = "Infrapeso: Delgadez aceptable";
			}else if(imc <= 24.99){
				rango = "Peso Normal";
			}else if(imc <= 29.99){
				rango = "Sobrepeso";
			}else if(imc <= 34.99){
				rango = "Obeso: Tipo I";
			}else if(imc <= 39.99){
				rango = "Obeso: Tipo II";
			}else{
				rango = "Obeso: Tipo III";
			}

			//Calcular pesoMin y pesoMax
			pesoMin =  18.5 * (alturaM * alturaM);
			pesoMax = 24.99 * (alturaM * alturaM);
		
			//Imprimir resultados
			System.out.println("--------------------------------------------------");
			System.out.printf("%s (%d años) %n", nombre, edad );
			System.out.println("--------------------------------------------------");
			System.out.printf("Índice de Masa Corporal (IMC):   %.2f%n", imc );
			System.out.printf("Clasificación:                   %s%n%n", rango );
			System.out.println("Su rango de peso ideal según la fórmula del IMC:");
			System.out.println("");
			System.out.println("      Peso mínimo       Peso maximo");			
			System.out.printf("%15.1fKg %15.1fKg%n%n", pesoMin, pesoMax );

			//Preguntar si se desea calcular otro IMCs
			System.out.println("Desea continuar (s/n):");			
			continuar = sc.nextLine();

		}while(continuar.equals("s"));
		
		//Mensaje de despedida
		System.out.println("¡ HASTA PRONTO !");
	}

}
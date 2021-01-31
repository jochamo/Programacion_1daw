package ud09_ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LecturaValidada {
	
	//a) Leer un número entero.
	public int numeroEntero() {
		
		Scanner sc = new Scanner(System.in);
		
		int res; 
		
		try {
			res = sc.nextInt();
		}
		catch(InputMismatchException e) {
			res = -1;
		}
		
		return res;
	}
	
	//b) Leer un número entero en un rango determinado.
	public int numeroEnteroRango(int a, int b) {
		
		Scanner sc = new Scanner(System.in);		
		int res; 
		
		try {
			res = sc.nextInt();
			
			if (res < a || res > b) {
				throw new FueraDeRangoException();
			}
		}
		catch(InputMismatchException e) {
			res = -1;
		} 
		catch (FueraDeRangoException e) {
			res = e.codigoError();
		}
		finally {
			sc.close();
		}
		
		return res;
	}

	//c) Leer un número real.
	public double numeroReal() {
		
		Scanner sc = new Scanner(System.in);
		
		double res; 
		
		try {
			res = sc.nextDouble();
		}
		catch(InputMismatchException e) {
			res = -1;
		}		
		
		return res;
	}
	
	//d) Leer un número real positivo.
	
	//e) Leer un número real en un rango determinado.


}

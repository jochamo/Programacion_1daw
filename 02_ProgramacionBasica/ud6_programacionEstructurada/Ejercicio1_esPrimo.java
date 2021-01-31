package ud6_programacionEstructurada;

public class Ejercicio1_esPrimo {

	public static void main(String[] args) {

		int cont = 1;

		for (int i=2; i<=1000; i++){

			if (  esPrimo(i)  ){

				if (cont<5){					
					System.out.printf("%5d", i);
					cont++;
				}
				else{
					System.out.printf("%5d%n", i);
					cont = 1;
				}				
			}			
		}		
	}

	public static boolean esPrimo(int n){

		boolean primo = true;
		int i = 2;

		while((i<n) && (primo)){

			if (n%i==0){
				primo = false;
			}
			i++;
		}

		return primo;
	}

}
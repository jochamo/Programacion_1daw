package ud4_estructurasDeControl_Diagramas;
import java.util.Scanner;

public class NumeroPrimo {


	public static void main(String[] args) {

		int i = 0;
		int n = 0;
		String op = "s";
		boolean primo = true;

		//La variable "sc" se usará para leer los datos
		Scanner sc = new Scanner(System.in);

		//
		while (op.equals("s")){

			System.out.println("Introduce un número y te digo si es primo o no: ");    	    
			n = sc.nextInt();

			if (n > 1){

				primo = true;
				i = 2;

				while((i<n) && (primo)){

					if (n%i==0){
						primo = false;
					}
					i++;
				}

				if(primo){
					System.out.println("SI PRIMO");
				}
				else{
					System.out.println("NO PRIMO");
				}

				System.out.println("¿Otro número? (s/n)");
				sc.nextLine();
				op = sc.nextLine();				

			}
			else{
				System.out.println("El número debe ser mayor que 1");			
			}
		}

		System.out.println("");
		System.out.println("FIN DEL PROGRAMA !!!");
	}

}
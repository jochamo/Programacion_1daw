package bloque_1;

public class Figuras {

	public static void main(String[] args) {
		
		int lineas = 5;	 

		// Cuadrado

		System.out.println("Cuadrado");

		System.out.println("--------\n"); 

		for(int i=0;i<lineas;i++){
			
			for(int j=0;j<lineas;j++){

				System.out.print("*");

			}

			System.out.print("\n");
		}

		// Rombo
		System.out.println("\n\nRombo");
		System.out.println("------\n");

		for(int i=1;i<=(lineas/2)+1;i++){

			for(int j=0;j<i;j++){

				System.out.print("*");

			}

			System.out.print("\n");
		}

		for(int i=(lineas/2);i>0;i--){

			for(int j=0;j<i;j++){

				System.out.print("*");
			}

			System.out.print("\n");
		}

		// Abeto
		System.out.println("\n\nAbeto");
		System.out.println("------\n");

		int contador = 1;

		for(int i=1;i<=lineas;i++){

			contador++;

			for(int j=1;j<=contador;j++){

				for(int k=0;k<j;k++){

					System.out.print("*");
				}

				System.out.print("\n");
			}
		}

		System.out.println("**");
		System.out.println("**");

		//***********************************
		
		int x = 2;
        int y = x*2;
        for(int contador3= 0; contador3<=x; contador3++)
        {
            for(int espacios = x - 1; espacios >=contador3; espacios-- )
            {
                System.out.print(" ");
            }
            for(int asteriscos= 0; asteriscos<= (1*contador3 + contador3); asteriscos++)
            {
                System.out.print("*");
            }
            System.out.println();
 
        }
        for(int contador2= 0; contador2<=x-1; contador2++)
        {
            for(int espacios = 0; espacios <=contador2; espacios++ )
            {
                System.out.print(" ");
            }
            for(int asteriscos=contador2 + 2 + contador2; asteriscos<=y; asteriscos++)
            {
                System.out.print("*");
            }
            System.out.println();
 
        }
        
        
        //*******************
        
        for(int contador5= 0; contador5<=x; contador5++)
        {
            for(int espacios = x - 1; espacios >=contador5; espacios-- )
            {
                System.out.print(" ");
            }
            for(int asteriscos= 0; asteriscos<= (1*contador5 + contador5); asteriscos++)
            {
                System.out.print("*");
            }
            System.out.println();
 
        }
 
    
	
	
	
	}

}

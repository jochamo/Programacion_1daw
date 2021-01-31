package bloque_2;

public class Ejercicio2_parejaNoSi {

	public static void main(String[] args) {
		
		char[] a= {'a','b','n','o','s','o','n','o'};

		//Recorrer vector
		for(int i=0;i<a.length;i++){
			
			//
			if(a[i]=='n' && a[i+1]=='o'){
				
				a[i]   ='s';
				a[i+1] ='i';	
			}
		}
		
		//Imprimir vector resultado
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
	}
}
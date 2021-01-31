package ud5_estructurasEstaticas;

public class Ejercicio_2_7_Cifras {

	public static void main(String[] args) {
		
		int[] miVector = Ejercicio_2_1_Vectores.rellenarVector(5);
		Ejercicio_2_1_Vectores.imprimirVector(miVector);
		
		//Llamada a la función del ejercicio
		cifras(miVector);
	}

	//Escriba en la salida estándar las primeras componentes del array
	//en las que NO hay elementos consecutivos repetidos.
	public static void cifras(int[] a){
		
		System.out.println("Las primeras componentes del array en las que no hay elementos consecutivos repetidos son:");
		System.out.println("");
		
		//  Si a es {8,8,4,3}, se escribe 8.
		//	Si a es {4,0,5,9,9}, se escribe 4059.
		//	Si a es {0,9,4,5,9}, se escribe 09459.
		//	Si a es {1,7,1,0,0,8,7}, se escribe 1710.
	
		//El primer elemento SIEMPRE se muestra
		System.out.printf("%4d", a[0]);
		
		//Comprobar el resto...
		for (int i=1; i<a.length; i++){
		
			if (a[i-1] != a[i]){
				System.out.printf("%4d", a[i]);				
			}			
			else{
				//Si son iguales, finalizar...
				break;
			}
		}		
	}
	
}
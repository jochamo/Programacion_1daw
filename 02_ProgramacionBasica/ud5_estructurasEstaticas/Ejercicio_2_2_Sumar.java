package ud5_estructurasEstaticas;

public class Ejercicio_2_2_Sumar {

	public static void main(String[] args) {

		int[] numeros = new int[100];

		for(int i=0; i<numeros.length; i++){
			numeros[i] = i+1;
		}

		//Calcular la suma de todos los elementos del vector
		double suma = Ejercicio_2_1_Vectores.sumarElementos( numeros );
		System.out.println("La suma de los elementos del vector es: " + suma);

		System.out.println("La suma de los elementos del vector es: " + (suma / 100));
	}

}
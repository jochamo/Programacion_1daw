package bloque_1;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		String nombre = "";
		int notaPractica  = 0;
		int notaProblemas = 0;
		int notaTeoria    = 0;
		double notaFinal  = 0;
		boolean siguienteAlumno = true;

		String errorNota = "ERROR: La nota debe estar entre 0 y 10";
		String introduzcaNota = "Introduzca la nota de ";

		Scanner Teclado = new Scanner(System.in);
		
		//
		while(siguienteAlumno){			

			System.out.println("Introduzca el nombre del alumno: ");
			nombre = Teclado.nextLine();

			//Si el usuario NO escribe ningún nombre...
			if(nombre.equals("")){			
				//...mostrar ERROR...
				System.out.println("FIN del programa");
				//...y salir del programa
				siguienteAlumno = false;
			}
			else{
				System.out.println(introduzcaNota + "Prácticas: ");
				notaPractica= Teclado.nextInt();

				//Comprobar que la nota esta entre 0 y 10
				if(notaPractica < 0 || notaPractica > 10){
					System.out.println( errorNota );					
				}
				else{
					System.out.println(introduzcaNota + "Problemas: ");
					notaProblemas= Teclado.nextInt();

					//Comprobar que la nota esta entre 0 y 10
					if(notaProblemas < 0 || notaProblemas > 10) {
						System.out.println( errorNota );						
					}
					else {
						System.out.println(introduzcaNota + "Teoría: ");
						notaTeoria = Teclado.nextInt();

						//Comprobar que la nota esta entre 0 y 10
						if(notaTeoria < 0 || notaTeoria > 10){
							System.out.println( errorNota );
						}
						else {
							notaFinal = (notaPractica*0.1) + (notaProblemas*0.5) + (notaTeoria*0.4);
							System.out.println("El alumno " + nombre + " ha obtenido una nota final de " + notaFinal);
						}

					}
				}
			}

			Teclado.nextLine();
			
		}//while(siguienteAlumno)

	}//main
	
}//class
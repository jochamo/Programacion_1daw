package examenes;
import java.util.Scanner;

public class ExamenNov2018_b {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int equipos, globos;
		int globoEquipo, ganador, globosGanador;
		boolean repetido;

		while(true) {

			equipos = sc.nextInt();
			globos  = sc.nextInt();

			if ((equipos == 0) && (globos == 0)) {
				break;
			}

			int[] clasificacion = new int[equipos+1];
			clasificacion[0] = -1;

			for (int i = 0; i < globos; i++) {

				globoEquipo = sc.nextInt();
				sc.nextLine();

				clasificacion[globoEquipo]++;
			}

			ganador       = -3;
			globosGanador = -3;
			repetido      = false;
			
			for (int i = 1; i < clasificacion.length; i++) {
			
				if (clasificacion[i] == globosGanador) {
					repetido = true;
				}
				
				if (clasificacion[i] > globosGanador) {
					ganador       = i;
					globosGanador = clasificacion[i];
					repetido      = false;
				}				
			}
			
			if (repetido) {
				System.out.println("EMPATE");
			}
			else {
				System.out.println(ganador);
			}
		}		
	}

}
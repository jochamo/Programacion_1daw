package ud5_estructurasEstaticas;
import java.util.Random;

public class ClaseRandom {

	public static void main(String[] args) {

		Random x = new Random();
		
		int a = x.nextInt(10);
		
		System.out.println(a);
		
		
		for(int i=0; i<5; i++){
			System.out.println(x.nextInt(100));
		}	
	}
}
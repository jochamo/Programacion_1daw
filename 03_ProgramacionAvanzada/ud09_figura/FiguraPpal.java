package ud09_figura;

public class FiguraPpal {

	public static void main(String[] args) {
		
		Figura f1 = new Figura("rojo","cuadrado");
		Figura f2 = new Figura("rojo","cuadrado");
		
		//Deprecated !!
		//Double d  = new Double(1.0);
		Double d  = 1.0;
		
		String k  = "Hello";
				
		System.out.println(  "1.- " + f1.equals(f2)  );
		System.out.println(  "2.- " + d.equals(k)    );
		System.out.println(  "3.- " + k.equals(f2)   );
		System.out.println(  "4.- " + f1.equals(d)   );		
	}

}
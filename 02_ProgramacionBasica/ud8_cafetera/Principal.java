package ud8_cafetera;

public class Principal {

	public static void main(String[] args) {

		Cafetera c1 = new Cafetera();
		Cafetera c2 = new Cafetera(2500);
		Cafetera c3 = new Cafetera(3500, 1000);	
		
		System.out.println( c1.getCantidadActual() );
		System.out.println( c2.getCantidadActual() );
		
		c1.servirTaza(150);
		c2.servirTaza(150);
		
		System.out.println( "Capacidad actual c1: " + c1.getCantidadActual() );
		System.out.println( c1.getCapacidadMaxima() );
		
		c2.servirTaza(150);
		System.out.println( c2.getCantidadActual() );
		System.out.println( c2.getCapacidadMaxima() );
		c2.llenarCafetera();
		System.out.println( c2.getCantidadActual() );
		
		c3.vaciarCafetera();
		System.out.println( c3.getCantidadActual() );
		System.out.println( c3.getCapacidadMaxima() );

	}

}
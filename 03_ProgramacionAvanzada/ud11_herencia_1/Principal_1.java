package ud11_herencia_1;

public class Principal_1 {

	public static void main(String[] args) {
		
		//A a = new A();
		A a = new B();
		
		B b = new B();		
		
		C c = new C();
		D d = new D();
		E e = new E();
		F f = new F();
		
		System.out.println( A.getNumObjects() );
		
		System.out.println( a.a2 );
		System.out.println( c.a2 );
		
		
	}
	
}
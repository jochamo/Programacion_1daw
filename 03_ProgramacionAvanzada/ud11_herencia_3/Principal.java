package ud11_herencia_3;

import java.util.ArrayList;

import ud11_herencia_1.A;
import ud11_herencia_1.B;
import ud11_herencia_1.C;
import ud11_herencia_1.D;
import ud11_herencia_1.E;
import ud11_herencia_1.F;
import ud11_herencia_2.G;
import ud11_herencia_2.H;
import ud11_herencia_2.J;
import ud11_herencia_2.K;

public class Principal {

	public static void main(String[] args) {

		//A a = new A();
		A a = new B();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		F f = new F();
		G g = new G();
		H h = new H();
		J j = new J();
		K k = new K();

		System.out.println( A.getNumObjects() );

		
		
		b.insertarEnListaK(k);
		
		ArrayList<K> listaK = b.getListaK();
		for (K ki : listaK) {
			System.out.println( ki );
		}

		
	}

}
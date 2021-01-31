package ud11_herencia_1;

public abstract class A {

	//Atributos de clase
	private static int numObjects;
	protected static final int maxObjects = 25;
	
	//Atributos de instancia
	private int a1;
	protected int a2;
	
	//Constructores
	public A() {
		
		this.a1 = 13;
		this.a2 = 27;
		
		numObjects++;
	}
	
	//Propiedades
	public static int getNumObjects() {
		return numObjects;
	}
	
	//Metodos abstractos
	public abstract void metodoA1();

	
}
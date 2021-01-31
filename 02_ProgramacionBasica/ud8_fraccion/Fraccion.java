package ud8_fraccion;

public class Fraccion implements Relacionable {

	//*******************************************************
	// Atributos
	//*******************************************************
	
	private int numerador;
	private int denominador;
	
	//*******************************************************
	// Constructores
	//*******************************************************
	
	public Fraccion() {
		this(1, 1);
	}

	public Fraccion(int numerador) {
		this(numerador, 1);
	}
	
	public Fraccion(int numerador, int denominador) {
		
		this.numerador   = numerador;
		this.denominador = denominador;
	}
	
	//*******************************************************
	// Getters and Setters (Propiedades)
	//*******************************************************
	
	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	//*******************************************************
	// Metodos sobreescritos de la clase Object
	//*******************************************************
	
	@Override
	public String toString(){
	
		return String.format("%3d / %d", this.numerador, this.denominador);			
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//Dos fracciones son iguales, si al simplificarlas son iguales
		
		Fraccion f = (Fraccion) obj;		
		f = f.simplificar();
		
		Fraccion f2 = this.simplificar();
		
		return ((f.numerador == f2.numerador) && (f.denominador == f2.denominador));
	}
	
	//*******************************************************
	// Metodos publicos 
	//*******************************************************
	
	public Fraccion invertir() {

		Fraccion res = new Fraccion();

		res.numerador   = this.denominador;
		res.denominador = this.numerador;
		
		return res;
	}

	public Fraccion simplificar() {

		Fraccion res = new Fraccion();

		int mcd = mcd( this.numerador, this.denominador );
		
		res.numerador   = this.numerador   / mcd;
		res.denominador = this.denominador / mcd;
		
		return res;
	}

	public Fraccion sumar( int n ) {
		
		return this.sumar( new Fraccion(n) );		
	}
	
	public Fraccion sumar( Fraccion f ){

		Fraccion res = new Fraccion();
		
		int mcm = mcm( f.denominador, this.denominador );
		
		res.numerador   = (f.numerador * mcm/f.denominador) + (this.numerador * mcm/this.denominador);
		res.denominador = mcm;

		return res.simplificar();
	}
	
	public Fraccion restar( int n ) {

		return this.restar( new Fraccion(n) );
	}
	
	public Fraccion restar( Fraccion f ){

		Fraccion res = new Fraccion();
		
		res = f.multiplicar(-1);		
		res = this.sumar(res);		

		return res;
	}
	
	public Fraccion dividir( int n ) {

		return this.dividir( new Fraccion(n) );
	}
	
	public Fraccion dividir( Fraccion f ){

		Fraccion res = new Fraccion();
		
		if (f != null) {
			res.numerador   = this.numerador   * f.denominador;
			res.denominador = this.denominador * f.numerador;	
		}	
		
		return res.simplificar();
	}
	
	public Fraccion multiplicar( int n ) {

		return this.multiplicar( new Fraccion(n) );
	}
	
	public Fraccion multiplicar( Fraccion f ){

		Fraccion res = new Fraccion();
		
		if (f != null) {
			res.numerador   = this.numerador   * f.numerador;
			res.denominador = this.denominador * f.denominador;	
		}	
		
		return res.simplificar();
	}
	
	//*******************************************************
	// Metodos de clase (estaticos)
	//*******************************************************
	
	public static Fraccion multiplicar( Fraccion f1, Fraccion f2 ){
		
		Fraccion res = new Fraccion();
		
		res.numerador   = f1.numerador   * f2.numerador;
		res.denominador = f1.denominador * f2.denominador;
		
		return res.simplificar();
	}	

	//*******************************************************
	// Metodos privados
	//*******************************************************
	
	private int mcd(int num1, int num2) {
		
		int mcd;
		int a = Math.max(num1, num2);
		int b = Math.min(num1, num2);
		
		do {
			mcd = b;
			b   = a % b;
			a   = mcd;
			
		} while (b!=0);
		
		return mcd;
	}

	private int mcm(int num1, int num2) {
		
		int mcm = 0;
		int a = Math.max(num1, num2);
		int b = Math.min(num1, num2);
		
		mcm = (a/mcd(a,b))*b;
		
		return mcm;
	}

	@Override
	public boolean esMayor() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esMenor() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esIgual() {
		// TODO Auto-generated method stub
		return false;
	}	
	
}
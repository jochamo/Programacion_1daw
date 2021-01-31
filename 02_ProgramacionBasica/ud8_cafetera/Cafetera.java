package ud8_cafetera;

public class Cafetera {  

	//Atributos:
	
	//1.- de clase (static)
	private static int numCafeteras;
	
	//2.- de instancia
	private int capacidadMaxima;
	private int cantidadActual;	
	
	//Constructor predeterminado: establece la capacidad máxima en 1000 (ml) y la actual en cero (cafetera vacía).
	public Cafetera(){
		
		this(1000, 0);
		//this.capacidadMaxima = 1000;
		//this.cantidadActual  = 0;
	}
	
	//Constructor con la capacidad máxima de la cafetera; 
	//inicializa la cantidad actual de café igual a la capacidad máxima (cafetera llena).
	public Cafetera(int capacidadMax){
		
		this(capacidadMax, capacidadMax);
		//this.capacidadMaxima = capacidadMax;
		//this.cantidadActual  = capacidadMax;
	}
	
	//Constructor con la capacidad máxima y la cantidad actual. 
	//Si la cantidad actual es mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
	public Cafetera(int capacidadMax, int cantidadActual){
		
		this.capacidadMaxima = capacidadMax;
		this.cantidadActual  = cantidadActual;
		
		if (cantidadActual > capacidadMax){
			this.cantidadActual  = capacidadMax;
		}	
		
		numCafeteras++;		
	}

	//Getters and Setters
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	//public void setCapacidadMaxima(int capacidadMaxima) {
	//	this.capacidadMaxima = capacidadMaxima;
	//}

	public int getCantidadActual() {
		return cantidadActual;
	}

	//public void setCantidadActual(int cantidadActual) {
	//	this.cantidadActual = cantidadActual;
	//}	
	
	//Métodos
	
	//llenarCafetera(): pues eso, hace que la cantidad actual sea igual a la capacidad.
	public void llenarCafetera(){
		
		this.cantidadActual = this.capacidadMaxima;
	}
	
	//servirTaza(int): simula la acción de servir una taza con la capacidad indicada. Si la cantidad actual
	//de café “no alcanza” para llenar la taza, se sirve lo que quede.
	public void servirTaza(int cantidadTaza){
		
		if (cantidadTaza > this.cantidadActual){
			vaciarCafetera();			
		}
		else{
			this.cantidadActual = this.cantidadActual - cantidadTaza;	
		}		
	}
	
	//vaciarCafetera(): pone la cantidad de café actual en cero.
	public void vaciarCafetera(){
		
		this.cantidadActual = 0;		
	}	
	
	//agregarCafe(int): añade a la cafetera la cantidad de café indicada.
	public void agregarCafe(int cantidad){
		
		//Si la cantidad actual mas la cantidad de café es mayor a la capacidad max...
		if (this.cantidadActual + cantidad > this.capacidadMaxima){
			//...lleno la cafetera, para que no rebose...
			llenarCafetera();
		}
		else{
			//sinó, añado la cantidad de café deseada
			this.cantidadActual = this.cantidadActual + cantidad;
		}
	}

	//Métodos estáticos
	
	public static int getNumeroCafeteras() {
		
		return numCafeteras;		
	}	
	
}
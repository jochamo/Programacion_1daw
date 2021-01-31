package ud09_figura;

public class Figura {

	private String color;
	private String tipo;

	public Figura(String color, String tipo){

		this.color = color;
		this.tipo  = tipo;
	}

	public double area(){

		return 0;
	}

	public boolean equals(Object o) {

		boolean igual;

		try{
			Figura f = (Figura) o;

			igual = this.color.equals(f.color) && 
					this.tipo.equals(f.tipo) && 
					this.area()==f.area();
		}
		catch(ClassCastException e){

			igual = false;
		}

		return igual;				
	}
	
}
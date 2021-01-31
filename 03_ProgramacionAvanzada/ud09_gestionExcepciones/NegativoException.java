package ud09_gestionExcepciones;

public class NegativoException extends Exception{

	
    // Constructor
    public NegativoException(){
	    	
	    	
    }
	   
    // Excepcion: Error Provocado
    public String excErrorPersonalizado(){
    	
        return "Ha introducido un numero negativo...";
    }
    
   
    
}
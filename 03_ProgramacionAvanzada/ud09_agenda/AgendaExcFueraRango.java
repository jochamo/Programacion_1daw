package ud09_agenda;

public class AgendaExcFueraRango extends Exception {

	//Atributos
	private int opcion;
	
	// Constructor
    public AgendaExcFueraRango(int opcion){
	    	
    	this.opcion = opcion;    	
    }
	   
    // Método: Devuelve el error provocado
    public String mensajeError(){
    	
        return "La opción elegida ha sido " + this.opcion;
    }
	
}
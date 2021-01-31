package ud09_agenda;

public class AgendaContacto {

	//Atributos
	private String nombre;
	private String apellidos;
	private String telefono;	
	private int edad;
	
	//Constructores
	public AgendaContacto(){
		
	}
			
	public AgendaContacto(String nombre, String apellidos, String telefono, int edad) {
		super();		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.edad = edad;
	}

	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//Métodos
	
	
}
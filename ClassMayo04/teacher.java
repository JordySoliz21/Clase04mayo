package ClassMayo04;

public class teacher extends persona {
	private String cedula;
	
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public teacher(String nombre, String apellido, String nacionalidad, int edad, String cedula) {
		super(nombre, apellido, nacionalidad, edad);
	
	}

	

}

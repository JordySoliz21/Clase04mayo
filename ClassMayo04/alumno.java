package ClassMayo04;

import javax.swing.JOptionPane;

public class alumno  extends persona {
	private String matricula; 
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	
		// TODO Auto-generated constructor stub
	public alumno(String nombre, String apellido, String nacionalidad, int edad, String matricula) {
		super(nombre, apellido, nacionalidad, edad);
		
	}


	
	public void MostrarDatos() {
		JOptionPane.showMessageDialog(null, "Alumno"+getNombre()+""+getApellido()+""+getNacionalidad()+""+getEdad()+" "+getMatricula());
	}
}

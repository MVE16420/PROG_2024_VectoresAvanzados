package asignatura;

public class Alumno {
	
	private String nombre;
	private String apellidos;
	private int telefono;
	private int asignaturas[];
	private int contador;
	
	public Alumno(int cuantas) {
		
		asignaturas = new int[cuantas];
		contador = 0;
	}
	
	public Alumno(String nombre, String apellidos,int telefono) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
	}
	
	public int Add(int numero) {
		if(contador < asignaturas.length) {
			asignaturas[contador] = numero;
			contador++;
		}
			return -1;
	}

	@Override
	public String toString() {
		return "Alumno [" + nombre + " " + apellidos + " " + telefono + " "+asignaturas+ "]";
	}
	
	
}

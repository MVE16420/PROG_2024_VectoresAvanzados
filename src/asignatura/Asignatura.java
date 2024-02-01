package asignatura;

public class Asignatura {
	
	private String nombre;
	private int nota;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return "Asignatura [" + nombre + " " + nota + "]";
	}
	public void indicarTrimestre(int trimestre) {
		switch(trimestre) {
		case 1:
			
		}
	}

}

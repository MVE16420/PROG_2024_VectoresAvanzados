package asignatura;

import java.util.Arrays;


public class Aula {
	
	private Alumno[] alumnos;
	private int cuantos;
	
	
	public void add(Alumno alumno) {
		
		if(cuantos < alumnos.length) {
			alumnos[cuantos] =alumno;
			cuantos++;
		}
	}

	@Override
	public String toString() {
		return Arrays.toString(alumnos);
	}

}

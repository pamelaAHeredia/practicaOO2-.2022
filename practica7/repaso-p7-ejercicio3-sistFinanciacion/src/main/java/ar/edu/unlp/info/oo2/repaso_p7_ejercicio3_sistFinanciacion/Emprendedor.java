package ar.edu.unlp.info.oo2.repaso_p7_ejercicio3_sistFinanciacion;

import java.util.ArrayList;
import java.util.List;

public class Emprendedor {
	private List<Proyecto> proyectos; 
	private String nombre; 
	
	public Emprendedor(String nombre) {
		this.nombre = nombre; 
		this.proyectos = new ArrayList<Proyecto>(); 
	}
	
	public void nuevoProyecto(Proyecto proyecto) {
			proyectos.add(proyecto); 
		
	}
	
	public List<Proyecto> getProyectos(){
		return this.proyectos; 
	}
	
	public void cancelarProyecto(Proyecto proyecto) {
		Proyecto project = proyectos.stream().filter(p -> p.equals(proyecto)).findFirst().orElse(null); 
		if(project != null) {
			project.cancelar();
		}
	}
}

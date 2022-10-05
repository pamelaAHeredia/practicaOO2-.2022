package ar.edu.unlp.info.oo2.repaso_p7_ejercicio3_sistFinanciacion;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Emprendedor> emprendedores; 
	
	public Sistema() {
		this.emprendedores = new ArrayList<Emprendedor>(); 
	}
	
	public void invertirDineroEnProyecto(Proyecto proyecto, double monto) {
		Proyecto project = emprendedores.stream().
				flatMap(e -> e.getProyectos().stream()).map(p -> p.esTitulo(proyecto.getNombre())).findFirst().orElse(null); 
		if (project != null) {		
			project.aportarDinero(monto);
		}
	}
	
	public void agregarEmprendedor(Emprendedor emp) {
			emprendedores.add(emp); 
	}
	
	public List<Emprendedor> getEmprendedores(){
		return this.emprendedores; 
	}
}

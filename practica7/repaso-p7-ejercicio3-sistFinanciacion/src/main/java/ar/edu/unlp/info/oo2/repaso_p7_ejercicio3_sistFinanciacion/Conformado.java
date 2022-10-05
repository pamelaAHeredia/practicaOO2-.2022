package ar.edu.unlp.info.oo2.repaso_p7_ejercicio3_sistFinanciacion;

public class Conformado extends Estado{
	public Conformado() {
		super.name = "conformado"; 
	}
	
	public void cancelarProyecto(Proyecto proyecto) {
		throw new RuntimeException("No puede cancelar un proyecto conformado."); 
	}

	@Override
	public void aportarDinero(Proyecto proyecto, double monto) {
		proyecto.agregarDinero(monto);
		
	}
}

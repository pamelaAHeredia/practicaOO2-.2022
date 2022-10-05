package ar.edu.unlp.info.oo2.repaso_p7_ejercicio3_sistFinanciacion;

public class Publicado extends Estado{
	public Publicado() {
		super.name = "publicado"; 
	}
	
	public void conformarProyecto(Proyecto proyecto) {
		proyecto.setEstado(new Conformado());
	}
	
	public void cancelarProyecto(Proyecto proyecto) {
		proyecto.setEstado(new Cancelado());
	}

	@Override
	public void aportarDinero(Proyecto proyecto, double monto) {
		proyecto.agregarDinero(monto);
		if (proyecto.alcanzoMontoNecesario()) {
			 proyecto.setEstado(new Conformado());
		}
		
	}
}

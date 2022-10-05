package ar.edu.unlp.info.oo2.repaso_p7_ejercicio3_sistFinanciacion;

public abstract class Estado {
	protected String name; 
	
	public void conformarProyecto(Proyecto proyecto) {}
	public void cancelarProyecto(Proyecto proyecto) {}
	public abstract void aportarDinero(Proyecto proyecto, double monto); 
	public String getNombre() {
		return this.name; 
	}
}

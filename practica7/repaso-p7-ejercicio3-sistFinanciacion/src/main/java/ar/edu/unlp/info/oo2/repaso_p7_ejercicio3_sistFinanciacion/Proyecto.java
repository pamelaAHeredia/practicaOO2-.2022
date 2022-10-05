package ar.edu.unlp.info.oo2.repaso_p7_ejercicio3_sistFinanciacion;

public class Proyecto {
	private String nombre; 
	private Emprendedor emprendedor; 
	private Estado estado; 
	private double montoRecibido; 
	private double montoNecesario; 
	
	public Proyecto(String nombre, Emprendedor emp, double montoNecesario) {
		this.nombre = nombre; 
		this.emprendedor = emp; 
		this.montoNecesario = montoNecesario; 
		this.estado = new Publicado(); 
		this.montoRecibido = 0; 
	}
	
	//Cuando un proyecto logra el dinero necesario se registra como conformado.
	public void agregarDinero(double monto) {
		this.montoRecibido = this.montoRecibido + monto; 
	}
	
	public void aportarDinero(double monto) {
		this.estado.aportarDinero(this, monto);
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado; 
	}
	
	public boolean alcanzoMontoNecesario() {
		return (this.montoRecibido >= this.montoNecesario); 
	}
	
	public double getMontoRecibido() {
		return this.montoRecibido; 
	}
	
	public Proyecto esTitulo(String titulo) {
		if (this.nombre.equals(titulo)){
			return this; 
		}
		return null; 
	}
	
	public String getNombre() {
		return this.nombre; 
	}
	
	public Estado getEstado() {
		return this.estado; 
	}
	
	public void cancelar() {
		this.estado.cancelarProyecto(this);
	}
}

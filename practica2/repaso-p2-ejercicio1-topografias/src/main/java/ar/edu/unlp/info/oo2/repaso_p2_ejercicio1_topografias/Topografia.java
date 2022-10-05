package ar.edu.unlp.info.oo2.repaso_p2_ejercicio1_topografias;

public abstract class Topografia {
	
	public abstract double calcularProporcionAgua(); 
	public abstract double calcularProporcionTierra(); 
	public abstract boolean equals(Topografia otra); 
	
	public boolean compararContraAgua() {
		return false; 
	}
	
	public boolean compararContraTierra() {
		return false; 
	}
	
	public boolean compararContraMixta(Mixta mixta) {
		return false; 
	}
	
	public boolean compararContraPantano() {
		return false; 
	}
}

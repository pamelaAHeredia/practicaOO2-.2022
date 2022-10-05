package ar.edu.unlp.info.oo2.repaso_p3_ejercicio3_dispositivo;

public abstract class Calculator {
	protected String calculator; 
	
	public abstract long crcFor(String data); 
	public String getName() {
		return this.calculator; 
	}
}

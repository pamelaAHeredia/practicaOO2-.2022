package ar.edu.unlp.info.oo2.repaso_p7_ejercicio1_lavarropas;

public class LavadoDiario extends EstrategiaLavado{

	public LavadoDiario() {
		super.porcentajeAguaLavado = 0.5; 
		super.tiempoLavado = 20; 
		super.tiempoLavadoAdicional = 0; 
		super.tiempoEnjuague = 7; 
		super.tiempoCentrifugado = 3; 
	}
}

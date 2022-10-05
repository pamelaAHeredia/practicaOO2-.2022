package ar.edu.unlp.info.oo2.repaso_p7_ejercicio1_lavarropas;

public class RopaDelicada extends EstrategiaLavado{

	public RopaDelicada() {
		super.porcentajeAguaLavado = 1; 
		super.tiempoLavado = 40; 
		super.tiempoLavadoAdicional = 0; 
		super.tiempoEnjuague = 15; 
		super.tiempoCentrifugado = 0; 
	}
}

package ar.edu.unlp.info.oo2.repaso_p7_ejercicio1_lavarropas;

public class RopaSucia extends EstrategiaLavado{

	public RopaSucia() {
		super.porcentajeAguaLavado = 1; 
		super.tiempoLavado = 100; 
		super.tiempoLavadoAdicional = 30; 
		super.tiempoEnjuague = 15; 
		super.tiempoCentrifugado = 10; 
	}
}

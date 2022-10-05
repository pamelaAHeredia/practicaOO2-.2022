package ar.edu.unlp.info.oo2.repaso_p7_ejercicio1_lavarropas;

public abstract class EstrategiaLavado {
	protected double porcentajeAguaLavado; 
	protected int tiempoLavado; 
	protected int tiempoLavadoAdicional; 
	protected int tiempoEnjuague; 
	protected int tiempoCentrifugado; 
	
	public void cambiarAgua(double agua, Lavarropas l) {
		l.vaciarAgua();
		l.agregarAgua(agua);
	}
	
	public int lavado(double agua, int tiempo, Lavarropas l) {
		if (tiempo > 0) {
			l.agregarJabon();
			l.lavar(tiempo);
			this.cambiarAgua(agua, l); 
		}	
		return tiempo; 
	}
	
	public int enjuagarRopa(int tiempoEnjuague, int tiempoCentrifugado, Lavarropas l) {
		l.agregarEnjuague();
		l.enjuagar(tiempoEnjuague);
		l.centrifugar(tiempoCentrifugado);
		return tiempoEnjuague + tiempoCentrifugado; 
	}

	public int lavarRopa(Lavarropas l) {
		l.agregarAgua(this.porcentajeAguaLavado);
		return this.lavado(porcentajeAguaLavado, tiempoLavado, l) 
				+ this.lavado(porcentajeAguaLavado, tiempoLavadoAdicional, l)
				+ this.enjuagarRopa(tiempoEnjuague, tiempoCentrifugado, l); 
		
	}
}

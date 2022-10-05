package ar.edu.unlp.info.oo2.repaso_p2_ejercicio1_topografias;

public class Tierra extends Topografia {
	
	public Tierra() {}

	@Override
	public double calcularProporcionAgua() {
		return 0;
	}

	@Override
	public double calcularProporcionTierra() {
		return 1 - this.calcularProporcionAgua();
	}

	@Override
	public boolean equals(Topografia otra) {
		return otra.compararContraTierra();
	}
	
	public boolean compararContraTierra() {
		return true; 
	}


}

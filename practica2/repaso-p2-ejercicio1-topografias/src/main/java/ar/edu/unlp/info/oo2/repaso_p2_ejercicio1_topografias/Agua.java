package ar.edu.unlp.info.oo2.repaso_p2_ejercicio1_topografias;

public class Agua extends Topografia {

	public Agua() {}

	public double calcularProporcionAgua() {
		return 1; 
	}

	@Override
	public double calcularProporcionTierra() {
		return 0;
	}

	@Override
	public boolean equals(Topografia otra) {
		return otra.compararContraAgua();
	}
	
	public boolean compararContraAgua() {
		return true; 
	}
}

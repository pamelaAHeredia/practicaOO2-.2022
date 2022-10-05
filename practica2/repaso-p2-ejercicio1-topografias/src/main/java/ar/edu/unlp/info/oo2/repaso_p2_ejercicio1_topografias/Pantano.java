package ar.edu.unlp.info.oo2.repaso_p2_ejercicio1_topografias;

public class Pantano extends Topografia{

	@Override
	public double calcularProporcionAgua() {
		return 0.7;
	}

	@Override
	public double calcularProporcionTierra() {
		return 0.3;
	}

	@Override
	public boolean equals(Topografia otra) {
		return otra.compararContraPantano();
	}
	
	public boolean compararContraPantano() {
		return true; 
	}

}

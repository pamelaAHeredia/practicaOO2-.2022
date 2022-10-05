package ar.edu.unlp.info.oo2.repaso_p2_ejercicio4_sueldos;

public class Pasante extends Empleado{
	private int eRendidos; 
	
	public Pasante(double basico, int rendidos) {
		super.sBasico = basico; 
		this.eRendidos = rendidos; 
	}

	@Override
	public double calcularAdicional() {
		return 2000 * this.eRendidos;
	}

	@Override
	public double calcularBasico() {
		return this.sBasico;
	}

}

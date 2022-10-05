package ar.edu.unlp.info.oo2.repaso_p2_ejercicio4_sueldos;

public class Temporario extends Empleado{
	private boolean casado; 
	private int hijos; 
	private int hsTrabajadas; 
	
	public Temporario(double basico, boolean casado, int hijos, int hs) {
		super.sBasico = basico; 
		this.casado = casado; 
		this.hijos = hijos; 
		this.hsTrabajadas = hs; 
	}

	@Override
	public double calcularAdicional() {
		double basico = 0; 
		if(casado) {
			basico = 5000; 
		}
		return basico + 2000 * this.hijos;
	}

	@Override
	public double calcularBasico() {
		return this.sBasico + this.hsTrabajadas * 300;
	}

}

package ar.edu.unlp.info.oo2.repaso_p2_ejercicio4_sueldos;

public class Planta extends Empleado{
	private boolean casado; 
	private int hijos; 
	private int antiguedad; 
	
	public Planta(double basico, boolean casado, int hijos, int antig) {
		super.sBasico = basico; 
		this.antiguedad = antig; 
		this.casado = casado; 
		this.hijos = hijos; 
	}

	@Override
	public double calcularAdicional() {
		double basico = 0;
		if(this.casado) {
			basico = 5000; 
		}
		return basico + 2000 * (this.hijos + this.antiguedad);
	}

	@Override
	public double calcularBasico() {
		return this.sBasico; 
	}

}

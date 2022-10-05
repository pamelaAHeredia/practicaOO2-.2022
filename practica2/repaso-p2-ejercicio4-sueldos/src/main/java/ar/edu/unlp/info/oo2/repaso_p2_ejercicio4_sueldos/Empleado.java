package ar.edu.unlp.info.oo2.repaso_p2_ejercicio4_sueldos;

public abstract class Empleado {
	protected double sBasico; 

	public abstract double calcularAdicional(); 
	public abstract double calcularBasico(); 
	
	public double calcularDescuento() {
		return 0.13* calcularBasico() + 0.05 * calcularAdicional(); 
	}
	
	public double sueldo() {
		return calcularBasico() + calcularAdicional() - calcularDescuento(); 
	}
}

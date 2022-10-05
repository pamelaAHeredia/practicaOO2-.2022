package ar.edu.unlp.info.oo2.repaso_p7_ejercicio3_sistFinanciacion;

public class Cancelado extends Estado{
	public Cancelado() {
		super.name = "cancelado"; 
	}

	@Override
	public void aportarDinero(Proyecto proyecto, double monto) {
		throw new RuntimeException("El proyecto ha sido cancelado. No puede aportar dinero."); 
		
	}
}

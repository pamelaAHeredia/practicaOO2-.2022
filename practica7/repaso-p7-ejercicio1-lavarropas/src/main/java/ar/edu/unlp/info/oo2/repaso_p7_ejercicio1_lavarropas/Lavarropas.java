package ar.edu.unlp.info.oo2.repaso_p7_ejercicio1_lavarropas;

public class Lavarropas {
	private EstrategiaLavado programa; 
	
	public Lavarropas(EstrategiaLavado p) {
		this.programa = p; 
	}
	
	public void agregarAgua(double porcentaje) {
		System.out.println("agregando Agua: " + porcentaje);
	}
	
	public void agregarJabon() {
		System.out.println("agregando jabón");
	}
	
	public void lavar(int minutos) {
		System.out.println("lavando por "+ minutos +" minutos.");
	}
	
	public void vaciarAgua() {
		System.out.println("Vaciando agua");
	}
	
	public void agregarEnjuague() {
		System.out.println("aggregando enjuague");
	}
	public void enjuagar(int tiempo) {
		System.out.println("enjuagando por "+ tiempo+" minutos");
	}
	public void centrifugar(int minutos) {
		System.out.println("centrifugando por "+minutos+" minutos.");
	}
	public int lavarRopa() {
		return programa.lavarRopa(this); 
	}
	
	public void setPrograma(EstrategiaLavado p) {
		this.programa = p; 
	}
}

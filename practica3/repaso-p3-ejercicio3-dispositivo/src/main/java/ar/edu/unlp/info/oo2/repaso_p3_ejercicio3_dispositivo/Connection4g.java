package ar.edu.unlp.info.oo2.repaso_p3_ejercicio3_dispositivo;

public class Connection4g {
	private String symb; 
	
	public Connection4g() {
		this.symb = "4g"; 
	}
	
	public String transmit(String data, long crc) {
		return data +", "+ crc; 
	}
	
	public String symb() {
		return this.symb; 
	}
}

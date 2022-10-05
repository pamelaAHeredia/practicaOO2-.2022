package ar.edu.unlp.info.oo2.repaso_p3_ejercicio3_dispositivo;

public class Adapter4g implements Connection{
	private Connection4g conn4g; 
	
	public Adapter4g() {
		this.conn4g = new Connection4g(); 
	}

	@Override
	public String sendData(String data, long crc) {
		return conn4g.transmit(data, crc); 
	}

	@Override
	public String pict() {
		return conn4g.symb(); 
		
	}

}

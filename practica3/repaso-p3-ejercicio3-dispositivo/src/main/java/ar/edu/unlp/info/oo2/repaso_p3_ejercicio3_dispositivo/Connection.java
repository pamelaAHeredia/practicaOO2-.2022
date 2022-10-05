package ar.edu.unlp.info.oo2.repaso_p3_ejercicio3_dispositivo;

public interface Connection {
	public String sendData(String data, long crc); 
	public String pict(); 
}

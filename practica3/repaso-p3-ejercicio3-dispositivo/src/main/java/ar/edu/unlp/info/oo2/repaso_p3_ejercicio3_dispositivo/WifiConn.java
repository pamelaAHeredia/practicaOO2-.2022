package ar.edu.unlp.info.oo2.repaso_p3_ejercicio3_dispositivo;

public class WifiConn implements Connection{
	private String pict; 
	
	public WifiConn() {
		this.pict = "WiFi"; 
	}

	@Override
	public String sendData(String data, long crc) {
		return data +", "+ crc; 
	}

	@Override
	public String pict() {
		return this.pict;
	}

}

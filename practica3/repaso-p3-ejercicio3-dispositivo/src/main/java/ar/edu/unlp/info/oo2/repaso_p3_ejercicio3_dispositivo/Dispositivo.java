package ar.edu.unlp.info.oo2.repaso_p3_ejercicio3_dispositivo;

public class Dispositivo {
	private Ringer ringer; 
	private Connection connection;
	private Calculator calculator; 
	private Display display; 
	
	public Dispositivo(Connection conn, Calculator calc) {
		this.ringer = new Ringer(); 
		this.connection = conn; 
		this.calculator = calc; 
		this.display = new Display(); 
	}
	
	public String send(String data) {
		long crc = this.calculator.crcFor(data); 
		return this.connection.sendData(data, crc); 
	}
	
	public void conectarCon(Connection conn) {
		this.connection = conn; 
		this.display.showBanner(conn.pict());
		this.ringer.ring();
	}
	
	public void configurarCRC(Calculator calc) {
		this.calculator = calc; 
	}

	public Display getDisplay() {
		return display;
	}

	public Calculator getCalculator() {
		return calculator;
	}
	public Connection getConnection() {
		return connection;
	}
	

}

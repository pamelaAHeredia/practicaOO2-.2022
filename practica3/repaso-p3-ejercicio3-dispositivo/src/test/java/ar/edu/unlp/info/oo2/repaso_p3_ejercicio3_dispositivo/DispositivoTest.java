package ar.edu.unlp.info.oo2.repaso_p3_ejercicio3_dispositivo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispositivoTest {
	Connection wifi, conn4g; 
	Dispositivo d1; 
	Ringer r1; 
	Calculator crc16, crc32; 
	String msg = "un mensaje"; 
	
	@BeforeEach
	public void setUp() {
		crc16 = new CRC16_Calculator(); 
		crc32 = new CRC32_Calculator();
		wifi = new WifiConn(); 
		conn4g = new Adapter4g(); 
		d1 = new Dispositivo(wifi, crc16); 
	}
	
	@Test
	public void conectarCon() {
		assertEquals("WiFi", d1.getConnection().pict()); 
		d1.conectarCon(conn4g);
		assertEquals("4g", d1.getConnection().pict()); 
	}
	
	@Test
	public void configurarCRC() {
		assertEquals("crc16", d1.getCalculator().getName()); 
		d1.configurarCRC(crc32);		
		assertEquals("crc32", d1.getCalculator().getName()); 
	}
	@Test
	public void send() {
		assertEquals(d1.send(msg), msg+", "+crc16.crcFor(msg));
		d1.configurarCRC(crc32);
		assertEquals(d1.send(msg), msg+", "+crc32.crcFor(msg));
	}
}

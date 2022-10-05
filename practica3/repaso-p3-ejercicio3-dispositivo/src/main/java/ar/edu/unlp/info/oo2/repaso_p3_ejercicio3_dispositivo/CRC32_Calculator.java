package ar.edu.unlp.info.oo2.repaso_p3_ejercicio3_dispositivo; 
import java.util.zip.CRC32;  

public class CRC32_Calculator extends Calculator{
	public CRC32_Calculator() {
		super.calculator = "crc32"; 
	}

	@Override
	public long crcFor(String datos) {
		CRC32 crc = new CRC32();
		crc.update(datos.getBytes());
		long result = crc.getValue();
		return result; 
	}

}

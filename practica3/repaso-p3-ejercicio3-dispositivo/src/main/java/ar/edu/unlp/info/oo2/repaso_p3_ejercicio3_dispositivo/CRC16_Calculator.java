package ar.edu.unlp.info.oo2.repaso_p3_ejercicio3_dispositivo;

public class CRC16_Calculator extends Calculator{
	public CRC16_Calculator() {
		super.calculator = "crc16"; 
	}

	@Override
	public long crcFor(String datos) {
		int crc = 0xFFFF;
		for (int j = 0; j < datos.getBytes().length; j++) {
		crc = ((crc >>> 8) | (crc << 8)) & 0xffff;
		crc ^= (datos.getBytes()[j] & 0xff);
		crc ^= ((crc & 0xff) >> 4);
		crc ^= (crc << 12) & 0xffff;
		crc ^= ((crc & 0xFF) << 5) & 0xffff;
		}
		crc &= 0xffff;
		return crc;
	}
	


}

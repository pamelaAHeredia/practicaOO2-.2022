package ar.edu.unlp.info.oo2.repaso_p2_ejercicio4_sueldos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemporarioTest {
	Temporario e1, e2, e3, e4; 
	
	@BeforeEach
	public void setUp() {
		e1 = new Temporario(20000, true, 2, 5); 
		e2 = new Temporario(20000, true, 0, 0);
		e3 = new Temporario(20000, false, 1, 5);
		e4 = new Temporario(20000, false, 0, 0);
	}
	
	@Test
	public void calcularBasico() {
		assertEquals(21500, e1.calcularBasico());
		assertEquals(20000, e2.calcularBasico()); 
	}
	
	@Test
	public void calcularAdicional() {
		assertEquals(9000, e1.calcularAdicional()); 
		assertEquals(5000, e2.calcularAdicional()); 
		assertEquals(2000, e3.calcularAdicional()); 
		assertEquals(0, e4.calcularAdicional()); 
	}
	
	@Test
	public void Sueldo() {
		assertEquals(27255, e1.sueldo()); 
		assertEquals(22150, e2.sueldo()); 
		assertEquals(20605, e3.sueldo()); 
		assertEquals(17400, e4.sueldo()); 
	}
}

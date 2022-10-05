package ar.edu.unlp.info.oo2.repaso_p2_ejercicio4_sueldos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PlantaTest {
	Planta p1, p2,p3,p4; 
	
	@BeforeEach
	public void setUp() {
		p1 = new Planta(50000, true, 2, 5); 
		p2 = new Planta(50000, true, 0, 0);
		p3 = new Planta(50000, false, 1, 5);
		p4 = new Planta(50000, false, 0, 0);
	}
	
	@Test
	public void calcularBasico() {
		assertEquals(50000, p1.calcularBasico()); 
	}
	
	@Test
	public void calcularAdicional() {
		assertEquals(19000, p1.calcularAdicional()); 
		assertEquals(5000, p2.calcularAdicional()); 
		assertEquals(12000, p3.calcularAdicional()); 
		assertEquals(0, p4.calcularAdicional()); 
	}
	
	@Test
	public void sueldo() {
		assertEquals(61550, p1.sueldo()); 
		assertEquals(48250, p2.sueldo()); 
		assertEquals(54900, p3.sueldo()); 
		assertEquals(43500, p4.sueldo()); 
	}
	
	

}

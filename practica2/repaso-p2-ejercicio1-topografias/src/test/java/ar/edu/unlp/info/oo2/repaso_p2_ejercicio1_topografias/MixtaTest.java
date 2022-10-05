package ar.edu.unlp.info.oo2.repaso_p2_ejercicio1_topografias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MixtaTest {
	Agua a1, a2, a3, a4; 
	Tierra t1, t2, t3, t4; 
	Mixta m1, m2, m3, m4, m5, m6, m7, m8;
	Pantano p1, p2; 
	
	@BeforeEach
	public void setUp(){
		a1 = new Agua(); 
		a2 = new Agua(); 
		a3 = new Agua(); 
		a4 = new Agua(); 
		
		t1 = new Tierra(); 
		t2 = new Tierra();
		t3 = new Tierra();
		t4 = new Tierra();
		
		m1 = new Mixta(Arrays.asList(a1,t1,a2,t2)); 
		m2 = new Mixta(Arrays.asList(a1,a2,a3,a4)); 
		m3 = new Mixta(Arrays.asList(t1,t2,t3,t4)); 
		m4 = new Mixta(Arrays.asList(a1,a2,a3,t4)); 
		m5 = new Mixta(Arrays.asList(a1,t1,a2,t2)); 
		m6 = new Mixta(Arrays.asList(a1,t1,m1,m4)); 
		m7 = new Mixta(Arrays.asList(a1,t1,m1,m4)); 
		m8 = new Mixta(Arrays.asList(a1,t1,m1,m5));
		
		p1 = new Pantano(); 
		p2 = new Pantano();
	}
	
	@Test
	public void calcularProporcionDeAgua() {
		assertEquals(0.5, m1.calcularProporcionAgua()); 
		assertEquals(0.5, m1.calcularProporcionTierra());
		assertEquals(1, m2.calcularProporcionAgua());
		assertEquals(0, m2.calcularProporcionTierra());
		assertEquals(1, m3.calcularProporcionTierra());
		assertEquals(0, m3.calcularProporcionAgua());
		assertEquals(0.75, m4.calcularProporcionAgua()); 
		assertEquals(0.25, m4.calcularProporcionTierra());
		assertEquals(0.5625, m6.calcularProporcionAgua()); 
	}
	
	@Test
	public void comparar() {
		assertTrue(a1.equals(a2)); 
		assertFalse(a1.equals(t2)); 
		assertFalse(a1.equals(m2));
		assertTrue(t1.equals(t2)); 
		assertFalse(t1.equals(a2)); 
		assertTrue(m1.equals(m5)); 
		assertTrue(m6.equals(m7));
		assertFalse(m7.equals(m8));
		
		assertTrue(p1.equals(p2)); 
		assertFalse(p1.equals(t2)); 
		
	}
}

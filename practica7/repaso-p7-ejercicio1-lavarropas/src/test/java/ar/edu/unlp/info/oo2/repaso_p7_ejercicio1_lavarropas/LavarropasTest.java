package ar.edu.unlp.info.oo2.repaso_p7_ejercicio1_lavarropas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LavarropasTest {
	private Lavarropas l; 
	private EstrategiaLavado diario, delicada, sucia; 
	
	@BeforeEach
	void setUp() {
		diario = new LavadoDiario(); 
		delicada = new RopaDelicada(); 
		sucia = new RopaSucia(); 
		l = new Lavarropas(diario); 
	}
	
	@Test
	void lavarRopa() {
		assertEquals(30, l.lavarRopa()); 
		System.out.println("------------------------------------------------------");
		l.setPrograma(delicada);
		assertEquals(55, l.lavarRopa()); 
		System.out.println("------------------------------------------------------");
		l.setPrograma(sucia);
		assertEquals(155, l.lavarRopa()); 
	}

}

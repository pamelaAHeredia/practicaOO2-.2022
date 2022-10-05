package ar.edu.unlp.info.oo2.repaso_p7_ejercicio3_sistFinanciacion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SistemaTest {
	Sistema s; 
	Proyecto p1, p2, p3, p4; 
	Emprendedor e1, e2; 
	
	@BeforeEach
	void setUp() {
		s = new Sistema(); 
		e1 = new Emprendedor("e1"); 
		e2 = new Emprendedor("e2"); 
		
		p1 = new Proyecto("p1", e1, 5000); 
		p2 = new Proyecto("p2", e1, 4000); 
		
		p3 = new Proyecto("p3", e2, 3000); 
		p4 = new Proyecto("p4", e2, 2000); 
		
		e1.nuevoProyecto(p1);
		e1.nuevoProyecto(p2);
		p2.aportarDinero(6000);
		
		e2.nuevoProyecto(p3);
		e2.cancelarProyecto(p3);
		e2.nuevoProyecto(p4);
		
		
		s.agregarEmprendedor(e1);
		s.agregarEmprendedor(e2);
	}
	
	@Test
	void aportarDinero() {
		assertEquals(0, p1.getMontoRecibido()); 
		s.invertirDineroEnProyecto(p1, 500); 
		assertEquals(500, p1.getMontoRecibido()); 
		p2.aportarDinero(200);
		assertEquals(6200, p2.getMontoRecibido());

	}
	
}

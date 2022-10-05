package ar.edu.unlp.info.oo2.repaso_p1_ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
	
	Twitter tw; 
	Usuario u1,u2,u3; 
	
	@BeforeEach
	public void setUp() {
		tw = new Twitter();  		
	}
	
	@Test
	public void nuevoUsuario() {
		assertNotNull( tw.nuevoUsuario("User1")); 
		assertNull(tw.nuevoUsuario("User1"));
		assertNotNull(tw.nuevoUsuario("User2"));
		
		assertEquals(2, tw.getUsuarios().size()); 
	}
	
	@Test
	public void eliminarUsuario() {	
		u1 = tw.nuevoUsuario("user1"); 
		u2 = tw.nuevoUsuario("user2"); 
		
		tw.eliminarUsuario(u3); 
		assertEquals(2, tw.getUsuarios().size()); 
		
		tw.eliminarUsuario(u2);
		assertEquals(1, tw.getUsuarios().size()); 
		
	}

}

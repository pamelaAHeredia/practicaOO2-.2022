package ar.edu.unlp.info.oo2.repaso_p1_ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	Usuario u1, u2;
	
	Tweet t1, t2,t3; 
	
	@BeforeEach
	public void setUp() {
		u1 = new Usuario("u1");
		u2 = new Usuario("u2"); 
	}
	
	@Test
	public void nuevoTweet() {
		assertEquals(0, u1.getTweets().size());
		
		assertNull(u1.nuevoTweet("")); 
		assertNull(u1.nuevoTweet("111111111111111")); 
		assertNotNull(u1.nuevoTweet("11111111111111"));
		assertNotNull(u1.nuevoTweet("1"));
		
		assertEquals(2, u1.getTweets().size());
	}
	
	@Test
	public void compartirTweet() {
		t1 = new Tweet("tweet 1"); 
		assertEquals(0, u1.getTweets().size());
		
		assertNull(u1.compartirTweet("", t1)); 
		assertNull(u1.compartirTweet("111111111111111", t1)); 
		assertNotNull(u1.compartirTweet("11111111111111", t1));
		assertNotNull(u1.compartirTweet("1", t1)); 
		
		assertEquals(2, u1.getTweets().size());
		
		t2 = u1.compartirTweet("texto largo", t1); 
		
		assertEquals(t1, t2.getOrigen()); 
		assertEquals("texto largo", t2.getTxt()); 
	}
	
	@Test
	public void eliminarTweets() {
		assertEquals(0, u1.getTweets().size());
		
		t1 = u1.nuevoTweet("tw 1"); 
		u1.nuevoTweet("tw 2"); 
		
		u1.compartirTweet("tw 3", t1); 
		
		assertEquals(3, u1.getTweets().size());
		
		u1.eliminarTweets();
		
		assertEquals(0, u1.getTweets().size());
	}
	
	
}

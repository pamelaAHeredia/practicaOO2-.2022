package ar.edu.unlp.info.oo2.repaso_p3_ejercicio4_decodificadorPelis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecodificadorTest {
	Decodificador d1; 
	Criterio c1, c2, c3; 
	Pelicula thor,capAm,ironMan,dunkk,rocky,rambo; 
	
	@BeforeEach
	public void setUp() {
		c1 = new Novedad(); 
		c2 = new Puntaje(); 
		c3 = new Similaridad(); 
		
		thor = new Pelicula("Thor", 7.9, 2007); 
		capAm = new Pelicula("Capitan America", 7.8, 2016); 
		ironMan = new Pelicula("Iron man", 7.9, 2010); 
		dunkk = new Pelicula("Dunkirk", 7.9, 2017); 
		rocky = new Pelicula("Rocky", 8.1, 1976); 
		rambo = new Pelicula("Rambo", 7.8, 1979); 
		
		thor.setSimilares(Arrays.asList(capAm,ironMan)); 
		capAm.setSimilares(Arrays.asList(thor, ironMan));
		ironMan.setSimilares(Arrays.asList(thor, capAm));

		rocky.setSimilares(Arrays.asList(rambo));
		rambo.setSimilares(Arrays.asList(rocky));
		
		d1 = new Decodificador(Arrays.asList(thor,capAm,ironMan,dunkk,rocky,rambo), Arrays.asList(thor, rocky), c1); 
	}
	
	@Test
	public void novedad() {
		assertEquals(Arrays.asList(dunkk, capAm,  ironMan), d1.sugerirPeliculas(d1.getPeliculasVistas(), d1.getGrilla())); 
	}
	
	@Test
	public void puntaje() {
		d1.setCriterioSugerencia(c2);
		assertEquals(Arrays.asList(rocky, dunkk, ironMan), d1.sugerirPeliculas(d1.getPeliculasVistas(), d1.getGrilla())); 
	}
	
	@Test
	public void similaridad() {
		d1.setCriterioSugerencia(c3);
		assertEquals(Arrays.asList(capAm, ironMan, rambo), d1.sugerirPeliculas(d1.getPeliculasVistas(), d1.getGrilla())); 
	}
	

}

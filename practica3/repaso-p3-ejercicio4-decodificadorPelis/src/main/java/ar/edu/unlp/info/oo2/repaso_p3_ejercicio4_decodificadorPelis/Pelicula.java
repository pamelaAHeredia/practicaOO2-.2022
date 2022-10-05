package ar.edu.unlp.info.oo2.repaso_p3_ejercicio4_decodificadorPelis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	private String titulo; 
	private int anioEstreno; 
	private double puntaje; 
	private List<Pelicula> pelisSimilares; 
	
	public Pelicula(String titulo, double puntaje, int anioEstreno) {
		this.anioEstreno = anioEstreno; 
		this.puntaje = puntaje; 
		this.titulo = titulo; 
		this.pelisSimilares = new ArrayList<Pelicula>(); 
	}

	public int getAnioEstreno() {
		return anioEstreno;
	}
	
	public double getPuntaje() {
		return puntaje;
	}

	public List<Pelicula> getPelisSimilares() {
		return pelisSimilares;
	}
	
	public void setSimilares(List<Pelicula> simil) {
		this.pelisSimilares = simil; 
	}
	
	public Pelicula agregarSimilar(Pelicula peli) {
		if(! pelisSimilares.contains(peli)) {
			pelisSimilares.add(peli); 
			return peli; 
		}
		return null; 
	}
}

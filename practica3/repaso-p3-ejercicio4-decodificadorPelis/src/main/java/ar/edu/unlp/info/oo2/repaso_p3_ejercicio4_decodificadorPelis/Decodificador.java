package ar.edu.unlp.info.oo2.repaso_p3_ejercicio4_decodificadorPelis;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
	private List<Pelicula> grilla; 
	private List<Pelicula> peliculasVistas; 
	private Criterio criterioSugerencia; 
	
	public Decodificador(List<Pelicula> grilla, List<Pelicula> peliculasVistas, Criterio criterio) {
		this.grilla = grilla; 
		this.peliculasVistas = peliculasVistas; 
		this.criterioSugerencia = criterio; 
	}
	public Decodificador(List<Pelicula> grilla) {
		this.grilla = grilla; 
		this.peliculasVistas = new ArrayList<Pelicula>(); 
		this.criterioSugerencia = new Puntaje(); 
	}
	public List<Pelicula> getGrilla() {
		return grilla;
	}
	public List<Pelicula> getPeliculasVistas() {
		return peliculasVistas;
	}
	public void setCriterioSugerencia(Criterio criterioSugerencia) {
		this.criterioSugerencia = criterioSugerencia;
	}
	
	public void setPeliculasVistas(List<Pelicula> vistas) {
		this.peliculasVistas = vistas; 
	}
	
	public List<Pelicula> sugerirPeliculas(List<Pelicula> pelis, List<Pelicula> grilla){
		return criterioSugerencia.obtenerSugerencias(pelis, grilla); 
	}
	
}

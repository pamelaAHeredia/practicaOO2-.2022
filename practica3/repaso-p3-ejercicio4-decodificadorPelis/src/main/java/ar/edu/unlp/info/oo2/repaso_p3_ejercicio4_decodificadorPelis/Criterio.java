package ar.edu.unlp.info.oo2.repaso_p3_ejercicio4_decodificadorPelis;

import java.util.List;

public interface Criterio {
	public List<Pelicula> obtenerSugerencias(List<Pelicula> peli, List<Pelicula> grilla);
}

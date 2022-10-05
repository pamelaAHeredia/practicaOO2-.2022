package ar.edu.unlp.info.oo2.repaso_p3_ejercicio4_decodificadorPelis;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Novedad implements Criterio{

	@Override
	public List<Pelicula> obtenerSugerencias(List<Pelicula> pelis, List<Pelicula> grilla) {
		return (List<Pelicula>) grilla.stream().sorted(Comparator.comparing(Pelicula :: getAnioEstreno).reversed()).limit(3).collect(Collectors.toList()); 
	}

}

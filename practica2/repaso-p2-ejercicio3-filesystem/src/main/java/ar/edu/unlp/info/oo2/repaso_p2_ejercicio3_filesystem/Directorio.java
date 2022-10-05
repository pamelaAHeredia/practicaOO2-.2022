package ar.edu.unlp.info.oo2.repaso_p2_ejercicio3_filesystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Directorio extends Contenido {
	private List<Contenido> contenido; 

	public Directorio(String nombre, LocalDate fecha) {
		super.fechaCreacion = fecha; 
		super.nombre = nombre; 
		super.tamanio = 32; 
		contenido = new ArrayList<Contenido>(); 
	}

	public int tamanoTotalOcupado() {
		return this.contenido.stream().mapToInt(c -> c.tamanoTotalOcupado()).sum() + 32; 
	}

	public Archivo archivoMasGrande() {
		return this.contenido.stream().map(c -> c.archivoMasGrande()).max(Comparator.comparingInt(Archivo :: tamanoTotalOcupado)).orElse(null); 
	}

	public Archivo archivoMasNuevo() {
		return this.contenido.stream().map(c -> c.archivoMasNuevo()).max(Comparator.comparing(Archivo :: getFecha)).orElse(null); 
	}
	
	public void agregar(Contenido c) {
		this.contenido.add(c); 
	}
	

}

package ar.edu.unlp.info.oo2.repaso_p2_ejercicio3_filesystem;

import java.time.LocalDate;

public class Archivo extends Contenido{
	
    public Archivo (String nombre, LocalDate fecha, int tamanio) {
    	super.fechaCreacion = fecha; 
    	super.nombre = nombre; 
    	super.tamanio = tamanio; 
    }

	@Override
	public int tamanoTotalOcupado() {
		return this.tamanio; 
	}

	@Override
	public Archivo archivoMasGrande() {
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}
	
	public LocalDate getFecha() {
		return super.fechaCreacion; 
	}
	
	public String getNombre() {
		return super.nombre; 
	}
}

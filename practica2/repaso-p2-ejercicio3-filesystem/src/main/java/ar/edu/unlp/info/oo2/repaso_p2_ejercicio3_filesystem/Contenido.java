package ar.edu.unlp.info.oo2.repaso_p2_ejercicio3_filesystem;

import java.time.LocalDate;

public abstract class Contenido {

	protected String nombre; 
	protected LocalDate fechaCreacion; 
	protected int tamanio; 
	
	public abstract int tamanoTotalOcupado(); 
	public abstract Archivo archivoMasGrande(); 
	public abstract Archivo archivoMasNuevo(); 
	
	

}

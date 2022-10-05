package ar.edu.unlp.info.oo2.repaso_p4_ejercicio2_fileManager;

import java.time.LocalDate;

public class Archivo implements Componente{
	private String nombre; 
	private String extension; 
	private int tamaño; 
	private LocalDate fechaCreacion; 
	private LocalDate fechaModif; 
	private String permisos; 
	
	public Archivo(String nombre, String extension, String permisos, int tamaño) {
		this.extension = extension; 
		this.fechaCreacion = LocalDate.now(); 
		this.permisos = permisos; 
		this.tamaño = tamaño; 
		this.fechaModif = null; 
	}

	@Override
	public String prettyPrint() {
		return " ";
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String getPermisos() {
		return this.permisos;
	}

	@Override
	public String getExtension() {
		return this.extension;
	}

	@Override
	public int getTamaño() {
		return this.tamaño;
	}

	@Override
	public LocalDate getFechaCreacion() {
		return this.fechaCreacion;
	}

	@Override
	public LocalDate getFechaModificacion() {
		return this.fechaModif;
	}


}

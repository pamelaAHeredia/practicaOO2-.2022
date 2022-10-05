package ar.edu.unlp.info.oo2.repaso_p4_ejercicio2_fileManager;

import java.time.LocalDate;

public abstract class Decorador implements Componente{
	protected Componente componente; 
	
	public Decorador(Componente c) {
		this.componente = c; 
	}

	public abstract String prettyPrint(); 
	
	public  String getNombre() {
		return this.getNombre(); 
	}
	public  String getPermisos() {
		return this.getPermisos(); 
	}
	public  String getExtension() {
		return this.getExtension(); 
	}
	public  int getTamaño() {
		return this.getTamaño(); 
	}
	public  LocalDate getFechaCreacion() {
		return this.getFechaCreacion(); 
	}
	public  LocalDate getFechaModificacion() {
		return this.getFechaModificacion(); 
	}
}

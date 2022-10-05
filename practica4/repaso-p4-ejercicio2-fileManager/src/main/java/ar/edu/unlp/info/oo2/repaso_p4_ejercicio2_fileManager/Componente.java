package ar.edu.unlp.info.oo2.repaso_p4_ejercicio2_fileManager;

import java.time.LocalDate;

public interface Componente {
	
	String prettyPrint(); 
	String getNombre(); 
	String getPermisos(); 
	String getExtension(); 
	int getTamaño(); 
	LocalDate getFechaCreacion(); 
	LocalDate getFechaModificacion();
}

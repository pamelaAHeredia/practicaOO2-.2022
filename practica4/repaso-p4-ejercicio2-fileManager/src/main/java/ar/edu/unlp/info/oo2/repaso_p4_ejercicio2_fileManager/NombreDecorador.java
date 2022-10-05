package ar.edu.unlp.info.oo2.repaso_p4_ejercicio2_fileManager;

import java.time.LocalDate;

public class NombreDecorador extends Decorador{

	
	public NombreDecorador(Componente c) {
		super(c);
	}

	@Override
	public String prettyPrint() {
	return componente.prettyPrint() + " "+ componente.getNombre();
	}



}

package ar.edu.unlp.info.oo2.repaso_p4_ejercicio2_fileManager;

public class ModificacionDecorador extends Decorador{
	
	public ModificacionDecorador(Componente c) {
		super(c); 
	}

	@Override
	public String prettyPrint() {
		return componente.prettyPrint() + " " + this.getFechaModificacion(); 
	}

}

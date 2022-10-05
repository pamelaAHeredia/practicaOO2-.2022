package ar.edu.unlp.info.oo2.repaso_p4_ejercicio2_fileManager;

public class PermisosDecorador extends Decorador{

	public PermisosDecorador(Componente c) {
		super(c); 
	}
	@Override
	public String prettyPrint() {
		return this.componente.prettyPrint() + " " + this.getPermisos(); 
	}

}

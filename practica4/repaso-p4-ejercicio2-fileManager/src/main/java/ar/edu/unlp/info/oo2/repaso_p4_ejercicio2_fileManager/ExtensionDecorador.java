package ar.edu.unlp.info.oo2.repaso_p4_ejercicio2_fileManager;

public class ExtensionDecorador extends Decorador{
	
	public ExtensionDecorador(Componente c) {
		super(c); 
	}

	@Override
	public String prettyPrint() {
		return componente.prettyPrint() + " "+ componente.getExtension();
	}
	

}

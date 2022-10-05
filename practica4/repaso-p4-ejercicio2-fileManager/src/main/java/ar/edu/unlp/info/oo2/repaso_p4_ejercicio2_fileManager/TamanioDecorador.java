package ar.edu.unlp.info.oo2.repaso_p4_ejercicio2_fileManager;

public class TamanioDecorador extends Decorador{

	public TamanioDecorador(Componente c) {
		super(c); 
	}
	
	@Override
	public String prettyPrint() {
		return componente.prettyPrint() + " "+ this.getTamaño(); 
	}

}

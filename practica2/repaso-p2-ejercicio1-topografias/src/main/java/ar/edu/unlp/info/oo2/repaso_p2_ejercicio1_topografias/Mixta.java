package ar.edu.unlp.info.oo2.repaso_p2_ejercicio1_topografias;

import java.util.ArrayList;
import java.util.List;

public class Mixta extends Topografia {
	
	private List<Topografia> partes; 
	
	public Mixta (List<Topografia> t) {
		this.partes = t; 
	}
	
	public List<Topografia> crearTopografia(Topografia t) {
		while (partes.size() < 4) {
			partes.add(t);  
		}
		if( partes.size() == 4) {
			return this.partes;
		}
		return null; 
	}


	public double calcularProporcionAgua() {		
		return partes.stream().mapToDouble(p -> p.calcularProporcionAgua()).sum() / 4; 
	}

	@Override
	public double calcularProporcionTierra() {
		return partes.stream().mapToDouble(p -> p.calcularProporcionTierra()).sum() / 4;
	}

	@Override
	public boolean equals(Topografia otra) {
		return otra.compararContraMixta(this);
	}
	
	public boolean compararContraMixta(Mixta mixta) {
		return this.partes.equals(mixta.partes); 
	}

}

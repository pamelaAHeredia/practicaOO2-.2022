package ar.edu.unlp.info.oo2.repaso_p1_ejercicio1;

public class Tweet {
	private String txt; 
	private Tweet origen; 
	
	public Tweet(String txt) {
		this.txt = txt;
		this.origen = null; 
	}
	
	public Tweet(String txt, Tweet origen) {
		this.txt = txt;
		this.origen = origen; 
	}

	public String getTxt() {
		return txt;
	}

	public Tweet getOrigen() {
		return origen;
	}
	
	
}

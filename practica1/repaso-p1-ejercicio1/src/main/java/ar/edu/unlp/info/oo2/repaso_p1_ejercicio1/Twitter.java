package ar.edu.unlp.info.oo2.repaso_p1_ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	private List<Usuario> usuarios; 
	
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>(); 
	}
	
	public boolean existeUsuario(String name) {
		return usuarios.stream().filter(u -> u.esNombre(name)).findFirst().orElse(null) != null; 
	}
	
	public Usuario nuevoUsuario(String name) {
		if (! existeUsuario(name)) {
			Usuario user = new Usuario(name); 
			usuarios.add(user); 
			return user; 
		}
		return null; 
	}
	
	public void eliminarUsuario(Usuario user) {
		if (usuarios.contains(user)) {
			user.eliminarTweets(); 
			usuarios.remove(user); 
		}
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	
	
}

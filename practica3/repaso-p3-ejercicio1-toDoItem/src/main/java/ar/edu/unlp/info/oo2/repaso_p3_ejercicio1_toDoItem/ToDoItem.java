package ar.edu.unlp.info.oo2.repaso_p3_ejercicio1_toDoItem;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {

	private String nombre;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin; 
	private Estado estado;
	private List<String> comentarios; 

	public ToDoItem(String name) {
		this.nombre = name;
		this.estado = new Pending();
		this.fechaInicio = null; 
		this.fechaFin = null; 
		this.comentarios = new ArrayList<String>(); 
	}

	public void start() {
		this.estado.start(this);
	}

	public void togglePause() {
		this.estado.togglePause(this);
	}

	public void finish() {
		this.estado.finish(this); 
	}

	public Duration workedTime() {
		if( fechaInicio != null && fechaFin != null) {
			return Duration.between(fechaInicio, fechaFin); 
		}
		if(fechaInicio != null && fechaFin == null) {
			return Duration.between(fechaInicio, LocalDateTime.now()); 
		}
		throw new RuntimeException("La tarea no ha sido iniciada");
	}

	public void addComment(String comment) {
		if (fechaFin != null) {
			comentarios.add(comment); 
		}
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public void setFechaInicio(LocalDateTime inicio) {
		this.fechaInicio = inicio; 
	}
	public void setFechaFin(LocalDateTime fin) {
		this.fechaFin = fin; 
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public Estado getEstado() {
		return estado;
	}
	

}

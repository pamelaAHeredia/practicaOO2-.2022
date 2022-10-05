package ar.edu.unlp.info.oo2.repaso_p3_ejercicio1_toDoItem;

import java.time.LocalDateTime;

public class Pending extends Estado{
	
	public Pending() {
		super.nombre = "pending"; 
	}
	
	public void start(ToDoItem todoitem) {
		todoitem.setEstado(new InProgress());
		todoitem.setFechaInicio(LocalDateTime.now());
	}
	
}

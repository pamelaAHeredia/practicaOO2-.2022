package ar.edu.unlp.info.oo2.repaso_p3_ejercicio1_toDoItem;

import java.time.LocalDateTime;

public class Paused extends Estado{
	
	public Paused() {
		super.nombre = "paused"; 
	}

	public void togglePause(ToDoItem todoitem) {
    	todoitem.setEstado(new InProgress());
    }
	
	public void finish(ToDoItem todoitem) {
		todoitem.setEstado(new Finished());
		todoitem.setFechaFin(LocalDateTime.now());
	}
}

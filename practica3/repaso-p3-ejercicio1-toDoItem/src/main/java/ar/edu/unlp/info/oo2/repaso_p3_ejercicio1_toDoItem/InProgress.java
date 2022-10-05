package ar.edu.unlp.info.oo2.repaso_p3_ejercicio1_toDoItem;

import java.time.LocalDateTime;

public class InProgress extends Estado{
	
	public InProgress() {
		super.nombre = "in progress"; 
	}
	
	public void togglePause(ToDoItem todoitem) {
    	todoitem.setEstado(new Paused());
    }
	
	public void finish(ToDoItem todoitem) {
		todoitem.setEstado(new Finished());
		todoitem.setFechaFin(LocalDateTime.now());
	}

}

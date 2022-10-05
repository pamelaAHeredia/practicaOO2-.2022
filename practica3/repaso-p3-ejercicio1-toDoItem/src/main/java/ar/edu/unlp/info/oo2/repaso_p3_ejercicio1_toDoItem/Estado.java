package ar.edu.unlp.info.oo2.repaso_p3_ejercicio1_toDoItem;

public abstract class Estado {
	protected String nombre; 
	
	public void start(ToDoItem todoitem) {}
	
	public void togglePause(ToDoItem todoitem) {
		throw new RuntimeException("La tarea no está en progreso.");
	}
	
	public void finish(ToDoItem todoitem) {}

	public String getNombre() {
		return nombre;
	}
	
}

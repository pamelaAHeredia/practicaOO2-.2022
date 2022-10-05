package ar.edu.unlp.info.oo2.repaso_p3_ejercicio1_toDoItem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {
	ToDoItem t1, t2, t3; 
	
	@BeforeEach
	public void setUp() {
		t1 = new ToDoItem("tarea 1"); 
		t2 = new ToDoItem("tarea 2"); 	
		t3 = new ToDoItem("tarea 3");
		
		t2.start();
		t3.start();
		t3.finish();
	}
	
	@Test
	public void start() {
		assertEquals("pending", t1.getEstado().getNombre()); 
		assertEquals("in progress", t2.getEstado().getNombre());
		assertEquals("finished", t3.getEstado().getNombre());
		
	}
	
	@Test
	public void togglePause() {
		assertThrows(RuntimeException.class,t1::togglePause); 
		assertThrows(RuntimeException.class,t3::togglePause);
		t2.togglePause(); 
		assertEquals("paused", t2.getEstado().getNombre()); 

	}
	
}

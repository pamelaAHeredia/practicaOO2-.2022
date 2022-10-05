package ar.edu.unlp.info.oo2.repaso_p4_ejercicio1_dataBaseAccess;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class DatabaseProxy implements DatabaseAccess{
	private DatabaseRealAccess realDb; 
	private String pass = "contrasenia"; 
	Scanner scan = new Scanner(System.in); 
	
	public DatabaseProxy(DatabaseRealAccess db) {
		this.realDb = db; 
	}
	
	public boolean checkAccess() {
		System.out.println("Ingrese la contraseña para autenticarse: ");
		String passwd = scan.next(); 
		if(! this.pass.contentEquals(passwd)) {
			throw new RuntimeException("Contraseña inválida.");
		}
		return true; 
	}
	
	public Collection<String> getSearchResults(String queryString) {
		if(!checkAccess()) {
			throw new RuntimeException("No tenés permiso para acceder.");
		}
		return realDb.getSearchResults(queryString);
	}
	
	@Override
	public int insertNewRow(List<String> rowData) {
		if(checkAccess()) {
			throw new RuntimeException("No tenés permiso para modificar esto.");
		}
		return realDb.insertNewRow(rowData);
	}

}

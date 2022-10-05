package ar.edu.unlp.info.oo2.repaso_p4_ejercicio1_dataBaseAccess;

import java.util.Collection;
import java.util.List;

public interface DatabaseAccess {
    Collection<String> getSearchResults(String queryString);

    /**
     * Retorna una colección de acuerdo al texto que posee "queryString"
     *
     * @param queryString
     * @return
     */
  
    /**
     * Realiza la inserción de nueva información en la base de datos y 
     * retorna el id que recibe la nueva inserción
     *
     * @param rowData
     * @return
     */
    public int insertNewRow(List<String> rowData);
}
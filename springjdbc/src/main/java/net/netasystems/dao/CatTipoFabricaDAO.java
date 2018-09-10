package net.netasystems.dao;

import java.util.List;

import net.netasystem.domain.CatTipoFabrica;

public interface CatTipoFabricaDAO {
	
	/**
	 * Método para realizar un conteo ()
	 * @return {@link Integer}
	 */
	Integer count();
	
	/**
	 * Método para insertar un registro en la base de datos 
	 * @param cat {@link CatTipoFabrica}
	 * @return Boolean si es exitosa la inserción 
	 */
	Boolean insert(CatTipoFabrica cat);
	
	/**
	 * Método para eliminar un registro de la base de datos 
	 * @param cat {@link CatTipoFabrica}
	 * @return Boolean si es exitosa la eliminación 
	 */
	Boolean delete(CatTipoFabrica cat);
	
	/**
	 * Método para actualizar un registro de la base de datos 
	 * @param cat {@link CatTipoFabrica}
	 * @return Boolean si es exitosa la actualización 
	 */
	Boolean update(CatTipoFabrica cat);
	
	/**
	 * Método para obtener la lista completa de los registros 
	 * @return {@link List} Lista con todos los registros 
	 */
	List<CatTipoFabrica> selectAll();
	
}

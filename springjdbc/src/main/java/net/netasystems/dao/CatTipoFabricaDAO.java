package net.netasystems.dao;

import java.util.List;

import net.netasystem.domain.CatTipoFabrica;

public interface CatTipoFabricaDAO {
	
	/**
	 * M�todo para realizar un conteo ()
	 * @return {@link Integer}
	 */
	Integer count();
	
	/**
	 * M�todo para insertar un registro en la base de datos 
	 * @param cat {@link CatTipoFabrica}
	 * @return Boolean si es exitosa la inserci�n 
	 */
	Boolean insert(CatTipoFabrica cat);
	
	/**
	 * M�todo para eliminar un registro de la base de datos 
	 * @param cat {@link CatTipoFabrica}
	 * @return Boolean si es exitosa la eliminaci�n 
	 */
	Boolean delete(CatTipoFabrica cat);
	
	/**
	 * M�todo para actualizar un registro de la base de datos 
	 * @param cat {@link CatTipoFabrica}
	 * @return Boolean si es exitosa la actualizaci�n 
	 */
	Boolean update(CatTipoFabrica cat);
	
	/**
	 * M�todo para obtener la lista completa de los registros 
	 * @return {@link List} Lista con todos los registros 
	 */
	List<CatTipoFabrica> selectAll();
	
}

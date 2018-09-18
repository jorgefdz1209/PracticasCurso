package net.netasystems.service;

import java.sql.SQLException;
import java.util.List;

import net.netasystems.dao.CatTipoFabricaDAO;
import net.netasystems.domain.CatTipoFabrica;

/**
 * @author Jesus Leyton
 * Servicio de la clase CatTipoFabricaDAO
 */
public class CatTipoFabricaService {
	
	private CatTipoFabricaDAO dao;
	
	/**
	 * constructor sin argumentos
	 * @throws ClassNotFoundException
	 * @throws SQLException excepcion tipo SQL
	 */
	public CatTipoFabricaService() throws ClassNotFoundException, SQLException {
		dao = new CatTipoFabricaDAO();
	}
	
	/**
	 * cierre de servicios
	 * @throws SQLException excepcion SQL
	 */
	public void close() throws SQLException {
		dao.destroy();
	}
	
	/**
	 * obtiene datos de la base de datos traidos en lista
	 * @return dao para obtener los datos
	 * @throws SQLException excepcion tipo SQL
	 */
	public List<CatTipoFabrica> getAllRecords() throws SQLException{
		return dao.getAllRecords();
}

}

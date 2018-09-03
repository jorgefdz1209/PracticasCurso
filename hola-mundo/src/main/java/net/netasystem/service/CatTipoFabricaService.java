package net.netasystem.service;

import java.sql.SQLException;
import java.util.List;

import net.netasystem.dao.CatTipoFabricaDAO;
import net.netasystem.domain.CatTipoFabrica;

public class CatTipoFabricaService {
	/**
	 * DAO para la conexión a base de datos 
	 */
	private CatTipoFabricaDAO dao;
	
	/**
	 * Creaci&oacute;n de los servicios con la inicialici&oacute;n de  
	 * @throws ClassNotFoundException if is don´t possible have the class 
	 * @throws SQLException if not possible get connection whit the database
	 */
	public CatTipoFabricaService() throws ClassNotFoundException, SQLException {
		dao=new CatTipoFabricaDAO();
	}
	
	/**
	 * Close connection of CatTipoFabricaDAO
	 * @throws SQLException if not possible get connection whit the database
	 */
	public void close() throws SQLException {
		dao.destroy();
	}
	
	/**
	 * Get all records of table in database 
	 * @return List contains all the records in the table in the database 
	 * @throws SQLException if not possible get connection whit the database
	 */
	public List<CatTipoFabrica> getAllRecords() throws SQLException{
		return dao.getAllRecords();
	}
}

package net.netasystem.service;

import java.sql.SQLException;
import java.util.List;

import net.netasystem.dao.CatTipoFabricaDAO;
import net.netasystem.domain.CatTipoFabrica;
/**
 * Servicio de manipulación de datos dentro de la base de datos (enmascaración) 
 * @author Netasystems/wJorge Saul
 *
 */
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
	
	/**
	 * add new record in database 
	 * @param record object type CatTipoFabrica for the arguments in the sentence sql 
	 * @throws SQLException if not possible get connection whit the database
	 */
	public void addRecord(CatTipoFabrica record) throws SQLException {
		dao.addRecord(record);
	}
	
	/**
	 * update record in the database  
	 * @param record for the parameters for update 
	 * @throws SQLException if not possible get connection whit the database
	 */
	public void updateRecord(CatTipoFabrica record) throws SQLException{
		dao.updateRecord(record);
	}
	
	/**
	 * delete record in the database 
	 * @param record for the parameters for delete 
	 * @throws SQLException if not possible get connection whit the database
	 */
	public void deleteRecord(CatTipoFabrica record) throws SQLException{
		dao.deleteRecord(record);
	}
}

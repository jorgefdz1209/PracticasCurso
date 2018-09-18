package net.netasystems.service;

import java.sql.SQLException;
import java.util.List;

import net.netasystems.dao.CatTipoFabricaDAO;
import net.netasystems.domain.CatTipoFabrica;

public class CatTipoFabricaService {
	
	private CatTipoFabricaDAO dao;
		
		public CatTipoFabricaService() throws ClassNotFoundException, SQLException {
			dao = new CatTipoFabricaDAO();
		}
		
		public void close() throws SQLException {
			dao.destroy();
		}
		
		public List<CatTipoFabrica> getAllRecords() throws SQLException{
			return dao.getAllRecords();
	}
		public void addRecord(CatTipoFabrica record) throws SQLException{
			
			dao.addRecord(record);
		}
		public String updateRecord(CatTipoFabrica record) throws SQLException {
			
			return dao.updateRecord(record);
		}

		
}

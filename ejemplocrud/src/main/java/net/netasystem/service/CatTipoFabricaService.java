package net.netasystem.service;

import java.sql.SQLException;
import java.util.List;

import net.netasystem.dao.CatTipoFabricaDAO;
import net.netasystem.domain.CatTipoFabrica;

public class CatTipoFabricaService {
	
	private CatTipoFabricaDAO dao;
	
	public CatTipoFabricaService() throws ClassNotFoundException, SQLException {
		dao=new CatTipoFabricaDAO();
	}
	public void cierra() throws SQLException {
		dao.destroy();
	}
	
	public List<CatTipoFabrica> getAllRecords() throws SQLException{
		return dao.getAllRecords();
	}
}

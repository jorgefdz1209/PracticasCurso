package net.netasystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.netasystem.domain.CatTipoFabrica;

public class CatTipoFabricaDAO {
	
	private Connection con;
	
	/**
	 * Constructor of the class CatFabricaDAO for the creation of connection of database
	 * @throws ClassNotFoundException if not possible get the class 
	 * @throws SQLException if not possible get connection whit the database 
	 */
	public CatTipoFabricaDAO() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(  
				"jdbc:oracle:thin:@198.23.75.98:1521:neta","EGLOBAL","egl0b4l");  
	}
	/**
	 * method for destroy the connection whit database 
	 * @throws SQLException if not possible get connection whit the database
	 */
	public void destroy() throws SQLException {
		con.close();
	}
	
	/**
	 * To get all the records in the table inside of database 
	 * @return ArrayList contains all records of the table
	 * @throws SQLException if not possible get connection whit the database
	 */
	public List<CatTipoFabrica> getAllRecords() throws SQLException{
		List<CatTipoFabrica> lista = new ArrayList<CatTipoFabrica>();
		String sql = "select IDCATTIPOFABRICA, NOMBRE, ESTATUS, FECHAMODIFICACION, IDUSUARIO from CAT_TIPO_FABRICA";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) { // while rs have a result add to list lista 
			long idCatTipoFabrica = rs.getLong("IDCATTIPOFABRICA");
			String nombre = rs.getString("NOMBRE");
			String estatusString = rs.getString("ESTATUS");
			Date fechaModificacion = rs.getDate("FECHAMODIFICACION");
			Long idUsuario = rs.getLong("IDUSUARIO");
			//little fix for casting String at char
			Character status = null;
			if(estatusString != null && !estatusString.isEmpty()) { // if statusString isn´t empty or null cast a Charater else do nothing 
				char est = estatusString.charAt(0);
				status = est;
			}
			CatTipoFabrica registro = new CatTipoFabrica(idCatTipoFabrica, nombre, status, fechaModificacion, idUsuario);
			lista.add(registro);
		}
		rs.close();
		stmt.close();
		return lista;
	}
	
}

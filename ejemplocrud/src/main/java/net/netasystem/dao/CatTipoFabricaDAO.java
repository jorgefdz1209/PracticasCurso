package net.netasystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import net.netasystem.domain.CatTipoFabrica;

/**
 * Provides the methods of interaction with the database
 * @author Jorge Saul 
 *
 */
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
	
	/**
	 * Update record of the database
	 * @param record Object type CatTipoFabrica 
	 * @return int the number of row update or 0 if the SQL sentences is without results 
	 * @throws SQLException if not possible get connection whit the database
	 */
	public int updateRecord(CatTipoFabrica record) throws SQLException {
		String sql = "UPDATE CAT_TIPO_FABRICA SET NOMBRE = ?,ESTATUS= ?, FECHAMODIFICACION = ?, IDUSUARIO = ? WHERE IDCATTIPOFABRICA=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, record.getNombre());
		pstmt.setString(2, record.getStatus()+"");//for cast character to into String 
		pstmt.setDate(3, (java.sql.Date) record.getFechaDeModificacion()); // little fix for cast a date to date type sql
		pstmt.setLong(4,record.getIdUsuario());
		pstmt.setLong(5, record.getIdTipoFabrica());
		int x =pstmt.executeUpdate();
		pstmt.close();
		return x;	
	}
	/**
	 * add a new record in the database 
	 * @param record Object type CatTipoFabrica 
	 * @return int the number of row update or 0 if the SQL sentences is without results
	 * @throws SQLException if not possible get connection whit the database
	 */
	public int addRecord(CatTipoFabrica record) throws SQLException {
		String sql = "INSERT INTO cat_tipo_fabrica VALUES (?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setLong(1, record.getIdTipoFabrica());
		pstmt.setString(2, record.getNombre());
		pstmt.setString(3, record.getIdTipoFabrica()+"");//for cast character to into String
		pstmt.setDate(4, (java.sql.Date) record.getFechaDeModificacion());// little fix for cast a date to date type sql
		pstmt.setLong(5, record.getIdUsuario());
		int x = pstmt.executeUpdate();
		pstmt.close();
		return x;
	}
	
	/**
	 * Delete a record in the database 
	 * @param record Object type CatTipoFabrica
	 * @return int the number of row update or 0 if the SQL sentences is without results
	 * @throws SQLException if not possible get connection whit the database
	 */
	public int deleteRecord(CatTipoFabrica record) throws SQLException {
		String sql ="DELETE FROM CAT_TIPO_FABRICA WHERE IDCATTIPOFABRICA = ?";
		int x =0;
		if(!checkIdUse(record.getIdTipoFabrica())) {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setLong(1, record.getIdTipoFabrica());
			x = pstmt.executeUpdate();
			pstmt.close();
		}
		return x;
	}
	
	/**
	 * Method for check if exist an Id into the table Cat_Tipo_Fabrica
	 * @param id Long for check if exist into the table 
	 * @return boolean true if exist false if does'nt exist 
	 * @throws SQLException if not possible get connection whit the database
	 */
	public boolean checkIdUse (Long id) throws SQLException {
		String sql = "Select 1 from CAT_TIPO_FABRICA WHERE IDCATTIPOFABRICA = ?";
		PreparedStatement ps = con.prepareStatement(sql);
	    ps.setLong(1, id);
	    ResultSet rs = ps.executeQuery();
		return rs.next();
	}
}

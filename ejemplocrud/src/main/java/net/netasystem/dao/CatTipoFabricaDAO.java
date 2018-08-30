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
	 * Constructor of the class CatFabricaDAO 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public CatTipoFabricaDAO() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(  
				"jdbc:oracle:thin:@198.23.75.98:1521:neta","EGLOBAL","egl0b4l");  
	}
	
	public void destroy() throws SQLException {
		con.close();
	}
	
	public List<CatTipoFabrica> getAllRecords() throws SQLException{
		List<CatTipoFabrica> lista = new ArrayList<CatTipoFabrica>();
		String sql = "select IDCATTIPOFABRICA, NOMBRE, ESTATUS, FECHAMODIFICACION, IDUSUARIO from CAT_TIPO_FABRICA";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			long idCatTipoFabrica = rs.getLong("IDCATTIPOFABRICA");
			String nombre = rs.getString("NOMBRE");
			String estatusString = rs.getString("ESTATUS");
			Date fechaModificacion = rs.getDate("FECHAMODIFICACION");
			Long idUsuario = rs.getLong("IDUSUARIO");
			//Arreglando el char de estatus
			Character status = null;
			if(estatusString != null && !estatusString.isEmpty()) {
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
	
	public int updateRecord(CatTipoFabrica record) throws SQLException {
		String sql = "UPDATE CAT_TIPO_FABRICA SET NOMBRE = ?,ESTATUS= ?, FECHAMODIFICACION = ?, IDUSUARIO = ? WHERE IDCATTIPOFABRICA=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, record.getNombre());
		pstmt.setString(2, record.getStatus()+"");
		pstmt.setDate(3, (java.sql.Date) record.getFechaDeModificacion());
		pstmt.setLong(4,record.getIdUsuario());
		pstmt.setLong(5, record.getIdTipoFabrica());
		int x =pstmt.executeUpdate();
		pstmt.close();
		return x;	
	}
	
	public int addRecord(CatTipoFabrica record) throws SQLException {
		String sql = "INSERT INTO cat_tipo_fabrica VALUES (?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setLong(1, record.getIdTipoFabrica());
		pstmt.setString(2, record.getNombre());
		pstmt.setString(3, record.getIdTipoFabrica()+"");
		pstmt.setDate(4, (java.sql.Date) record.getFechaDeModificacion());
		pstmt.setLong(5, record.getIdUsuario());
		int x = pstmt.executeUpdate();
		pstmt.close();
		return x;
	}
	
	public int deleteRecord(CatTipoFabrica record) throws SQLException {
		String sql ="DELETE FROM CAT_TIPO_FABRICA WHERE IDCATTIPOFABRICA = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setLong(1, record.getIdTipoFabrica());
		int x = pstmt.executeUpdate();
		return x;
	}
}

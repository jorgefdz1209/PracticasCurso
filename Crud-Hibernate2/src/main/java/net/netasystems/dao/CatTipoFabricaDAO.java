package net.netasystems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.netasystems.domain.CatTipoFabrica;

/**
 * @author Jesus Leyton
 * La clase realiza la conexion a la base de datos 
 * y contienes metodos para realizar CRUD 
 */
public class CatTipoFabricaDAO {
private Connection con;
	
	/**
	 * Conexion a la base de datos
	 * @throws ClassNotFoundException
	 * @throws SQLException excepcion de tipo SQL
	 */
	public CatTipoFabricaDAO() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(  
				"jdbc:oracle:thin:@198.23.75.98:1521:neta","EGLOBAL","egl0b4l");  
	}
	
	/**
	 * @throws SQLException excepcion de tipo SQL
	 * el metodo cierra la conexion
	 */
	public void destroy() throws SQLException {
		con.close();
	}
	
	/**
	 * El metodo hace un Select de las tabla CAT_TIPO_FABRICA
	 * 
	 * @return regresa una lista de tipo CatTipoFabrica
	 * @throws SQLException excepcion de tipo SQL
	 * 
	 */
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

}

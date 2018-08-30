package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionDB {
		
		private final String DRIVER = "oracle.jdbc.driver.OracleDriver";
		private final String URL = "jdbc:oracle:thin:@198.23.75.98:1521:neta";
		private final String USER = "EGLOBAL";
		private final String PASS = "egl0b4l";
		private Connection con;
		
		/**
		 * 
		 * @return
		 * @throws ClassNotFoundException
		 * @throws SQLException
		 */
		public Connection getConection() throws ClassNotFoundException, SQLException {
			Class.forName(DRIVER);
			return DriverManager.getConnection(URL, USER, PASS);
		} 
}


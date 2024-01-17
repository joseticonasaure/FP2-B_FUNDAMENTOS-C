package fp2_23b;

import java.sql.*;

public class Consulta {
	public static Connection conec;
	
	Consulta() {
	}
	public static Connection getConnection() {
		try {
			if (conec == null) {
				Class.forName("com.mysql.jdbc.Driver");
				conec = DriverManager.getConnection("jbdc:mysql://localhost", "fp2", "1234");
			}
			return conec;
		} catch (Exception e) {
			System.out.println("conexion fallida");
		}
	}
}

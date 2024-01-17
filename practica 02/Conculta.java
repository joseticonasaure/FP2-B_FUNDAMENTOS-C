package fp2_23b;

import java.sql.*;

public class Consulta {
    private static Connection conec;

    private Consulta() {
    }

    public static Connection getConnection() {
        try {
            if (conec == null ) {
                Class.forName("com.mysql.jdbc.Driver");
                conec = DriverManager.getConnection("jdbc:mysql://localhost/fp2", "root", "1234");
            }
            return conec;
        } catch (Exception e) {
            System.out.println("Conexion fallida");
            throw new RuntimeException("Error al establecer la conexión a la base de datos");
        }
    }

    public static Consulta getInstance() {
        return new Consulta();
    }
}

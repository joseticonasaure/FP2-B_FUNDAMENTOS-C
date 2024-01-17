package fp2_23b;

public class Conexion {
	public static void main(String[] args) {
		Consulta sql = Consulta.getConnection();
		System.out.println("Consulta exitosa");
	}
}

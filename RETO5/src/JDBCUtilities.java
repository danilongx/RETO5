import java.sql.*;

public class JDBCUtilities {
    // Atributos de clase para gestión de conexión con la base de datos
    private static final String UBICACION_BD = "ProyectosConstruccion.db";
    public static Connection getConnection() throws Exception {
    String url = "jdbc:sqlite:" + UBICACION_BD;
    return DriverManager.getConnection(url);
    }
}
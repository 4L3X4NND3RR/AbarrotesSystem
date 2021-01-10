package Utilidades;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionBD {
    
    DatosConexion dc = new DatosConexion();
    
    public static ConexionBD instance;
    private Connection conexion;
    
    public String NameServer = dc.getNameServer();
    public String Puerto = dc.getPuerto();
    public String NombreBD = dc.getNombreBD();
    public String Username = dc.getUsername();
    public String Password = dc.getPassword();
    public String URL = "jdbc:mysql://" + NameServer + ":" + Puerto + "/" + NombreBD;
    
    private ConexionBD() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, Username, Password);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public synchronized static ConexionBD comprobarEstado() {
        if (instance == null) {
            instance = new ConexionBD();
        }
        return instance;
    }

    public Connection getConection() {
        return conexion;
    }
    
    public void cerrarConexion() {
        ConexionBD.instance = null;
    }
}

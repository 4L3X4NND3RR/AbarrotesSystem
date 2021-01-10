package Utilidades;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Validaciones {
    private static final ConexionBD conexionbd = ConexionBD.comprobarEstado();
    
    public Boolean ValidarVacio(JPanel j){ 
        boolean band = false;
        for (Component c : j.getComponents()) {
            if (c instanceof JTextField) {
                JTextField textField = new JTextField("");
                textField = (JTextField)c;
                String texto = textField.getText();
                if (texto.equals("")) {
                    band = true;
                    break;
                }
            }
        }
        if (band != false) {
            JOptionPane.showMessageDialog(null, "No Pueden Haber Campos Vacios","Informacion",JOptionPane.INFORMATION_MESSAGE);
        }
        return band;
    }
    public void limitarCaracteres(KeyEvent evt, int limite, JTextField field){
        if (field.getText().length() == limite) evt.consume(); 
    }
    
    public void ValidarNumeros(KeyEvent evt){
        char c = evt.getKeyChar();
        if(c < '0' || c > '9') evt.consume();
    }
    
    public void ValidarNit(KeyEvent evt){
        char c = evt.getKeyChar();
        if (c != '-') {
            if(c < '0' || c > '9') evt.consume();
        }
    }
    
    public void ValidarDecimales(KeyEvent evt){
        char c = evt.getKeyChar();
        if (c != '.') {
            if(c < '0' || c > '9') evt.consume();
        }
    }
    
    public Boolean ValidarCorreo(String correo){
        boolean band = false;
        
        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
 
        // El email a validar 
        Matcher mather = pattern.matcher(correo);
 
        if(mather.find()) {
            band = true;
        } else {
            band = false;
            JOptionPane.showMessageDialog(null, "Correo electronico no valido","Información",JOptionPane.INFORMATION_MESSAGE);
        }
        
        return band;
    }
    
    public Boolean ValidarContrasenna(char[] con1, char[] con2){
        String pass1 = "";
        String pass2 = "";
        
        for (int i = 0; i < con1.length; i++) {
            pass1 += con1[i];
        }
        
        for (int i = 0; i < con2.length; i++) {
            pass2 += con2[i];
        }
        
        if (pass1.equals(pass2)) {
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden","Información",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
    
    public Boolean existeCorreo(String Correo){
        try{
            String query = "SELECT * FROM Usuario WHERE CorreoElectronico = ?";
            PreparedStatement consulta = conexionbd.getConection().prepareStatement(query);
            consulta.setString(1, Correo);
            ResultSet resultado = consulta.executeQuery();
            if (resultado.next()) {
                resultado.close();
                consulta.close();
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Algo salio mal: "+e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            return false;
        }finally{
            conexionbd.cerrarConexion();
        }
    }
    
    public Boolean existenUsuarios(){
        try{
            String query = "SELECT * FROM Usuario";
            PreparedStatement consulta = conexionbd.getConection().prepareStatement(query);
            ResultSet resultado = consulta.executeQuery();
            if (resultado.next()) {
                resultado.close();
                consulta.close();
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Algo salio mal: "+e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            return false;
        }finally{
            conexionbd.cerrarConexion();
        }
    }
}

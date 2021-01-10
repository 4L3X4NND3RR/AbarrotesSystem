package Utilidades;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class Utilidades {
    DatosCorreo c = new DatosCorreo();
    
    public String generarCodigo(){
        Integer Codigo = (int)(1000000 * Math.random());
        return Codigo.toString();
    }
    
    public void enviarCorreo(String Codigo, JDialog dialogo, String Correo){
        c.setContrasenia("bxbskmzomfrswkgk");
        c.setUsuarioCorreo("abarrotesystem@gmail.com");
        c.setAsunto("Verificación Del Correo");
        c.setMensaje("Tu codigo de verificacion es: "+Codigo);
        c.setDestino(Correo.trim());
        ControladorCorreo controlador = new ControladorCorreo();
        if (controlador.enviarCorreo(c)) {
            JOptionPane.showMessageDialog(null, "Se ha enviado un codigo de verificacion a "+Correo,"Información",JOptionPane.INFORMATION_MESSAGE);
            dialogo.setLocationRelativeTo(null);
            dialogo.setSize(390, 210);
            dialogo.setVisible(true);
        }
    }
    
    public void abrirPDF(String ruta,String NombrePDF){
        try {
            File directorio = new File("temp"); //Creas un nuevo directorio a nivel de tu jar.
            directorio.mkdirs();
            directorio.setWritable(true);
            //copias la direccion
            String archivo = directorio.getCanonicalPath() + "/" + NombrePDF;
            //nuevo archivo en esa direccion
            File temp = new File(archivo);
            InputStream is = this.getClass().getResourceAsStream(ruta);
            FileOutputStream archivoDestino = new FileOutputStream(temp);
            FileWriter fw = new FileWriter(temp);
            byte[] buffer = new byte[512 * 1024];
            //lees el archivo hasta que se acabe...
            int nbLectura;
            while ((nbLectura = is.read(buffer)) != -1) {
                archivoDestino.write(buffer, 0, nbLectura);
            }
            //cierras el archivo,el inputS y el FileW
            fw.close();
            archivoDestino.close();
            is.close();
            //abres el archivo temporal
            Desktop.getDesktop().open(temp);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "error al abrir el rchivo");
        }
    }
}

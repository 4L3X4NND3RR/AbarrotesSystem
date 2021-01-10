
package Venta;

import Utilidades.ConexionBD;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class GenerarFactura {
    private static final ConexionBD conexionbd = ConexionBD.comprobarEstado();
    
    public void Factura(int NumFac){
        try {
            JasperReport factura = (JasperReport) JRLoader.loadObject("FacturaElectronica.jasper");
            Map parametro  = new HashMap();
            parametro.put("idFactura", NumFac);
            JasperPrint jprint = JasperFillManager.fillReport(factura,parametro,conexionbd.getConection());
            JasperViewer jv = new JasperViewer(jprint,false);
            jv.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/IconoSistema.png")).getImage());
            jv.setTitle("Factura");
            jv.setVisible(true);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal: "+e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }catch(Exception exc){
            JOptionPane.showMessageDialog(null, "Algo salio mal: "+exc.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }finally{
            conexionbd.cerrarConexion();
        }
    }
}

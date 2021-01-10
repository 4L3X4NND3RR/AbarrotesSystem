package Consultas;

import Instalacion.DatosUsuario;
import Reportes.ListadoVentas;
import Utilidades.empresaLogo;
import Utilidades.ConexionBD;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class VentasDia extends javax.swing.JInternalFrame {

    private static final ConexionBD conexionbd = ConexionBD.comprobarEstado();

    DatosUsuario du;

    DefaultTableModel modelo;
    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
    Date FechaHoy = Date.valueOf(LocalDate.now());
    String Fecha = formato.format(FechaHoy);
    String Where = "WHERE Fecha = '" + Fecha + "'";
    private static int listadopor = 0;
    DecimalFormat formatodecimal = new DecimalFormat("#.00");

    public VentasDia() {
        initComponents();
    }

    public VentasDia(DatosUsuario du) {
        this.du = du;
        initComponents();
        cargarDatos(Where);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jpanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDatos = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();
        lblCantidadVentas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        btnImprimir = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setTitle("Consulta Ventas");

        jpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        jtblDatos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return false;
            }
        };
        jtblDatos.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jtblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtblDatos.setFocusable(false);
        jtblDatos.getTableHeader().setReorderingAllowed(false);
        jtblDatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtblDatosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtblDatos);

        jpanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 860, 400));

        lblTotal.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCantidadVentas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblCantidadVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidadVentas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Cantidad de Ventas:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Total de Dinero Reunido:");
        jLabel3.setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Listar por Dia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N

        jDateChooser1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Listar por Mes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N

        jMonthChooser1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMonthChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jMonthChooser1PropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMonthChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jMonthChooser1PropertyChange(evt);
            }
        });

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCantidadVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCantidadVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnImprimir))
                    .addComponent(jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        listarPorFecha();
        listadopor = 1;
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jMonthChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jMonthChooser1PropertyChange
        listarPorMes();
        listadopor = 2;
    }//GEN-LAST:event_jMonthChooser1PropertyChange

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        imprimir();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void jtblDatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtblDatosKeyPressed
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_L) {
            imprimir();
        }
    }//GEN-LAST:event_jtblDatosKeyPressed

    private void cargarDatos(String Where) {
        try {
            lblCantidadVentas.setText("0");
            lblTotal.setText("0");
            modelo = new DefaultTableModel();
            jtblDatos.setModel(modelo);
            String query = "SELECT * FROM Factura " + Where;
            PreparedStatement Consulta = conexionbd.getConection().prepareStatement(query);
            try (ResultSet rs = Consulta.executeQuery()) {
                ResultSetMetaData rsMD = rs.getMetaData();
                int cantidadCol = rsMD.getColumnCount();
                double DineroReunido = 0;
                
                modelo.addColumn("No. Factura");
                modelo.addColumn("DPI Usuario");
                modelo.addColumn("Usuario");
                modelo.addColumn("NIT");
                modelo.addColumn("Cliente");
                modelo.addColumn("Fecha");
                modelo.addColumn("Efectivo");
                modelo.addColumn("Cambio");
                modelo.addColumn("Total Sin IVA");
                modelo.addColumn("Total");
                
                int[] anchos = {10, 10, 20, 10, 20, 50, 10, 10, 15, 8};
                for (int i = 0; i < jtblDatos.getColumnCount(); i++) {
                    jtblDatos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
                }
                
                while (rs.next()) {
                    Object[] filas = new Object[cantidadCol];
                    for (int i = 0; i < cantidadCol; i++) {
                        filas[i] = rs.getObject(i + 1);
                    }
                    modelo.addRow(filas);
                }
                
                if (jtblDatos.getRowCount() > 0) {
                    for (int i = 0; i < jtblDatos.getRowCount(); i++) {
                        DineroReunido += Double.parseDouble(jtblDatos.getValueAt(i, 9).toString());
                    }
                    lblTotal.setText("" + formatodecimal.format(DineroReunido));
                    lblCantidadVentas.setText("" + jtblDatos.getRowCount());
                }
                rs.close();
                Consulta.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            conexionbd.cerrarConexion();
        }
    }
    
    private void imprimir(){
        List lista = new ArrayList();
        for (int i = 0; i < jtblDatos.getRowCount(); i++) {
            String numfactura = jtblDatos.getValueAt(i, 0).toString();
            String dpi = jtblDatos.getValueAt(i, 1).toString();
            String nombreusuario = jtblDatos.getValueAt(i, 2).toString();
            String nit = jtblDatos.getValueAt(i, 3).toString();
            String nombrecliente = jtblDatos.getValueAt(i, 4).toString();
            String fecha = jtblDatos.getValueAt(i, 5).toString();
            String efectivo = jtblDatos.getValueAt(i, 6).toString();
            String cambio = jtblDatos.getValueAt(i, 7).toString();
            String totalsiniva = jtblDatos.getValueAt(i, 8).toString();
            String total = jtblDatos.getValueAt(i, 9).toString();
            ListadoVentas lv = new ListadoVentas(numfactura, dpi, nombreusuario, nit, nombrecliente, fecha, efectivo, cambio, totalsiniva, total);
            lista.add(lv);
        }
        try {
            JasperReport reporte = (JasperReport) JRLoader.loadObject("Ventas.jasper");
            Map parametro = new HashMap();
            if (listadopor == 1) {
                Fecha = formato.format(jDateChooser1.getDate());
                parametro.put("filtradopor", "Fecha " + Fecha);
            } else if (listadopor == 2) {
                parametro.put("filtradopor", "Mes de " + saberMes(jMonthChooser1.getMonth()));
            }
            parametro.put("cantidadlventas", lblCantidadVentas.getText());
            parametro.put("dineroreunido", lblTotal.getText());
            parametro.put("logo", empresaLogo.getLogo().getImage());
            JRBeanCollectionDataSource Datos = new JRBeanCollectionDataSource(lista);
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, Datos);
            JasperViewer jv = new JasperViewer(jprint,false);
            jv.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/IconoSistema.png")).getImage());
            jv.setTitle("Listado de Ventas");
            jv.setVisible(true);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void listarPorFecha() {
        try {
            String FechaDateChooser = formato.format(jDateChooser1.getDate());
            Where = "WHERE Fecha = '" + FechaDateChooser + "'";
            cargarDatos(Where);
        } catch (Exception e) {
        }
    }

    public void listarPorMes() {
        try {
            int Anio = LocalDate.now().getYear();
            int Mes = jMonthChooser1.getMonth() + 1;
            Where = "WHERE MONTH(Fecha) = '" + Mes + "' AND YEAR(Fecha) = '" + Anio + "'";
            cargarDatos(Where);
        } catch (Exception e) {
        }
    }

    private String saberMes(int mes) {
        String Mes = "";
        mes += 1;
        switch (mes) {
            case 1:
                Mes = "Enero";
                break;
            case 2:
                Mes = "Febrero";
                break;
            case 3:
                Mes = "Marzo";
                break;
            case 4:
                Mes = "Abril";
                break;
            case 5:
                Mes = "Mayo";
                break;
            case 6:
                Mes = "Junio";
                break;
            case 7:
                Mes = "Julio";
                break;
            case 8:
                Mes = "Agosto";
                break;
            case 9:
                Mes = "Septiembre";
                break;
            case 10:
                Mes = "Octubre";
                break;
            case 11:
                Mes = "Noviembre";
                break;
            case 12:
                Mes = "Diciembre";
                break;
        }
        return Mes;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpanel;
    private javax.swing.JTable jtblDatos;
    private javax.swing.JLabel lblCantidadVentas;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}

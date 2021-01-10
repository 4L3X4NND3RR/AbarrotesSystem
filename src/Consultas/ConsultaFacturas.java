package Consultas;

import Reportes.ListadoFacturas;
import Utilidades.ConexionBD;
import Utilidades.Validaciones;
import Utilidades.empresaLogo;
import Venta.GenerarFactura;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
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

public class ConsultaFacturas extends javax.swing.JInternalFrame {

    Validaciones v = new Validaciones();
    ConexionBD conexionbd = ConexionBD.comprobarEstado();

    String Where = "";
    DefaultTableModel modelo;

    public ConsultaFacturas() {
        initComponents();
        cargarDatos(Where);
        jtblDatos.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDatos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        cboBuscarPor = new javax.swing.JComboBox<>();
        chkFecha = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnImprimirListado = new javax.swing.JButton();
        btnImprimirFactura = new javax.swing.JButton();
        btnListarTodo = new javax.swing.JButton();

        setClosable(true);
        setTitle("Consulta Facturas");

        jpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Buscar:");
        jLabel1.setToolTipText("");
        jpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        txtBuscar.setBackground(new java.awt.Color(244, 244, 244));
        txtBuscar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtBuscar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtBuscar.setBorder(null);
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });
        jpanel.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 270, 30));
        jpanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 270, 10));

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
        jtblDatos.getTableHeader().setReorderingAllowed(false);
        jtblDatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtblDatosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtblDatos);

        jpanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 860, 330));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Buscar Por", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboBuscarPor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cboBuscarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No. Factura", "NIT", "Nombre de Cliente", "DPI Usuario", "Nombre de Usuario" }));
        cboBuscarPor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboBuscarPorItemStateChanged(evt);
            }
        });
        jPanel4.add(cboBuscarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, -1));

        chkFecha.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        chkFecha.setText("Combinar con fecha");
        jPanel4.add(chkFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Listar  Por Fecha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDateChooser1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 160, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N

        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnImprimirListado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnImprimirListado.setText("Imprimir Listado");
        btnImprimirListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirListadoActionPerformed(evt);
            }
        });

        btnImprimirFactura.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnImprimirFactura.setText("Imprimir Factura");
        btnImprimirFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirFacturaActionPerformed(evt);
            }
        });

        btnListarTodo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnListarTodo.setText("Listar Todo");
        btnListarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnImprimirFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImprimirListado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnImprimirListado)
                .addGap(18, 18, 18)
                .addComponent(btnImprimirFactura)
                .addGap(18, 18, 18)
                .addComponent(btnListarTodo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        int Posicion = cboBuscarPor.getSelectedIndex();
        switch (Posicion) {
            case 0:
                v.ValidarNumeros(evt);
                v.limitarCaracteres(evt, 10, txtBuscar);
                break;
            case 1:
                v.ValidarNit(evt);
                v.limitarCaracteres(evt, 9, txtBuscar);
                break;
            case 2:
                v.limitarCaracteres(evt, 50, txtBuscar);
                break;
            case 3:
                v.ValidarNumeros(evt);
                v.limitarCaracteres(evt, 10, txtBuscar);
                break;
            case 4:
                v.limitarCaracteres(evt, 50, txtBuscar);
                break;
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            if (chkFecha.isSelected() && jDateChooser1.getDate() != null) {
                SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                String Fecha = formato.format(jDateChooser1.getDate());
                switch (cboBuscarPor.getSelectedIndex()) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "Combinar con fecha no aplica para buscar por No. Factura", "Información", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 1:
                        Where = "WHERE idCliente LIKE '%" + txtBuscar.getText().trim() + "%' AND Fecha = '" + Fecha + "'";
                        break;
                    case 2:
                        Where = "WHERE Nombre LIKE '%" + txtBuscar.getText().trim() + "%' AND Fecha = '" + Fecha + "'";
                        break;
                    case 3:
                        Where = "WHERE idUsuario LIKE '%" + txtBuscar.getText().trim() + "%' AND Fecha = '" + Fecha + "'";
                        break;
                    case 4:
                        Where = "WHERE NombreUsuario LIKE '%" + txtBuscar.getText().trim() + "%' AND Fecha = '" + Fecha + "'";
                        break;
                }
                cargarDatos(Where);
            } else {
                switch (cboBuscarPor.getSelectedIndex()) {
                    case 0:
                        Where = "WHERE idFactura = '" + txtBuscar.getText().trim() + "'";
                        break;
                    case 1:
                        Where = "WHERE idCliente LIKE '%" + txtBuscar.getText().trim() + "%'";
                        break;
                    case 2:
                        Where = "WHERE Nombre LIKE '%" + txtBuscar.getText().trim() + "%'";
                        break;
                    case 3:
                        Where = "WHERE idUsuario LIKE '%" + txtBuscar.getText().trim() + "%'";
                        break;
                    case 4:
                        Where = "WHERE NombreUsuario LIKE '%" + txtBuscar.getText().trim() + "%'";
                        break;
                }
                cargarDatos(Where);
            }
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        listarPorFecha();
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void cboBuscarPorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboBuscarPorItemStateChanged
        txtBuscar.setText(null);
        txtBuscar.requestFocus();
    }//GEN-LAST:event_cboBuscarPorItemStateChanged

    private void btnListarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTodoActionPerformed
        Where = "";
        cargarDatos(Where);
    }//GEN-LAST:event_btnListarTodoActionPerformed

    private void btnImprimirListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirListadoActionPerformed
        imprimirListado();
    }//GEN-LAST:event_btnImprimirListadoActionPerformed

    private void btnImprimirFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirFacturaActionPerformed
        imprimirFactura();
    }//GEN-LAST:event_btnImprimirFacturaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarRegistro();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jtblDatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtblDatosKeyPressed
        switch(evt.getKeyChar()){
            case KeyEvent.VK_DELETE:
                eliminarRegistro();
                break;
        }
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_L) {
            imprimirListado();
        }else if(evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_F){
            imprimirFactura();
        }
    }//GEN-LAST:event_jtblDatosKeyPressed
    private void eliminarRegistro(){
        if (jtblDatos.getSelectedRowCount() == 1) {
            int confirmado = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar la factura?", "Eliminar Factura", 0, JOptionPane.QUESTION_MESSAGE);
            if (confirmado == 0) {
                try {
                    int NumFac = Integer.parseInt(jtblDatos.getValueAt(jtblDatos.getSelectedRow(), 0).toString());
                    String query = "DELETE FROM Factura WHERE idFactura = '" + NumFac + "'";
                    try (PreparedStatement consulta = conexionbd.getConection().prepareStatement(query)) {
                        consulta.execute();
                        modelo.removeRow(jtblDatos.getSelectedRow());
                        consulta.close();
                    }
                    JOptionPane.showMessageDialog(null, "Factura eliminada exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void imprimirListado(){
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
            ListadoFacturas lf = new ListadoFacturas(numfactura, dpi, nombreusuario, nit, nombrecliente, fecha, efectivo, cambio, totalsiniva, total);
            lista.add(lf);
        }
        try {
            JasperReport reporte = (JasperReport) JRLoader.loadObject("Facturas.jasper");
            Map parametro = new HashMap();
            parametro.put("buscadopor", cboBuscarPor.getSelectedItem());
            parametro.put("logo", empresaLogo.getLogo().getImage());
            JRBeanCollectionDataSource Datos = new JRBeanCollectionDataSource(lista);
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, Datos);
            JasperViewer jv = new JasperViewer(jprint,false);
            jv.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/IconoSistema.png")).getImage());
            jv.setTitle("Listado de Facturas");
            jv.setVisible(true);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void imprimirFactura(){
        if (jtblDatos.getSelectedRowCount() == 1) {
            int NumFac = Integer.parseInt(jtblDatos.getValueAt(jtblDatos.getSelectedRow(), 0).toString());
            GenerarFactura gf = new GenerarFactura();
            gf.Factura(NumFac);
        }
    }
    
    private void cargarDatos(String Where) {
        try {
            modelo = new DefaultTableModel();
            jtblDatos.setModel(modelo);
            String query = "SELECT * FROM Factura " + Where;
            try (PreparedStatement Consulta = conexionbd.getConection().prepareStatement(query)) {
                ResultSet rs = Consulta.executeQuery();
                ResultSetMetaData rsMD = rs.getMetaData();
                int cantidadCol = rsMD.getColumnCount();
                
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
                rs.close();
                Consulta.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            conexionbd.cerrarConexion();
        }
    }

    public void listarPorFecha() {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            String Fecha = formato.format(jDateChooser1.getDate());
            Where = "WHERE Fecha LIKE '%" + Fecha + "%'";
            cargarDatos(Where);
        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnImprimirFactura;
    private javax.swing.JButton btnImprimirListado;
    private javax.swing.JButton btnListarTodo;
    private javax.swing.JComboBox<String> cboBuscarPor;
    private javax.swing.JCheckBox chkFecha;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel jpanel;
    private javax.swing.JTable jtblDatos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}

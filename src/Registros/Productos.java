package Registros;

import Utilidades.ConexionBD;
import Utilidades.Validaciones;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Productos extends javax.swing.JInternalFrame {

    Validaciones c = new Validaciones();
    private static final ConexionBD conexionbd = ConexionBD.comprobarEstado();
    Date FechaActual = Date.valueOf(LocalDate.now());

    public Productos() {
        initComponents();
        jDateFechaVencimiento.setDate(Date.valueOf(LocalDate.now()));
        jDateFechaVencimiento.setMinSelectableDate(FechaActual);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtDescripcion = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jDateFechaVencimiento = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();

        setClosable(true);
        setTitle("Registro de Productos");
        setLayer(1);

        btnGuardar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Precio:");
        jLabel4.setToolTipText("");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txtCodigo.setBackground(new java.awt.Color(244, 244, 244));
        txtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCodigo.setBorder(null);
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        panel.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 150, 30));
        panel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 150, 10));

        txtDescripcion.setBackground(new java.awt.Color(244, 244, 244));
        txtDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDescripcion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDescripcion.setBorder(null);
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });
        panel.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 270, 30));
        panel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 270, 10));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Codigo:");
        jLabel5.setToolTipText("");
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtPrecio.setBackground(new java.awt.Color(244, 244, 244));
        txtPrecio.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPrecio.setBorder(null);
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        panel.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 100, 30));
        panel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 100, 10));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Descripcion:");
        jLabel6.setToolTipText("");
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Fecha de Vencimiento:");
        jLabel7.setToolTipText("");
        panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        txtStock.setBackground(new java.awt.Color(244, 244, 244));
        txtStock.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtStock.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtStock.setBorder(null);
        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockKeyTyped(evt);
            }
        });
        panel.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 100, 30));
        panel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 100, 10));

        jDateFechaVencimiento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        panel.add(jDateFechaVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 140, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Stock:");
        jLabel8.setToolTipText("");
        panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setText("Marca:");
        jLabel9.setToolTipText("");
        panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtMarca.setBackground(new java.awt.Color(244, 244, 244));
        txtMarca.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtMarca.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtMarca.setBorder(null);
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });
        panel.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 150, 30));
        panel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 150, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (c.ValidarVacio(panel) != true && FechaActual.compareTo(jDateFechaVencimiento.getDate()) < 0) {
            try {
                try (CallableStatement procedimiento = conexionbd.getConection().prepareCall("{call InsertarProducto(?, ?, ?, ?, ?, ?, ?)}")) {
                    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                    String FechaVencimiento = formato.format(jDateFechaVencimiento.getDate());
                    Date FechaVe = Date.valueOf(FechaVencimiento);

                    int diasParaVencer = (int) ((FechaVe.getTime() - FechaActual.getTime()) / 86400000) + 1;

                    procedimiento.setString(1, txtCodigo.getText().trim());
                    procedimiento.setString(2, txtDescripcion.getText().trim());
                    procedimiento.setString(3, txtMarca.getText().trim());
                    procedimiento.setFloat(4, Float.parseFloat(txtPrecio.getText().trim()));
                    procedimiento.setInt(5, Integer.parseInt(txtStock.getText().trim()));
                    procedimiento.setDate(6, Date.valueOf(FechaVencimiento));
                    procedimiento.setInt(7, diasParaVencer);
                    procedimiento.execute();
                    procedimiento.close();
                    JOptionPane.showMessageDialog(null, "Datos almancenado exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                    Limpiar();
                } 
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            } finally {
                conexionbd.cerrarConexion();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fecha Incorrecta");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        c.ValidarNumeros(evt);
        c.limitarCaracteres(evt, 15, txtCodigo);
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        c.ValidarDecimales(evt);
        c.limitarCaracteres(evt, 5, txtPrecio);
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyTyped
        c.ValidarNumeros(evt);
        c.limitarCaracteres(evt, 11, txtStock);
    }//GEN-LAST:event_txtStockKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        c.limitarCaracteres(evt, 50, txtDescripcion);
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
        c.limitarCaracteres(evt, 45, txtMarca);
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void Limpiar() {
        txtCodigo.setText(null);
        txtDescripcion.setText(null);
        txtMarca.setText(null);
        txtPrecio.setText(null);
        txtStock.setText(null);
        jDateFechaVencimiento.setDate(FechaActual);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private com.toedter.calendar.JDateChooser jDateFechaVencimiento;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPanel panel;
    public static javax.swing.JTextField txtCodigo;
    public static javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}

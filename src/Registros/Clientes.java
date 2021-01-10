
package Registros;

import Utilidades.ConexionBD;
import Utilidades.Validaciones;
import java.awt.HeadlessException;
import java.sql.CallableStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Clientes extends javax.swing.JInternalFrame {
    Validaciones v = new Validaciones();
    private static final ConexionBD conexionbd = ConexionBD.comprobarEstado();
    
    public Clientes() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNitCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setClosable(true);
        setTitle("Registro de Clientes");
        setLayer(1);

        btnGuardar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Apellido:");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Direccion:");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txtNitCliente.setBackground(new java.awt.Color(244, 244, 244));
        txtNitCliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNitCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNitCliente.setBorder(null);
        txtNitCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNitClienteKeyTyped(evt);
            }
        });
        jPanel1.add(txtNitCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 150, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("NIT:");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtNombre.setBackground(new java.awt.Color(244, 244, 244));
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombre.setBorder(null);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 270, 30));

        txtApellido.setBackground(new java.awt.Color(244, 244, 244));
        txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellido.setBorder(null);
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 270, 30));

        txtDireccion.setBackground(new java.awt.Color(244, 244, 244));
        txtDireccion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDireccion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDireccion.setBorder(null);
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 270, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 150, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 270, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 270, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 270, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNitClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitClienteKeyTyped
        v.ValidarNit(evt);
        v.limitarCaracteres(evt, 9, txtNitCliente);
    }//GEN-LAST:event_txtNitClienteKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (v.ValidarVacio(jPanel1)!=true) {
            try{
                try (CallableStatement procedimiento = conexionbd.getConection().prepareCall("{call InsertarClientes(?, ?, ?, ?)}")) {
                    procedimiento.setString(1, txtNitCliente.getText());
                    procedimiento.setString(2, txtNombre.getText());
                    procedimiento.setString(3, txtApellido.getText());
                    procedimiento.setString(4, txtDireccion.getText());
                    procedimiento.execute();
                    procedimiento.close();
                    JOptionPane.showMessageDialog(null, "Datos almancenado exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
                    Limpiar();
                }
            }catch(HeadlessException | SQLException e){
                JOptionPane.showMessageDialog(null, "Algo salio mal: "+e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            }finally{
                conexionbd.cerrarConexion();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        v.limitarCaracteres(evt, 50, txtNombre);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        v.limitarCaracteres(evt, 50, txtApellido);
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        v.limitarCaracteres(evt, 100, txtDireccion);
    }//GEN-LAST:event_txtDireccionKeyTyped
    private void Limpiar(){
        txtNitCliente.setText(null);
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtDireccion.setText(null);
        txtNitCliente.requestFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    public static javax.swing.JTextField txtNitCliente;
    public static javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

package Principal;

import Utilidades.empresaLogo;
import Utilidades.ConexionBD;
import Utilidades.Validaciones;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Preferencias extends javax.swing.JInternalFrame {

    Validaciones v = new Validaciones();
    ConexionBD conexionbd = ConexionBD.comprobarEstado();

    private static JFileChooser fc;
    private static FileNameExtensionFilter filtro;
    private static File file;
    private static int seleccion;

    public Preferencias() {
        initComponents();
        cargarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombreEmpresa = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        btnCambiarLogo = new javax.swing.JButton();
        btnCambiarDatos = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Preferencias");
        setLayer(1);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Direccion:");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtNit.setBackground(new java.awt.Color(244, 244, 244));
        txtNit.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNit.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNit.setBorder(null);
        txtNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNitKeyTyped(evt);
            }
        });
        jPanel1.add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 150, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("NIT:");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtNombreEmpresa.setBackground(new java.awt.Color(244, 244, 244));
        txtNombreEmpresa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombreEmpresa.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombreEmpresa.setBorder(null);
        txtNombreEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEmpresaKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 270, 30));

        txtDireccion.setBackground(new java.awt.Color(244, 244, 244));
        txtDireccion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDireccion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDireccion.setBorder(null);
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 270, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 150, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 270, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 270, 10));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Pais:");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txtPais.setBackground(new java.awt.Color(244, 244, 244));
        txtPais.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPais.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPais.setBorder(null);
        txtPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaisKeyTyped(evt);
            }
        });
        jPanel1.add(txtPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 270, 30));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 270, 10));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Departamento:");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        txtDepartamento.setBackground(new java.awt.Color(244, 244, 244));
        txtDepartamento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDepartamento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDepartamento.setBorder(null);
        txtDepartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDepartamentoKeyTyped(evt);
            }
        });
        jPanel1.add(txtDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 270, 30));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 270, 10));

        btnCambiarLogo.setText("Cambiar Logo");
        btnCambiarLogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarLogoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCambiarLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 120, -1));

        btnCambiarDatos.setText("Guardar");
        btnCambiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarDatosActionPerformed(evt);
            }
        });
        jPanel1.add(btnCambiarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 120, -1));
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 150, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitKeyTyped
        v.ValidarNit(evt);
        v.limitarCaracteres(evt, 9, txtNit);
    }//GEN-LAST:event_txtNitKeyTyped

    private void btnCambiarLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarLogoActionPerformed
        fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        filtro = new FileNameExtensionFilter("*.JPEG", "jpg");
        fc.setFileFilter(filtro);

        seleccion = fc.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
            try {
                FileInputStream fis = new FileInputStream(file);
                try {
                    PreparedStatement consulta = conexionbd.getConection().prepareStatement("Select NITEmpresa From DatosEmpresa");
                    try (ResultSet resultado = consulta.executeQuery()) {
                        if (resultado.next()) {
                            String NIT = resultado.getString(1);
                            CallableStatement procedimiento = conexionbd.getConection().prepareCall("{call ActualizarLogo(?, ?)}");
                            procedimiento.setString(1, NIT);
                            procedimiento.setBinaryStream(2, fis, file.length());
                            procedimiento.execute();
                            JOptionPane.showMessageDialog(null, "Datos almancenado exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                            cargarDatos();
                            Venta.PuntoVenta.cargarLogo();
                        }
                        resultado.close();
                        consulta.close();
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                } finally {
                    conexionbd.cerrarConexion();
                }
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCambiarLogoActionPerformed

    private void btnCambiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarDatosActionPerformed
        if (!v.ValidarVacio(jPanel1)) {
            try {
                PreparedStatement consulta = conexionbd.getConection().prepareStatement("Select NITEmpresa From DatosEmpresa");
                try (ResultSet resultado = consulta.executeQuery()) {
                    if (resultado.next()) {
                        String Nit = resultado.getString(1);
                        try (CallableStatement procedimiento = conexionbd.getConection().prepareCall("{call ActualizaDatosEmpresa(?, ?, ?, ?, ?, ?)}")) {
                            procedimiento.setString(1, Nit);
                            procedimiento.setString(2, txtNit.getText());
                            procedimiento.setString(3, txtNombreEmpresa.getText().trim());
                            procedimiento.setString(4, txtDireccion.getText().trim());
                            procedimiento.setString(5, txtPais.getText().trim());
                            procedimiento.setString(6, txtDepartamento.getText().trim());
                            procedimiento.execute();
                            procedimiento.close();
                        }
                        resultado.close();
                        JOptionPane.showMessageDialog(null, "Datos almancenado exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            } finally {
                conexionbd.cerrarConexion();
            }
        }
    }//GEN-LAST:event_btnCambiarDatosActionPerformed

    private void txtNombreEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEmpresaKeyTyped
        v.limitarCaracteres(evt, 20, txtNombreEmpresa);
    }//GEN-LAST:event_txtNombreEmpresaKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        v.limitarCaracteres(evt, 45, txtDireccion);
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtPaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaisKeyTyped
        v.limitarCaracteres(evt, 20, txtPais);
    }//GEN-LAST:event_txtPaisKeyTyped

    private void txtDepartamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDepartamentoKeyTyped
        v.limitarCaracteres(evt, 25, txtDepartamento);
    }//GEN-LAST:event_txtDepartamentoKeyTyped

    private void cargarDatos() {
        try {
            PreparedStatement ps = conexionbd.getConection().prepareStatement("Select NITEmpresa, NombreEmpresa, DireccionEmpresa, Pais, Departamento, Logo From DatosEmpresa");
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    InputStream img = rs.getBinaryStream(6);
                    try {
                        BufferedImage buffimg = ImageIO.read(img);
                        ImageIcon imagen = new ImageIcon(buffimg);
                        empresaLogo.setLogo(new ImageIcon(imagen.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
                        lblLogo.setIcon(empresaLogo.getLogo());
                        txtNit.setText(rs.getString("NITEmpresa"));
                        txtNombreEmpresa.setText(rs.getString("NombreEmpresa"));
                        txtDireccion.setText(rs.getString("DireccionEmpresa"));
                        txtPais.setText(rs.getString("Pais"));
                        txtDepartamento.setText(rs.getString("Departamento"));
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
                rs.close();
                ps.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarDatos;
    private javax.swing.JButton btnCambiarLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombreEmpresa;
    private javax.swing.JTextField txtPais;
    // End of variables declaration//GEN-END:variables
}

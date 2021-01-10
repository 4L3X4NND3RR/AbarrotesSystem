package Instalacion;

import Utilidades.ConexionBD;
import Utilidades.Utilidades;
import Utilidades.Validaciones;
import java.awt.HeadlessException;
import java.sql.CallableStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public final class RegistrarUsuario extends javax.swing.JFrame {

    Validaciones v = new Validaciones();
    Utilidades utilidades = new Utilidades();
    Encriptacion encriptar = null;
    private static final ConexionBD conexionbd = ConexionBD.comprobarEstado();
    String CodigoGenerado = utilidades.generarCodigo();
    JFrame frame;

    public RegistrarUsuario() {
        Cerrar();
    }
    
    public RegistrarUsuario(JFrame frame){
        this.frame = frame;
        frame.dispose();
        frame.setVisible(false);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/IconoRegistro.png")).getImage());
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogoVerificacion = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        btnCambiarDatos = new javax.swing.JButton();
        jPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        txtCorreoElectronico = new app.bolivia.swing.JCTextField();
        txtDPI = new app.bolivia.swing.JCTextField();
        txtNombre = new app.bolivia.swing.JCTextField();
        txtApellido = new app.bolivia.swing.JCTextField();
        jpConfirmarContrasenna = new jpass.JRPasswordField();
        jpContrasenna = new jpass.JRPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new app.bolivia.swing.JCTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtTelefono = new app.bolivia.swing.JCTextField();
        jSeparator9 = new javax.swing.JSeparator();
        btnRegistrar = new javax.swing.JButton();

        dialogoVerificacion.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoVerificacion.setTitle("Verificación de Código");
        dialogoVerificacion.setModal(true);
        dialogoVerificacion.setResizable(false);
        dialogoVerificacion.setSize(new java.awt.Dimension(316, 116));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Ingrese Código:");

        txtCodigo.setBackground(new java.awt.Color(244, 244, 244));
        txtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCodigo.setBorder(null);
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnVerificar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        btnCambiarDatos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCambiarDatos.setText("Cambiar Datos");
        btnCambiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogoVerificacionLayout = new javax.swing.GroupLayout(dialogoVerificacion.getContentPane());
        dialogoVerificacion.getContentPane().setLayout(dialogoVerificacionLayout);
        dialogoVerificacionLayout.setHorizontalGroup(
            dialogoVerificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoVerificacionLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(dialogoVerificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogoVerificacionLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCambiarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        dialogoVerificacionLayout.setVerticalGroup(
            dialogoVerificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoVerificacionLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogoVerificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerificar)
                    .addComponent(btnCambiarDatos))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Usuarios");
        setResizable(false);

        jPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        jLabel1.setToolTipText("");
        jPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Apellido:");
        jLabel2.setToolTipText("");
        jPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("DPI:");
        jLabel4.setToolTipText("");
        jPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, 10));
        jPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 180, 10));
        jPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 180, 10));
        jPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 380, 10));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Correo Electronico:");
        jLabel5.setToolTipText("");
        jPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Contraseña:");
        jLabel7.setToolTipText("");
        jPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));
        jPanel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 180, 10));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Confirmar Contraseña:");
        jLabel8.setToolTipText("");
        jPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));
        jPanel.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 180, 10));

        txtCorreoElectronico.setBackground(new java.awt.Color(244, 244, 244));
        txtCorreoElectronico.setBorder(null);
        txtCorreoElectronico.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCorreoElectronico.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtCorreoElectronico.setPlaceholder("alguien@example.com");
        txtCorreoElectronico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoElectronicoKeyTyped(evt);
            }
        });
        jPanel.add(txtCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 380, -1));

        txtDPI.setBackground(new java.awt.Color(244, 244, 244));
        txtDPI.setBorder(null);
        txtDPI.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDPI.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDPI.setPlaceholder("DPI");
        txtDPI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDPIKeyTyped(evt);
            }
        });
        jPanel.add(txtDPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 180, -1));

        txtNombre.setBackground(new java.awt.Color(244, 244, 244));
        txtNombre.setBorder(null);
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNombre.setPlaceholder("Nombre");
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, -1));

        txtApellido.setBackground(new java.awt.Color(244, 244, 244));
        txtApellido.setBorder(null);
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtApellido.setPlaceholder("Apellido");
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 180, -1));

        jpConfirmarContrasenna.setBackground(new java.awt.Color(244, 244, 244));
        jpConfirmarContrasenna.setBorder(null);
        jpConfirmarContrasenna.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jpConfirmarContrasenna.setPlaceholder("Contraseña");
        jPanel.add(jpConfirmarContrasenna, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 180, -1));

        jpContrasenna.setBackground(new java.awt.Color(244, 244, 244));
        jpContrasenna.setBorder(null);
        jpContrasenna.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jpContrasenna.setPlaceholder("Contraseña");
        jpContrasenna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpContrasennaKeyTyped(evt);
            }
        });
        jPanel.add(jpContrasenna, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 180, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Dirección:");
        jLabel6.setToolTipText("");
        jPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        txtDireccion.setBackground(new java.awt.Color(244, 244, 244));
        txtDireccion.setBorder(null);
        txtDireccion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDireccion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDireccion.setPlaceholder("Dirección");
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });
        jPanel.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 380, -1));
        jPanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 380, 10));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setText("Telefono:");
        jLabel9.setToolTipText("");
        jPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        txtTelefono.setBackground(new java.awt.Color(244, 244, 244));
        txtTelefono.setBorder(null);
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtTelefono.setPlaceholder("Telefono");
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 180, -1));
        jPanel.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 180, 10));

        btnRegistrar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnRegistrar.setText("Registrarte");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(btnRegistrar)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnRegistrar)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (v.ValidarVacio(jPanel) != true) {
            if (v.ValidarCorreo(txtCorreoElectronico.getText()) && v.ValidarContrasenna(jpContrasenna.getPassword(), jpConfirmarContrasenna.getPassword())) {
                if (v.existeCorreo(txtCorreoElectronico.getText()) != true) {
                    utilidades.enviarCorreo(CodigoGenerado, dialogoVerificacion, txtCorreoElectronico.getText());
                } else {
                    JOptionPane.showMessageDialog(null, "El correo electronico ingresado ya esta registrado,\ningrese otro por favor", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtDPIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDPIKeyTyped
        v.ValidarNit(evt);
        v.limitarCaracteres(evt, 13, txtDPI);
    }//GEN-LAST:event_txtDPIKeyTyped

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        String codigo = txtCodigo.getText().trim();
        if (v.ValidarVacio(jPanel1)!=true) {
            if (CodigoGenerado.equals(codigo)) {
                dialogoVerificacion.dispose();
                if (frame == null) {
                    registrarUsuario("Administrador","Activo");
                }else{
                    registrarUsuario("Estandar","Inactivo");
                }
                new Login().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "El código ingresado es incorrecto", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnCambiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarDatosActionPerformed
        dialogoVerificacion.dispose();
    }//GEN-LAST:event_btnCambiarDatosActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        v.limitarCaracteres(evt, 50, txtNombre);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        v.limitarCaracteres(evt, 50, txtApellido);
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        v.limitarCaracteres(evt, 100, txtDireccion);
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        v.ValidarNumeros(evt);
        v.limitarCaracteres(evt, 8, txtTelefono);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtCorreoElectronicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoElectronicoKeyTyped
        v.limitarCaracteres(evt, 30, txtCorreoElectronico);
    }//GEN-LAST:event_txtCorreoElectronicoKeyTyped

    private void jpContrasennaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpContrasennaKeyTyped
        v.limitarCaracteres(evt, 15, jpContrasenna);
        v.limitarCaracteres(evt, 15, jpConfirmarContrasenna);
    }//GEN-LAST:event_jpContrasennaKeyTyped

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        v.ValidarNumeros(evt);
        v.limitarCaracteres(evt, 6, txtCodigo);
    }//GEN-LAST:event_txtCodigoKeyTyped
    private void registrarUsuario(String tipoUsuario, String Estado) {
        try {
            encriptar = new Encriptacion();
            String Contrasena = encriptar.sha1(new String(jpContrasenna.getPassword()));
            try (CallableStatement procedimiento = conexionbd.getConection().prepareCall("{call InsertarUsuario(?, ?, ?, ?, ?, ?, ?, ?,?)}")) {
                procedimiento.setString(1, txtDPI.getText());
                procedimiento.setString(2, tipoUsuario);
                procedimiento.setString(3, Estado);
                procedimiento.setString(4, txtNombre.getText());
                procedimiento.setString(5, txtApellido.getText());
                procedimiento.setString(6, txtDireccion.getText());
                procedimiento.setString(7, txtTelefono.getText());
                procedimiento.setString(8, txtCorreoElectronico.getText());
                procedimiento.setString(9, Contrasena);
                procedimiento.execute();
                procedimiento.close();
            }
            JOptionPane.showMessageDialog(null, "Datos almancenado exitosamente, ahora puedes iniciar sesión", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            conexionbd.cerrarConexion();
        }
    }

    public void Cerrar() {
        if (v.existenUsuarios()) {
            this.dispose();
            new Login().setVisible(true);
        } else {
            initComponents();
            setIconImage(new ImageIcon(getClass().getResource("/Imagenes/IconoRegistro.png")).getImage());
            this.setLocationRelativeTo(null);
        }
    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("org.jb2011.lnf.beautyeye.BeautyEyeLookAndFeelCross");
            UIManager.put("RootPane.setupButtonVisible", false);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new RegistrarUsuario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarDatos;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JDialog dialogoVerificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private jpass.JRPasswordField jpConfirmarContrasenna;
    public jpass.JRPasswordField jpContrasenna;
    public app.bolivia.swing.JCTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    public app.bolivia.swing.JCTextField txtCorreoElectronico;
    public app.bolivia.swing.JCTextField txtDPI;
    public app.bolivia.swing.JCTextField txtDireccion;
    public app.bolivia.swing.JCTextField txtNombre;
    public app.bolivia.swing.JCTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

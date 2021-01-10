package Instalacion;

import Principal.Principal;
import Utilidades.ConexionBD;
import Utilidades.empresaLogo;
import Utilidades.Utilidades;
import Utilidades.Validaciones;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Login extends javax.swing.JFrame {

    Utilidades utilidades = new Utilidades();
    Validaciones v = new Validaciones();
    DatosUsuario d = new DatosUsuario();
    Encriptacion encriptar = new Encriptacion();
    String Codigo = utilidades.generarCodigo();
    private static final ConexionBD conexionbd = ConexionBD.comprobarEstado();
    String idUsuario;

    public Login() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/IconoLogin.png")).getImage());
        this.setLocationRelativeTo(null);
        jPanel2.requestFocus();
        cargarLogo();
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
        dialogoCambiarContrasena = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jpCambio = new jpass.JRPasswordField();
        jSeparator5 = new javax.swing.JSeparator();
        jpConfirmarCambio = new jpass.JRPasswordField();
        jSeparator6 = new javax.swing.JSeparator();
        btnCambiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        btnOlvidoContrasena = new javax.swing.JButton();
        jpContrasenna = new jpass.JRPasswordField();
        txtUsuario = new app.bolivia.swing.JCTextField();
        btnCuenta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelLogo = new javax.swing.JPanel();
        lblNombreEmpresa = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

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

        dialogoCambiarContrasena.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoCambiarContrasena.setTitle("Cambiar Contraseña");
        dialogoCambiarContrasena.setModal(true);
        dialogoCambiarContrasena.setResizable(false);
        dialogoCambiarContrasena.setSize(new java.awt.Dimension(316, 116));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jpCambio.setBackground(new java.awt.Color(244, 244, 244));
        jpCambio.setBorder(null);
        jpCambio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jpCambio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jpCambio.setPlaceholder("Nueva Contraseña");

        jpConfirmarCambio.setBackground(new java.awt.Color(244, 244, 244));
        jpConfirmarCambio.setBorder(null);
        jpConfirmarCambio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jpConfirmarCambio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jpConfirmarCambio.setPlaceholder("Confirmar Contraseña");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpConfirmarCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpConfirmarCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnCambiar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCambiar.setText("Cambiar Contraseña");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogoCambiarContrasenaLayout = new javax.swing.GroupLayout(dialogoCambiarContrasena.getContentPane());
        dialogoCambiarContrasena.getContentPane().setLayout(dialogoCambiarContrasenaLayout);
        dialogoCambiarContrasenaLayout.setHorizontalGroup(
            dialogoCambiarContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoCambiarContrasenaLayout.createSequentialGroup()
                .addGroup(dialogoCambiarContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogoCambiarContrasenaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialogoCambiarContrasenaLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnCambiar)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        dialogoCambiarContrasenaLayout.setVerticalGroup(
            dialogoCambiarContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoCambiarContrasenaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCambiar)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesión");
        setResizable(false);

        jPanel2.setBackground(java.awt.Color.darkGray);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña:");
        jLabel4.setToolTipText("");

        jSeparator3.setVerifyInputWhenFocusTarget(false);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo:");
        jLabel5.setToolTipText("");

        btnIniciarSesion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        btnOlvidoContrasena.setText("¿Olvidaste tu contraseña?");
        btnOlvidoContrasena.setToolTipText("");
        btnOlvidoContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlvidoContrasenaActionPerformed(evt);
            }
        });

        jpContrasenna.setBackground(java.awt.Color.darkGray);
        jpContrasenna.setBorder(null);
        jpContrasenna.setForeground(new java.awt.Color(255, 255, 255));
        jpContrasenna.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jpContrasenna.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jpContrasenna.setPhColor(new java.awt.Color(255, 255, 255));
        jpContrasenna.setPlaceholder("Contraseña");
        jpContrasenna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpContrasennaKeyTyped(evt);
            }
        });

        txtUsuario.setBackground(java.awt.Color.darkGray);
        txtUsuario.setBorder(null);
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtUsuario.setPhColor(new java.awt.Color(255, 255, 255));
        txtUsuario.setPlaceholder("alguien@example.com");

        btnCuenta.setText("¿Aún no tienes una cuenta?");
        btnCuenta.setToolTipText("");
        btnCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentaActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario-hombre.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bloquear.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnIniciarSesion)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jpContrasenna, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(50, 50, 50)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnOlvidoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator4))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(1, 1, 1)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jpContrasenna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIniciarSesion)
                .addGap(28, 28, 28)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOlvidoContrasena)
                .addGap(18, 18, 18)
                .addComponent(btnCuenta)
                .addGap(86, 86, 86))
        );

        lblNombreEmpresa.setFont(new java.awt.Font("Candle Mustard", 0, 36)); // NOI18N
        lblNombreEmpresa.setForeground(java.awt.Color.darkGray);
        lblNombreEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombreEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOlvidoContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOlvidoContrasenaActionPerformed
        if (!txtUsuario.getText().trim().equals("")) {
            if (v.ValidarCorreo(txtUsuario.getText())) {
                if (v.existeCorreo(txtUsuario.getText().trim())) {
                    utilidades.enviarCorreo(Codigo, dialogoVerificacion, txtUsuario.getText());
                } else {
                    JOptionPane.showMessageDialog(null, "El correo ingresado no ah sido registrado,\ncomunicate con el administrador para ser registrado", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Es nesesario ingresar correo electrónico", "Información", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnOlvidoContrasenaActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        String codigo = txtCodigo.getText().trim();
        if (v.ValidarVacio(jPanel1) != true) {
            if (codigo.equals(Codigo)) {
                dialogoVerificacion.dispose();
                dialogoCambiarContrasena.setLocationRelativeTo(null);
                dialogoCambiarContrasena.setSize(306, 270);
                dialogoCambiarContrasena.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(dialogoVerificacion, "El código ingresado es incorrecto", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnCambiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarDatosActionPerformed
        dialogoVerificacion.dispose();
    }//GEN-LAST:event_btnCambiarDatosActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        if (v.ValidarVacio(jPanel3) != true) {
            if (v.ValidarContrasenna(jpCambio.getPassword(), jpConfirmarCambio.getPassword())) {
                String ContrasenaNueva = encriptar.sha1(new String(jpCambio.getPassword()));
                modificarContrasena(ContrasenaNueva);
                dialogoCambiarContrasena.dispose();
                jpContrasenna.setText(null);
                jpContrasenna.requestFocus();
            }
        }
    }//GEN-LAST:event_btnCambiarActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        if (v.ValidarVacio(jPanel2) != true) {
            if (v.ValidarCorreo(txtUsuario.getText().trim())) {
                if (v.existeCorreo(txtUsuario.getText().trim())) {
                    logearUsuario();
                } else {
                    JOptionPane.showMessageDialog(null, "El correo ingresado no ah sido registrado,\ncomunicate con el administrador para ser registrado", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentaActionPerformed
        RegistrarUsuario rg = new RegistrarUsuario(this);
        rg.setVisible(true);
    }//GEN-LAST:event_btnCuentaActionPerformed

    private void jpContrasennaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpContrasennaKeyTyped
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER) {
            logearUsuario();
        }
    }//GEN-LAST:event_jpContrasennaKeyTyped

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        v.ValidarNumeros(evt);
        v.limitarCaracteres(evt, 6, txtCodigo);
    }//GEN-LAST:event_txtCodigoKeyTyped
    private void modificarContrasena(String NuevaContrasenna) {
        try {
            String query = "SELECT idUsuario FROM Usuario WHERE CorreoElectronico = ?";
            try (PreparedStatement consulta = conexionbd.getConection().prepareStatement(query)) {
                consulta.setString(1, txtUsuario.getText());
                try (ResultSet resultado = consulta.executeQuery()) {
                    while (resultado.next()) {
                        idUsuario = resultado.getString("idUsuario");
                    }
                    resultado.close();
                }
                consulta.close();
            }
            try (CallableStatement procedimiento = conexionbd.getConection().prepareCall("{call ModificarContrasena(?, ?)}")) {
                procedimiento.setString(1, idUsuario);
                procedimiento.setString(2, NuevaContrasenna);
                procedimiento.execute();
                procedimiento.close();
            }
            JOptionPane.showMessageDialog(dialogoCambiarContrasena, "La contraseña ah sido modificada exitosamente, ahora puedes iniciar sesión", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            conexionbd.cerrarConexion();
        }
    }

    private void logearUsuario() {
        String Nombre, Contrasena, TipoUsuario;
        try {
            String query = "SELECT Contrasena, Nombre, TipoUsuario, Estado, idUsuario FROM Usuario WHERE CorreoElectronico = ?";
            try (PreparedStatement consulta = conexionbd.getConection().prepareStatement(query)) {
                consulta.setString(1, txtUsuario.getText().trim());
                try (ResultSet rs = consulta.executeQuery()) {
                    Contrasena = encriptar.sha1(new String(jpContrasenna.getPassword()));
                    if (rs.next()) {
                        if (Contrasena.equals(rs.getString(1))) {
                            if (rs.getString(4).equals("Activo")) {
                                Nombre = rs.getString(2);
                                TipoUsuario = rs.getString(3);
                                idUsuario = rs.getString(5);
                                d.setIdUsuario(idUsuario);
                                d.setNombre(Nombre);
                                d.setTipoUsuario(TipoUsuario);
                                this.dispose();
                                Principal p = new Principal(d);
                                p.setVisible(true);
                                p.menuItemCerrarSesion.setText("Cerrar sesión de " + Nombre);
                            }else{
                                JOptionPane.showMessageDialog(null, "Comuniquece con el Administrador para activar su cuenta", "Información", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "La contraseña es incorrecta, vuelve a intentarlo", "Información", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    rs.close();
                    consulta.close();
                }
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            conexionbd.cerrarConexion();
        }
    }
    
    private void cargarLogo() {
        try {
            try (PreparedStatement ps = conexionbd.getConection().prepareStatement("Select Logo, NombreEmpresa From DatosEmpresa");ResultSet rs = ps.executeQuery()) {
                BufferedImage buffimg = null;
                
                if (rs.next()) {
                    InputStream img = rs.getBinaryStream(1);
                    lblNombreEmpresa.setText(rs.getString(2));
                    try {
                        buffimg = ImageIO.read(img);
                        ImageIcon imagen = new ImageIcon(buffimg);
                        empresaLogo.setLogo(new ImageIcon(imagen.getImage().getScaledInstance(256, 256, Image.SCALE_SMOOTH)));
                        lblLogo.setIcon(empresaLogo.getLogo());
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
                rs.close();
                ps.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            conexionbd.cerrarConexion();
        }
    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("org.jb2011.lnf.beautyeye.BeautyEyeLookAndFeelCross");
            UIManager.put("RootPane.setupButtonVisible", false);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnCambiarDatos;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnOlvidoContrasena;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JDialog dialogoCambiarContrasena;
    private javax.swing.JDialog dialogoVerificacion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private jpass.JRPasswordField jpCambio;
    private jpass.JRPasswordField jpConfirmarCambio;
    private jpass.JRPasswordField jpContrasenna;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JTextField txtCodigo;
    private app.bolivia.swing.JCTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

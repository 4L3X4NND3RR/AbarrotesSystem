package Utilidades;

import Instalacion.RegistrarUsuario;
import java.awt.HeadlessException;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.UIManager;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public final class ConectarBD extends javax.swing.JFrame {

    Validaciones v = new Validaciones();
    DatosConexion dc = new DatosConexion();
    Properties properties;

    String NameServer;
    String Puerto;
    String NombreBD;
    String Username;
    String Password;
    String URL;

    public ConectarBD() {
        Cerrar();
    }

    private void Mostrar() {
        txtNombreServidor.setText(NameServer);
        txtPuerto.setText(Puerto);
        txtNombreBD.setText(NombreBD);
        txtUserBD.setText(Username);
        txtContrasenna.setText(Password);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreServidor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPuerto = new javax.swing.JTextField();
        txtNombreBD = new javax.swing.JTextField();
        txtUserBD = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txtContrasenna = new javax.swing.JPasswordField();
        btnGuardar = new javax.swing.JButton();
        txtTest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conectar Base de Datos");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Puerto:");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Nombre BD:");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Usuario BD:");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txtNombreServidor.setBackground(new java.awt.Color(244, 244, 244));
        txtNombreServidor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombreServidor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombreServidor.setBorder(null);
        txtNombreServidor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreServidorKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreServidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 150, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Nombre Servidor:");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtPuerto.setBackground(new java.awt.Color(244, 244, 244));
        txtPuerto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPuerto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPuerto.setBorder(null);
        txtPuerto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPuertoKeyTyped(evt);
            }
        });
        jPanel1.add(txtPuerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 150, 30));

        txtNombreBD.setBackground(new java.awt.Color(244, 244, 244));
        txtNombreBD.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombreBD.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombreBD.setBorder(null);
        txtNombreBD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreBDKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 150, 30));

        txtUserBD.setBackground(new java.awt.Color(244, 244, 244));
        txtUserBD.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtUserBD.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUserBD.setBorder(null);
        txtUserBD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserBDKeyTyped(evt);
            }
        });
        jPanel1.add(txtUserBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 150, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 150, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 150, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 140, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 150, 10));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Contraseña BD:");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 150, 10));

        txtContrasenna.setBackground(new java.awt.Color(244, 244, 244));
        txtContrasenna.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtContrasenna.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtContrasenna.setBorder(null);
        txtContrasenna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContrasennaKeyTyped(evt);
            }
        });
        jPanel1.add(txtContrasenna, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 150, 30));

        btnGuardar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtTest.setText("Test de Conexión");
        txtTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTest, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(txtTest))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try (FileReader reader = new FileReader("Config")) {
            properties = new Properties();
            properties.load(reader);
            properties.setProperty("NameServer", txtNombreServidor.getText().trim());
            properties.setProperty("Puerto", txtPuerto.getText().trim());
            properties.setProperty("NombreBD", txtNombreBD.getText().trim());
            properties.setProperty("Username", txtUserBD.getText().trim());
            properties.setProperty("Password", txtContrasenna.getText().trim());
            properties.store(new FileWriter("Config"), "un comentario");
            

            dc.setNameServer(properties.getProperty("NameServer"));
            dc.setPuerto(properties.getProperty("Puerto"));
            dc.setNombreBD(properties.getProperty("NombreBD"));
            dc.setUsername(properties.getProperty("Username"));
            dc.setPassword(properties.getProperty("Password"));
            
            JOptionPane.showMessageDialog(null, "Datos guardados exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTestActionPerformed
        try {
            if (Conexion()) {
                JOptionPane.showMessageDialog(null, "¡Conexión Exitosa!", "Información", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new RegistrarUsuario().setVisible(true);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtTestActionPerformed

    private void txtPuertoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPuertoKeyTyped
        v.ValidarNumeros(evt);
        v.limitarCaracteres(evt, 5, txtPuerto);
    }//GEN-LAST:event_txtPuertoKeyTyped

    private void txtNombreServidorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreServidorKeyTyped
        v.limitarCaracteres(evt, 25, txtNombreServidor);
    }//GEN-LAST:event_txtNombreServidorKeyTyped

    private void txtNombreBDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreBDKeyTyped
        v.limitarCaracteres(evt, 25, txtNombreBD);
    }//GEN-LAST:event_txtNombreBDKeyTyped

    private void txtUserBDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserBDKeyTyped
        v.limitarCaracteres(evt, 10, txtUserBD);
    }//GEN-LAST:event_txtUserBDKeyTyped

    private void txtContrasennaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasennaKeyTyped
        v.limitarCaracteres(evt, 15, txtContrasenna);
    }//GEN-LAST:event_txtContrasennaKeyTyped
   
    public void Cerrar() {
        if (Conexion()) {
            this.dispose();
            RegistrarUsuario rg = new RegistrarUsuario();
            rg.setVisible(true);
        } else {
            initComponents();
            this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/IconoConexionBD.png")).getImage());
            this.setLocationRelativeTo(null);
            Mostrar();
        }
    }

    public Boolean Conexion() {
        NameServer = dc.getNameServer();
        Puerto = dc.getPuerto();
        NombreBD = dc.getNombreBD();
        Username = dc.getUsername();
        Password = dc.getPassword();

        URL = "jdbc:mysql://" + NameServer + ":" + Puerto + "/" + NombreBD;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.getConnection(URL, Username, Password);
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("org.jb2011.lnf.beautyeye.BeautyEyeLookAndFeelCross");
            UIManager.put("RootPane.setupButtonVisible", false);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConectarBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConectarBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConectarBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConectarBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new ConectarBD().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPasswordField txtContrasenna;
    private javax.swing.JTextField txtNombreBD;
    private javax.swing.JTextField txtNombreServidor;
    private javax.swing.JTextField txtPuerto;
    private javax.swing.JButton txtTest;
    private javax.swing.JTextField txtUserBD;
    // End of variables declaration//GEN-END:variables
}

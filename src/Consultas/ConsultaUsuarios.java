package Consultas;

import Instalacion.DatosUsuario;
import Instalacion.Encriptacion;
import Utilidades.ConexionBD;
import Utilidades.Validaciones;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaUsuarios extends javax.swing.JInternalFrame {

    Validaciones v = new Validaciones();
    Encriptacion encriptar = new Encriptacion();
    private String WHERE = "";
    private static String DPI;
    DefaultTableModel modelo;
    DatosUsuario du;
    private static final ConexionBD conexionbd = ConexionBD.comprobarEstado();

    public ConsultaUsuarios() {
        initComponents();
        txtBuscar.setEnabled(false);
        cargarDatos(WHERE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogoModificarDatos = new javax.swing.JDialog();
        btnGuardarDatos = new javax.swing.JButton();
        btnSalirDatos = new javax.swing.JButton();
        jPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCorreoElectronico = new app.bolivia.swing.JCTextField();
        txtDPI = new app.bolivia.swing.JCTextField();
        txtNombre = new app.bolivia.swing.JCTextField();
        txtApellido = new app.bolivia.swing.JCTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new app.bolivia.swing.JCTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtTelefono = new app.bolivia.swing.JCTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();
        cboTipoUsuario = new javax.swing.JComboBox<>();
        dialogoCambiarContrasena = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jpCambio = new jpass.JRPasswordField();
        jSeparator7 = new javax.swing.JSeparator();
        jpConfirmarCambio = new jpass.JRPasswordField();
        jSeparator8 = new javax.swing.JSeparator();
        btnCambiar = new javax.swing.JButton();
        jpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDatos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        cboBuscar = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnModificarDatos = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnInactivar = new javax.swing.JButton();
        btnActivar = new javax.swing.JButton();
        btnCamibarContra = new javax.swing.JButton();

        dialogoModificarDatos.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoModificarDatos.setTitle("Modificar Usuario");
        dialogoModificarDatos.setModal(true);
        dialogoModificarDatos.setResizable(false);

        btnGuardarDatos.setText("Guardar");
        btnGuardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDatosActionPerformed(evt);
            }
        });

        btnSalirDatos.setText("Salir");
        btnSalirDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirDatosActionPerformed(evt);
            }
        });

        jPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Nombre:");
        jLabel5.setToolTipText("");
        jPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Apellido:");
        jLabel2.setToolTipText("");
        jPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("DPI:");
        jLabel4.setToolTipText("");
        jPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, 10));
        jPanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 180, 10));
        jPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 180, 10));
        jPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 380, 10));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Correo Electronico:");
        jLabel7.setToolTipText("");
        jPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Tipo Usuario:");
        jLabel8.setToolTipText("");
        jPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        txtCorreoElectronico.setBackground(new java.awt.Color(244, 244, 244));
        txtCorreoElectronico.setBorder(null);
        txtCorreoElectronico.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCorreoElectronico.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtCorreoElectronico.setPlaceholder("alguien@example.com");
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
        jPanel.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, -1));

        txtApellido.setBackground(new java.awt.Color(244, 244, 244));
        txtApellido.setBorder(null);
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtApellido.setPlaceholder("Apellido");
        jPanel.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 180, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Dirección:");
        jLabel6.setToolTipText("");
        jPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        txtDireccion.setBackground(new java.awt.Color(244, 244, 244));
        txtDireccion.setBorder(null);
        txtDireccion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDireccion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDireccion.setPlaceholder("Dirección");
        jPanel.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 380, -1));
        jPanel.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 380, 10));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setText("Telefono:");
        jLabel9.setToolTipText("");
        jPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        txtTelefono.setBackground(new java.awt.Color(244, 244, 244));
        txtTelefono.setBorder(null);
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtTelefono.setPlaceholder("Telefono");
        jPanel.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 180, -1));
        jPanel.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 180, 10));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setText("Estado:");
        jLabel12.setToolTipText("");
        jPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        jPanel.add(cboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 130, 30));

        cboTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Estandar" }));
        jPanel.add(cboTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 130, 30));

        javax.swing.GroupLayout dialogoModificarDatosLayout = new javax.swing.GroupLayout(dialogoModificarDatos.getContentPane());
        dialogoModificarDatos.getContentPane().setLayout(dialogoModificarDatosLayout);
        dialogoModificarDatosLayout.setHorizontalGroup(
            dialogoModificarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoModificarDatosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(dialogoModificarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dialogoModificarDatosLayout.createSequentialGroup()
                        .addComponent(btnGuardarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalirDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        dialogoModificarDatosLayout.setVerticalGroup(
            dialogoModificarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoModificarDatosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(dialogoModificarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarDatos)
                    .addComponent(btnSalirDatos))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        dialogoCambiarContrasena.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoCambiarContrasena.setTitle("Cambiar Contraseña");
        dialogoCambiarContrasena.setModal(true);
        dialogoCambiarContrasena.setResizable(false);
        dialogoCambiarContrasena.setSize(new java.awt.Dimension(316, 116));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpConfirmarCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpConfirmarCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialogoCambiarContrasenaLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnCambiar)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        dialogoCambiarContrasenaLayout.setVerticalGroup(
            dialogoCambiarContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoCambiarContrasenaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCambiar)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setClosable(true);
        setTitle("Consulta Usuarios");
        setLayer(1);

        jpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Buscar:");
        jLabel1.setToolTipText("");
        jpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

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
        jpanel.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 270, 30));
        jpanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 270, 10));

        jScrollPane1.setBorder(null);
        jScrollPane1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jtblDatos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return false;
            }
        };
        jtblDatos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
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

        jpanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 800, 290));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Buscar Por", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboBuscar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cboBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "DPI", "Nombre" }));
        cboBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(cboBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnModificarDatos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnModificarDatos.setText("Modificar Datos");
        btnModificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDatosActionPerformed(evt);
            }
        });
        jPanel3.add(btnModificarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 160, -1));

        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, -1));

        btnInactivar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnInactivar.setText("Incativar");
        btnInactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInactivarActionPerformed(evt);
            }
        });
        jPanel3.add(btnInactivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 160, -1));

        btnActivar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnActivar.setText("Activar");
        btnActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarActionPerformed(evt);
            }
        });
        jPanel3.add(btnActivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 160, -1));

        btnCamibarContra.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCamibarContra.setText("Cambiar Contraseña");
        btnCamibarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCamibarContraActionPerformed(evt);
            }
        });
        jPanel3.add(btnCamibarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        int Posicion = cboBuscar.getSelectedIndex();
        switch (Posicion) {
            case 0:
                break;
            case 1:
                v.ValidarNumeros(evt);
                v.limitarCaracteres(evt, 9, txtBuscar);
                break;
            case 2:
                v.limitarCaracteres(evt, 50, txtBuscar);
                break;
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER) {
            switch (cboBuscar.getSelectedIndex()) {
                case 1:
                    WHERE = "WHERE idUsuario LIKE '%" + txtBuscar.getText().trim() + "%'";
                    break;
                case 2:
                    WHERE = "WHERE Nombre LIKE '%" + txtBuscar.getText().trim() + "%'";
                    break;
            }
            cargarDatos(WHERE);
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void cboBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBuscarActionPerformed
        int Item = cboBuscar.getSelectedIndex();
        switch (Item) {
            case 0:
                txtBuscar.setText(null);
                txtBuscar.setEnabled(false);
                txtBuscar.requestFocus();
                break;
            case 1:
                txtBuscar.setText(null);
                txtBuscar.setEnabled(true);
                txtBuscar.requestFocus();
                break;
            case 2:
                txtBuscar.setText(null);
                txtBuscar.setEnabled(true);
                txtBuscar.requestFocus();
                break;
        }
    }//GEN-LAST:event_cboBuscarActionPerformed

    private void btnModificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDatosActionPerformed
        modificarRegistro();
    }//GEN-LAST:event_btnModificarDatosActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarUsuario();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarActionPerformed
        activarUsuario();
    }//GEN-LAST:event_btnActivarActionPerformed

    private void txtDPIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDPIKeyTyped
        v.ValidarNit(evt);
    }//GEN-LAST:event_txtDPIKeyTyped

    private void btnSalirDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirDatosActionPerformed
        dialogoModificarDatos.dispose();
    }//GEN-LAST:event_btnSalirDatosActionPerformed

    private void btnGuardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDatosActionPerformed
        try {
            Object[] fila = new Object[8];
            String AntiguoID = jtblDatos.getValueAt(jtblDatos.getSelectedRow(), 0).toString();
            try (CallableStatement procedimiento = conexionbd.getConection().prepareCall("{call ModificarUsuario(?, ?, ?, ?, ?, ?, ?, ?,?)}")) {
                procedimiento.setString(1, AntiguoID);
                procedimiento.setString(2, txtDPI.getText());
                procedimiento.setString(3, cboTipoUsuario.getSelectedItem().toString());
                procedimiento.setString(4, cboEstado.getSelectedItem().toString());
                procedimiento.setString(5, txtNombre.getText());
                procedimiento.setString(6, txtApellido.getText());
                procedimiento.setString(7, txtDireccion.getText());
                procedimiento.setString(8, txtTelefono.getText());
                procedimiento.setString(9, txtCorreoElectronico.getText());
                procedimiento.execute();
                procedimiento.close();
            }

            modelo.removeRow(jtblDatos.getSelectedRow());

            fila[0] = txtDPI.getText().trim();
            fila[1] = cboTipoUsuario.getSelectedItem().toString();
            fila[2] = cboEstado.getSelectedItem().toString();
            fila[3] = txtNombre.getText().trim();
            fila[4] = txtApellido.getText().trim();
            fila[5] = txtDireccion.getText().trim();
            fila[6] = txtTelefono.getText().trim();
            fila[7] = txtCorreoElectronico.getText().trim();

            modelo.addRow(fila);

            dialogoModificarDatos.dispose();
            JOptionPane.showMessageDialog(null, "Datos almancenado exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            conexionbd.cerrarConexion();
        }
    }//GEN-LAST:event_btnGuardarDatosActionPerformed

    private void btnInactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactivarActionPerformed
        inactivarUsuario();
    }//GEN-LAST:event_btnInactivarActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        if (v.ValidarVacio(jPanel4) != true) {
            if (v.ValidarContrasenna(jpCambio.getPassword(), jpConfirmarCambio.getPassword())) {
                String ContrasenaNueva = encriptar.sha1(new String(jpCambio.getPassword()));
                modificarContrasena(ContrasenaNueva);
            }
        }
    }//GEN-LAST:event_btnCambiarActionPerformed

    private void btnCamibarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCamibarContraActionPerformed
        cambiarContrasena();
    }//GEN-LAST:event_btnCamibarContraActionPerformed

    private void jtblDatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtblDatosKeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_M:
                modificarRegistro();
                break;
            case KeyEvent.VK_C:
                cambiarContrasena();
                break;
            case KeyEvent.VK_DELETE:
                eliminarUsuario();
                break;
        }
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_A) {
            activarUsuario();
        } else if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_I) {
            inactivarUsuario();
        }
    }//GEN-LAST:event_jtblDatosKeyPressed
    private void cambiarContrasena() {
        if (jtblDatos.getSelectedRowCount() == 1) {
            dialogoCambiarContrasena.setLocationRelativeTo(null);
            dialogoCambiarContrasena.setSize(306, 270);
            dialogoCambiarContrasena.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void modificarRegistro() {
        if (jtblDatos.getSelectedRowCount() == 1) {
            int Fila = jtblDatos.getSelectedRow();
            DPI = jtblDatos.getValueAt(Fila, 0).toString();
            try {
                String query = "SELECT * FROM Usuario WHERE idUsuario = ?";
                try (PreparedStatement consulta = conexionbd.getConection().prepareStatement(query)) {
                    consulta.setString(1, DPI);
                    try (ResultSet resultado = consulta.executeQuery()) {
                        while (resultado.next()) {
                            txtDPI.setText(resultado.getString("idUsuario"));
                            txtNombre.setText(resultado.getString("Nombre"));
                            txtApellido.setText(resultado.getString("Apellido"));
                            txtDireccion.setText(resultado.getString("Direccion"));
                            txtTelefono.setText(resultado.getString("Telefono"));
                            txtCorreoElectronico.setText(resultado.getString("CorreoElectronico"));
                            if ("Activo".equals(resultado.getString("Estado"))) {
                                cboEstado.setSelectedIndex(0);
                            } else {
                                cboEstado.setSelectedIndex(1);
                            }
                            if ("Administrador".equals(resultado.getString("TipoUsuario"))) {
                                cboTipoUsuario.setSelectedIndex(0);
                            } else {
                                cboTipoUsuario.setSelectedIndex(1);
                            }
                        }
                        resultado.close();
                    }
                    consulta.close();
                    dialogoModificarDatos.setSize(517, 673);
                    dialogoModificarDatos.setLocationRelativeTo(null);
                    dialogoModificarDatos.setVisible(true);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            } finally {
                conexionbd.cerrarConexion();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void activarUsuario() {
        if (jtblDatos.getSelectedRowCount() == 1) {
            try {
                String query = "SELECT Estado FROM Usuario WHERE idUsuario = ?";
                String Estado = "";
                PreparedStatement consulta = conexionbd.getConection().prepareStatement(query);
                consulta.setString(1, jtblDatos.getValueAt(jtblDatos.getSelectedRow(), 0).toString());
                try (ResultSet resultado = consulta.executeQuery()) {
                    while (resultado.next()) {
                        Estado = resultado.getString("Estado");
                    }
                    resultado.close();
                }
                if ("Inactivo".equals(Estado)) {
                    query = "UPDATE SistemaVentas.Usuario SET Estado = 'Activo' WHERE idUsuario = ?";
                    consulta = conexionbd.getConection().prepareStatement(query);
                    consulta.setString(1, jtblDatos.getValueAt(jtblDatos.getSelectedRow(), 0).toString());
                    consulta.execute();
                    consulta.close();
                    jtblDatos.setValueAt("Activo", jtblDatos.getSelectedRow(), 2);
                    JOptionPane.showMessageDialog(null, "Usuario Activado", "Información", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario ya se encuentra activado", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            } finally {
                conexionbd.cerrarConexion();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void inactivarUsuario() {
        if (jtblDatos.getSelectedRowCount() == 1) {
            try {
                String query = "SELECT Estado FROM Usuario WHERE idUsuario = ?";
                String Estado = "";
                PreparedStatement consulta = conexionbd.getConection().prepareStatement(query);
                consulta.setString(1, jtblDatos.getValueAt(jtblDatos.getSelectedRow(), 0).toString());
                try (ResultSet resultado = consulta.executeQuery()) {
                    while (resultado.next()) {
                        Estado = resultado.getString("Estado");
                    }
                    resultado.close();
                }
                if ("Activo".equals(Estado)) {
                    query = "UPDATE SistemaVentas.Usuario SET Estado = 'Inactivo' WHERE idUsuario = ?";
                    consulta = conexionbd.getConection().prepareStatement(query);
                    consulta.setString(1, jtblDatos.getValueAt(jtblDatos.getSelectedRow(), 0).toString());
                    consulta.execute();
                    consulta.close();
                    jtblDatos.setValueAt("Inactivo", jtblDatos.getSelectedRow(), 2);
                    JOptionPane.showMessageDialog(null, "Usuario Inactivado", "Información", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario ya se encuentra Inactivo", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            } finally {
                conexionbd.cerrarConexion();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void eliminarUsuario() {
        if (jtblDatos.getSelectedRowCount() == 1) {
            int confirmado = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar el usuario?", "Eliminar Usuario", 0, JOptionPane.QUESTION_MESSAGE);
            if (0 == confirmado) {
                try {
                    String query = "DELETE FROM Usuario WHERE idUsuario = ?";
                    try (PreparedStatement consulta = conexionbd.getConection().prepareStatement(query)) {
                        consulta.setString(1, jtblDatos.getValueAt(jtblDatos.getSelectedRow(), 0).toString());
                        consulta.execute();
                        consulta.close();
                    }
                    modelo.removeRow(jtblDatos.getSelectedRow());
                    JOptionPane.showMessageDialog(null, "Usuario eliminado", "Información", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                } finally {
                    conexionbd.cerrarConexion();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void cargarDatos(String Where) {
        try {
            modelo = new DefaultTableModel();
            jtblDatos.setModel(modelo);
            String query = "SELECT * FROM Usuario " + Where;
            PreparedStatement Consulta = conexionbd.getConection().prepareStatement(query);
            try (ResultSet rs = Consulta.executeQuery()) {
                ResultSetMetaData rsMD = rs.getMetaData();
                int cantidadCol = rsMD.getColumnCount();

                modelo.addColumn("DPI");
                modelo.addColumn("Tipo Usuario");
                modelo.addColumn("Estado");
                modelo.addColumn("Nombre");
                modelo.addColumn("Apellido");
                modelo.addColumn("Dirección");
                modelo.addColumn("Teléfono");
                modelo.addColumn("Correo Electronico");

                int[] anchos = {20, 50, 20, 50, 50, 150, 30, 200};
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

    private void modificarContrasena(String NuevaContrasenna) {
        try {
            String idUsuario = "";
            String query = "SELECT idUsuario FROM Usuario WHERE CorreoElectronico = ?";
            PreparedStatement consulta = conexionbd.getConection().prepareStatement(query);
            consulta.setString(1, jtblDatos.getValueAt(jtblDatos.getSelectedRow(), 7).toString());
            try (ResultSet resultado = consulta.executeQuery()) {
                while (resultado.next()) {
                    idUsuario = resultado.getString("idUsuario");
                }
                resultado.close();
            }
            try (CallableStatement procedimiento = conexionbd.getConection().prepareCall("{call ModificarContrasena(?, ?)}")) {
                procedimiento.setString(1, idUsuario);
                procedimiento.setString(2, NuevaContrasenna);
                procedimiento.execute();
                procedimiento.close();
            }
            dialogoCambiarContrasena.dispose();
            JOptionPane.showMessageDialog(null, "La contraseña ah sido modificada exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            conexionbd.cerrarConexion();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivar;
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnCamibarContra;
    public javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarDatos;
    private javax.swing.JButton btnInactivar;
    public javax.swing.JButton btnModificarDatos;
    private javax.swing.JButton btnSalirDatos;
    private javax.swing.JComboBox<String> cboBuscar;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JComboBox<String> cboTipoUsuario;
    private javax.swing.JDialog dialogoCambiarContrasena;
    private javax.swing.JDialog dialogoModificarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private jpass.JRPasswordField jpCambio;
    private jpass.JRPasswordField jpConfirmarCambio;
    private javax.swing.JPanel jpanel;
    private javax.swing.JTable jtblDatos;
    public app.bolivia.swing.JCTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    public app.bolivia.swing.JCTextField txtCorreoElectronico;
    public app.bolivia.swing.JCTextField txtDPI;
    public app.bolivia.swing.JCTextField txtDireccion;
    public app.bolivia.swing.JCTextField txtNombre;
    public app.bolivia.swing.JCTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

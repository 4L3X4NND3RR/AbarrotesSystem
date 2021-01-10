package Consultas;

import Instalacion.DatosUsuario;
import Utilidades.ConexionBD;
import Utilidades.Validaciones;
import Venta.PuntoVenta;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaClientes extends javax.swing.JInternalFrame {

    Validaciones v = new Validaciones();
    private DatosUsuario du;
    DefaultTableModel modelo;
    private static final ConexionBD conexionbd = ConexionBD.comprobarEstado();
    String WHERE = "";
    private static String NIT;

    public ConsultaClientes() {
        initComponents();
    }

    public ConsultaClientes(DatosUsuario du) {
        this.du = du;
        initComponents();
        txtBuscar.setEnabled(false);
        jtblDatos.requestFocus();
        tipoUsuario();
        cargarDatos(WHERE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogoModificar = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNitCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDatos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        cboBuscar = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        dialogoModificar.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoModificar.setTitle("Modificar Cliente");
        dialogoModificar.setModal(true);
        dialogoModificar.setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Direccion:");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

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

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("NIT:");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtNombre.setBackground(new java.awt.Color(244, 244, 244));
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 270, 30));

        txtApellido.setBackground(new java.awt.Color(244, 244, 244));
        txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellido.setBorder(null);
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 270, 30));

        txtDireccion.setBackground(new java.awt.Color(244, 244, 244));
        txtDireccion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDireccion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDireccion.setBorder(null);
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 270, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 150, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 270, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 270, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 270, 10));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogoModificarLayout = new javax.swing.GroupLayout(dialogoModificar.getContentPane());
        dialogoModificar.getContentPane().setLayout(dialogoModificarLayout);
        dialogoModificarLayout.setHorizontalGroup(
            dialogoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoModificarLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(dialogoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dialogoModificarLayout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        dialogoModificarLayout.setVerticalGroup(
            dialogoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoModificarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dialogoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnSalir))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setClosable(true);
        setTitle("Consulta Clientes");
        setLayer(1);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Buscar:");
        jLabel1.setToolTipText("");
        jpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        txtBuscar.setBackground(new java.awt.Color(244, 244, 244));
        txtBuscar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtBuscar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtBuscar.setBorder(null);
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        jpanel.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 270, 30));
        jpanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 270, 10));

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

        jpanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 500, 290));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Buscar Por", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboBuscar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cboBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "NIT", "Nombre" }));
        cboBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(cboBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnModificar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel3.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 80, -1));

        btnAgregar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER) {
            switch (cboBuscar.getSelectedIndex()) {
                case 1:
                    WHERE = "WHERE idCliente LIKE '%" + txtBuscar.getText().trim() + "%'";
                    break;
                case 2:
                    WHERE = "WHERE Nombre LIKE '%" + txtBuscar.getText().trim() + "%'";
                    break;
            }
            cargarDatos(WHERE);
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        int Posicion = cboBuscar.getSelectedIndex();
        switch (Posicion) {
            case 0:
                break;
            case 1:
                v.ValidarNit(evt);
                v.limitarCaracteres(evt, 9, txtBuscar);
                break;
            case 2:
                v.limitarCaracteres(evt, 50, txtBuscar);
                break;
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void cboBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBuscarActionPerformed
        int Item = cboBuscar.getSelectedIndex();
        switch (Item) {
            case 0:
                txtBuscar.setText(null);
                txtBuscar.setEnabled(false);
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

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificarRegistro();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtNitClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitClienteKeyTyped
        v.ValidarNit(evt);
    }//GEN-LAST:event_txtNitClienteKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (v.ValidarVacio(jPanel1) != true) {
            try {
                Object[] fila = new Object[5];
                try (CallableStatement procedimiento = conexionbd.getConection().prepareCall("{call InsertarClientes(?, ?, ?, ?)}")) {
                    procedimiento.setString(1, txtNitCliente.getText());
                    procedimiento.setString(2, txtNombre.getText());
                    procedimiento.setString(3, txtApellido.getText());
                    procedimiento.setString(4, txtDireccion.getText());
                    procedimiento.execute();
                    procedimiento.close();

                    modelo.removeRow(jtblDatos.getSelectedRow());

                    fila[0] = txtNitCliente.getText().trim();
                    fila[1] = txtNombre.getText().trim();
                    fila[2] = txtApellido.getText().trim();
                    fila[3] = txtDireccion.getText().trim();
                    modelo.addRow(fila);

                    dialogoModificar.dispose();
                }
                JOptionPane.showMessageDialog(dialogoModificar, "Datos almancenado exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            } finally {
                conexionbd.cerrarConexion();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dialogoModificar.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarRegistro();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        PuntoVenta.btnClientes.setEnabled(true);
    }//GEN-LAST:event_formInternalFrameClosing

    private void jtblDatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtblDatosKeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_DELETE:
                eliminarRegistro();
                break;
            case KeyEvent.VK_M:
                modificarRegistro();
                break;
            case KeyEvent.VK_ENTER:
                agregar();
                break;
        }
    }//GEN-LAST:event_jtblDatosKeyPressed
    private void modificarRegistro() {
        if (jtblDatos.getSelectedRowCount() == 1) {
            int Fila = jtblDatos.getSelectedRow();
            NIT = jtblDatos.getValueAt(Fila, 0).toString();
            if (!jtblDatos.getValueAt(Fila, 0).toString().equals("C/F")) {
                try {
                    String query = "SELECT * FROM Cliente WHERE idCliente = ?";
                    try (PreparedStatement consulta = conexionbd.getConection().prepareStatement(query)) {
                        consulta.setString(1, NIT);
                        try (ResultSet resultado = consulta.executeQuery()) {
                            while (resultado.next()) {
                                txtNitCliente.setText(resultado.getString("idCliente"));
                                txtNombre.setText(resultado.getString("Nombre"));
                                txtApellido.setText(resultado.getString("Apellido"));
                                txtDireccion.setText(resultado.getString("Direccion"));
                            }
                            resultado.close();
                        }
                        consulta.close();
                    }
                    dialogoModificar.setSize(490, 360);
                    dialogoModificar.setLocationRelativeTo(null);
                    dialogoModificar.setVisible(true);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                } finally {
                    conexionbd.cerrarConexion();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Consumidor Final no puede ser modificado", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void eliminarRegistro() {
        if (jtblDatos.getSelectedRowCount() == 1) {
            if (!jtblDatos.getValueAt(jtblDatos.getSelectedRow(), 0).toString().equals("C/F")) {
                int confirmado = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar al cliente?", "Eliminar Cliente", 0, JOptionPane.QUESTION_MESSAGE);
                if (0 == confirmado) {
                    try {
                        String query = "DELETE FROM Cliente WHERE idCliente = ?";
                        try (PreparedStatement consulta = conexionbd.getConection().prepareStatement(query)) {
                            consulta.setString(1, jtblDatos.getValueAt(jtblDatos.getSelectedRow(), 0).toString());
                            consulta.execute();
                            modelo.removeRow(jtblDatos.getSelectedRow());
                            consulta.close();
                        }
                        JOptionPane.showMessageDialog(null, "Cliente eliminado", "Información", JOptionPane.INFORMATION_MESSAGE);
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conexionbd.cerrarConexion();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Consumidor Final no puede ser eliminado", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void agregar() {
        if (jtblDatos.getSelectedRowCount() == 1) {
            PuntoVenta.txtNIT.setText(jtblDatos.getValueAt(jtblDatos.getSelectedRow(), 0).toString());
            PuntoVenta.lblNombre.setText(jtblDatos.getValueAt(jtblDatos.getSelectedRow(), 1).toString());
            PuntoVenta.lblApellido.setText(jtblDatos.getValueAt(jtblDatos.getSelectedRow(), 2).toString());
            PuntoVenta.lblDireccion.setText(jtblDatos.getValueAt(jtblDatos.getSelectedRow(), 3).toString());
            PuntoVenta.btnClientes.setEnabled(true);
            PuntoVenta.txtCodigo.requestFocus();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void cargarDatos(String Where) {
        try {
            modelo = new DefaultTableModel();
            jtblDatos.setModel(modelo);
            String query = "SELECT * FROM Cliente " + Where;
            try (PreparedStatement Consulta = conexionbd.getConection().prepareStatement(query); ResultSet rs = Consulta.executeQuery()) {
                ResultSetMetaData rsMD = rs.getMetaData();
                int cantidadCol = rsMD.getColumnCount();

                modelo.addColumn("NIT");
                modelo.addColumn("Nombre");
                modelo.addColumn("Apellido");
                modelo.addColumn("Direccion");

                int[] anchos = {20, 100, 100, 150};
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
                Consulta.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            conexionbd.cerrarConexion();
        }
    }

    private void tipoUsuario() {
        if ("Estandar".equals(du.getTipoUsuario())) {
            btnModificar.setVisible(false);
            btnEliminar.setVisible(false);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboBuscar;
    private javax.swing.JDialog dialogoModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPanel jpanel;
    private javax.swing.JTable jtblDatos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNitCliente;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

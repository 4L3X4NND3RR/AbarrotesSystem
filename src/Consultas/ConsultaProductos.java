package Consultas;

import Instalacion.DatosUsuario;
import Reportes.ListaProductos;
import Utilidades.ConexionBD;
import Utilidades.DatosConexion;
import Utilidades.Validaciones;
import Utilidades.empresaLogo;
import Venta.PuntoVenta;
import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
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

public class ConsultaProductos extends javax.swing.JInternalFrame {

    Validaciones v = new Validaciones();
    DatosConexion dc = new DatosConexion();
    Properties properties;
    DatosUsuario du;
    private static final ConexionBD conexionbd = ConexionBD.comprobarEstado();
    DefaultTableModel modelo;
    String Where = "";
    Date FechaActual = Date.valueOf(LocalDate.now());
    private static String CodigoProducto = "";

    public ConsultaProductos() {
        initComponents();
    }

    public ConsultaProductos(DatosUsuario du) {
        this.du = du;
        initComponents();
        tipoUsuario();
        cargarDatos(Where);
        jtblDatos.requestFocus();
        txtBuscar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogoConfigurar = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtRangoDias = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtRangoStock = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        dialogoModificar = new javax.swing.JDialog();
        panel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtDescripcion = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jDateFechaVencimiento = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        chkAnadirStock = new javax.swing.JCheckBox();
        btnGuardarProducto = new javax.swing.JButton();
        btnSalirModificar = new javax.swing.JButton();
        jpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDatos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        cboListarPor = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnConfigurar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        cboBuscarPor = new javax.swing.JComboBox<>();

        dialogoConfigurar.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoConfigurar.setTitle("Configurar rangos");
        dialogoConfigurar.setModal(true);
        dialogoConfigurar.setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Rango de dias a vencer:");
        jLabel4.setToolTipText("");

        txtRangoDias.setBackground(new java.awt.Color(244, 244, 244));
        txtRangoDias.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtRangoDias.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtRangoDias.setBorder(null);
        txtRangoDias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRangoDiasKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Rango de stock:");
        jLabel5.setToolTipText("");

        txtRangoStock.setBackground(new java.awt.Color(244, 244, 244));
        txtRangoStock.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtRangoStock.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtRangoStock.setBorder(null);
        txtRangoStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRangoStockKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator4)
                    .addComponent(txtRangoStock)
                    .addComponent(jSeparator2)
                    .addComponent(txtRangoDias, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRangoDias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRangoStock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnGuardar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogoConfigurarLayout = new javax.swing.GroupLayout(dialogoConfigurar.getContentPane());
        dialogoConfigurar.getContentPane().setLayout(dialogoConfigurarLayout);
        dialogoConfigurarLayout.setHorizontalGroup(
            dialogoConfigurarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoConfigurarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(dialogoConfigurarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dialogoConfigurarLayout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        dialogoConfigurarLayout.setVerticalGroup(
            dialogoConfigurarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoConfigurarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(dialogoConfigurarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnSalir))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        dialogoModificar.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoModificar.setTitle("Modificar Producto");
        dialogoModificar.setModal(true);
        dialogoModificar.setResizable(false);

        panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Precio:");
        jLabel6.setToolTipText("");
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

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
        panel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 150, 10));

        txtDescripcion.setBackground(new java.awt.Color(244, 244, 244));
        txtDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDescripcion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDescripcion.setBorder(null);
        panel.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 270, 30));
        panel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 270, 10));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Codigo:");
        jLabel7.setToolTipText("");
        panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

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
        panel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 100, 10));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Descripcion:");
        jLabel8.setToolTipText("");
        panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setText("Fecha de Vencimiento:");
        jLabel9.setToolTipText("");
        panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

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
        panel.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 100, 10));

        jDateFechaVencimiento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        panel.add(jDateFechaVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 140, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText("Stock:");
        jLabel10.setToolTipText("");
        panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setText("Marca:");
        jLabel11.setToolTipText("");
        panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtMarca.setBackground(new java.awt.Color(244, 244, 244));
        txtMarca.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtMarca.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtMarca.setBorder(null);
        panel.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 150, 30));
        panel.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 150, 10));

        chkAnadirStock.setText("Añadir a Stock");
        panel.add(chkAnadirStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        btnGuardarProducto.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnGuardarProducto.setText("Guardar");
        btnGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProductoActionPerformed(evt);
            }
        });

        btnSalirModificar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSalirModificar.setText("Salir");
        btnSalirModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogoModificarLayout = new javax.swing.GroupLayout(dialogoModificar.getContentPane());
        dialogoModificar.getContentPane().setLayout(dialogoModificarLayout);
        dialogoModificarLayout.setHorizontalGroup(
            dialogoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoModificarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(dialogoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dialogoModificarLayout.createSequentialGroup()
                        .addComponent(btnGuardarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalirModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        dialogoModificarLayout.setVerticalGroup(
            dialogoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoModificarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dialogoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalirModificar)
                    .addComponent(btnGuardarProducto))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setClosable(true);
        setTitle("Consulta Productos");
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
        jpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

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
        jpanel.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 270, 30));
        jpanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 270, 10));

        jScrollPane1.setBorder(null);

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

        jpanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 710, 330));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Listar Por", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboListarPor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cboListarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todo", "Proximos a agotarse", "Agotados", "Proximos a vencer", "Vencidos" }));
        cboListarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboListarPorActionPerformed(evt);
            }
        });
        jPanel2.add(cboListarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnModificar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel3.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, -1));

        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, -1));

        btnAgregar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 110, -1));

        btnConfigurar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnConfigurar.setText("Configurar");
        btnConfigurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigurarActionPerformed(evt);
            }
        });
        jPanel3.add(btnConfigurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, -1));

        btnImprimir.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jPanel3.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 110, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Buscar Por", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboBuscarPor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cboBuscarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "Codigo", "Descripción", "Marca" }));
        cboBuscarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBuscarPorActionPerformed(evt);
            }
        });
        jPanel4.add(cboBuscarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        int Posicion = cboBuscarPor.getSelectedIndex();
        switch (Posicion) {
            case 0:
                break;
            case 1:
                v.ValidarNumeros(evt);
                v.limitarCaracteres(evt, 15, txtBuscar);
                break;
            case 2:
                v.limitarCaracteres(evt, 50, txtBuscar);
                break;
            case 3:
                v.limitarCaracteres(evt, 45, txtBuscar);
                break;
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER) {
            switch (cboBuscarPor.getSelectedIndex()) {
                case 1:
                    Where = "WHERE idProducto LIKE '%" + txtBuscar.getText().trim() + "%'";
                    break;
                case 2:
                    Where = "WHERE DescripcionProducto LIKE '%" + txtBuscar.getText().trim() + "%'";
                    break;
                case 3:
                    Where = "WHERE Marca LIKE '%" + txtBuscar.getText() + "%'";
            }
            cargarDatos(Where);
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void cboListarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboListarPorActionPerformed
        int Item = cboListarPor.getSelectedIndex();
        switch (Item) {
            case 0:
                Where = "";
                break;
            case 1:
                Where = "WHERE Stock < '" + dc.getRangoStock() + "'";
                break;
            case 2:
                Where = "WHERE Stock = 0";
                break;
            case 3:
                Where = "WHERE DiasParaVencer < '" + dc.getRangoDias() + "'";
                break;
            case 4:
                Where = "WHERE DiasParaVencer = 0";
                break;
        }
        cargarDatos(Where);
    }//GEN-LAST:event_cboListarPorActionPerformed

    private void cboBuscarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBuscarPorActionPerformed
        int Item = cboBuscarPor.getSelectedIndex();
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
            case 3:
                txtBuscar.setText(null);
                txtBuscar.setEnabled(true);
                txtBuscar.requestFocus();
                break;
        }
    }//GEN-LAST:event_cboBuscarPorActionPerformed

    private void txtRangoDiasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRangoDiasKeyTyped
        v.ValidarNumeros(evt);
    }//GEN-LAST:event_txtRangoDiasKeyTyped

    private void txtRangoStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRangoStockKeyTyped
        v.ValidarNumeros(evt);
    }//GEN-LAST:event_txtRangoStockKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (v.ValidarVacio(jPanel1) != true) {
            try (FileReader reader = new FileReader("Config")) {
                properties = new Properties();
                properties.load(reader);
                properties.setProperty("RangoDias", txtRangoDias.getText().trim());
                properties.setProperty("RangoStock", txtRangoStock.getText().trim());
                properties.store(new FileWriter("Config"), "un comentario");
                dialogoConfigurar.dispose();
                JOptionPane.showMessageDialog(null, "Datos guardados exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnConfigurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigurarActionPerformed
        txtRangoDias.setText(dc.getRangoDias());
        txtRangoStock.setText(dc.getRangoStock());
        dialogoConfigurar.setSize(385, 291);
        dialogoConfigurar.setLocationRelativeTo(null);
        dialogoConfigurar.setVisible(true);
    }//GEN-LAST:event_btnConfigurarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dialogoConfigurar.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificarRegistro();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        v.ValidarNumeros(evt);
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        v.ValidarDecimales(evt);
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyTyped
        v.ValidarNumeros(evt);
    }//GEN-LAST:event_txtStockKeyTyped

    private void btnSalirModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirModificarActionPerformed
        dialogoModificar.dispose();
    }//GEN-LAST:event_btnSalirModificarActionPerformed

    private void btnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProductoActionPerformed
        if (v.ValidarVacio(panel) != true && FechaActual.compareTo(jDateFechaVencimiento.getDate()) < 0) {
            try {
                String FechaVencimiento;
                int diasParaVencer;
                Object[] fila;
                try (CallableStatement procedimiento = conexionbd.getConection().prepareCall("{call InsertarProducto(?, ?, ?, ?, ?, ?, ?)}")) {
                    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                    FechaVencimiento = formato.format(jDateFechaVencimiento.getDate());
                    Date FechaVe = Date.valueOf(FechaVencimiento);
                    diasParaVencer = (int) ((FechaVe.getTime() - FechaActual.getTime()) / 86400000) + 1;
                    fila = new Object[7];
                    procedimiento.setString(1, txtCodigo.getText().trim());
                    procedimiento.setString(2, txtDescripcion.getText().trim());
                    procedimiento.setString(3, txtMarca.getText().trim());
                    procedimiento.setFloat(4, Float.parseFloat(txtPrecio.getText().trim()));
                    if (chkAnadirStock.isSelected()) {
                        int NuevoStock = Integer.parseInt(txtStock.getText());
                        String query = "SELECT Stock FROM Producto WHERE idProducto = ?";
                        PreparedStatement consulta = conexionbd.getConection().prepareStatement(query);
                        consulta.setString(1, CodigoProducto);
                        ResultSet resultado = consulta.executeQuery();
                        while (resultado.next()) {
                            NuevoStock += resultado.getInt("Stock");

                        }
                        procedimiento.setInt(5, NuevoStock);
                        fila[4] = NuevoStock;
                    } else {
                        procedimiento.setInt(5, Integer.parseInt(txtStock.getText().trim()));
                        fila[4] = txtStock.getText();
                    }
                    procedimiento.setDate(6, Date.valueOf(FechaVencimiento));
                    procedimiento.setInt(7, diasParaVencer);
                    procedimiento.execute();
                    procedimiento.close();
                }

                modelo.removeRow(jtblDatos.getSelectedRow());

                fila[0] = txtCodigo.getText();
                fila[1] = txtDescripcion.getText();
                fila[2] = txtMarca.getText();
                fila[3] = txtPrecio.getText();
                fila[5] = FechaVencimiento;
                fila[6] = diasParaVencer;
                modelo.addRow(fila);

                dialogoModificar.dispose();
                JOptionPane.showMessageDialog(null, "Datos almancenado exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            } finally {
                conexionbd.cerrarConexion();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fecha Incorrecta");
        }
    }//GEN-LAST:event_btnGuardarProductoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarRegistro();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        PuntoVenta.btnProductos.setEnabled(true);
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        imprimir();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void jtblDatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtblDatosKeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_M:
                modificarRegistro();
                break;
            case KeyEvent.VK_DELETE:
                eliminarRegistro();
                break;
            case KeyEvent.VK_ENTER:
                agregar();
                break;
        }
        if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_L) {
            imprimir();
        }
    }//GEN-LAST:event_jtblDatosKeyPressed
    private void eliminarRegistro() {
        int Fila = jtblDatos.getSelectedRow();
        if (jtblDatos.getSelectedRowCount() == 1) {
            int confirmado = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar el producto?", "Eliminar Producto", 0, JOptionPane.QUESTION_MESSAGE);
            if (0 == confirmado) {
                CodigoProducto = jtblDatos.getValueAt(Fila, 0).toString();
                try {
                    String query = "DELETE FROM Producto WHERE idProducto = ?";
                    try (PreparedStatement Consulta = conexionbd.getConection().prepareStatement(query)) {
                        Consulta.setString(1, CodigoProducto);
                        Consulta.execute();
                        Consulta.close();
                    }
                    modelo.removeRow(Fila);
                    JOptionPane.showMessageDialog(null, "Producto eliminado", "Información", JOptionPane.INFORMATION_MESSAGE);
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

    private void modificarRegistro() {
        int Fila = jtblDatos.getSelectedRow();
        if (jtblDatos.getSelectedRowCount() == 1) {
            CodigoProducto = jtblDatos.getValueAt(Fila, 0).toString();
            try {
                String query = "SELECT * FROM Producto WHERE idProducto = ?";
                try (PreparedStatement Consulta = conexionbd.getConection().prepareStatement(query)) {
                    Consulta.setString(1, CodigoProducto);
                    try (ResultSet resultado = Consulta.executeQuery()) {
                        while (resultado.next()) {
                            txtCodigo.setText(resultado.getString("idProducto"));
                            txtDescripcion.setText(resultado.getString("DescripcionProducto"));
                            txtMarca.setText(resultado.getString("Marca"));
                            txtPrecio.setText(resultado.getString("Precio"));
                            txtStock.setText(resultado.getString("Stock"));
                            jDateFechaVencimiento.setDate(resultado.getDate("FechaVencimiento"));
                        }
                        resultado.close();
                    }
                    Consulta.close();
                }
                dialogoModificar.setSize(500, 455);
                dialogoModificar.setLocationRelativeTo(null);
                dialogoModificar.setVisible(true);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            } finally {
                conexionbd.cerrarConexion();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void agregar() {
        if (jtblDatos.getSelectedRowCount() == 1) {
            int Fila = jtblDatos.getSelectedRow();
            PuntoVenta.txtCodigo.setText(jtblDatos.getValueAt(Fila, 0).toString());
            PuntoVenta.lblDescripcion.setText(jtblDatos.getValueAt(Fila, 1).toString());
            PuntoVenta.lblPrecio.setText(jtblDatos.getValueAt(Fila, 3).toString());
            PuntoVenta.txtCantidad.requestFocus();
            PuntoVenta.btnProductos.setEnabled(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void imprimir() {
        List lista = new ArrayList();
        for (int i = 0; i < jtblDatos.getRowCount(); i++) {
            String Codigo, Descripcion, Marca, Precio, Stock, DiasParaVencer;
            Codigo = jtblDatos.getValueAt(i, 0).toString();
            Descripcion = jtblDatos.getValueAt(i, 1).toString();
            Marca = jtblDatos.getValueAt(i, 2).toString();
            Precio = jtblDatos.getValueAt(i, 3).toString();
            Stock = jtblDatos.getValueAt(i, 4).toString();
            DiasParaVencer = jtblDatos.getValueAt(i, 6).toString();
            ListaProductos lp = new ListaProductos(Codigo, Descripcion, Marca, Precio, Stock, DiasParaVencer);
            lista.add(lp);
        }
        try {
            JasperReport reporte = (JasperReport) JRLoader.loadObject("Productos.jasper");
            Map parametro = new HashMap();
            parametro.put("FiltradoPor", cboListarPor.getSelectedItem());
            parametro.put("logo", empresaLogo.getLogo().getImage());
            JRBeanCollectionDataSource Datos = new JRBeanCollectionDataSource(lista);
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, Datos);
            JasperViewer jv = new JasperViewer(jprint, false);
            jv.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/IconoSistema.png")).getImage());
            jv.setTitle("Listado de Productos");
            jv.setVisible(true);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargarDatos(String Where) {
        try {
            modelo = new DefaultTableModel();
            jtblDatos.setModel(modelo);
            String query = "SELECT * FROM Producto " + Where;
            PreparedStatement Consulta = conexionbd.getConection().prepareStatement(query);
            try (ResultSet rs = Consulta.executeQuery()) {
                ResultSetMetaData rsMD = rs.getMetaData();
                int cantidadCol = rsMD.getColumnCount();

                modelo.addColumn("Código");
                modelo.addColumn("Descripción");
                modelo.addColumn("Marca");
                modelo.addColumn("Precio");
                modelo.addColumn("Stock");
                modelo.addColumn("Fecha de vencimiento");
                modelo.addColumn("Dias para vencer");

                int[] anchos = {20, 140, 20, 6, 6, 60, 55};
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
            }
            Consulta.close();
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
    private javax.swing.JButton btnConfigurar;
    public javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarProducto;
    private javax.swing.JButton btnImprimir;
    public javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalirModificar;
    private javax.swing.JComboBox<String> cboBuscarPor;
    private javax.swing.JComboBox<String> cboListarPor;
    private javax.swing.JCheckBox chkAnadirStock;
    private javax.swing.JDialog dialogoConfigurar;
    private javax.swing.JDialog dialogoModificar;
    private com.toedter.calendar.JDateChooser jDateFechaVencimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel jpanel;
    private javax.swing.JTable jtblDatos;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtRangoDias;
    private javax.swing.JTextField txtRangoStock;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}

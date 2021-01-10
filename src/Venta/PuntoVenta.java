package Venta;

import Consultas.ConsultaClientes;
import Consultas.ConsultaProductos;
import Instalacion.DatosUsuario;
import Principal.Principal;
import Registros.Clientes;
import Registros.Productos;
import Utilidades.CentrarTabla;
import Utilidades.ConexionBD;
import Utilidades.DatosConexion;
import Utilidades.Validaciones;
import Utilidades.empresaLogo;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.text.DecimalFormat;
import java.time.LocalDate;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class PuntoVenta extends javax.swing.JInternalFrame {

    ConsultaClientes cc;
    ConsultaProductos cp;
    DatosUsuario du;
    Validaciones v = new Validaciones();
    DatosConexion dc = new DatosConexion();
    DecimalFormat formatodecimal = new DecimalFormat("0.00");

    PreparedStatement consulta = null;
    ResultSet resultado = null;
    CallableStatement procedimiento = null;
    private static final ConexionBD conexionbd = ConexionBD.comprobarEstado();
    String query = null;

    int Respuesta;
    DefaultTableModel modelo;
    private static int contadorFilas = 0;
    private static float Total = 0;
    private static float Cambio = 0;
    float Stock, Cantidad, NuevoStock, Precio;
    String Codigo = null;

    public PuntoVenta() {
        initComponents();
    }

    public PuntoVenta(DatosUsuario du, ConsultaClientes cc, ConsultaProductos cp) {
        this.cc = cc;
        this.cp = cp;
        this.du = du;
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        mostrarFecha();
        setVisible(true);
        asignarModelo();
        cargarLogo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogoConfigurar = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtIVA = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtCorteCaja = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNIT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnFactuar = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnConfigurar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtEfectivo = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblCambio = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblTotalSinIVA = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        lblIVA = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDatos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lblDescripcion = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        lblPrecio = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        txtCodigo = new app.bolivia.swing.JCTextField();
        jSeparator17 = new javax.swing.JSeparator();
        txtCantidad = new app.bolivia.swing.JCTextField();
        jSeparator18 = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JButton();
        chkCantidad = new javax.swing.JCheckBox();
        lblNombreUsuario = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

        dialogoConfigurar.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoConfigurar.setModal(true);
        dialogoConfigurar.setResizable(false);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("IVA:");
        jLabel5.setToolTipText("");

        txtIVA.setBackground(new java.awt.Color(244, 244, 244));
        txtIVA.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtIVA.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtIVA.setBorder(null);
        txtIVA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIVAKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Corte de caja:");
        jLabel6.setToolTipText("");

        txtCorteCaja.setBackground(new java.awt.Color(244, 244, 244));
        txtCorteCaja.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCorteCaja.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCorteCaja.setBorder(null);
        txtCorteCaja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorteCajaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIVA, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtCorteCaja)
                    .addComponent(jSeparator9)
                    .addComponent(jSeparator16))
                .addGap(41, 41, 41))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorteCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout dialogoConfigurarLayout = new javax.swing.GroupLayout(dialogoConfigurar.getContentPane());
        dialogoConfigurar.getContentPane().setLayout(dialogoConfigurarLayout);
        dialogoConfigurarLayout.setHorizontalGroup(
            dialogoConfigurarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoConfigurarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(dialogoConfigurarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dialogoConfigurarLayout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        dialogoConfigurarLayout.setVerticalGroup(
            dialogoConfigurarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoConfigurarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dialogoConfigurarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnSalir))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Apellido:");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Direccion:");
        jLabel3.setToolTipText("");

        txtNIT.setBackground(new java.awt.Color(244, 244, 244));
        txtNIT.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNIT.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNIT.setBorder(null);
        txtNIT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNITKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNITKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("NIT:");
        jLabel4.setToolTipText("");

        lblNombre.setBackground(new java.awt.Color(244, 244, 244));
        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblApellido.setBackground(new java.awt.Color(244, 244, 244));
        lblApellido.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(0, 0, 0));
        lblApellido.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblDireccion.setBackground(new java.awt.Color(255, 51, 0));
        lblDireccion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(57, 57, 57)
                            .addComponent(txtNIT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(19, 19, 19)
                                .addComponent(lblApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(lblDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(9, 9, 9))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addComponent(txtNIT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2))
                            .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnFactuar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnFactuar.setText("Facturar");
        btnFactuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactuarActionPerformed(evt);
            }
        });
        btnFactuar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnFactuarKeyPressed(evt);
            }
        });

        btnClientes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnProductos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnConfigurar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnConfigurar.setText("Configurar");
        btnConfigurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigurarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar Venta");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFactuar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(btnConfigurar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFactuar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConfigurar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText("Efectivo:");
        jLabel10.setToolTipText("");

        txtEfectivo.setBackground(new java.awt.Color(244, 244, 244));
        txtEfectivo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEfectivo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEfectivo.setBorder(null);
        txtEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEfectivoKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEfectivoKeyPressed(evt);
            }
        });

        lblCambio.setBackground(new java.awt.Color(244, 244, 244));
        lblCambio.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCambio.setForeground(new java.awt.Color(0, 0, 0));
        lblCambio.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setText("Cambio:");
        jLabel13.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setText("Total Sin IVA:");
        jLabel14.setToolTipText("");

        lblTotalSinIVA.setBackground(new java.awt.Color(244, 244, 244));
        lblTotalSinIVA.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTotalSinIVA.setForeground(new java.awt.Color(0, 0, 0));
        lblTotalSinIVA.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setText("TOTAL:");
        jLabel15.setToolTipText("");

        lblTotal.setBackground(new java.awt.Color(244, 244, 244));
        lblTotal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(0, 0, 0));
        lblTotal.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setText("IVA:");
        jLabel16.setToolTipText("");

        lblIVA.setBackground(new java.awt.Color(244, 244, 244));
        lblIVA.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblIVA.setForeground(new java.awt.Color(0, 0, 0));
        lblIVA.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6)
                    .addComponent(txtEfectivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator7)
                    .addComponent(lblCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator14)
                    .addComponent(lblIVA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator8)
                    .addComponent(lblTotalSinIVA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator13)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(lblTotalSinIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15))
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(lblCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel13))
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16)
                                .addComponent(jLabel14))
                            .addGap(0, 0, 0)
                            .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 9, Short.MAX_VALUE))
        );

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

        lblDescripcion.setBackground(new java.awt.Color(244, 244, 244));
        lblDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        lblDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescripcion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblPrecio.setBackground(new java.awt.Color(244, 244, 244));
        lblPrecio.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecio.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txtCodigo.setBackground(new java.awt.Color(244, 244, 244));
        txtCodigo.setBorder(null);
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtCodigo.setPlaceholder("Código");
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });

        txtCantidad.setBackground(new java.awt.Color(244, 244, 244));
        txtCantidad.setBorder(null);
        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidad.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtCantidad.setPlaceholder("Cantidad");
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jSeparator11))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(jSeparator15))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        btnAgregar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblNombreUsuario.setFont(new java.awt.Font("Arial Unicode MS", 1, 36)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(153, 153, 153));
        lblNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblFecha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(153, 153, 153));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("viernes 11 marzo de 2018");
        lblFecha.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkCantidad)
                                .addGap(6, 6, 6))
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(14, 14, 14)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(chkCantidad))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNITKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNITKeyTyped
        v.ValidarNit(evt);
        v.limitarCaracteres(evt, 9, txtNIT);
    }//GEN-LAST:event_txtNITKeyTyped

    private void txtEfectivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEfectivoKeyTyped
        v.ValidarDecimales(evt);
        v.limitarCaracteres(evt, 5, txtEfectivo);
    }//GEN-LAST:event_txtEfectivoKeyTyped

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        abrirClientes();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        abrirProductos();
    }//GEN-LAST:event_btnProductosActionPerformed

    private void txtNITKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNITKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_C) {
            abrirClientes();
        } else if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            try {
                if (txtNIT.getText().equals("")) {
                    query = "SELECT * FROM Cliente WHERE idCliente ='C/F'";
                } else {
                    query = "SELECT * FROM Cliente WHERE idCliente = '" + txtNIT.getText().trim() + "'";
                }
                consulta = conexionbd.getConection().prepareStatement(query);
                resultado = consulta.executeQuery();
                if (resultado.next()) {
                    txtNIT.setText(resultado.getString("idCliente"));
                    lblNombre.setText(resultado.getString("Nombre"));
                    lblApellido.setText(resultado.getString("Apellido"));
                    lblDireccion.setText(resultado.getString("Direccion"));
                    txtCodigo.requestFocus();
                } else {
                    Respuesta = JOptionPane.showConfirmDialog(null, "¿El cliente aun no ha sido registrado, desea registrarlo?", "Registrar cliente", 0, JOptionPane.QUESTION_MESSAGE);
                    if (0 == Respuesta) {
                        Clientes c = new Clientes();
                        Principal.panelPrincipal.add(c);
                        Clientes.txtNitCliente.setText(txtNIT.getText());
                        Clientes.txtNombre.requestFocus();
                        c.setVisible(true);
                        c.setLocation((Principal.panelPrincipal.getSize().width - c.getSize().width) / 2, (Principal.panelPrincipal.getSize().height - c.getSize().height) / 2);
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            } finally {
                conexionbd.cerrarConexion();
            }
        }
    }//GEN-LAST:event_txtNITKeyPressed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (!v.ValidarVacio(jPanel4)) {
            Agregar();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarVenta();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (contadorFilas > 0) {
            for (int i = contadorFilas - 1; i >= 0; i--) {
                try {
                    Codigo = jtblDatos.getValueAt(i, 0).toString();
                    query = "SELECT Stock FROM Producto WHERE idProducto = '" + Codigo + "'";
                    consulta = conexionbd.getConection().prepareStatement(query);
                    resultado = consulta.executeQuery();
                    if (resultado.next()) {
                        Stock = Float.parseFloat(resultado.getString("Stock"));
                        Cantidad = Float.parseFloat(jtblDatos.getValueAt(i, 3).toString());
                        NuevoStock = Stock + Cantidad;
                        procedimiento = conexionbd.getConection().prepareCall("{call ActualizarStock(?, ?)}");
                        procedimiento.setInt(1, (int) NuevoStock);
                        procedimiento.setString(2, Codigo);
                        procedimiento.execute();
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                } finally {
                    conexionbd.cerrarConexion();
                }
            }
        }
        Limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtIVAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIVAKeyTyped
        v.ValidarNumeros(evt);
    }//GEN-LAST:event_txtIVAKeyTyped

    private void txtCorteCajaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorteCajaKeyTyped
        v.ValidarDecimales(evt);
    }//GEN-LAST:event_txtCorteCajaKeyTyped

    private void btnConfigurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigurarActionPerformed
        txtIVA.setText(dc.getIVA());
        txtCorteCaja.setText(dc.getCorteCaja());
        dialogoConfigurar.setSize(380, 280);
        dialogoConfigurar.setLocationRelativeTo(null);
        dialogoConfigurar.setVisible(true);
    }//GEN-LAST:event_btnConfigurarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (v.ValidarVacio(jPanel5) != true) {
            dc.setIVA(txtIVA.getText());
            dc.setCorteCaja(txtCorteCaja.getText());
            JOptionPane.showMessageDialog(null, "Datos guardados exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            dialogoConfigurar.dispose();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dialogoConfigurar.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtEfectivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEfectivoKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_ENTER && !v.ValidarVacio(jPanel3)) {
            float Efectivo = Float.parseFloat(txtEfectivo.getText());
            float TotalCompleto = Float.parseFloat(lblTotal.getText());
            float Caja = Float.parseFloat(dc.getCorteCaja());
            if (TotalCompleto < Efectivo) {
                if (Caja > Cambio) {
                    Cambio = Efectivo - TotalCompleto;
                    lblCambio.setText("" + formatodecimal.format(Cambio));
                    btnFactuar.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Necesita ingresar mas dinero en corte de caja", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Necesita mas efectivo", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtEfectivoKeyPressed

    private void btnFactuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactuarActionPerformed
        if (!v.ValidarVacio(jPanel1) && !v.ValidarVacio(jPanel3)) {
            Facturar();
        }
    }//GEN-LAST:event_btnFactuarActionPerformed

    private void btnFactuarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnFactuarKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            if (!v.ValidarVacio(jPanel1) && !v.ValidarVacio(jPanel3)) {
                Facturar();
            }
        }
    }//GEN-LAST:event_btnFactuarKeyPressed

    private void jtblDatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtblDatosKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_DELETE) {
            eliminarVenta();
        } else if (evt.getKeyCode() == KeyEvent.VK_C) {
            txtCodigo.requestFocus();
        }
    }//GEN-LAST:event_jtblDatosKeyPressed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        v.ValidarNumeros(evt);
        v.limitarCaracteres(evt, 50, txtCodigo);
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        v.ValidarNumeros(evt);
        v.limitarCaracteres(evt, 6, txtCantidad);
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_E:
                txtEfectivo.requestFocus();
                break;
            case KeyEvent.VK_T:
                jtblDatos.requestFocus();
                break;
            case KeyEvent.VK_P:
                abrirProductos();
                break;
            case KeyEvent.VK_C:
                if (chkCantidad.isSelected()) {
                    chkCantidad.setSelected(false);
                } else {
                    chkCantidad.setSelected(true);
                }
                break;
            case KeyEvent.VK_ENTER:
                if (txtCodigo.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "No pueden haber campos vacios", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    try {
                        query = "SELECT * FROM Producto WHERE idProducto LIKE '%" + txtCodigo.getText().trim() + "%'";
                        consulta = conexionbd.getConection().prepareStatement(query);
                        resultado = consulta.executeQuery();
                        if (!resultado.next()) {
                            Respuesta = JOptionPane.showConfirmDialog(null, "¿El producto ingresado aun no ha sido registrado, desea registrarlo?", "Registrar producto", 0, JOptionPane.QUESTION_MESSAGE);
                            if (0 == Respuesta) {
                                Productos productos = new Productos();
                                Principal.panelPrincipal.add(productos);
                                productos.setVisible(true);
                                productos.setLocation((Principal.panelPrincipal.getSize().width - productos.getSize().width) / 2, (Principal.panelPrincipal.getSize().height - productos.getSize().height) / 2);
                                Productos.txtCodigo.setText(txtCodigo.getText());
                                Productos.txtDescripcion.requestFocus();
                            }
                        } else {
                            Stock = Float.parseFloat(resultado.getString("Stock"));
                            if (Stock > 0) {
                                txtCodigo.setText(resultado.getString("idProducto"));
                                lblDescripcion.setText(resultado.getString("DescripcionProducto"));
                                lblPrecio.setText(resultado.getString("Precio"));
                                if (chkCantidad.isSelected()) {
                                    txtCantidad.requestFocus();
                                } else {
                                    txtCantidad.setText("1");
                                    Agregar();
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Producto agotado", "InformaciÛn", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conexionbd.cerrarConexion();
                    }
                }
                break;
        }
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!v.ValidarVacio(jPanel4)) {
                Agregar();
            }
        }
    }//GEN-LAST:event_txtCantidadKeyPressed
    private void abrirClientes() {
        if (Principal.estacerrado(cc)) {
            cc = new ConsultaClientes(du);
            Principal.panelPrincipal.add(cc);
            cc.setVisible(true);
            cc.setLocation((Principal.panelPrincipal.getSize().width - cc.getSize().width) / 2, (Principal.panelPrincipal.getSize().height - cc.getSize().height) / 2);
        } else {
            JOptionPane.showMessageDialog(null, "La ventana clientes ya se encuentra abierta", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void abrirProductos() {
        if (Principal.estacerrado(cp)) {
            cp = new ConsultaProductos(du);
            Principal.panelPrincipal.add(cp);
            cp.setVisible(true);
            cp.setLocation((Principal.panelPrincipal.getSize().width - cp.getSize().width) / 2, (Principal.panelPrincipal.getSize().height - cp.getSize().height) / 2);
        } else {
            JOptionPane.showMessageDialog(null, "La ventana productos ya se encuentra abierta", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void asignarModelo() {
        modelo = new DefaultTableModel();
        jtblDatos.setModel(modelo);

        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Sub Total");

        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        jtblDatos.getColumnModel().getColumn(0).setCellRenderer(tcr);
        jtblDatos.getColumnModel().getColumn(1).setCellRenderer(tcr);
        jtblDatos.getColumnModel().getColumn(2).setCellRenderer(tcr);
        jtblDatos.getColumnModel().getColumn(3).setCellRenderer(tcr);
        jtblDatos.getColumnModel().getColumn(4).setCellRenderer(tcr);

        JTableHeader header = jtblDatos.getTableHeader();
        header.setDefaultRenderer(new CentrarTabla(jtblDatos));
    }

    private void mostrarFecha() {
        Date today;
        DateFormat dateFormatter;
        String dateOut;

        dateFormatter = DateFormat.getDateInstance(DateFormat.FULL);
        today = Date.valueOf(LocalDate.now());

        dateOut = dateFormatter.format(today);

        lblFecha.setText(dateOut);
    }

    private void Agregar() {
        boolean band = false;
        int indiceFila = 0;
        float NuevaCantidad;
        float NuevoSubTotal;
        float SubTotal;

        Object[] fila = new Object[5];

        if (stockDisponible() == true) {
            if (contadorFilas == 0) {

                fila[0] = txtCodigo.getText().trim();
                fila[1] = lblDescripcion.getText();
                fila[2] = lblPrecio.getText();
                fila[3] = txtCantidad.getText();
                modelo.addRow(fila);
                Precio = Float.parseFloat(jtblDatos.getValueAt(contadorFilas, 2).toString());
                Cantidad = Float.parseFloat(jtblDatos.getValueAt(contadorFilas, 3).toString());
                SubTotal = Precio * Cantidad;
                jtblDatos.setValueAt(SubTotal, contadorFilas, 4);
                contadorFilas++;
            } else {
                for (int i = 0; i < jtblDatos.getRowCount(); i++) {
                    if (jtblDatos.getValueAt(i, 0).toString().equals(txtCodigo.getText().trim())) {
                        band = true;
                        indiceFila = i;
                    }
                }
                if (band) {
                    NuevaCantidad = Float.parseFloat(txtCantidad.getText()) + Float.parseFloat(jtblDatos.getValueAt(indiceFila, 3).toString());
                    jtblDatos.setValueAt(NuevaCantidad, indiceFila, 3);
                    NuevoSubTotal = Float.parseFloat(jtblDatos.getValueAt(indiceFila, 2).toString()) * Float.parseFloat(jtblDatos.getValueAt(indiceFila, 3).toString());
                    jtblDatos.setValueAt(NuevoSubTotal, indiceFila, 4);
                } else {
                    fila[0] = txtCodigo.getText().trim();
                    fila[1] = lblDescripcion.getText();
                    fila[2] = lblPrecio.getText();
                    fila[3] = txtCantidad.getText();
                    modelo.addRow(fila);
                    Precio = Float.parseFloat(jtblDatos.getValueAt(contadorFilas, 2).toString());
                    Cantidad = Float.parseFloat(jtblDatos.getValueAt(contadorFilas, 3).toString());
                    SubTotal = Precio * Cantidad;
                    jtblDatos.setValueAt(SubTotal, contadorFilas, 4);
                    contadorFilas++;
                }
            }
            txtCodigo.setText(null);
            lblDescripcion.setText(null);
            lblPrecio.setText(null);
            txtCantidad.setText(null);
            txtCodigo.requestFocus();
            Total = 0;

            for (int i = 0; i < jtblDatos.getRowCount(); i++) {
                Total += Float.parseFloat(jtblDatos.getValueAt(i, 4).toString());
            }
            lblTotalSinIVA.setText("" + formatodecimal.format(Total));
            float Iva = ((Total * Float.parseFloat(dc.getIVA())) / 100);
            lblIVA.setText("" + formatodecimal.format(Iva));
            lblTotal.setText("" + formatodecimal.format(Total + Iva));
        }
    }

    private boolean stockDisponible() {
        try {
            query = "SELECT Stock FROM Producto WHERE idProducto LIKE '%" + txtCodigo.getText().trim() + "%'";
            consulta = conexionbd.getConection().prepareStatement(query);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                Stock = Float.parseFloat(resultado.getString("Stock"));
                if (Stock == 0) {
                    JOptionPane.showMessageDialog(null, "Producto agotado", "Información", JOptionPane.INFORMATION_MESSAGE);
                    txtCodigo.setText(null);
                    txtCodigo.requestFocus();
                    return false;
                } else if (Stock < Integer.parseInt(txtCantidad.getText().trim())) {
                    JOptionPane.showMessageDialog(null, "Nada mas hay en exitencias " + Stock, "Información", JOptionPane.INFORMATION_MESSAGE);
                    txtCantidad.requestFocus();
                    return false;
                } else {
                    NuevoStock = Stock - Integer.parseInt(txtCantidad.getText());
                    procedimiento = conexionbd.getConection().prepareCall("{call ActualizarStock(?, ?)}");
                    procedimiento.setString(1, "" + (int) NuevoStock);
                    procedimiento.setString(2, txtCodigo.getText().trim());
                    procedimiento.execute();
                    return true;
                }
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            conexionbd.cerrarConexion();
        }
    }

    private void eliminarVenta() {
        if (contadorFilas > 0 && jtblDatos.getSelectedRowCount() == 1) {
            try {
                Codigo = jtblDatos.getValueAt(jtblDatos.getSelectedRow(), 0).toString();
                query = "SELECT Stock FROM Producto WHERE idProducto = '" + Codigo + "'";
                consulta = conexionbd.getConection().prepareStatement(query);
                resultado = consulta.executeQuery();
                if (resultado.next()) {
                    Stock = Float.parseFloat(resultado.getString("Stock"));
                    Cantidad = Float.parseFloat(jtblDatos.getValueAt(jtblDatos.getSelectedRow(), 3).toString());
                    NuevoStock = Stock + Cantidad;
                    procedimiento = conexionbd.getConection().prepareCall("{call ActualizarStock(?, ?)}");
                    procedimiento.setString(1, "" + (int) NuevoStock);
                    procedimiento.setString(2, Codigo);
                    procedimiento.execute();
                    Total = Total - Float.parseFloat(jtblDatos.getValueAt(jtblDatos.getSelectedRow(), 4).toString());
                    lblTotalSinIVA.setText("" + Total);
                    float Iva = ((Total * Float.parseFloat(dc.getIVA())) / 100);
                    lblIVA.setText("" + Iva);
                    lblTotal.setText("" + (Total + Float.parseFloat(lblIVA.getText())));
                    modelo.removeRow(jtblDatos.getSelectedRow());
                    contadorFilas--;
                }
            } catch (NumberFormatException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            } finally {
                conexionbd.cerrarConexion();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void Facturar() {
        if (contadorFilas > 0) {
            Date FechaActual = Date.valueOf(LocalDate.now());
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            String Fecha = formato.format(FechaActual);
            try {
                procedimiento = conexionbd.getConection().prepareCall("{call ActualizaFactura(?, ?, ?, ?, ?, ?, ?, ?, ?)}");
                procedimiento.setString(1, du.getIdUsuario());
                procedimiento.setString(2, du.getNombre());
                procedimiento.setString(3, txtNIT.getText().trim());
                procedimiento.setString(4, lblNombre.getText());
                procedimiento.setDate(5, Date.valueOf(Fecha));
                procedimiento.setFloat(6, Float.parseFloat(txtEfectivo.getText().trim()));
                procedimiento.setFloat(7, Float.parseFloat(lblCambio.getText()));
                procedimiento.setFloat(8, Float.parseFloat(lblTotalSinIVA.getText()));
                procedimiento.setFloat(9, Float.parseFloat(lblTotal.getText()));
                resultado = procedimiento.executeQuery();
                if (resultado.next()) {
                    String NumFac = resultado.getString("idFactura");
                    for (int i = 0; i < contadorFilas; i++) {
                        procedimiento = conexionbd.getConection().prepareCall("{call ActualizaDetalle(?, ?, ?, ?, ?)}");
                        procedimiento.setInt(1, Integer.parseInt(NumFac));
                        procedimiento.setString(2, jtblDatos.getValueAt(i, 0).toString());
                        procedimiento.setFloat(3, Float.parseFloat(jtblDatos.getValueAt(i, 2).toString()));
                        Cantidad = Float.parseFloat(jtblDatos.getValueAt(i, 3).toString());
                        procedimiento.setInt(4, (int) Cantidad);
                        procedimiento.setFloat(5, Float.parseFloat(jtblDatos.getValueAt(i, 4).toString()));
                        procedimiento.execute();
                    }
                    GenerarFactura gf = new GenerarFactura();
                    gf.Factura(Integer.parseInt(NumFac));
                    corteCaja();
                    Limpiar();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            } finally {
                conexionbd.cerrarConexion();
            }
        }
    }

    private void corteCaja() {
        float Caja = Float.parseFloat(dc.getCorteCaja());
        Caja = Caja - Cambio;
        dc.setCorteCaja("" + Caja);
    }

    private void Limpiar() {
        txtNIT.setText(null);
        lblNombre.setText(null);
        lblApellido.setText(null);
        lblDireccion.setText(null);
        txtCodigo.setText(null);
        lblDescripcion.setText(null);
        lblPrecio.setText(null);
        txtCantidad.setText(null);
        txtEfectivo.setText(null);
        lblCambio.setText(null);
        lblIVA.setText(null);
        lblTotalSinIVA.setText(null);
        lblTotal.setText(null);
        Total = 0;
        Cambio = 0;
        Stock = 0f;
        Cantidad = 0f;
        Precio = 0f;
        NuevoStock = 0f;
        Codigo = null;
        query = null;
        consulta = null;
        resultado = null;
        procedimiento = null;
        if (contadorFilas > 0) {
            for (int i = contadorFilas - 1; i >= 0; i--) {
                modelo.removeRow(i);
            }
            contadorFilas = 0;
        }
        txtNIT.requestFocus();
    }

    public static void cargarLogo() {
        try {
            PreparedStatement ps = conexionbd.getConection().prepareStatement("Select Logo From DatosEmpresa");
            ResultSet rs = ps.executeQuery();

            BufferedImage buffimg = null;

            if (rs.next()) {
                InputStream img = rs.getBinaryStream(1);
                try {
                    buffimg = ImageIO.read(img);
                    ImageIcon imagen = new ImageIcon(buffimg);
                    empresaLogo.setLogo(new ImageIcon(imagen.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
                    lblLogo.setIcon(empresaLogo.getLogo());
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            conexionbd.cerrarConexion();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    public static javax.swing.JButton btnClientes;
    private javax.swing.JButton btnConfigurar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFactuar;
    private javax.swing.JButton btnGuardar;
    public static javax.swing.JButton btnProductos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox chkCantidad;
    private javax.swing.JDialog dialogoConfigurar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    public javax.swing.JTable jtblDatos;
    public static javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCambio;
    public static javax.swing.JLabel lblDescripcion;
    public static javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIVA;
    public static javax.swing.JLabel lblLogo;
    public static javax.swing.JLabel lblNombre;
    public javax.swing.JLabel lblNombreUsuario;
    public static javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalSinIVA;
    public static app.bolivia.swing.JCTextField txtCantidad;
    public static app.bolivia.swing.JCTextField txtCodigo;
    private javax.swing.JTextField txtCorteCaja;
    private javax.swing.JTextField txtEfectivo;
    private javax.swing.JTextField txtIVA;
    public static javax.swing.JTextField txtNIT;
    // End of variables declaration//GEN-END:variables
}

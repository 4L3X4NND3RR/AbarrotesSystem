package Principal;

import Consultas.ConsultaClientes;
import Consultas.ConsultaFacturas;
import Consultas.ConsultaProductos;
import Consultas.ConsultaUsuarios;
import Consultas.VentasDia;
import Herramientas.CopiaSeguridad;
import Instalacion.DatosUsuario;
import Instalacion.Login;
import Registros.*;
import Utilidades.ConexionBD;
import Utilidades.Utilidades;
import Venta.PuntoVenta;
import java.awt.Image;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Principal extends javax.swing.JFrame {

    Clientes c;
    Productos p;
    DatosUsuario d;
    PuntoVenta v;
    ConsultaUsuarios cu;
    ConsultaFacturas cf;
    ConsultaClientes cc;
    ConsultaProductos cp;
    VentasDia vd;
    Preferencias pf;
    CopiaSeguridad cs;

    private static final ConexionBD conexionbd = ConexionBD.comprobarEstado();
    Utilidades u = new Utilidades();

    public Principal() {
        initComponents();
    }

    public Principal(DatosUsuario d) {
        this.d = d;
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/IconoSistema.png")).getImage());
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        Venta();
        tipoUsuario();
        actualizarDiasVencer();
    }

    private void Venta() {
        v = new PuntoVenta(d, cc, cp);
        panelPrincipal.add(v);
        v.setVisible(true);
        v.lblNombreUsuario.setText(d.getNombre());
        try {
            v.setMaximum(true);
        } catch (PropertyVetoException exc) {
            JOptionPane.showMessageDialog(null, "Algo Salio Mal: " + exc.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogoAcercaDe = new javax.swing.JDialog();
        lblLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblOS = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblOS1 = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemPreferencias = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuItemCerrarSesion = new javax.swing.JMenuItem();
        menuItemSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItemRegistroClientes = new javax.swing.JMenuItem();
        menuItemRegistroProductos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuItemCosultaClientes = new javax.swing.JMenuItem();
        menuItemConsultaProductos = new javax.swing.JMenuItem();
        menuItemConsultaFacturas = new javax.swing.JMenuItem();
        menuItemConsultaUsuarios = new javax.swing.JMenuItem();
        menuItemConsultaVentaDia = new javax.swing.JMenuItem();
        menuHerramientas = new javax.swing.JMenu();
        menuItemCopiaSeguridad = new javax.swing.JMenuItem();
        menuItemCalc = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        menuItemAbrebiaturas = new javax.swing.JMenuItem();
        menuItemManual = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuItemAcercade = new javax.swing.JMenuItem();

        dialogoAcercaDe.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogoAcercaDe.setTitle("Acerca del Sistema de Ventas");
        dialogoAcercaDe.setModal(true);
        dialogoAcercaDe.setResizable(false);

        jLabel1.setFont(new java.awt.Font("Candle Mustard", 0, 36)); // NOI18N
        jLabel1.setText("Sistema de Ventas");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Versión del Producto:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel7.setText("1.0.0");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Sistema Operativo:");

        lblOS.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lblOS.setText("jLabel5");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Soporte:");

        lblOS1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lblOS1.setText("+502 5763 0943");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblOS1)
                        .addComponent(jLabel7)
                        .addComponent(lblOS))
                    .addContainerGap(63, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel7))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(lblOS))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(lblOS1))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout dialogoAcercaDeLayout = new javax.swing.GroupLayout(dialogoAcercaDe.getContentPane());
        dialogoAcercaDe.getContentPane().setLayout(dialogoAcercaDeLayout);
        dialogoAcercaDeLayout.setHorizontalGroup(
            dialogoAcercaDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoAcercaDeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        dialogoAcercaDeLayout.setVerticalGroup(
            dialogoAcercaDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoAcercaDeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(dialogoAcercaDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 927, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jMenu1.setText("Sistema");

        menuItemPreferencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Preferencias.png"))); // NOI18N
        menuItemPreferencias.setText("Preferencias");
        menuItemPreferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPreferenciasActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemPreferencias);
        jMenu1.add(jSeparator1);

        menuItemCerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        menuItemCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarSesionFile.png"))); // NOI18N
        menuItemCerrarSesion.setText("Cerrar Sesion");
        menuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemCerrarSesion);

        menuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuItemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SalirFile.png"))); // NOI18N
        menuItemSalir.setText("Salir");
        menuItemSalir.setToolTipText("");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Registro");

        menuItemRegistroClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RegistrarCliente.png"))); // NOI18N
        menuItemRegistroClientes.setText("Clientes");
        menuItemRegistroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistroClientesActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemRegistroClientes);

        menuItemRegistroProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RegistrarProducto.png"))); // NOI18N
        menuItemRegistroProductos.setText("Productos");
        menuItemRegistroProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegistroProductosActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemRegistroProductos);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consulta");

        menuItemCosultaClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultaClientes.png"))); // NOI18N
        menuItemCosultaClientes.setText("Clientes");
        menuItemCosultaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCosultaClientesActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemCosultaClientes);

        menuItemConsultaProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultaProductos.png"))); // NOI18N
        menuItemConsultaProductos.setText("Productos");
        menuItemConsultaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemConsultaProductosActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemConsultaProductos);

        menuItemConsultaFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultaFactura.png"))); // NOI18N
        menuItemConsultaFacturas.setText("Facturas");
        menuItemConsultaFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemConsultaFacturasActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemConsultaFacturas);

        menuItemConsultaUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultaUsuarios.png"))); // NOI18N
        menuItemConsultaUsuarios.setText("Usuarios");
        menuItemConsultaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemConsultaUsuariosActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemConsultaUsuarios);

        menuItemConsultaVentaDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultaVentasDia.png"))); // NOI18N
        menuItemConsultaVentaDia.setText("Ventas");
        menuItemConsultaVentaDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemConsultaVentaDiaActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemConsultaVentaDia);

        jMenuBar1.add(jMenu3);

        menuHerramientas.setText("Herramientas");

        menuItemCopiaSeguridad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CopiaSeguridad.png"))); // NOI18N
        menuItemCopiaSeguridad.setText("Copia de Seguridad");
        menuItemCopiaSeguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCopiaSeguridadActionPerformed(evt);
            }
        });
        menuHerramientas.add(menuItemCopiaSeguridad);

        menuItemCalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calculadora.png"))); // NOI18N
        menuItemCalc.setText("Calculadora");
        menuItemCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCalcActionPerformed(evt);
            }
        });
        menuHerramientas.add(menuItemCalc);

        jMenuBar1.add(menuHerramientas);

        menuAyuda.setText("Ayuda");

        menuItemAbrebiaturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Abreviatura.png"))); // NOI18N
        menuItemAbrebiaturas.setText("Metodos abreviados de teclado");
        menuItemAbrebiaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAbrebiaturasActionPerformed(evt);
            }
        });
        menuAyuda.add(menuItemAbrebiaturas);

        menuItemManual.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuItemManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ManualUsuario.png"))); // NOI18N
        menuItemManual.setText("Manual de usuario");
        menuItemManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemManualActionPerformed(evt);
            }
        });
        menuAyuda.add(menuItemManual);
        menuAyuda.add(jSeparator2);

        menuItemAcercade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Acercade.png"))); // NOI18N
        menuItemAcercade.setText("Acerca de");
        menuItemAcercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAcercadeActionPerformed(evt);
            }
        });
        menuAyuda.add(menuItemAcercade);

        jMenuBar1.add(menuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSalirActionPerformed

    private void menuItemRegistroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistroClientesActionPerformed
        if (estacerrado(c)) {
            c = new Clientes();
            panelPrincipal.add(c);
            c.setLocation((panelPrincipal.getSize().width - c.getSize().width) / 2, (panelPrincipal.getSize().height - c.getSize().height) / 2);
            c.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "La ventana registro de clientes ya se encuentra abierta", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_menuItemRegistroClientesActionPerformed

    private void menuItemRegistroProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegistroProductosActionPerformed
        if (estacerrado(p)) {
            p = new Productos();
            panelPrincipal.add(p);
            p.setLocation((panelPrincipal.getSize().width - p.getSize().width) / 2, (panelPrincipal.getSize().height - p.getSize().height) / 2);
            p.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "La ventana registro de productos ya se encuentra abierta", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_menuItemRegistroProductosActionPerformed

    private void menuItemCosultaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCosultaClientesActionPerformed
        if (estacerrado(cc)) {
            cc = new ConsultaClientes(d);
            panelPrincipal.add(cc);
            cc.setVisible(true);
            cc.setLocation((panelPrincipal.getSize().width - cc.getSize().width) / 2, (panelPrincipal.getSize().height - cc.getSize().height) / 2);
        } else {
            JOptionPane.showMessageDialog(null, "La ventana consulta clientes ya se encuentra abierta", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_menuItemCosultaClientesActionPerformed

    private void menuItemConsultaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConsultaProductosActionPerformed
        if (estacerrado(cp)) {
            cp = new ConsultaProductos(d);
            panelPrincipal.add(cp);
            cp.setVisible(true);
            cp.setLocation((panelPrincipal.getSize().width - cp.getSize().width) / 2, (panelPrincipal.getSize().height - cp.getSize().height) / 2);
        } else {
            JOptionPane.showMessageDialog(null, "La ventana consulta productos ya se encuentra abierta", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_menuItemConsultaProductosActionPerformed

    private void menuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCerrarSesionActionPerformed
        this.dispose();
        Login g = new Login();
        g.setVisible(true);
    }//GEN-LAST:event_menuItemCerrarSesionActionPerformed

    private void menuItemConsultaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConsultaUsuariosActionPerformed
        if (estacerrado(cu)) {
            cu = new ConsultaUsuarios();
            panelPrincipal.add(cu);
            cu.setVisible(true);
            cu.setLocation((panelPrincipal.getSize().width - cu.getSize().width) / 2, (panelPrincipal.getSize().height - cu.getSize().height) / 2);
        } else {
            JOptionPane.showMessageDialog(null, "La ventana consulta usuarios ya se encuentra abierta", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_menuItemConsultaUsuariosActionPerformed

    private void menuItemConsultaFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConsultaFacturasActionPerformed
        if (estacerrado(cf)) {
            cf = new ConsultaFacturas();
            panelPrincipal.add(cf);
            cf.setVisible(true);
            cf.setLocation((panelPrincipal.getSize().width - cf.getSize().width) / 2, (panelPrincipal.getSize().height - cf.getSize().height) / 2);
        } else {
            JOptionPane.showMessageDialog(null, "La ventana consulta facturas ya se encuentra abierta", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_menuItemConsultaFacturasActionPerformed

    private void menuItemPreferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPreferenciasActionPerformed
        if (estacerrado(pf)) {
            pf = new Preferencias();
            panelPrincipal.add(pf);
            pf.setVisible(true);
            pf.setLocation((panelPrincipal.getSize().width - pf.getSize().width) / 2, (panelPrincipal.getSize().height - pf.getSize().height) / 2);
        } else {
            JOptionPane.showMessageDialog(null, "La ventana preferencias ya se encuentra abierta", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_menuItemPreferenciasActionPerformed

    private void menuItemConsultaVentaDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConsultaVentaDiaActionPerformed
        if (estacerrado(vd)) {
            vd = new VentasDia(d);
            panelPrincipal.add(vd);
            vd.setVisible(true);
            vd.setLocation((panelPrincipal.getSize().width - vd.getSize().width) / 2, (panelPrincipal.getSize().height - vd.getSize().height) / 2);
        } else {
            JOptionPane.showMessageDialog(null, "La ventana venta del dia ya se encuentra abierta", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_menuItemConsultaVentaDiaActionPerformed

    private void menuItemCopiaSeguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCopiaSeguridadActionPerformed
        if (estacerrado(cs)) {
            cs = new CopiaSeguridad();
            panelPrincipal.add(cs);
            cs.setVisible(true);
            cs.setLocation((panelPrincipal.getSize().width - cs.getSize().width) / 2, (panelPrincipal.getSize().height - cs.getSize().height) / 2);
        }
    }//GEN-LAST:event_menuItemCopiaSeguridadActionPerformed

    private void menuItemAbrebiaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAbrebiaturasActionPerformed
        u.abrirPDF("/Ayuda/MetodosAbreviados.pdf","MetodosAbreviados.pdf");
    }//GEN-LAST:event_menuItemAbrebiaturasActionPerformed

    private void menuItemAcercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAcercadeActionPerformed
        String OS = System.getProperty("os.name");
        String OSversion = System.getProperty("os.version");
        ImageIcon image = new ImageIcon(getClass().getResource("/Imagenes/LogoSistema.png"));
        lblLogo.setIcon(new ImageIcon(image.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        lblOS.setText(OS+" "+OSversion);
        dialogoAcercaDe.setSize(575, 275);
        dialogoAcercaDe.setLocationRelativeTo(null);
        dialogoAcercaDe.setVisible(true);  
    }//GEN-LAST:event_menuItemAcercadeActionPerformed

    private void menuItemManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemManualActionPerformed
        u.abrirPDF("/Ayuda/ManualUsuario.pdf", "ManualUsuario.pdf");
    }//GEN-LAST:event_menuItemManualActionPerformed

    private void menuItemCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCalcActionPerformed
        try {
            Runtime rt = Runtime.getRuntime();
            Process proceso = rt.exec("calc");
            proceso.waitFor();
        }catch (IOException | InterruptedException ex) {     
            System.out.println("Error al ejecutar la calculadora del sistema windows: "+ ex);
       }
    }//GEN-LAST:event_menuItemCalcActionPerformed

    public static boolean estacerrado(Object obj) {
        JInternalFrame[] activos = panelPrincipal.getAllFrames();
        boolean cerrado = true;
        int i = 0;
        while (i < activos.length && cerrado) {
            if (activos[i] == obj) {
                cerrado = false;
            }
            i++;
        }
        return cerrado;
    }

    private void tipoUsuario() {
        if ("Estandar".equals(d.getTipoUsuario())) {
            menuItemPreferencias.setVisible(false);
            menuItemConsultaFacturas.setVisible(false);
            menuItemConsultaUsuarios.setVisible(false);
            menuItemConsultaVentaDia.setVisible(false);
            menuItemCopiaSeguridad.setVisible(false);
        }
    }

    private void actualizarDiasVencer() {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            Date FechaBD;
            Date FechaActualSF = Date.valueOf(LocalDate.now());
            String FechaHoy = formato.format(FechaActualSF);
            Date FechaActualCF = Date.valueOf(FechaHoy);
            
            String NIT;
            PreparedStatement consulta = conexionbd.getConection().prepareStatement("Select * From Producto");
            ResultSet resultado = consulta.executeQuery();
            CallableStatement procedimiento = null;

           
            PreparedStatement consulta2 = conexionbd.getConection().prepareStatement("Select FechaActualPro, NITEmpresa From DatosEmpresa");
            ResultSet rs = consulta2.executeQuery();
            if (rs.next()) {
                FechaBD = rs.getDate(1);
                NIT = rs.getString(2);
                if (FechaBD.compareTo(FechaActualCF) != 0) {
                    while (resultado.next()) {
                        String codigo = resultado.getString("idProducto");
                        Date FechaVencimientoSinFormato = resultado.getDate("FechaVencimiento");
                        String FVConFormato = formato.format(FechaVencimientoSinFormato);
                        Date FechaVencimiento = Date.valueOf(FVConFormato);

                        int diasParaVencer = (int) ((FechaVencimiento.getTime() - FechaActualCF.getTime()) / 86400000) + 1;

                        if (diasParaVencer > 0) {
                            procedimiento = conexionbd.getConection().prepareCall("{call ActualizarDiasVencer(?, ?)}");
                            procedimiento.setString(1, codigo);
                            procedimiento.setInt(2, diasParaVencer);
                            procedimiento.execute();
                            procedimiento.close();
                        }
                    }
                    procedimiento = conexionbd.getConection().prepareCall("{call ActualizarFecha(?, ?)}");
                    procedimiento.setString(1, NIT);
                    procedimiento.setDate(2, Date.valueOf(FechaHoy));
                    procedimiento.execute();
                    procedimiento.close();
                }
                rs.close();
            }           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal: "+e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }finally{
            conexionbd.cerrarConexion();
        }
    }

    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel("org.jb2011.lnf.beautyeye.BeautyEyeLookAndFeelCross");
            UIManager.put("RootPane.setupButtonVisible", false);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog dialogoAcercaDe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblOS;
    private javax.swing.JLabel lblOS1;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuHerramientas;
    private javax.swing.JMenuItem menuItemAbrebiaturas;
    private javax.swing.JMenuItem menuItemAcercade;
    private javax.swing.JMenuItem menuItemCalc;
    public javax.swing.JMenuItem menuItemCerrarSesion;
    private javax.swing.JMenuItem menuItemConsultaFacturas;
    private javax.swing.JMenuItem menuItemConsultaProductos;
    private javax.swing.JMenuItem menuItemConsultaUsuarios;
    private javax.swing.JMenuItem menuItemConsultaVentaDia;
    private javax.swing.JMenuItem menuItemCopiaSeguridad;
    private javax.swing.JMenuItem menuItemCosultaClientes;
    private javax.swing.JMenuItem menuItemManual;
    private javax.swing.JMenuItem menuItemPreferencias;
    private javax.swing.JMenuItem menuItemRegistroClientes;
    private javax.swing.JMenuItem menuItemRegistroProductos;
    private javax.swing.JMenuItem menuItemSalir;
    public static javax.swing.JDesktopPane panelPrincipal;
    // End of variables declaration//GEN-END:variables
}

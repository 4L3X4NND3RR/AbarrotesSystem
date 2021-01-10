package Herramientas;

import Utilidades.DatosConexion;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class CopiaSeguridad extends javax.swing.JInternalFrame {

    public CopiaSeguridad() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Copia de Seguridad");
        setLayer(1);

        btnGuardar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnGuardar.setText("Guardar Como");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnGuardar)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnGuardar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        JFileChooser dlg = new JFileChooser();
        int option = dlg.showSaveDialog(this);
        String ruta;

        if (option == JFileChooser.APPROVE_OPTION) {
            DatosConexion dc = new DatosConexion();
            File f = dlg.getSelectedFile();
            ruta = f.toString();
            try {
                Process p = Runtime.getRuntime().exec("mysqldump -u " + dc.getUsername() + " -p" + dc.getPassword() + " " + dc.getNombreBD());
                InputStream is = p.getInputStream();
                try (FileOutputStream fos = new FileOutputStream(ruta + ".sql")) {
                    byte[] buffer = new byte[1000];
                    int leido = is.read(buffer);
                    while (leido > 0) {
                        fos.write(buffer, 0, leido);
                        leido = is.read(buffer);
                    }
                    JOptionPane.showMessageDialog(null, "Copia de seguridad creada");
                    is.close();
                    fos.close();
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Algo salio mal: " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    // End of variables declaration//GEN-END:variables
}

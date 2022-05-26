/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AltasCarreras.java
 *
 * Created on 12-abr-2013, 9:15:56
 */

package formularios;

import java.util.logging.Level;
import java.util.logging.Logger;
import utilerias.conexion;
import java.sql.*;
import javax.swing.JOptionPane;

public class AltasCarreras extends javax.swing.JFrame {

 
    public AltasCarreras() {
        initComponents();
    }
    public void Limpiar(){
        txtclave.setText("");
        txtnombre.setText("");
        txtespecialidad.setText("");
        txtcreditos.setText("");
        txtclave.requestFocus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtclave = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtespecialidad = new javax.swing.JTextField();
        txtcreditos = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        lblerror = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CARRERAS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Clave");

        jLabel3.setText("Nombre");

        jLabel4.setText("Especialidad");

        jLabel5.setText("Creditos");

        txtclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclaveActionPerformed(evt);
            }
        });
        txtclave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtclaveFocusLost(evt);
            }
        });

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnombreFocusLost(evt);
            }
        });

        txtespecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtespecialidadActionPerformed(evt);
            }
        });
        txtespecialidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtespecialidadFocusLost(evt);
            }
        });

        txtcreditos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcreditosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcreditosFocusLost(evt);
            }
        });

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        lblerror.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
        lblerror.setForeground(new java.awt.Color(153, 51, 255));
        lblerror.setText("Error!!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnguardar)
                        .addGap(53, 53, 53)
                        .addComponent(btncancelar)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtespecialidad, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(txtcreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblerror, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(266, 266, 266))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblerror, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btncancelar)
                    .addComponent(btnsalir))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnguardar.getAccessibleContext().setAccessibleName("btnguardar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclaveActionPerformed

    private void txtespecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtespecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtespecialidadActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        try {
            String c = txtclave.getText();
            String n = txtnombre.getText();
            String e = txtespecialidad.getText();
            int cr = Integer.parseInt(txtcreditos.getText());
            conexion.conectar("jdbc:mysql://localhost:3306/escuela", "root", "");
            ResultSet resultado;
            resultado = conexion.sentencia.executeQuery("select * from carrera where clave='" + c + "'");
            if(resultado.next()){
                JOptionPane.showMessageDialog(null, "La clave ya existe!");
                txtclave.requestFocus();
                return;
            }

            conexion.sentencia.execute("insert into carrera values('"+c+"', '"+n+"', '"+e+"',"+cr+")");
            JOptionPane.showMessageDialog(null, "Registro Insertado!");
            Limpiar();

        } catch (SQLException ex) {
            Logger.getLogger(AltasCarreras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed

        this.dispose(); //cerrar el formulario que en el momento estamos utilizando
    }//GEN-LAST:event_btnsalirActionPerformed

    private void txtclaveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtclaveFocusLost
        txtclave.setText(txtclave.getText().toUpperCase()); //convertir en mayusculas con evento focus lost
        
    }//GEN-LAST:event_txtclaveFocusLost

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed

    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtnombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnombreFocusLost
       txtnombre.setText(txtnombre.getText().toUpperCase());
    }//GEN-LAST:event_txtnombreFocusLost

    private void txtespecialidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtespecialidadFocusLost
        txtespecialidad.setText(txtespecialidad.getText().toUpperCase());
    }//GEN-LAST:event_txtespecialidadFocusLost

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       lblerror.setVisible(false); 
    }//GEN-LAST:event_formWindowOpened

    private void txtcreditosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcreditosFocusLost
        try {
            int x=Integer.parseInt(txtcreditos.getText()); //variable de tipo entero, donde se guarda el valor de la caja de texto creditos
        }
        catch(NumberFormatException nfe){
            lblerror.setVisible(true);
        }     
    }//GEN-LAST:event_txtcreditosFocusLost

    private void txtcreditosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcreditosFocusGained
        txtcreditos.setText("");
        lblerror.setVisible(false);
    }//GEN-LAST:event_txtcreditosFocusGained

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
       Limpiar();
    }//GEN-LAST:event_btncancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltasCarreras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblerror;
    private javax.swing.JTextField txtclave;
    private javax.swing.JTextField txtcreditos;
    private javax.swing.JTextField txtespecialidad;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables

}

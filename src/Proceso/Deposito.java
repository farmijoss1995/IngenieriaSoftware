/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import java.awt.Rectangle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public class Deposito extends javax.swing.JInternalFrame {

    static double getSaldoAcutal(String cuenta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    double monto;
    double nuevomonto;
    /**
     * Creates new form Retiros
     */
    public Deposito() {
        initComponents();
        setTitle("Deposito");
        setBounds(new Rectangle(85, 64, 367, 208));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        txtOtro = new org.edisoncor.gui.textField.TextFieldRectIcon();
        buttonAction1 = new org.edisoncor.gui.button.ButtonAction();
        Monto = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Deposito");

        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4-min.jpg"))); // NOI18N

        labelMetric1.setText("Monto a Depositar");

        labelMetric2.setText("Otro monto");

        txtOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtroActionPerformed(evt);
            }
        });

        buttonAction1.setText("EJECUTAR");
        buttonAction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction1ActionPerformed(evt);
            }
        });

        Monto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "200", "300", "400", "500", "1000", "2000", "3000", "10000", "20000", "Otro" }));
        Monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MontoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Monto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtOtro, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                .addGap(38, 38, 38))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(buttonAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static double getSaldoActual(String cuenta)throws SQLException{
    double saldo = 0;
    String consulta= "Select Saldo from usuario where `Numero de cuenta`="+cuenta;
    Statement sent= Conexion.conexion.createStatement();
    ResultSet rs= sent.executeQuery(consulta);
    if(rs.next()){
        saldo=rs.getFloat(1);
    }
    return saldo;
}
    private void txtOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOtroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOtroActionPerformed

    private void MontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MontoActionPerformed

    private void buttonAction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction1ActionPerformed
        // TODO add your handling code here:
        try{
            if(Monto.getSelectedItem().toString().equals("Otro")&& txtOtro.getText().isEmpty())
            {throw new Exception("El campo para el\nsaldo esta vacio");}
             
            if(txtOtro.getText().isEmpty()==false && Util.tieneLetras(txtOtro.getText()))
            {throw new Exception("El campo para el saldo\nsolo acepta cantidades");}
            
             if(Monto.getSelectedItem().toString().equals("Otro")){
                 monto = Double.parseDouble(txtOtro.getText());
             }else{
                 monto= Double.parseDouble(Monto.getSelectedItem().toString());
             }
             nuevomonto=getSaldoActual(Ingresar.cuenta);
             nuevomonto+=monto;
             
           String update = "update usuario set Saldo = "+nuevomonto+" where `Numero de cuenta`="+Ingresar.cuenta;
           Conexion.sentencia = Conexion.conexion.createStatement();
           Conexion.sentencia.executeUpdate(update);
           Util.mensaje(this, "Exito al depositar", "Exito", "src/Imagenes/descarga.jpg");
                    }catch(Exception ex){
                        Util.mensaje(this, ex.getMessage(), "Error", "src/Imagenes/descarga.jpg");
                    }
           
    }//GEN-LAST:event_buttonAction1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Monto;
    private org.edisoncor.gui.button.ButtonAction buttonAction1;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.textField.TextFieldRectIcon txtOtro;
    // End of variables declaration//GEN-END:variables
}

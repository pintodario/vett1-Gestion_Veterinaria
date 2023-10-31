/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Acceso_a_Datos.ClienteData;
import Entidades.Cliente;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author carol
 */
public class Registro_Clientes extends javax.swing.JInternalFrame {

    ClienteData cliente = new ClienteData();
   
    public Registro_Clientes() {
        initComponents();
        resetearCampos();
    }

    public void resetearCampos(){
        jTdni.setText("");
        jTnombre.setText("");
        jTapellido.setText("");
        jTdireccion.setText("");
        jTtelefono.setText("");
        jTcontactoAlt.setText("");
        jTtelContactoAlt.setText("");
        jRestado.setSelected(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Multimedia/fondoFrame.png"));
        Image image = icon.getImage();
        Desk1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,Desk1.getWidth(),Desk1.getHeight(),this);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTcontactoAlt = new javax.swing.JTextField();
        jTtelContactoAlt = new javax.swing.JTextField();
        jTtelefono = new javax.swing.JTextField();
        jTdireccion = new javax.swing.JTextField();
        jTapellido = new javax.swing.JTextField();
        jTnombre = new javax.swing.JTextField();
        jTdni = new javax.swing.JTextField();
        jRestado = new javax.swing.JRadioButton();
        jBnuevo = new javax.swing.JButton();
        jBregistrar1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("GRUPO 75");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Registro de Clientes");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("DNI");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Apellido");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Telefono");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Direccion");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Estado");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("Contacto Alternativo");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Telefono");

        jTtelContactoAlt.setToolTipText("Ingrese valores numericos");
        jTtelContactoAlt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTtelContactoAltKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jTcontactoAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTtelContactoAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4)
                    .addComponent(jTcontactoAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTtelContactoAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTtelefono.setToolTipText("Ingrese valores numericos");
        jTtelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTtelefonoKeyTyped(evt);
            }
        });

        jTdni.setToolTipText("Ingrese valores numericos");
        jTdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTdniKeyTyped(evt);
            }
        });

        jBnuevo.setBackground(new java.awt.Color(204, 204, 204));
        jBnuevo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jBnuevo.setText("NUEVO");
        jBnuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jBregistrar1.setBackground(new java.awt.Color(204, 204, 204));
        jBregistrar1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jBregistrar1.setText("REGISTRAR");
        jBregistrar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBregistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregistrar1ActionPerformed(evt);
            }
        });

        Desk1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jTtelefono, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jTdireccion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jTapellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jTnombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jTdni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jRestado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jBnuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jBregistrar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout Desk1Layout = new javax.swing.GroupLayout(Desk1);
        Desk1.setLayout(Desk1Layout);
        Desk1Layout.setHorizontalGroup(
            Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Desk1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Desk1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(422, 422, 422))
                    .addGroup(Desk1Layout.createSequentialGroup()
                        .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Desk1Layout.createSequentialGroup()
                                .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Desk1Layout.createSequentialGroup()
                                        .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(171, 171, 171)
                                        .addComponent(jBnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Desk1Layout.createSequentialGroup()
                                        .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(240, 240, 240)
                                        .addComponent(jRestado))))
                            .addGroup(Desk1Layout.createSequentialGroup()
                                .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(30, 30, 30)
                                .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Desk1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Desk1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(468, 468, 468))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Desk1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
            .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Desk1Layout.createSequentialGroup()
                    .addContainerGap(714, Short.MAX_VALUE)
                    .addComponent(jBregistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(261, 261, 261)))
        );
        Desk1Layout.setVerticalGroup(
            Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Desk1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRestado))
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
            .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Desk1Layout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addComponent(jBregistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(511, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desk1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desk1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBregistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregistrar1ActionPerformed
          
       if(jTnombre.getText().isEmpty() 
               || jTapellido.getText().isEmpty()
               || jTdireccion.getText().isEmpty() 
               || jTcontactoAlt.getText().isEmpty()
               || jTdni.getText().isEmpty()
               || jTtelefono.getText().isEmpty()
               || jTtelContactoAlt.getText().isEmpty()
               || jRestado.isSelected()==false){
           JOptionPane.showMessageDialog(this, "No debe haber campos vacios");
       }
       else{
           String nombre = jTnombre.getText();
           String apellido = jTapellido.getText();
           String direccion = jTdireccion.getText();
           String contactoAlt = jTcontactoAlt.getText();
           int dni = Integer.parseInt(jTdni.getText()); 
           int telefono = Integer.parseInt(jTtelefono.getText());
           int telContactoAlt = Integer.parseInt(jTtelContactoAlt.getText());
           boolean activo = jRestado.isSelected();
           
      Cliente cli = new Cliente(dni, nombre, apellido, telefono, direccion, telContactoAlt, contactoAlt, activo);
      cliente.agregarCliente(cli);
       }
      
    }//GEN-LAST:event_jBregistrar1ActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        resetearCampos();
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jTdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdniKeyTyped
        if (Character.isLetter(evt.getKeyChar()) || evt.getKeyChar() == KeyEvent.VK_SPACE || !Character.isLetterOrDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTdniKeyTyped

    private void jTtelContactoAltKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTtelContactoAltKeyTyped
        if (Character.isLetter(evt.getKeyChar()) || evt.getKeyChar() == KeyEvent.VK_SPACE || !Character.isLetterOrDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTtelContactoAltKeyTyped

    private void jTtelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTtelefonoKeyTyped
        if (Character.isLetter(evt.getKeyChar()) || evt.getKeyChar() == KeyEvent.VK_SPACE || !Character.isLetterOrDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTtelefonoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desk1;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBregistrar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRestado;
    private javax.swing.JTextField jTapellido;
    private javax.swing.JTextField jTcontactoAlt;
    private javax.swing.JTextField jTdireccion;
    private javax.swing.JTextField jTdni;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTtelContactoAlt;
    private javax.swing.JTextField jTtelefono;
    // End of variables declaration//GEN-END:variables
}

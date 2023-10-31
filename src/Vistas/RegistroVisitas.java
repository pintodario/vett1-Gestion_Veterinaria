/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Acceso_a_Datos.MascotaData;
import Acceso_a_Datos.TratamientoData;
import Acceso_a_Datos.VisitaData;
import Entidades.Mascota;
import Entidades.Tratamiento;
import Entidades.Visita;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author carol
 */
public class RegistroVisitas extends javax.swing.JInternalFrame {

   
    public RegistroVisitas() {
        initComponents();
        resetearCampos();
    }
    
    private void resetearCampos() {
        
        jTidMascotas.setText("");
        jTidTratamiento.setText("");
        jTdetalle.setText("");
        jDfechaVisita.setDate(null);
        jTpeso.setText("");
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTidTratamiento = new javax.swing.JTextField();
        jTidMascotas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTdetalle = new javax.swing.JTextArea();
        jDfechaVisita = new com.toedter.calendar.JDateChooser();
        jTpeso = new javax.swing.JTextField();
        jBnuevo = new javax.swing.JButton();
        jBregistro = new javax.swing.JButton();
        jBfactura = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("GRUPO 75");
        setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Registro de Visitas");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("ID Tratamiento");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("ID Mascota");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Fecha");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Peso ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Detalle");

        jTidTratamiento.setToolTipText("Ingrese valores numericos");
        jTidTratamiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTidTratamientoKeyTyped(evt);
            }
        });

        jTidMascotas.setToolTipText("Ingrese valores  numericos");
        jTidMascotas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTidMascotasKeyTyped(evt);
            }
        });

        jTdetalle.setColumns(20);
        jTdetalle.setRows(5);
        jScrollPane1.setViewportView(jTdetalle);

        jTpeso.setToolTipText("Ingrese valores numericos con '.'");
        jTpeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTpesoKeyTyped(evt);
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

        jBregistro.setBackground(new java.awt.Color(204, 204, 204));
        jBregistro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jBregistro.setText("REGISTRAR");
        jBregistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregistroActionPerformed(evt);
            }
        });

        jBfactura.setBackground(new java.awt.Color(204, 204, 204));
        jBfactura.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jBfactura.setText("GENERAR FACTURA");
        jBfactura.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfacturaActionPerformed(evt);
            }
        });

        Desk1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jTidTratamiento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jTidMascotas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jDfechaVisita, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jTpeso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jBnuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jBregistro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jBfactura, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout Desk1Layout = new javax.swing.GroupLayout(Desk1);
        Desk1.setLayout(Desk1Layout);
        Desk1Layout.setHorizontalGroup(
            Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Desk1Layout.createSequentialGroup()
                .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Desk1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Desk1Layout.createSequentialGroup()
                                .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(34, 34, 34)
                                .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Desk1Layout.createSequentialGroup()
                                        .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTidMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTidTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(149, 149, 149)
                                        .addComponent(jBregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(Desk1Layout.createSequentialGroup()
                                .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Desk1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jDfechaVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(154, 154, 154)
                                        .addComponent(jLabel5))
                                    .addGroup(Desk1Layout.createSequentialGroup()
                                        .addGap(152, 152, 152)
                                        .addComponent(jBnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(68, 68, 68))
                    .addGroup(Desk1Layout.createSequentialGroup()
                        .addGap(486, 486, 486)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(131, 131, 131))
        );
        Desk1Layout.setVerticalGroup(
            Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Desk1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Desk1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTidMascotas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTidTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Desk1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jTpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jDfechaVisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6))
                        .addGap(75, 75, 75)
                        .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Desk1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jBregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desk1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desk1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
       resetearCampos();
        
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jBregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregistroActionPerformed
      
            
            if(jTdetalle.getText().isEmpty() || jDfechaVisita.getDate() == null||jTidMascotas.getText().isEmpty()||jTidTratamiento.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Todos los campos deben estar completos");
            }
            else{
            
            MascotaData mascota = new MascotaData();
            String detalle = jTdetalle.getText();
            LocalDate fechaVisita = jDfechaVisita.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            TratamientoData tratamiento = new TratamientoData();
            Mascota idMascota = mascota.buscarMascota(Integer.parseInt(jTidMascotas.getText()));
            Tratamiento idTratamiento = tratamiento.buscarTratamiento(Integer.parseInt(jTidTratamiento.getText()));
            double pesoActual = Double.parseDouble(jTpeso.getText());
            Visita visita = new Visita(idMascota, idTratamiento, detalle, fechaVisita, pesoActual);
            VisitaData vd = new VisitaData();
            vd.GuardarNuevaVisita(visita);
            }
        
    }//GEN-LAST:event_jBregistroActionPerformed

    private void jBfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfacturaActionPerformed
        Factura f = new Factura();
        f.setVisible(true);
        Desk1.add(f);
        Desk1.moveToFront(f);
    }//GEN-LAST:event_jBfacturaActionPerformed

    private void jTidMascotasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTidMascotasKeyTyped
        if (Character.isLetter(evt.getKeyChar()) || evt.getKeyChar() == KeyEvent.VK_SPACE || !Character.isLetterOrDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTidMascotasKeyTyped

    private void jTidTratamientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTidTratamientoKeyTyped
        if (Character.isLetter(evt.getKeyChar()) || evt.getKeyChar() == KeyEvent.VK_SPACE || !Character.isLetterOrDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTidTratamientoKeyTyped

    private void jTpesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTpesoKeyTyped
        if (Character.isLetter(evt.getKeyChar()) || evt.getKeyChar() == KeyEvent.VK_SPACE || !Character.isLetterOrDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTpesoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desk1;
    private javax.swing.JButton jBfactura;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBregistro;
    private com.toedter.calendar.JDateChooser jDfechaVisita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTdetalle;
    private javax.swing.JTextField jTidMascotas;
    private javax.swing.JTextField jTidTratamiento;
    private javax.swing.JTextField jTpeso;
    // End of variables declaration//GEN-END:variables
}

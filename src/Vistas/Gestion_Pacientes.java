/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author carol
 */
public class Gestion_Pacientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form Gestion_Pacientes
     */
    public Gestion_Pacientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Multimedia/mascotaFrame.png"));
        Image image = icon.getImage();
        Desk1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,Desk1.getWidth(),Desk1.getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMtratamientosXmascotas = new javax.swing.JMenuItem();
        jMlistaPacientes = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        jMenuItem3.setText("jMenuItem3");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("GRUPO 75");

        javax.swing.GroupLayout Desk1Layout = new javax.swing.GroupLayout(Desk1);
        Desk1.setLayout(Desk1Layout);
        Desk1Layout.setHorizontalGroup(
            Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1217, Short.MAX_VALUE)
        );
        Desk1Layout.setVerticalGroup(
            Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );

        jMenu1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jMenu1.setText("    Formulario de Pacientes    ");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenuItem1.setText("Registro de Pacientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Busqueda y Gestion de Pacientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("    Consultas    ");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMtratamientosXmascotas.setText("Lista Tratamientos por Mascotas");
        jMtratamientosXmascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMtratamientosXmascotasActionPerformed(evt);
            }
        });
        jMenu3.add(jMtratamientosXmascotas);

        jMlistaPacientes.setText("Lista de Pacientes");
        jMlistaPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMlistaPacientesActionPerformed(evt);
            }
        });
        jMenu3.add(jMlistaPacientes);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desk1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desk1)
        );

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Registro_Pacientes rp = new Registro_Pacientes();
        rp.setVisible(true);
        Desk1.add(rp);
        Desk1.moveToFront(rp);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Busqueda_Gestion_Pacientes bgp = new Busqueda_Gestion_Pacientes();
        bgp.setVisible(true);
        Desk1.add(bgp);
        Desk1.moveToFront(bgp);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMtratamientosXmascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMtratamientosXmascotasActionPerformed
        Lista_tratamientosXmascotas txm = new Lista_tratamientosXmascotas();
        txm.setVisible(true);
        Desk1.add(txm);
        Desk1.moveToFront(txm);
    }//GEN-LAST:event_jMtratamientosXmascotasActionPerformed

    private void jMlistaPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMlistaPacientesActionPerformed
        ListaPacientes lp = new ListaPacientes();
        lp.setVisible(true);
        Desk1.add(lp);
        Desk1.moveToFront(lp);
    }//GEN-LAST:event_jMlistaPacientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desk1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMlistaPacientes;
    private javax.swing.JMenuItem jMtratamientosXmascotas;
    // End of variables declaration//GEN-END:variables
}
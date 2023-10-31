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
public class Gestion_Visitas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Gestion_Visitas
     */
    public Gestion_Visitas() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Multimedia/visitaFrame.png"));
        Image image = icon.getImage();
        Desk1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,Desk1.getWidth(),Desk1.getHeight(),this);
            }
        };
        jMenuBar2 = new javax.swing.JMenuBar();
        jMBusquedaGestion = new javax.swing.JMenu();
        jMregistro = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMvisitasXpacientes = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("jMenu3");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("GRUPO 75");

        javax.swing.GroupLayout Desk1Layout = new javax.swing.GroupLayout(Desk1);
        Desk1.setLayout(Desk1Layout);
        Desk1Layout.setHorizontalGroup(
            Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1219, Short.MAX_VALUE)
        );
        Desk1Layout.setVerticalGroup(
            Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
        );

        jMBusquedaGestion.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jMBusquedaGestion.setText("   Formulario de Visitas   ");
        jMBusquedaGestion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMregistro.setText("Registro de Visitas");
        jMregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMregistroActionPerformed(evt);
            }
        });
        jMBusquedaGestion.add(jMregistro);

        jMenuItem2.setText("Busqueda y Gestion de Visitas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMBusquedaGestion.add(jMenuItem2);

        jMenuBar2.add(jMBusquedaGestion);

        jMenu4.setText("   Consultas   ");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMvisitasXpacientes.setText("Lista de Visitas por Pacientes");
        jMvisitasXpacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMvisitasXpacientesActionPerformed(evt);
            }
        });
        jMenu4.add(jMvisitasXpacientes);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desk1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desk1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMregistroActionPerformed
        RegistroVisitas rv = new RegistroVisitas();
        rv.setVisible(true);
        Desk1.add(rv);
        Desk1.moveToFront(rv);
    }//GEN-LAST:event_jMregistroActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Busqueda_Gestion_Visitas bgv = new Busqueda_Gestion_Visitas();
        bgv.setVisible(true);
        Desk1.add(bgv);
        Desk1.moveToFront(bgv);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMvisitasXpacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMvisitasXpacientesActionPerformed
        Lista_visitasXpacientes vxp = new Lista_visitasXpacientes();
        vxp.setVisible(true);
        Desk1.add(vxp);
        Desk1.moveToFront(vxp);
    }//GEN-LAST:event_jMvisitasXpacientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desk1;
    private javax.swing.JMenu jMBusquedaGestion;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMregistro;
    private javax.swing.JMenuItem jMvisitasXpacientes;
    // End of variables declaration//GEN-END:variables
}

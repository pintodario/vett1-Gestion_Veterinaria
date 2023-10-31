/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author carol
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Multimedia/iconoFrame.png")).getImage());
        jPmenu.setVisible(true);
        jBmenu.setIcon(setIcono("/Multimedia/iconoMenu.png", jBmenu));
        jBmenu.setPressedIcon(setIconoPresionado("/Multimedia/iconoMenu.png", jBmenu, 20, 20));
        jBmascotas.setIcon(setIcono("/Multimedia/iconoMascotas.png", jBmascotas));
        jBmascotas.setPressedIcon(setIconoPresionado("/Multimedia/iconoMascotas.png", jBmascotas, 20, 20));
        jBclientes.setIcon(setIcono("/Multimedia/iconoClientes.png", jBclientes));
        jBclientes.setPressedIcon(setIconoPresionado("/Multimedia/iconoClientes.png", jBclientes, 20, 20));
        jBtratamientos.setIcon(setIcono("/Multimedia/iconoTratamientos.png", jBtratamientos));
        jBtratamientos.setPressedIcon(setIconoPresionado("/Multimedia/iconoTratamientos.png", jBtratamientos, 20, 20));
        jBvisitas.setIcon(setIcono("/Multimedia/iconoVisitas.png", jBvisitas));
        jBvisitas.setPressedIcon(setIconoPresionado("/Multimedia/iconoVisitas.png", jBvisitas, 20, 20));
        jPdesplegable.setVisible(false);
       
    }

    public Icon setIcono(String url, JButton boton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, ancho, Image.SCALE_DEFAULT));
        return icono;
    }

    public Icon setIconoPresionado(String url, JButton boton, int ancho, int alto) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int width = boton.getWidth() - ancho;
        int height = boton.getHeight() - alto;
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
        return icono;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Multimedia/veterinariaImage.png"));
        Image image = icon.getImage();
        Desk1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,Desk1.getWidth(),Desk1.getHeight(),this);
            }
        };
        jPmenu = new javax.swing.JPanel();
        jBmenu = new javax.swing.JButton();
        jPdesplegable = new javax.swing.JPanel();
        jBvisitas = new javax.swing.JButton();
        jBtratamientos = new javax.swing.JButton();
        jBclientes = new javax.swing.JButton();
        jBmascotas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GRUPO 75");
        setBackground(new java.awt.Color(255, 255, 255));

        jPmenu.setBackground(new java.awt.Color(153, 204, 255));

        jBmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPmenuLayout = new javax.swing.GroupLayout(jPmenu);
        jPmenu.setLayout(jPmenuLayout);
        jPmenuLayout.setHorizontalGroup(
            jPmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPmenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPmenuLayout.setVerticalGroup(
            jPmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPmenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBmenu, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPdesplegable.setBackground(new java.awt.Color(153, 204, 255));

        jBvisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvisitasActionPerformed(evt);
            }
        });

        jBtratamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtratamientosActionPerformed(evt);
            }
        });

        jBclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBclientesActionPerformed(evt);
            }
        });

        jBmascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmascotasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPdesplegableLayout = new javax.swing.GroupLayout(jPdesplegable);
        jPdesplegable.setLayout(jPdesplegableLayout);
        jPdesplegableLayout.setHorizontalGroup(
            jPdesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdesplegableLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPdesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBmascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtratamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBvisitas, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPdesplegableLayout.setVerticalGroup(
            jPdesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPdesplegableLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jBmascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtratamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jBvisitas, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        Desk1.setLayer(jPmenu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jPdesplegable, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout Desk1Layout = new javax.swing.GroupLayout(Desk1);
        Desk1.setLayout(Desk1Layout);
        Desk1Layout.setHorizontalGroup(
            Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Desk1Layout.createSequentialGroup()
                .addComponent(jPdesplegable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 944, Short.MAX_VALUE))
        );
        Desk1Layout.setVerticalGroup(
            Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Desk1Layout.createSequentialGroup()
                .addComponent(jPmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPdesplegable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jBmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmenuActionPerformed
       if (jPdesplegable.isVisible()) {
            jPdesplegable.setVisible(false);
        } else {
            jPdesplegable.setVisible(true);
        }
    }//GEN-LAST:event_jBmenuActionPerformed

    private void jBmascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmascotasActionPerformed
//        Desk1.removeAll();
//        Desk1.repaint();
        Gestion_Pacientes gp = new Gestion_Pacientes();
        gp.setVisible(true);
        Desk1.add(gp);
        Desk1.moveToFront(gp);
    }//GEN-LAST:event_jBmascotasActionPerformed

    private void jBclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBclientesActionPerformed
        Gestion_Clientes gc = new Gestion_Clientes();
        gc.setVisible(true);
        Desk1.add(gc);
        Desk1.moveToFront(gc);
    }//GEN-LAST:event_jBclientesActionPerformed

    private void jBtratamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtratamientosActionPerformed
       Gestion_Tratamientos gt = new Gestion_Tratamientos();
       gt.setVisible(true);
       Desk1.add(gt);
       Desk1.moveToFront(gt);
    }//GEN-LAST:event_jBtratamientosActionPerformed

    private void jBvisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvisitasActionPerformed
       Gestion_Visitas gv = new Gestion_Visitas();
       gv.setVisible(true);
       Desk1.add(gv);
       Desk1.moveToFront(gv);
    }//GEN-LAST:event_jBvisitasActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desk1;
    private javax.swing.JButton jBclientes;
    private javax.swing.JButton jBmascotas;
    private javax.swing.JButton jBmenu;
    private javax.swing.JButton jBtratamientos;
    private javax.swing.JButton jBvisitas;
    private javax.swing.JPanel jPdesplegable;
    private javax.swing.JPanel jPmenu;
    // End of variables declaration//GEN-END:variables
}

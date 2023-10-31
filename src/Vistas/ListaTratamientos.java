/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Acceso_a_Datos.TratamientoData;
import Entidades.Tratamiento;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carol
 */
public class ListaTratamientos extends javax.swing.JInternalFrame {

    TratamientoData tratamiento = new TratamientoData();

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {

            return false;
        }
    };

    private void cargarCabecera() {
        modelo.addColumn("ID Tratamiento");
        modelo.addColumn("Tipo Tratamiento");
        modelo.addColumn("Medicamento");
        modelo.addColumn("Importe");
        modelo.addColumn("Descripcion");

        jTtratamientos.setModel(modelo);
    }

    public ListaTratamientos() {
        initComponents();
        cargarCabecera();
    }

    private void borraFilas() {
        int f = jTtratamientos.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }

        jRactivos.setSelected(false);
        jRinactivos.setSelected(false);
        jRtodos.setSelected(false);

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTtratamientos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRactivos = new javax.swing.JRadioButton();
        jRinactivos = new javax.swing.JRadioButton();
        jRtodos = new javax.swing.JRadioButton();
        jBnuevo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("GRUPO 75");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Historial de Tratamientos");

        jTtratamientos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTtratamientos);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Activos");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Inactivos");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Todos");

        jRactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRactivosActionPerformed(evt);
            }
        });

        jRinactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRinactivosActionPerformed(evt);
            }
        });

        jRtodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRtodosActionPerformed(evt);
            }
        });

        jBnuevo.setBackground(new java.awt.Color(204, 204, 204));
        jBnuevo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jBnuevo.setText("NUEVA BUSQUEDA");
        jBnuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        Desk1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jRactivos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jRinactivos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jRtodos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jBnuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout Desk1Layout = new javax.swing.GroupLayout(Desk1);
        Desk1.setLayout(Desk1Layout);
        Desk1Layout.setHorizontalGroup(
            Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Desk1Layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Desk1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(457, 457, 457))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Desk1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Desk1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRactivos)
                        .addGap(144, 144, 144)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRinactivos)
                        .addGap(192, 192, 192)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRtodos)
                        .addGap(246, 246, 246))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Desk1Layout.createSequentialGroup()
                        .addComponent(jBnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(448, 448, 448))))
        );
        Desk1Layout.setVerticalGroup(
            Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Desk1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Desk1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jRactivos)
                            .addComponent(jRinactivos))
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Desk1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jRtodos))))
                .addGap(63, 63, 63)
                .addComponent(jBnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
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

    private void jRactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRactivosActionPerformed
        jRinactivos.setSelected(false);
        jRtodos.setSelected(false);

        borraFilas();

        for (Tratamiento tr : tratamiento.obtenerTartamientosActivos()) {
            modelo.addRow(new Object[]{tr.getID_tratamiento(), tr.getTipoTratamiento(), tr.getMedicamento(), tr.getImporte(), tr.getDescripcion()});
            jTtratamientos.setModel(modelo);
        }
    }//GEN-LAST:event_jRactivosActionPerformed

    private void jRinactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRinactivosActionPerformed
        jRactivos.setSelected(false);
        jRtodos.setSelected(false);

        borraFilas();

        for (Tratamiento tr : tratamiento.obtenerTartamientosInactivos()) {
            modelo.addRow(new Object[]{tr.getID_tratamiento(), tr.getTipoTratamiento(), tr.getMedicamento(), tr.getImporte(), tr.getDescripcion()});
            jTtratamientos.setModel(modelo);
        }
    }//GEN-LAST:event_jRinactivosActionPerformed

    private void jRtodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRtodosActionPerformed
        jRactivos.setSelected(false);
        jRinactivos.setSelected(false);

        borraFilas();

        for (Tratamiento tr : tratamiento.obtenerTodosTratamientos()) {
            modelo.addRow(new Object[]{tr.getID_tratamiento(), tr.getTipoTratamiento(), tr.getMedicamento(), tr.getImporte(), tr.getDescripcion()});
            jTtratamientos.setModel(modelo);
        }
    }//GEN-LAST:event_jRtodosActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        borraFilas();
    }//GEN-LAST:event_jBnuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desk1;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRactivos;
    private javax.swing.JRadioButton jRinactivos;
    private javax.swing.JRadioButton jRtodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTtratamientos;
    // End of variables declaration//GEN-END:variables
}

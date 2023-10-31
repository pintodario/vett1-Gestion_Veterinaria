/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Acceso_a_Datos.ClienteData;
import Entidades.Cliente;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carol
 */
public class ListaClientes extends javax.swing.JInternalFrame {

    ClienteData cliente = new ClienteData();
    
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {

            return false;
        }
    };
    
    public ListaClientes() {
        initComponents();
        cargarCabecera();
        
    }

    private void cargarCabecera(){
        modelo.addColumn("ID Cliente");
         modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("ContactoAlt");
        modelo.addColumn("Tel ContAlt");
        
        jTclientes.setModel(modelo);
    }
    
    private void borraFilas() {
        int f = jTclientes.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
        
        jRactivo.setSelected(false);
        jRinactivo.setSelected(false);
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
        jTclientes = new javax.swing.JTable();
        jRactivo = new javax.swing.JRadioButton();
        jRinactivo = new javax.swing.JRadioButton();
        jRtodos = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBnuevo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("GRUPO 75");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Historial de Clientes");

        jTclientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTclientes);

        jRactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRactivoActionPerformed(evt);
            }
        });

        jRinactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRinactivoActionPerformed(evt);
            }
        });

        jRtodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRtodosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Activo");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Inactivo");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Todos");

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
        Desk1.setLayer(jRactivo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jRinactivo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jRtodos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jBnuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout Desk1Layout = new javax.swing.GroupLayout(Desk1);
        Desk1.setLayout(Desk1Layout);
        Desk1Layout.setHorizontalGroup(
            Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Desk1Layout.createSequentialGroup()
                .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Desk1Layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRactivo)
                        .addGap(159, 159, 159)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRinactivo)
                        .addGap(144, 144, 144)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRtodos))
                    .addGroup(Desk1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Desk1Layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(jBnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Desk1Layout.createSequentialGroup()
                        .addGap(481, 481, 481)
                        .addComponent(jLabel1)))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        Desk1Layout.setVerticalGroup(
            Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Desk1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRinactivo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRactivo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRtodos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jBnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desk1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desk1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRactivoActionPerformed
        
        jRinactivo.setSelected(false);
        jRtodos.setSelected(false);
        
        borraFilas();
        
        for (Cliente cli : cliente.obtenerClientesActivos()) {
             modelo.addRow(new Object[]{cli.getID_cliente(),cli.getDni(),cli.getNombre(),cli.getApellido(),cli.getDireccion(),cli.getTelefono(),cli.getNombreContactoAlt(),cli.getContactoAlternativo()});
            jTclientes.setModel(modelo);
        }
            
    }//GEN-LAST:event_jRactivoActionPerformed

    private void jRinactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRinactivoActionPerformed
       
        jRactivo.setSelected(false);
        jRtodos.setSelected(false);
        
        borraFilas();
        
        for (Cliente cli : cliente.obtenerClientesInactivos()) {
             modelo.addRow(new Object[]{cli.getID_cliente(),cli.getDni(),cli.getNombre(),cli.getApellido(),cli.getDireccion(),cli.getTelefono(),cli.getNombreContactoAlt(),cli.getContactoAlternativo()});
            jTclientes.setModel(modelo);
        }
            
    }//GEN-LAST:event_jRinactivoActionPerformed

    private void jRtodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRtodosActionPerformed
       
        jRactivo.setSelected(false);
       jRinactivo.setSelected(false);
       
       borraFilas();
       
        for (Cliente cli : cliente.obtenerTodosLosClientes()) {
             modelo.addRow(new Object[]{cli.getID_cliente(),cli.getDni(),cli.getNombre(),cli.getApellido(),cli.getDireccion(),cli.getTelefono(),cli.getNombreContactoAlt(),cli.getContactoAlternativo()});
            jTclientes.setModel(modelo);
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
    private javax.swing.JRadioButton jRactivo;
    private javax.swing.JRadioButton jRinactivo;
    private javax.swing.JRadioButton jRtodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTclientes;
    // End of variables declaration//GEN-END:variables
}

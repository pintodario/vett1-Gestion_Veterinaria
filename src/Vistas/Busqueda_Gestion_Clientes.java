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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carol
 */
public class Busqueda_Gestion_Clientes extends javax.swing.JInternalFrame {

    ClienteData cliente = new ClienteData();

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {

            return true;
        }
    };

    public Busqueda_Gestion_Clientes() {
        initComponents();
        cargarCabecera();
    }

    private void cargarCabecera() {
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("ContactoAlt");
        modelo.addColumn("Tel ContAlt");
        modelo.addColumn("Activo");
        jTclientes.setModel(modelo);
    }

    private void borraFilas() {
        int f = jTclientes.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
        jTidCliente.setText("");
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
        }
        ;
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTidCliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTclientes = new javax.swing.JTable();
        jBeliminar = new javax.swing.JButton();
        jBactualizar = new javax.swing.JButton();
        jBnuevo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("GRUPO 75");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Busqueda y Gestion de Clientes");

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("ID Cliente");

        jTidCliente.setToolTipText("Ingrese solo campos numericos");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

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

        jBeliminar.setBackground(new java.awt.Color(204, 204, 204));
        jBeliminar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jBeliminar.setText("ELIMINAR");
        jBeliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBactualizar.setBackground(new java.awt.Color(204, 204, 204));
        jBactualizar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jBactualizar.setText("ACTUALIZAR");
        jBactualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBactualizarActionPerformed(evt);
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

        Desk1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jBeliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jBactualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desk1.setLayer(jBnuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout Desk1Layout = new javax.swing.GroupLayout(Desk1);
        Desk1.setLayout(Desk1Layout);
        Desk1Layout.setHorizontalGroup(
            Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Desk1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(jBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(jBnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
            .addGroup(Desk1Layout.createSequentialGroup()
                .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Desk1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Desk1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Desk1Layout.createSequentialGroup()
                        .addGap(422, 422, 422)
                        .addComponent(jLabel1)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        Desk1Layout.setVerticalGroup(
            Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Desk1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Desk1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(253, Short.MAX_VALUE))
                    .addGroup(Desk1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Desk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84))))
        );

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try{
            int id = Integer.parseInt(jTidCliente.getText());

            Cliente cli = cliente.obtenerClientePorId(id);

            if (cli != null) {
                modelo.addRow(new Object[]{cli.getDni(), 
                    cli.getNombre(), 
                    cli.getApellido(), 
                    cli.getDireccion(),
                    cli.getTelefono(), 
                    cli.getNombreContactoAlt(),
                    cli.getContactoAlternativo(),
                    cli.isActivo()});
                jTclientes.setModel(modelo);
            }
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Es necesario introducir un valor numerico");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizarActionPerformed

        int filas = jTclientes.getSelectedRow();
        int idCliente = Integer.parseInt(jTidCliente.getText());
        int dni = Integer.parseInt(jTclientes.getValueAt(filas, 0).toString());
        String nombre = jTclientes.getValueAt(filas, 1).toString();
        String apellido = jTclientes.getValueAt(filas, 2).toString();
        String direccion = jTclientes.getValueAt(filas, 3).toString();
        int telefono = Integer.parseInt(jTclientes.getValueAt(filas, 4).toString());
        String contactoAlt = jTclientes.getValueAt(filas, 5).toString();
        int telContactoAlt = Integer.parseInt(jTclientes.getValueAt(filas, 6).toString());
        boolean estado = (boolean) jTclientes.getValueAt(filas, 7);

        Cliente cli = new Cliente(idCliente, dni, nombre, apellido, telefono, direccion, telContactoAlt, contactoAlt, estado);
        cliente.actualizarCliente(cli);

    }//GEN-LAST:event_jBactualizarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        try {

            int id = Integer.parseInt(jTidCliente.getText());
            cliente.eliminarCliente(id);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese campos numericos");

        }
        borraFilas();

    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed

        borraFilas();

    }//GEN-LAST:event_jBnuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desk1;
    private javax.swing.JButton jBactualizar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTclientes;
    private javax.swing.JTextField jTidCliente;
    // End of variables declaration//GEN-END:variables
}

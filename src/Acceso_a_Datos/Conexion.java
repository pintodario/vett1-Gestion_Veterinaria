/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acceso_a_Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author carol
 */
public class Conexion {
    
      private static final String URL = "jdbc:mariadb://localhost/";
    private static final String BBDD = "veterinariaULP";
    private static String USUARIO = "root";
    private static String PASSWORD = "";
    private static Connection connection;
    
    public Conexion(){
        
    }
    
    public static Connection getConexion(){
        
        if(connection == null){
            
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL + BBDD, USUARIO, PASSWORD);
                
                JOptionPane.showMessageDialog(null, "Conectado");
                
            } catch (ClassNotFoundException ex) {
               JOptionPane.showMessageDialog(null, "Error al cargar el driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de coneccion");
            }
        }
        return connection;
    
}
}

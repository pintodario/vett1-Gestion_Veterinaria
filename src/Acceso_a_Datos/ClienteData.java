/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acceso_a_Datos;

/**
 *
 * @author MaxiGalvan
 */
import Entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteData {
//    private Connection conexion; // conectar a BDATOS
//
//    public ClienteData(Connection conexion) {
//        this.conexion = conexion;
//    }

    private Connection con = null;

    public ClienteData() {
        this.con = Conexion.getConexion();

    }

    public void agregarCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente( dni, nombre, apellido, telefono, direccion, contactoAlternativo,nombreContactoAlt,activo)"
                + " VALUES ( ?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cliente.getDni());
            ps.setString(3, cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setString(5, cliente.getDireccion());
            ps.setInt(4, cliente.getTelefono());
            ps.setInt(6, cliente.getContactoAlternativo());
            ps.setString(7, cliente.getNombreContactoAlt());
            ps.setBoolean(8, cliente.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                cliente.setID_cliente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cliente registrado");

            } else {
                JOptionPane.showMessageDialog(null, "Cliente no se puede registrar con el mismo dni");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cliente no se puede registrar con el mismo dni");
        }
    }

    public void actualizarCliente(Cliente cliente) {
        try {
            String sql = "UPDATE cliente SET dni=?,nombre=?,apellido=?,telefono=?,direccion=?,contactoAlternativo=?,nombreContactoAlt=?"
                    + "WHERE ID_cliente=? AND activo = 1";

            PreparedStatement ps = con.prepareStatement(sql);
           
            ps.setInt(1, cliente.getDni());
             ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setString(4, cliente.getDireccion());
            ps.setInt(5, cliente.getTelefono());
            ps.setInt(6, cliente.getContactoAlternativo());
            ps.setString(7, cliente.getNombreContactoAlt());
            ps.setInt(8, cliente.getID_cliente());
            ps.setBoolean(9, cliente.isActivo());

            int filas = ps.executeUpdate();

            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Cliente Modificado");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente");
        }

    }

    public void eliminarCliente(int id) {
        String sql = "UPDATE cliente Set activo=0 WHERE ID_cliente=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Cliente eliminado exitosamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
    }

    public Cliente obtenerClientePorId(int id) {
        Cliente cliente = null;
        String sql = "SELECT  dni, nombre, apellido, telefono, direccion, contactoAlternativo,nombreContactoAlt, activo "
                + "FROM cliente WHERE ID_cliente=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setID_cliente(id);
                cliente.setDni(rs.getInt("dni"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setContactoAlternativo(rs.getInt("contactoAlternativo"));
                cliente.setNombreContactoAlt(rs.getString("nombreContactoAlt"));
                cliente.setActivo(rs.getBoolean("activo"));

            } else {
                JOptionPane.showMessageDialog(null, "Cliente inexistente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }

        return cliente;
    }
    

    public List<Cliente> obtenerTodosLosClientes() {
        List<Cliente> client = new ArrayList<>();

        try {
            String sql = "SELECT * FROM cliente";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    Cliente cliente = new Cliente();

                    cliente.setID_cliente(rs.getInt("ID_cliente"));
                    cliente.setDni(rs.getInt("dni"));
                    cliente.setNombre(rs.getString("nombre"));
                    cliente.setApellido(rs.getString("apellido"));
                    cliente.setTelefono(rs.getInt("telefono"));
                    cliente.setDireccion(rs.getString("direccion"));
                    cliente.setContactoAlternativo(rs.getInt("contactoAlternativo"));
                    cliente.setNombreContactoAlt(rs.getString("nombreContactoAlt"));
                    cliente.setActivo(rs.getBoolean("activo"));

                    client.add(cliente);

                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }

        return client;
    }
    
     public List<Cliente> obtenerClientesActivos() {
        List<Cliente> client = new ArrayList<>();

        try {
            String sql = "SELECT * FROM cliente WHERE activo = 1";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    Cliente cliente = new Cliente();

                    cliente.setID_cliente(rs.getInt("ID_cliente"));
                    cliente.setDni(rs.getInt("dni"));
                    cliente.setNombre(rs.getString("nombre"));
                    cliente.setApellido(rs.getString("apellido"));
                    cliente.setTelefono(rs.getInt("telefono"));
                    cliente.setDireccion(rs.getString("direccion"));
                    cliente.setContactoAlternativo(rs.getInt("contactoAlternativo"));
                    cliente.setNombreContactoAlt(rs.getString("nombreContactoAlt"));
                    cliente.setActivo(rs.getBoolean("activo"));

                    client.add(cliente);

                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }

        return client;
    }
     
      public List<Cliente> obtenerClientesInactivos() {
        List<Cliente> client = new ArrayList<>();

        try {
            String sql = "SELECT * FROM cliente WHERE activo = 0";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    Cliente cliente = new Cliente();

                    cliente.setID_cliente(rs.getInt("ID_cliente"));
                    cliente.setDni(rs.getInt("dni"));
                    cliente.setNombre(rs.getString("nombre"));
                    cliente.setApellido(rs.getString("apellido"));
                    cliente.setTelefono(rs.getInt("telefono"));
                    cliente.setDireccion(rs.getString("direccion"));
                    cliente.setContactoAlternativo(rs.getInt("contactoAlternativo"));
                    cliente.setNombreContactoAlt(rs.getString("nombreContactoAlt"));
                    cliente.setActivo(rs.getBoolean("activo"));

                    client.add(cliente);

                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }

        return client;
    }

}

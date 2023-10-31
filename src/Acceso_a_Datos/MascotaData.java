/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acceso_a_Datos;

import Entidades.Cliente;
import Entidades.Mascota;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author carol
 */
public class MascotaData {

    private Connection con;
    ClienteData cl = new ClienteData();

    public MascotaData() {
        this.con = Conexion.getConexion();
    }

    public void guardarMascota(Mascota mascota) {

        String sql = "INSERT INTO mascota (ID_cliente,nombre, sexo, especie, raza, color, peso, fechaNac,  activo) VALUES (?,?,?,?,?,?,?,?,?) ";

        try {

            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mascota.getCliente().getID_cliente());
            ps.setString(2, mascota.getNombre());
            ps.setString(3, mascota.getSexo());
            ps.setString(4, mascota.getEspecie());
            ps.setString(5, mascota.getRaza());
            ps.setString(6, mascota.getColor());
            ps.setDouble(7, mascota.getPeso());
            ps.setDate(8, Date.valueOf(mascota.getFechaNac()));

            ps.setBoolean(9, mascota.isActivo());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                mascota.setIdMascota(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Paciente registrado correctamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error a conectarse a la tabla");
        }

    }

    public Mascota buscarMascota(int id) {

        String sql = "SELECT ID_cliente, nombre, sexo, especie, raza, color, peso, fechaNac, activo FROM mascota WHERE ID_mascota = ? ";
        Mascota masc = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                masc = new Mascota();
                masc.setIdMascota(id);
                Cliente cliente = cl.obtenerClientePorId(rs.getInt("ID_cliente"));
                masc.setCliente(cliente);
                masc.setNombre(rs.getString("nombre"));
                masc.setSexo(rs.getString("sexo"));
                masc.setEspecie(rs.getString("especie"));
                masc.setRaza(rs.getString("raza"));
                masc.setColor(rs.getString("color"));
                masc.setPeso(rs.getDouble("peso"));
                masc.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                masc.setActivo(rs.getBoolean("activo"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese paciente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error a conectarse a la tabla");
        }
        return masc;
    }

    public void modificarMascota(Mascota mascota) {
        String sql = "UPDATE mascota SET ID_cliente = ?, nombre = ?, sexo = ?, especie = ?, raza = ?, color = ?, peso = ?, fechaNac = ? WHERE  ID_mascota = ? AND activo = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mascota.getCliente().getID_cliente());
            ps.setString(2, mascota.getNombre());
            ps.setString(3,mascota.getSexo());
            ps.setString(4, mascota.getEspecie());
            ps.setString(5, mascota.getRaza());
            ps.setString(6, mascota.getColor());
            ps.setDouble(7, mascota.getPeso());
            ps.setDate(8, Date.valueOf(mascota.getFechaNac()));
            ps.setInt(9, mascota.getIdMascota());
            ps.setBoolean(10, mascota.isActivo());

            int filas = ps.executeUpdate();

            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Paciente modificado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "El paciente es inexistente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }

    }

    public void eliminarMascota(int id) {

        try {
            String sql = "UPDATE mascota SET activo = 0 WHERE ID_mascota = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino correctamente el paciente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }

    }

    public List<Mascota> listarMascotasActivas() {

        List<Mascota> mascotas = new ArrayList<>();

        String sql = "SELECT * FROM mascota WHERE activo = 1 ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Mascota masc = new Mascota();
                masc.setIdMascota(rs.getInt("ID_mascota"));
                Cliente cliente = cl.obtenerClientePorId(rs.getInt("ID_cliente"));
                masc.setCliente(cliente);
                masc.setNombre(rs.getString("nombre"));
                masc.setSexo(rs.getString("sexo"));
                masc.setEspecie(rs.getString("especie"));
                masc.setRaza(rs.getString("raza"));
                masc.setRaza(rs.getString("color"));
                masc.setPeso(rs.getDouble("peso"));
                masc.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                masc.setActivo(rs.getBoolean("activo"));

                mascotas.add(masc);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }

        return mascotas;

    }
    
    
    public List<Mascota> listarMascotasInactivas() {

        List<Mascota> mascotas = new ArrayList<>();

        String sql = "SELECT * FROM mascota WHERE activo = 0 ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Mascota masc = new Mascota();
                masc.setIdMascota(rs.getInt("ID_mascota"));
                Cliente cliente = cl.obtenerClientePorId(rs.getInt("ID_cliente"));
                masc.setCliente(cliente);
                masc.setNombre(rs.getString("nombre"));
                masc.setSexo(rs.getString("sexo"));
                masc.setEspecie(rs.getString("especie"));
                masc.setRaza(rs.getString("raza"));
                masc.setRaza(rs.getString("color"));
                masc.setPeso(rs.getDouble("peso"));
                masc.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                masc.setActivo(rs.getBoolean("activo"));

                mascotas.add(masc);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }

        return mascotas;

    }
    
    
    public List<Mascota> listarMascotas() {

        List<Mascota> mascotas = new ArrayList<>();

        String sql = "SELECT * FROM mascota  ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Mascota masc = new Mascota();
                masc.setIdMascota(rs.getInt("ID_mascota"));
                Cliente cliente = cl.obtenerClientePorId(rs.getInt("ID_cliente"));
                masc.setCliente(cliente);
                masc.setNombre(rs.getString("nombre"));
                masc.setSexo(rs.getString("sexo"));
                masc.setEspecie(rs.getString("especie"));
                masc.setRaza(rs.getString("raza"));
                masc.setRaza(rs.getString("color"));
                masc.setPeso(rs.getDouble("peso"));
                masc.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                masc.setActivo(rs.getBoolean("activo"));

                mascotas.add(masc);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }

        return mascotas;

    }

    public List<Mascota> obtenerMascotasXcliente(int idCliente) {

        List<Mascota> mascotas = new ArrayList<>();

        String sql = "SELECT m.ID_mascota, m.nombre, m.sexo, m.especie, m.raza, m.color, m.peso, m.fechaNac, m.activo "
                + "FROM mascota AS m JOIN cliente AS c ON m.ID_cliente = c.ID_cliente"
                + " WHERE c. ID_cliente = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCliente);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Mascota masc = new Mascota();
                masc.setIdMascota(rs.getInt("ID_mascota"));
                masc.setNombre(rs.getString("nombre"));
                masc.setSexo(rs.getString("sexo"));
                masc.setEspecie(rs.getString("especie"));
                masc.setRaza(rs.getString("raza"));
                masc.setColor(rs.getString("color"));
                masc.setPeso(rs.getDouble("peso"));
                masc.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                masc.setActivo(rs.getBoolean("activo"));

                mascotas.add(masc);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a una de las tablas");
        }

        return mascotas;
    }

}

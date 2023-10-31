/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acceso_a_Datos;

import Entidades.Cliente;
import Entidades.Mascota;
import Entidades.Tratamiento;
import Entidades.Visita;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author carol
 */
public class VisitaData {

    private Connection con;
    ClienteData cl = new ClienteData();
    MascotaData md = new MascotaData();
    TratamientoData td = new TratamientoData();

    public VisitaData() {
        this.con = Conexion.getConexion();;
    }

    public void GuardarNuevaVisita(Visita visita) {
        String sql = "INSERT INTO visita (Id_mascota,ID_tratamiento,fechaVisita,detalle, pesoActual ) VALUES (?,?,?,?,?) ";

        try {

            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setInt(1, visita.getID_mascota().getIdMascota());
            ps.setInt(2, visita.getID_tratamiento().getID_tratamiento());
            ps.setDate(3, Date.valueOf(visita.getFechaVisita()));
            ps.setString(4, visita.getDetalle());
            ps.setDouble(5, visita.getPesoActual());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                visita.setID_visita(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Visita cargada correctamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error a conectarse a la tabla");
        }
    }

    public Visita buscarVisita(int id) {
        String sql = "SELECT ID_mascota, ID_Tratamiento, fechaVisita, detalle, pesoActual FROM visita WHERE ID_visita = ? ";
        Visita vis = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                vis = new Visita();
                vis.setID_visita(id);
                Mascota mascota = md.buscarMascota(rs.getInt("ID_mascota"));
                Tratamiento tratamiento = td.buscarTratamiento(rs.getInt("ID_tratamiento"));
                vis.setID_mascota(mascota);
                vis.setID_tratamiento(tratamiento);
                vis.setFechaVisita(rs.getDate("fechaVisita").toLocalDate());
                vis.setDetalle(rs.getString("detalle"));
                vis.setPesoActual(rs.getDouble("pesoActual"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe esa visita");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error a conectarse a la tabla");
        }
        return vis;

    }

    public void modificarVisita(Visita visita) {
        String sql = "UPDATE visita SET ID_mascota = ?, ID_tratamiento = ?, fechaVisita = ?, detalle = ?, pesoActual = ? WHERE  ID_visita = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, visita.getID_mascota().getIdMascota());
            ps.setInt(2, visita.getID_tratamiento().getID_tratamiento());
            ps.setDate(3, Date.valueOf(visita.getFechaVisita()));
            ps.setString(4, visita.getDetalle());
            ps.setDouble(5, visita.getPesoActual());
            ps.setInt(6, visita.getID_visita());

            int filas = ps.executeUpdate();

            System.out.println(filas);

            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Visita modificado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "La visita es inexistente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }

    }

    public void eliminarVisita(int id) {

        try {
            String sql = "DELETE FROM visita WHERE ID_visita = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino correctamente el la visita");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }

    }

    public List<Visita> listarVisitas() {

        List<Visita> visitas = new ArrayList<>();

        String sql = "SELECT * FROM visita ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Visita vis = new Visita();

                vis.setID_visita(rs.getInt("ID_visita"));
                Mascota mascota = md.buscarMascota(rs.getInt("ID_mascota"));
                vis.setID_mascota(mascota);
                Tratamiento tratamiento = td.buscarTratamiento(rs.getInt("ID_tratamiento"));
                vis.setID_tratamiento(tratamiento);
                vis.setFechaVisita(rs.getDate("fechaVisita").toLocalDate());
                vis.setDetalle(rs.getString("detalle"));
                vis.setPesoActual(rs.getDouble("pesoActual"));

                visitas.add(vis);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }

        return visitas;
    }

    public List<Visita> obtenerVisitasXmascota(int idMascota) {

        List<Visita> visitas = new ArrayList<>();

        String sql = "SELECT ID_visita,ID_tratamiento,fechaVisita, detalle, pesoActual FROM visita WHERE ID_mascota = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMascota);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Visita vis = new Visita();
                vis.setID_visita(rs.getInt("ID_visita"));
                Tratamiento tratamiento = td.buscarTratamiento(rs.getInt("ID_tratamiento"));
                vis.setID_tratamiento(tratamiento);
                vis.setFechaVisita(rs.getDate("fechaVisita").toLocalDate());
                vis.setDetalle(rs.getString("detalle"));
                vis.setPesoActual(rs.getDouble("pesoActual"));

                visitas.add(vis);

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a una de las tablas");
        }

        return visitas;
    }

    public List<Mascota> obtenerMascotasXtratamientos(Tratamiento tratamiento) {

        List<Mascota> mascotas = new ArrayList<>();
        Mascota masc = null;

        String sql = "SELECT DISTINCT m.*\n"
                + "FROM mascota AS m\n"
                + "JOIN visita AS v ON m.ID_mascota = v.ID_mascota\n"
                + "WHERE v.ID_tratamiento = ?\n"
                + "AND m.ID_mascota NOT IN (\n"
                + "SELECT m2.ID_mascota\n"
                + "FROM mascota AS m2\n"
                + "JOIN visita AS v2 ON m2.ID_mascota = v2.ID_mascota\n"
                + "WHERE v2.ID_tratamiento = ?\n"
                + "AND m2.ID_mascota <> m.ID_mascota)\n";

        PreparedStatement ps;

        try {

            ps = con.prepareStatement(sql);

            ps.setInt(1, tratamiento.getID_tratamiento());
            ps.setInt(2, tratamiento.getID_tratamiento());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                masc = new Mascota();
                masc.setIdMascota(rs.getInt("ID_mascota"));
                masc.setNombre(rs.getString("nombre"));
                masc.setSexo(rs.getString("sexo"));
                masc.setEspecie(rs.getString("especie"));
                masc.setRaza(rs.getString("raza"));

                mascotas.add(masc);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a una de las tablas");
        }

        return mascotas;
    }

    public List<Tratamiento> tratamientosXmascotas(Mascota mascota) {

        List<Tratamiento> tratamientos = new ArrayList<>();
        Tratamiento trat = null;

        String sql = "SELECT DISTINCT t.*\n"
                + "FROM tratamiento AS t\n"
                + "JOIN visita AS v ON t.ID_tratamiento = v.ID_tratamiento\n"
                + "WHERE v.ID_mascota = ?\n"
                + "AND t.ID_tratamiento NOT IN (\n"
                + "SELECT t2.ID_tratamiento\n"
                + "FROM tratamiento AS t2\n"
                + "JOIN visita AS v2 ON t2.ID_tratamiento = v2.ID_tratamiento\n"
                + "WHERE v2.ID_mascota = ?\n"
                + "AND t2.ID_tratamiento <> t.ID_tratamiento)\n";

        PreparedStatement ps;

        try {

            ps = con.prepareStatement(sql);

            ps.setInt(1, mascota.getIdMascota());
            ps.setInt(2, mascota.getIdMascota());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                trat = new Tratamiento();
                trat.setID_tratamiento(rs.getInt("ID_tratamiento"));
                trat.setDescripcion(rs.getString("descripcion"));
                trat.setMedicamento(rs.getString("medicamento"));
                trat.setImporte(rs.getDouble("importe"));
                trat.setTipoTratamiento(rs.getString("tipoTratamiento"));
                trat.setActivo(rs.getBoolean("activo"));

                tratamientos.add(trat);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a una de las tablas");
        }

        return tratamientos;
    }

    public String pesoProm(int id) {
        String sql = "SELECT ID_mascota, AVG(pesoActual) FROM visita WHERE ID_mascota=? ORDER BY fechaVisita DESC LIMIT 10";

        String st = null;

        DecimalFormat df = new DecimalFormat("#.00");
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                
                double avgPeso = rs.getDouble("AVG(pesoActual)");
                st = df.format(avgPeso);

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
        return st;

    }

}

//"SELECT COUNT(fechaVisita) AS cantidad, SUM(peso) AS total FROM ( SELECT fechaVisita, peso FROM visita WHERE idMascota = ? ORDER BY fechaVisita DESC LIMIT 10 ) subquery;";

package Acceso_a_Datos;

/**
 *
 * @author Dario
 */
import Entidades.Tratamiento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TratamientoData {
    private Connection connection;

    public TratamientoData() {
        this.connection = Conexion.getConexion();
    }


    public void altaTratamiento(Tratamiento tratamiento) {
        String sql = "INSERT INTO tratamiento (tipoTratamiento, medicamento, importe, descripcion, activo) VALUES (?, ?, ?, ?, ?)";
    
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, tratamiento.getTipoTratamiento());
            statement.setString(2, tratamiento.getMedicamento());
            statement.setDouble(3, tratamiento.getImporte());
            statement.setString(4, tratamiento.getDescripcion());
            statement.setBoolean(5, tratamiento.isActivo());
        
            int rowsAffected = statement.executeUpdate();
        
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Tratamiento registrado exitosamente");
            
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla");
//            e.printStackTrace();
        }
    }

    
    
    public void bajaTratamiento(int ID_tratamiento) {
       try {
            String sql = "UPDATE tratamiento SET activo = 0 WHERE ID_tratamiento = ?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, ID_tratamiento);

            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Tratamiento eliminado exitosamente");
            }
            else{
                JOptionPane.showMessageDialog(null, "El tratamiento es inexistente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
    }

    public void modificarTratamiento(Tratamiento tratamiento) {
        String sql = "UPDATE tratamiento SET tipoTratamiento = ?, medicamento = ?, importe = ?, descripcion = ? WHERE ID_tratamiento = ? AND activo = 1";
        
        try {
            PreparedStatement ps  = connection.prepareStatement(sql);
            ps.setString(1, tratamiento.getTipoTratamiento());
            ps.setString(2, tratamiento.getMedicamento());
            ps.setDouble(3, tratamiento.getImporte());
            ps.setString(4, tratamiento.getDescripcion());
            ps.setInt(5, tratamiento.getID_tratamiento());
            ps.setBoolean(6, tratamiento.isActivo());
            
        
            int filas = ps.executeUpdate();
        
            if (filas ==1) {
               JOptionPane.showMessageDialog(null, "Tratamiento modificado exitosamente");
            }
            else{
                 JOptionPane.showMessageDialog(null, "El tratamiento es inexistente");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla");
//            e.printStackTrace();
        }
    }
    
    public Tratamiento buscarTratamiento(int id){
         String sql = "SELECT tipoTratamiento, medicamento, importe, descripcion, activo FROM tratamiento WHERE ID_tratamiento = ? ";
        Tratamiento trat = null;
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                trat = new Tratamiento();
                trat.setID_tratamiento(id);
                trat.setDescripcion(rs.getString("tipoTratamiento"));
                trat.setMedicamento(rs.getString("medicamento"));
                trat.setImporte(rs.getDouble("importe"));
                trat.setTipoTratamiento(rs.getString("descripcion"));
                trat.setActivo(rs.getBoolean("activo"));
               
            } else {
                JOptionPane.showMessageDialog(null, "Tratamiento inexistente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error a conectarse a la tabla");
        }
        
        return trat;
    
    }

    public Tratamiento consultarTratamiento(int ID_tratamiento) {
        String sql = "SELECT * FROM tratamiento WHERE ID_tratamiento = ?";
        Tratamiento tratamiento = null;
        
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, ID_tratamiento);
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                tratamiento = new Tratamiento();
                tratamiento.setID_tratamiento(resultSet.getInt("ID_tratamiento"));
                tratamiento.setDescripcion(resultSet.getString("tipoTratamiento"));
                tratamiento.setMedicamento(resultSet.getString("medicamento"));
                tratamiento.setImporte(resultSet.getDouble("importe"));
                tratamiento.setTipoTratamiento(resultSet.getString("descripcion"));
                tratamiento.setActivo(resultSet.getBoolean("activo"));
            }
        } catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla");
//            e.printStackTrace();
        }
        
        return tratamiento;
    }

    public List<Tratamiento> obtenerTodosTratamientos() {
        String sql = "SELECT * FROM tratamiento";
        List<Tratamiento> tratamientos = new ArrayList<>();
        
        try{
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                Tratamiento tratamiento = new Tratamiento();
                tratamiento.setID_tratamiento(resultSet.getInt("ID_tratamiento"));
                tratamiento.setTipoTratamiento(resultSet.getString("tipoTratamiento"));
                tratamiento.setMedicamento(resultSet.getString("medicamento"));
                tratamiento.setImporte(resultSet.getDouble("importe"));
                tratamiento.setDescripcion(resultSet.getString("descripcion"));
                tratamiento.setActivo(resultSet.getBoolean("activo"));
                tratamientos.add(tratamiento);
            }
        } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla");
            
        }
        
        return tratamientos;
    }
    
    public List<Tratamiento> obtenerTartamientosActivos() {
        String sql = "SELECT * FROM tratamiento WHERE activo = 1";
        List<Tratamiento> tratamientos = new ArrayList<>();
        
        try{
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                Tratamiento tratamiento = new Tratamiento();
                tratamiento.setID_tratamiento(resultSet.getInt("ID_tratamiento"));
                tratamiento.setTipoTratamiento(resultSet.getString("tipoTratamiento"));
                tratamiento.setMedicamento(resultSet.getString("medicamento"));
                tratamiento.setImporte(resultSet.getDouble("importe"));
                tratamiento.setDescripcion(resultSet.getString("descripcion"));
                tratamiento.setActivo(resultSet.getBoolean("activo"));
                tratamientos.add(tratamiento);
            }
        } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla");

        }
        
        return tratamientos;
    }
    
      public List<Tratamiento> obtenerTartamientosInactivos() {
        String sql = "SELECT * FROM tratamiento WHERE activo = 0";
        List<Tratamiento> tratamientos = new ArrayList<>();
        
        try{
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                Tratamiento tratamiento = new Tratamiento();
                tratamiento.setID_tratamiento(resultSet.getInt("ID_tratamiento"));
                tratamiento.setTipoTratamiento(resultSet.getString("tipoTratamiento"));
                tratamiento.setMedicamento(resultSet.getString("medicamento"));
                tratamiento.setImporte(resultSet.getDouble("importe"));
                tratamiento.setDescripcion(resultSet.getString("descripcion"));
                tratamiento.setActivo(resultSet.getBoolean("activo"));
                tratamientos.add(tratamiento);
            }
        } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla");

        }
        
        return tratamientos;
    }
    
     public List<String> listarMedicamentos() {

        List<String> medicamentos = new ArrayList<>();
        
        medicamentos.add("Ninguno");
        medicamentos.add("Asepcia");
        medicamentos.add("Amoxicilina");
        medicamentos.add("Ampicilina");
        medicamentos.add("Avilamicina");
        medicamentos.add("Imidocarb");
        medicamentos.add("Ipronidazol");
        medicamentos.add("Isometamidio");
        medicamentos.add("Olaquindox");
        medicamentos.add("Espiramicina");
        medicamentos.add("Ivermectina");
        
        return medicamentos;

    }
     
     
}
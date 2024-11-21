/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.DAO;

import modelo.DTO.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.Conexion;

/**
 *
 * @author David
 */
public class PersonaDAO {
    
    private static final String SQL_TABLE = "persona",
            SQL_INSERT = "INSERT INTO " + SQL_TABLE + " (id, nombre, direccion, telefono, genero, fechanacimiento) VALUES (?,?,?,?,?,?)",
            SQL_UPDATE = "UPDATE " + SQL_TABLE + " SET nombre, direccion, telefono, genero, fechanacimiento WHERE id = ?",
            SQL_DELETE = "DELETE FROM " + SQL_TABLE + " WHERE id = ?",
            SQL_SELECT = "SELECT * FROM " + SQL_TABLE + " WHERE id = ?",
            SQL_SELECT_ALL = "SELECT * FROM " + SQL_TABLE;
   
    private static final Conexion CON = Conexion.getInstance();
    
    public boolean create(Persona o) {
        PreparedStatement ps;
        try {
            ps = CON.getCnn().prepareStatement(SQL_INSERT);
            
            ps.setString(1, o.getDocumento());
            ps.setString(2, o.getNombre());
            ps.setString(3, o.getDireccion());
            ps.setString(4, o.getTelefono());
            ps.setString(5, o.getGenero());
            if (o.getFechaNacimiento() != null) {
                ps.setDate(6, new java.sql.Date(o.getFechaNacimiento().getTime()));
            } else {
                ps.setString(6, null);
            }
            if (ps.executeUpdate() > 0) {
                return (true);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            CON.close();
        }
        return (false);
    }
    
    
    public Persona getPersona(String id) {
        
        PreparedStatement ps;
        ResultSet rs;
        Persona item = null;
        
        try {
            ps = CON.getCnn().prepareStatement(SQL_SELECT);
            
            ps.setString(1, id);
            
            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                item = new Persona();
                item.setNombre(rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            CON.close();
        }
        return (item);
    }
    
    
}

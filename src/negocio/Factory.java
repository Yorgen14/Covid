/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import modelo.DAO.PersonaDAO;
import java.sql.SQLException;

/**
 *
 * @author David
 */
public class Factory {
 
    public PersonaDAO getPersona() throws SQLException {
        return new PersonaDAO();
    }
    
    public PersonaDAO getClinica() throws SQLException {
        return new PersonaDAO();
    }
    
    public PersonaDAO getPaciente() throws SQLException {
        return new PersonaDAO();
    }
    
}

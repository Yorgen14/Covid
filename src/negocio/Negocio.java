/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import modelo.DAO.PersonaDAO;
import modelo.DTO.Paciente;
import modelo.DTO.Persona;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author David
 */
public class Negocio implements INegocio{

    private final Factory factory;

    public Negocio() {
        this.factory = new Factory();
    }

    @Override
    public boolean personaRegistrar(String documento, String nombre, String direccion, String telefono, String genero, Date fechaNacimiento, Paciente contactos) {
        try{
            return factory.getPersona().create(new Persona(documento, nombre, direccion, telefono, genero, fechaNacimiento, contactos));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean personaEditar(String documento, String nombre, String direccion, String telefono, String genero, Date fechaNacimiento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean personaEliminar(String documento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}

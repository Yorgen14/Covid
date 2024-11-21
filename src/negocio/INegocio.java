/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import modelo.DTO.Paciente;
import java.util.Date;

/**
 *
 * @author David
 */
public interface INegocio {

    public boolean personaRegistrar(String documento, String nombre, String direccion, String telefono, String genero, Date fechaNacimiento, Paciente contactos);
    
    public boolean personaEditar(String documento, String nombre, String direccion, String telefono, String genero, Date fechaNacimiento);

    public boolean personaEliminar(String documento);

}

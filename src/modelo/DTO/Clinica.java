/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.DTO;

/**
 *
 * @author Estudiante
 */
public class Clinica {
    private String nombre;
    private String direccion;
    private PersonalSalud personal;
    private Paciente pacientes;
    
    public Clinica() {
    }

    public Clinica(String nombre, String direccion, PersonalSalud personal, Paciente pacientes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.personal = personal;
        this.pacientes = pacientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public PersonalSalud getPersonal() {
        return personal;
    }

    public void setPersonal(PersonalSalud personal) {
        this.personal = personal;
    }

    public Paciente getPacientes() {
        return pacientes;
    }

    public void setPacientes(Paciente pacientes) {
        this.pacientes = pacientes;
    }

    
}

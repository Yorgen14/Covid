/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.DTO;

import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class PersonalSalud extends Persona{
    private int id;
    private Especialidad especialidad;
    private Clinica clinica;
    private Prueba pruebas;

    public PersonalSalud() {
    }

    public PersonalSalud(Especialidad especialidad, Clinica clinica, Prueba pruebas, String documento, String nombre, String direccion, String telefono, String genero, Date fechaNacimiento) {
        super(documento, nombre, direccion, telefono, genero, fechaNacimiento);
        this.especialidad = especialidad;
        this.clinica = clinica;
        this.pruebas = pruebas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }

    public Prueba getPruebas() {
        return pruebas;
    }

    public void setPruebas(Prueba pruebas) {
        this.pruebas = pruebas;
    }

}

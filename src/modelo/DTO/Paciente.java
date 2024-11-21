/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.DTO;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class Paciente extends Persona {
    
    private Date fechaDeteccion;
    private Boolean casa;
    private LugarProcedencia lugarProcedencia;
    private Estado estado;
    private Clinica clinica;
    private List<Persona> relacion;

    public Paciente() {
    }

    public Paciente(Date fechaDeteccion, Boolean casa, LugarProcedencia lugarProcedencia, Estado estado, Clinica clinica, String documento, String nombre, String direccion, String telefono, String genero, Date fechaNacimiento) {
        super(documento, nombre, direccion, telefono, genero, fechaNacimiento);
        this.fechaDeteccion = fechaDeteccion;
        this.casa = casa;
        this.lugarProcedencia = lugarProcedencia;
        this.estado = estado;
        this.clinica = clinica;
    }
    
    public Date getFechaDeteccion() {
        return fechaDeteccion;
    }

    public void setFechaDeteccion(Date fechaDeteccion) {
        this.fechaDeteccion = fechaDeteccion;
    }

    public Boolean getCasa() {
        return casa;
    }

    public void setCasa(Boolean casa) {
        this.casa = casa;
    }

    public LugarProcedencia getLugarProcedencia() {
        return lugarProcedencia;
    }

    public void setLugarProcedencia(LugarProcedencia lugarProcedencia) {
        this.lugarProcedencia = lugarProcedencia;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }
    
}

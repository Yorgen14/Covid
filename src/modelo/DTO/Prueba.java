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
public class Prueba {
    private Date fecha;
    private Boolean positivo;

    public Prueba() {
    }

    public Prueba(Date fecha, Boolean positivo) {
        this.fecha = fecha;
        this.positivo = positivo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Boolean getPositivo() {
        return positivo;
    }

    public void setPositivo(Boolean positivo) {
        this.positivo = positivo;
    }
    
    
}

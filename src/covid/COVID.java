/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package covid;

import control.control;
import negocio.INegocio;
import negocio.Negocio;

/**
 *
 * @author Estudiante
 */
public class COVID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        INegocio negocio = new Negocio();
        control con = new control(negocio);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import modelo.DTO.Paciente;
import modelo.DTO.PersonalSalud;
import vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Date;
import negocio.INegocio;
import negocio.Negocio;
import utils.Conexion;

/**
 *
 * @author paola
 */
public class control implements ActionListener{
    

    private final INegocio negocio;
    private final Formulario vista;
    
    public control(INegocio negocio) {
        this.negocio = negocio;
        this.vista = new Formulario();
        this.init();
    }
    
    private void init() {
        this.vista.setVisible(true);
        this.vista.jButton1.addActionListener(this);
        this.vista.btnRegistrarPersonal.addActionListener(this);
    }
    
    
    private void pacienteRegistrar() {
        // this.negocio.personaRegistrar();
        this.negocio.personaRegistrar("12", this.vista.textNombre.getText(), "cucuta", "6666", "M", new Date(), null);
    }
    
    
    private void registrarPersonal() {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().contentEquals("btn_registrar_paciente")) {
            this.pacienteRegistrar();
        } else if (e.getActionCommand().contentEquals("accion_btn_registrar_personal")) {
            this.registrarPersonal();
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.*;

/**
 *
 * @author paola
 */
public class Conexion {
    
    private static Conexion instance;
    private Connection cnn;
    
    private static final String DB = "covid";
    private static final String USER = "root";
    private static final String PASS = "";

    private Conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DB, USER, PASS);
        } catch (SQLException | ClassNotFoundException ex) {
        }

    }

    /**
     * Obtener conexion de la base de datos<br>
     * synchronized se utiliza para poner en cola si es que hay muchas
     * peticiones a la conexion
     *
     * @return una unica instancia gracias al patron singleton
     */
    public static synchronized Conexion getInstance() {

        if (instance == null) {
            instance = new Conexion();
        }

        return instance;
    }

    /**
     * Obtener conexion de la base de datos
     *
     * @return conexion de base de datos
     */
    public Connection getCnn() {
        return cnn;
    }

    /**
     * Obtener nombre de la base de datos
     *
     * @return Nombre de la base de datos
     */
    public static String getDb() {
        return DB;
    }

    /**
     * Cerrar conexion
     */
    public void close() {
        instance = null;
    }

}

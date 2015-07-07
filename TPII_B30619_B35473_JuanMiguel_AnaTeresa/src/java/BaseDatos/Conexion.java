/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Juan Miguel Arias Mejias
<<<<<<< HEAD
=======
 * @author Ana Teresa Quesada Ramirez
>>>>>>> origin/Rama-JSP
 */
public class Conexion {

    final String TABLE_NAME = "users"; // nombre de la tabla de usuarios
    final String DATABASE = "databaseusers";
    final String HOST = "localhost";
    final String USER = "root";
    final String PASSWORD = "root";

    public Conexion() {
        loadDriver();
    }

<<<<<<< HEAD
=======
    /**
     * Carga el driver encargado de la conexion de con la base de datos
     */
>>>>>>> origin/Rama-JSP
    private void loadDriver() {
        try {

            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            System.err.println(e);
        }
    }

<<<<<<< HEAD
=======
    /**
     * Crea una conexion con la base de datos
     *
     * @return una conexion
     */
>>>>>>> origin/Rama-JSP
    public Connection conectarBaseDatos() {
        Connection c = null;
        try {

            c = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + DATABASE, USER, PASSWORD);

        } catch (SQLException e) {
            System.err.println(e);
        }
        return c;
    }
<<<<<<< HEAD
    
=======

    /**
     * Crea un statement encargado de las sentencias
     *
     * @return Statement
     */
>>>>>>> origin/Rama-JSP
    public Statement getStatement() {

        Statement st = null;

        try {

            Connection c = conectarBaseDatos();
            st = c.createStatement();

        } catch (SQLException e) {
            System.err.println(e);
        }

        return st;
    }
<<<<<<< HEAD
    
=======

    /**
     * Soluciona el problema de un String sin comillas
     * @param value es el string al que le vamos a agregar las comillas
     */
>>>>>>> origin/Rama-JSP
    public String sqlFormat(String value) {
        return "\"" + value + "\"";
    }

}

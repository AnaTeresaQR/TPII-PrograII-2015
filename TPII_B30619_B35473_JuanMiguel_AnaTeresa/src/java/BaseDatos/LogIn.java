/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import beans.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Juan Miguel Arias Mejias
 * @author Ana Teresa Quesada Ramirez
 */
public class LogIn extends Conexion {

    public User login(String identificador, String password) {

        Statement st = getStatement();
        User userNick = nickLog(identificador);
        User userEmail = emailLog(identificador);

        if (userNick != null) {

            // Se encontro
            if (userNick.getPassword().equals(password)) {
                return userNick;
            }
        }

        if (userEmail != null) {

            if (userEmail.getPassword().equals(password)) {

                return userEmail;
            }
        }

        // No se encontro
        return null;
    }

    private User nickLog(String nick) {

        Statement st = getStatement();
        User user = null;

        String sql = "select * from " + TABLE_NAME + " where nick = " + sqlFormat(nick);

        try {
            ResultSet rs = st.executeQuery(sql);

            String nickU = "";
            String emailU = "";
            String passwordU = "";
            int id = 0;

            while (rs.next()) {

                nickU = (String) rs.getObject("nick");
                emailU = (String) rs.getObject("email");
                passwordU = (String) rs.getObject("password");
                id = (int)rs.getObject("id");
            }

            rs.close();
            return new User(nickU, emailU, passwordU, id);

        } catch (SQLException e) {
            System.err.println(e);
        }
        return null;
    }

    private User emailLog(String email) {

        Statement st = getStatement();
        User user = null;

        String sql = "select * from " + TABLE_NAME + " where email = " + sqlFormat(email);

        try {
            ResultSet rs = st.executeQuery(sql);

            String nickU = "";
            String emailU = "";
            String passwordU = "";
            int id = 0;

            while (rs.next()) {

                nickU = (String) rs.getObject("nick");
                emailU = (String) rs.getObject("email");
                passwordU = (String) rs.getObject("password");
                id = (int)rs.getObject("id");
            }

            rs.close();
            return new User(nickU, emailU, passwordU, id);

        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }

}

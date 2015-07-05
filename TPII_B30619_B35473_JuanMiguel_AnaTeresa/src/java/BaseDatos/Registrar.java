/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import beans.User;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Juan Miguel Arias Mejias
 */
public class Registrar extends Conexion {

    public void registrar(User user) throws SQLException {
        
        Statement st = getStatement();
        String nick = sqlFormat(user.getNick());
        String email = sqlFormat(user.getEmail());
        String password = sqlFormat(user.getPassword());

        String sql = "insert into " + TABLE_NAME + " (nick, email, password) values(" + nick + ", " + email + ", " + password + ")";
        st.executeUpdate(sql);
    }

}

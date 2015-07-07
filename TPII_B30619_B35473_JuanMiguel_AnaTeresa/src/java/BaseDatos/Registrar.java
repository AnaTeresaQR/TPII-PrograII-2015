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
<<<<<<< HEAD
 */
public class Registrar extends Conexion {

    public void registrar(User user) throws SQLException {
        
=======
 * @author Ana Teresa Quesada Ramirez
 */
public class Registrar extends Conexion {

    /**
     * Registra un usuario en la base de datos
     * @param user es el usuario a ser registrado
     * @throws SQLException error al registrar
     */
    public void registrar(User user) throws SQLException {

>>>>>>> origin/Rama-JSP
        Statement st = getStatement();
        String nick = sqlFormat(user.getNick());
        String email = sqlFormat(user.getEmail());
        String password = sqlFormat(user.getPassword());

        String sql = "insert into " + TABLE_NAME + " (nick, email, password) values(" + nick + ", " + email + ", " + password + ")";
        st.executeUpdate(sql);
    }
<<<<<<< HEAD

}
=======
 } // Fin clase
>>>>>>> origin/Rama-JSP

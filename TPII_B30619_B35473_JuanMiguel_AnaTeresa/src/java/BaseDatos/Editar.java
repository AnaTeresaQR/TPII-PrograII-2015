/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Juan Miguel Arias Mejias
<<<<<<< HEAD
 */
public class Editar extends Conexion {

=======
 * @author Ana Teresa Quesada Ramirez
 */
public class Editar extends Conexion {

    /**
     * Edita los datos de un usuario
     *
     * @param nickAntig es el nick antiguo del usuario
     * @param nuevo es el nick con el que se va a reemplazar
     */
>>>>>>> origin/Rama-JSP
    public void editarNick(String nickAntig, String nuevo) {
        Statement st = getStatement();
        String nickNuevo = sqlFormat(nuevo);
        String sql = "update " + TABLE_NAME + " set nick = " + nickNuevo + " where nick = " + sqlFormat(nickAntig);
        try {
            st.executeUpdate(sql);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

<<<<<<< HEAD
=======
    /**
     * Edita los datos de un usuario
     *
     * @param nick es el nick del usuario
     * @param passwordAnt es el password antigua
     * @param nuevo es la nueva contraseña
     */
>>>>>>> origin/Rama-JSP
    public void editarPassword(String nick, String passwordAnt, String nuevo) {
        Statement st = getStatement();
        String passwordNueva = sqlFormat(nuevo);
        String sql = "update " + TABLE_NAME + " set password = " + passwordNueva + " where nick = " + sqlFormat(nick);
        try {
            st.executeUpdate(sql);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
<<<<<<< HEAD

}
=======
} // Fin clase
>>>>>>> origin/Rama-JSP

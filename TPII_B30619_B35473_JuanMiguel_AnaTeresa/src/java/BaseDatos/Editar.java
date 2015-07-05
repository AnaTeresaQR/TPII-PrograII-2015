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
 */
public class Editar extends Conexion {

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

}

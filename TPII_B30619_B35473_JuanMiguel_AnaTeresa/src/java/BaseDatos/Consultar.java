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
 */
public class Consultar extends Conexion{
    
    public String contenidoTabla() {

        Statement st = getStatement();
        StringBuilder sb = new StringBuilder();
        try {
            // select * from tabla
            ResultSet rs = st.executeQuery("select * from " + TABLE_NAME);
            while (rs.next()) {
                sb.append("id: ").append((int) rs.getObject("id"))
                        .append(" nick: ").append((String) rs.getObject("nick"))
                        .append(" email: ").append((String) rs.getObject("email"))
                        .append(" password: ").append((String) rs.getObject("password"))
                        .append("\n");
            }
            rs.close();
        } catch (SQLException e) {
            System.err.println(e);
        }

        return sb.toString();
    }

}

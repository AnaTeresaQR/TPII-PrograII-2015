/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
<<<<<<< HEAD

package BaseDatos;

import beans.User;
=======
package BaseDatos;

>>>>>>> origin/Rama-JSP
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Juan Miguel Arias Mejias
<<<<<<< HEAD
 */
public class Consultar extends Conexion{
    
=======
 * @author Ana Teresa Quesada Ramirez
 */
public class Consultar extends Conexion {

    /**
     * Retorna el contenido de la tabla en forma de matriz
     *
     * @return contenido de base de datos
     */
>>>>>>> origin/Rama-JSP
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
<<<<<<< HEAD

=======
>>>>>>> origin/Rama-JSP
}

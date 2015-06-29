package BaseDatos;

import beans.User;
import java.sql.SQLException;

/**
 *
 * @author Ana Teresa Quesada Ramírez
 * @author Juan Miguel Arias Mejías
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        DataBaseManager base = new DataBaseManager();
        System.out.println(base.contenidoTabla());

        User user = new User("tere", "tere@gmail.com", "tere");
        //        base.registrar("users", user);
        //---------------------------------------------------------------------------------
        //id: 1 nick: juan email: root@root.com password: root
        //id: 2 nick: root2 email: root2@root.com password: root2
        //id: 5 nick: root3 email: root3@root.com password: root
        //id: 6 nick: tere email: tere@gmail.com password: tere
        //---------------------------------------------------------------------------------
        base.registrar(user);
        System.out.println(base.contenidoTabla());

    }

}

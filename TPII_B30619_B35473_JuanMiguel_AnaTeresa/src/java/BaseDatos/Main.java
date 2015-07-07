package BaseDatos;

import java.sql.SQLException;

/**
 *
 * @author Juan Miguel Arias Mejias
 * @author Ana Teresa Quesada Ramirez
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        Consultar consultar = new Consultar();
        Registrar registrar = new Registrar();
        Editar editar = new Editar();
        LogIn logIn = new LogIn();
        System.out.println(consultar.contenidoTabla());
        editar.editarNick("Juan15", "Juan16");
        System.out.println(consultar.contenidoTabla());
     //   System.out.println(logIn.login("juan15@gmail.com", "jmam2445958").getUnique());
    }

}

<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
=======
>>>>>>> origin/Rama-JSP
package BaseDatos;

import java.sql.SQLException;

/**
 *
 * @author Juan Miguel Arias Mejias
<<<<<<< HEAD
=======
 * @author Ana Teresa Quesada Ramirez
>>>>>>> origin/Rama-JSP
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
<<<<<<< HEAD
        System.out.println(logIn.login("juan15@gmail.com", "jmam2445958").getUnique());
=======
     //   System.out.println(logIn.login("juan15@gmail.com", "jmam2445958").getUnique());
>>>>>>> origin/Rama-JSP
    }

}

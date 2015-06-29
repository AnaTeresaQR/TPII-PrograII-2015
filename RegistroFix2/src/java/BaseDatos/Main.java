package BaseDatos;

import beans.User;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {
        final String  nombreTabla = "users";
        DataBaseManager base = new DataBaseManager();
        System.out.println(base.contenidoTabla("users"));

//        User user = new User("tere", "tere@gmail.com", "tere");
//        base.registrar("users", user);

        base.editarNick(nombreTabla, "root", "juan");
        System.out.println(base.contenidoTabla("users"));
        
    }

}

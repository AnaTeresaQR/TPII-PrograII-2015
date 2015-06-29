package BaseDatos;

import beans.User;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {
        final String nombreTabla = "users";
        DataBaseManager base = new DataBaseManager();
        System.out.println(base.contenidoTabla("users"));

//        User user = new User("tere", "tere@gmail.com", "tere");
//        base.registrar("users", user);
//id: 1 nick: juan email: root@root.com password: root
//id: 2 nick: root2 email: root2@root.com password: root2
//id: 5 nick: root3 email: root3@root.com password: root
//id: 6 nick: tere email: tere@gmail.com password: tere
        base.editarPassword(nombreTabla, "root3", "root", "contraseñaModificada");
        System.out.println(base.contenidoTabla(nombreTabla));

    }

}

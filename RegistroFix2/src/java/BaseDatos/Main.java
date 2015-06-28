/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import beans.User;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {
        DataBaseManager base = new DataBaseManager();
        System.out.println(base.contenidoTabla("users"));
        
        User user = new User("tere", "tere@gmail.com", "tere");
        base.registrar("users", user);
        
        System.out.println(base.contenidoTabla("users"));
    }

}

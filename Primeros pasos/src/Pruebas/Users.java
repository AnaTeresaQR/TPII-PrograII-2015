/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Juan Miguel Arias Mejias
 */
@XmlRootElement
@XmlSeeAlso({User.class})
@XmlType(propOrder = {"autor", "users"})
public class Users {

    @XmlElement
    private User autor;

    @XmlElement(name = "contribuyentes")
    private List<User> users;

    public Users() {
        users = new ArrayList<>();
    }

    public Users(User autor) {
        this.autor = autor;
        users = new ArrayList<>();
    }

    public void add(User user) {
        users.add(user);
    }

    public void remove(User user) {
        users.remove(user);
    }

}

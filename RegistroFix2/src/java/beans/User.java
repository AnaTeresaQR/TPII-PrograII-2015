/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Juan Miguel Arias Mejias
 */
@XmlType(propOrder = {"nick", "name", "email", "password"})
public class User implements Serializable {

    private String nick; // Unico
    private String name;
    private String email;
    private String password;

    public User(String nick, String name, String email, String password) {
        this.nick = nick;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User() {
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "nick=" + nick + ", name=" + name + ", email=" + email + ", password=" + password + '}';
    }

}

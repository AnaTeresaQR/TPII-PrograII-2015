/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author Juan Miguel Arias Mejias
 */
@XmlRootElement
@XmlSeeAlso({User.class})
public class Users extends ArrayList<User> {

    public Users() {
    }

    @XmlElement(name = "user")
    public List<User> getUsers() {
        return this;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import javax.xml.bind.annotation.*;

/**
 *
 * @author Juan Miguel Arias Mejias
 */
@XmlType(propOrder = {"id", "users", "personajes"})
@XmlRootElement(name = "historieta")
public class Historieta {

    @XmlID
    private String id;
    @XmlElement
    private Users users;
    @XmlElement
    private Personajes personajes;

    public Historieta() {
        users = new Users();
        personajes = new Personajes();
    }

    public Historieta(String id) {
        this.id = id;
        users = new Users();
        personajes = new Personajes();
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getIdHistorieta() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Personajes getPersonajesH() {
        return personajes;
    }

    public void setPersonajes(Personajes personajes) {
        this.personajes = personajes;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.io.Serializable;

/**
 *
 * @author Juan Miguel Arias Mejias
 */
public class Person implements Serializable {

    private String name; // Identificador 'unico
    private String email;
    private String password;

    public Person(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Person() {
        name = email = password = null;
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
        return "Person{" + "name=" + name + ", email=" + email + ", password=" + password + '}';
    }
}

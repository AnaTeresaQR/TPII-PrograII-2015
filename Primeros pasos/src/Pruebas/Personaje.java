/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Juan Miguel Arias Mejias
 */
@XmlType(propOrder = {"name", "personalidad", "foto"})
public class Personaje implements Serializable {

    @XmlID
    private String name;
    private String personalidad;
    private String foto;

    public Personaje(String name, String personalidad, String foto) {
        this.name = name;
        this.personalidad = personalidad;
        this.foto = foto;
    }

    public Personaje() {
    }

    public String getNameP() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Personaje{" + "name=" + name + ", personalidad=" + personalidad + ", foto=" + foto + '}';
    }
}

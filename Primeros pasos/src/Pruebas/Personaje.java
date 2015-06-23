/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.awt.Image;
import java.io.Serializable;

/**
 *
 * @author Juan Miguel Arias Mejias
 */
public class Personaje implements Serializable {

    private String name;
    private String personalidad;
    private Image foto;

    public Personaje(String name, String personalidad, Image foto) {
        this.name = name;
        this.personalidad = personalidad;
        this.foto = foto;
    }

    public String getName() {
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

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Personaje{" + "name=" + name + ", personalidad=" + personalidad + ", foto=" + foto + '}';
    }
}

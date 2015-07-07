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
@XmlSeeAlso(Personaje.class)
public class Cuadros extends ArrayList<Cuadro> {

    public Cuadros() {
    }

    @XmlElement(name = "cuadro")
    public List<Cuadro> getUsers() {
        return this;
    }

}

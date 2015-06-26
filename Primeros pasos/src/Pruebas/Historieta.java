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
@XmlType(propOrder = {"id", "users", "personajes", "cuadros"})
@XmlRootElement(name = "historieta")
public class Historieta {

    @XmlID
    private int id;
    @XmlElement
    private User[] users;
    @XmlElement
    private Personaje personajes[];
    @XmlElement
    private String[] cuadros;

}

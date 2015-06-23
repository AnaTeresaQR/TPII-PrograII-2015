/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pruebas;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;


/**
 *
 * @author Juan Miguel Arias Mejias
 */
public class Traductor {
    
    private static final String PERSON_DAT_FILE = "person.dat";
    
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Person.class);
        
        
    }
    
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pruebas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


/**
 *
 * @author Juan Miguel Arias Mejias
 */
public class Traductor {
    
    private static final String PERSON_DAT_FILE = "person.dat";
    
    public static void main(String[] args) throws JAXBException, FileNotFoundException, IOException {
        JAXBContext context = JAXBContext.newInstance(Person.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        
        Person person = new Person("Juan", "juanmiguel.arias@ucrso.info", "123");
        
        // Mostramos el documento XML generado por la salida estandar
        marshaller.marshal(person, System.out);
        
        FileOutputStream fos = new FileOutputStream(PERSON_DAT_FILE);
        // Guardamos el objeto serializado en un documento XML
        marshaller.marshal(person, fos);
        fos.close();
        
        Unmarshaller unmarshaller = context.createUnmarshaller();
        // Deserealizamos a partir de un documento XML
        Person personAux = (Person) unmarshaller.unmarshal(new File(PERSON_DAT_FILE));
        System.out.println("-------------- Persona cargada desde fichero XML -------------");
        // Mostramos por lenia de comandos el objeto JAva obtenido
        // Producto de la deserializaci'on
        marshaller.marshal(personAux, System.out);
        
        
        
        
    }
    
    

}

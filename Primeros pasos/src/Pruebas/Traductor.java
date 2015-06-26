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

    private static final String PERSON_DAT_FILE = "historieta.dat";

    public static void main(String[] args) throws JAXBException, FileNotFoundException, IOException {
        JAXBContext context = JAXBContext.newInstance(Historieta.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // Creo historieta
        Historieta historieta = new Historieta("Esa historia...");

        // Lista de usuarios
        Users users = new Users();
        // Creo  los usuarios
        User miguel = new User("JM", "Juan", "juan@gmail", "123");
        users.add(miguel);
        User tere = new User("Te", "Tere", "tere@gmail", "321");
        users.add(tere);
        // Agrego la lista a la historieta
        historieta.setUsers(users);

        Personajes personajes = new Personajes();
        Personaje personaje1 = new Personaje("Juan", "Feliz", "Dirreccion de imagen");
        Personaje personaje2 = new Personaje("Tere", "Muy Feliz", "Dirreccion de imagen");
        personajes.add(personaje1);
        personajes.add(personaje2);
        
        historieta.setPersonajes(personajes);

        // Mostramos el documento XML generado por la salida estandar
        marshaller.marshal(historieta, System.out);

        FileOutputStream fos = new FileOutputStream(PERSON_DAT_FILE);
        // Guardamos el objeto serializado en un documento XML
        marshaller.marshal(historieta, fos);
        fos.close();

        Unmarshaller unmarshaller = context.createUnmarshaller();
        // Deserealizamos a partir de un documento XML
        Historieta personAux = (Historieta) unmarshaller.unmarshal(new File(PERSON_DAT_FILE));
        System.out.println("-------------- Persona cargada desde fichero XML -------------");
        // Mostramos por lenia de comandos el objeto JAva obtenido
        // Producto de la deserializaci'on
        marshaller.marshal(personAux, System.out);

    }

}

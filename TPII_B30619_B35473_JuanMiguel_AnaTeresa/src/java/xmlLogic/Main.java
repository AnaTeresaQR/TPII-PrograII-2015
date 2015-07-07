package xmlLogic;

import javax.xml.transform.TransformerException;

public class Main {

    public static void main(String[] args) throws TransformerException {

        ManejadorXMLPersonajes xml = new ManejadorXMLPersonajes("web/xml/personajes.xml");
        xml.agregarPersonaje(new Personaje("Omagio", "Feliz", "Muy amable", "img/omagio.png"), "web/xml/personajes.xml");
        xml.agregarPersonaje(new Personaje("Omagio", "Feliz", "Muy amable", "img/omagio.png"), "web/xml/personajes.xml");
        xml.agregarPersonaje(new Personaje("Omagio", "Feliz", "Muy amable", "img/omagio.png"), "web/xml/personajes.xml");
        System.out.println("" +xml.listaPersonajes().imprimir());

//        ManejadorXMLHistorietas xmlH = new ManejadorXMLHistorietas("web/xml/historietas.xml");
//        Lista_Historietas historietas = xmlH.ListaHistorietas();
//        System.out.println(historietas.getHistorietas(0).imprimirCuadros());
//
//        System.out.println(historietas.getHistorietas(1).imprimirCuadros());
//
//        System.out.println(historietas.getHistorietas(1).obtenerCuadro(0).obtenerPersonaje(1)[1]);
    }
}

package xmlLogic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ManejadorXMLPersonajes {

    Lista_Personajes listaPersonajes;
    final String expresion = "/personajes/personaje";
    FileInputStream file;
    DocumentBuilderFactory factory;
    DocumentBuilder builder;
    Document document;
    XPath xPath;

    public ManejadorXMLPersonajes(String ruta) {
        try {
            listaPersonajes = new Lista_Personajes();
            file = new FileInputStream(ruta);
            factory = DocumentBuilderFactory.newInstance();
            builder = factory.newDocumentBuilder();
            document = builder.parse(file);
            xPath = XPathFactory.newInstance().newXPath();
        } catch (FileNotFoundException ex) {
            System.out.println("XML no encontrado");
        } catch (SAXException | IOException ex) {
            System.out.println("Error IO init clase ManejadorXMLPersonajes\n" + ex.getMessage());
        } catch (ParserConfigurationException ex) {
            System.out.println("Error al parsear la configuración");
        }
    }

    public Lista_Personajes listaPersonajes() {
        try {
            NodeList listaNodos = (NodeList) xPath.compile(expresion).evaluate(document, XPathConstants.NODESET);
            for (int i = 0; i < listaNodos.getLength(); i++) {
                Element element = (Element) listaNodos.item(i);
                int id = Integer.parseInt(element.getAttribute("id"));
                String nombre = element.getElementsByTagName("nombre").item(0).getFirstChild().getNodeValue();
                String descripcion = element.getElementsByTagName("descripcion").item(0).getFirstChild().getNodeValue();
                String personalidad = element.getElementsByTagName("personalidad").item(0).getFirstChild().getNodeValue();
                String img = element.getElementsByTagName("img").item(0).getFirstChild().getNodeValue();
                listaPersonajes.agregar(new Personaje(id, nombre, descripcion, personalidad, img));
            }
        } catch (XPathExpressionException ex) {
            System.out.println("Error al compilar documento XML");
        }
        return listaPersonajes;
    }

    public String imprimir() {
        return listaPersonajes.imprimir();
    }
}
